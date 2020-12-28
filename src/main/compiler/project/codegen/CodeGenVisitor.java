package compiler.project.codegen;

import com.sun.tools.javac.util.FatalError;
import compiler.project.antlr.*;
import compiler.project.vm.Executable;
import compiler.project.vm.IntermediateCode;
import compiler.project.vm.MemorySegment;
import compiler.project.vm.VMInstructionType;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: 骆荟州
 * @createTime: 2020/12/16 11:42 上午
 * @updateTime:
 */

/*
一些约定:
代码中的临时变量ra代表relativeAddress;
 */
public class CodeGenVisitor extends StoneLikeBaseVisitor<Object> {

    PrintStream ps = System.out;

    /** 编译生成的代码 */
    public List<IntermediateCode> codes = new ArrayList<IntermediateCode>();

    /** 存放代码中出现的字面量的数据段 */
    public List<Object> dataSegment = new ArrayList<>();

    /** 指示数据段当前下标 */
    private int valueLiteralIndex = -1;

    /** 是否在声明变量的语句中 */
    private boolean inVarDeclareMode = false;

    /** 是否在声明常量的语句中 */
    private boolean inConstDeclareMode = false;

    /** 始终指向全局作用域 */
    private Scope globalScope;

    /** 指向当前作用域 */
    private Scope currentScope;

    /** 编译是否成功 */
    private boolean compileSucceed = false;

    /** 获取可执行文件，包括数据段和代码段 */
    public Executable getExecutable() {
        if(compileSucceed) {
            return new Executable(dataSegment, codes);
        }
        return null;
    }

    /** 向数据段中插入内容 */
    private int addValueLiteral(Object obj) {
        valueLiteralIndex++;
        dataSegment.add(obj);
        return valueLiteralIndex;
    }

    /** 导入库函数 */
    private void importLibrary(StoneLikeLibraryFunction libFunc) {
        int loc = codes.size();
        globalScope.defineFunctionSymbol(new FunctionSymbol
                (libFunc.name, globalScope, libFunc.parameterNum, loc));
        codes.addAll(libFunc.codes);
    }

    @Override
    public Object visitProgram(StoneLikeParser.ProgramContext ctx) {
        globalScope = new Scope(null);
        currentScope = globalScope;
        IntermediateCode c = new IntermediateCode(VMInstructionType.j);
        codes.add(c);
        importLibrary(StoneLikeStandardLibrary.print);
        // 先编译一遍，生成函数声明
        ctx.children.forEach(child -> {
            if(child.getChild(0) instanceof StoneLikeParser.FunctionDeclarationContext) {
                visit(child.getChild(0));
            }
        });

        // 编完函数后的起始地址
        c.op1 = codes.size();
        // 访问每个非函数声明
        ctx.children.forEach(child -> {
            if(!(child.getChild(0) instanceof StoneLikeParser.FunctionDeclarationContext)) {
                visit(child.getChild(0));
            }
        });

        codes.add(new IntermediateCode(VMInstructionType.halt));
        compileSucceed = true;
        return null;
    }

    @Override
    public Object visitCallStatement(StoneLikeParser.CallStatementContext ctx) {
        // 获取函数名
        String name = ctx.Identifier().getText();
        FunctionSymbol s;
        if(ctx.expressionList() == null) {
            // 获取参数个数
            int parameterNumber = 0;
            s = globalScope.resolveFunctionSymbol(new FunctionSignature(name, parameterNumber));

            // 判断函数是否已定义
            if(s == null) {
                throw new FatalError("使用了未定义的函数或参数数量不匹配:" + ctx.Identifier().getText());
            }

        } else {
            // 获取参数个数
            int parameterNumber = (ctx.expressionList().children.size() + 1) / 2;

            s = globalScope.resolveFunctionSymbol(new FunctionSignature(name, parameterNumber));

            // 判断函数是否已定义
            if(s == null) {
                throw new FatalError("使用了未定义的函数或参数数量不匹配:" + ctx.Identifier().getText());
            }

            // 将参数逆序放置栈中
            int length = ctx.expressionList().children.size();
            for(int i = length - 1; i >= 0; i -= 2) {
                visit(ctx.expressionList().children.get(i));
            }
        }

        // 生成中间代码
        codes.add(new IntermediateCode(VMInstructionType.push, MemorySegment.CONSTANT, s.parameterNum));
        codes.add(new IntermediateCode(VMInstructionType.call, s.codeAddress, currentScope.getValueSymbolNum()));
        return null;
    }

    @Override
    public Object visitExpressionList(StoneLikeParser.ExpressionListContext ctx) {
        return super.visitExpressionList(ctx);
    }

    @Override
    public Object visitFunctionDeclaration(StoneLikeParser.FunctionDeclarationContext ctx) {
        Scope temp = currentScope;
        currentScope = new Scope(currentScope);
        String[] paras = (String[])visit(ctx.parameterClause());
        int paraNum = paras == null ? 0 : paras.length;
        String name = ctx.Identifier().getText();

        FunctionSignature fs = new FunctionSignature(name, paraNum);
        if(globalScope.functionSymbolRedundant(fs)) {
            throw new FatalError("重复定义函数。");
        }
        FunctionSymbol s = new FunctionSymbol(name, currentScope, paraNum, codes.size());
        globalScope.defineFunctionSymbol(s);

        //将参数从运算栈上转移到栈帧中。
        if(paraNum > 0) {
            for(int i = 0; i < paraNum; i++) {
                ValueSymbol vs = new ValueSymbol(paras[i], false);
                int ra = currentScope.defineValueSymbol(vs).relativeMemoryAddress;
                codes.add(new IntermediateCode(VMInstructionType.pop, MemorySegment.LOCAL, ra));
            }
        }
        visit(ctx.codeBlock());

        // 判断函数是否有return语句（还是留着了，感觉少一点ret也好)
        for(ParseTree context: ctx.codeBlock().children){
            // 有则直接返回
            if(context.getChild(0) instanceof StoneLikeParser.ReturnStatementContext){
                // 恢复作用域
                currentScope = temp;
                return null;
            }
        }

        // 生成返回指令
        codes.add(new IntermediateCode(VMInstructionType.ret));
        // 恢复作用域
        currentScope = temp;
        return null;
    }

    @Override
    public Object visitCodeBlock(StoneLikeParser.CodeBlockContext ctx) {
        return super.visitCodeBlock(ctx);
    }

    @Override
    public Object visitReturnStatement(StoneLikeParser.ReturnStatementContext ctx) {
        // 存在返回值将返回值置于栈顶
        if(ctx.expression() != null){
            visit(ctx.expression());
        }
        // 生成返回指令
        codes.add(new IntermediateCode(VMInstructionType.ret));
        return null;
    }

    @Override
    public Object visitParameterClause(StoneLikeParser.ParameterClauseContext ctx) {
        if(ctx.parameterList() == null) {
            return null;
        }
        return visit(ctx.parameterList());
    }

    @Override
    public Object visitParameterList(StoneLikeParser.ParameterListContext ctx) {
        int paraNum = (ctx.getChildCount() + 1) / 2;
        String[] paras = new String[paraNum];
        for(int i = 0; i < paraNum; i++) {
            paras[i] = ctx.getChild(2 * i).getText();
        }
        return paras;
    }

    @Override
    public Object visitInitializerList(StoneLikeParser.InitializerListContext ctx) {
        return super.visitInitializerList(ctx);
    }

    @Override
    public Object visitStatement(StoneLikeParser.StatementContext ctx) {
        ParseTree context = ctx;
        //不编译悬浮表达式。
        while(context.getChildCount() == 1) {
            context = context.getChild(0);
            if(context instanceof StoneLikeParser.ExpressionContext) {
                return null;
            }
        }
        return super.visitStatement(ctx);
    }

    /*
    expression
	: expression '&&' boolExpression
	| expression '||' boolExpression
	| '!' expression
	| boolExpression
	;
     */
    @Override
    public Object visitExpression(StoneLikeParser.ExpressionContext ctx) {
        if(ctx.getChildCount() != 1) {
            visit(ctx.getChild(0));
            visit(ctx.getChild(2));
            IntermediateCode c;
            switch(ctx.getChild(1).getText()) {
                case "&&":
                    c = new IntermediateCode(VMInstructionType.and);
                    break;
                case "||":
                    c = new IntermediateCode(VMInstructionType.or);
                    break;
                default:
                    c = null;
            }
            codes.add(c);
        }
        else if(ctx.getChildCount() == 2) {
            visit(ctx.getChild(1));
            codes.add(new IntermediateCode(VMInstructionType.not));
        }
        else {
            visitChildren(ctx);
        }
        return null;
    }

    /*
    arrayExpression
    : '[' expression ( ',' expression )* ']'
    ;
     */
    @Override
    public Object  visitArrayExpression(StoneLikeParser.ArrayExpressionContext ctx) {
        int elementNum = ctx.getChildCount() / 2;
        int idx = addValueLiteral(new Object[elementNum]);
        codes.add(new IntermediateCode(VMInstructionType.push, MemorySegment.DATA, idx));
        codes.add(new IntermediateCode(VMInstructionType.pop, MemorySegment.TEMP, 0));
        for(int i = 1; i < ctx.getChildCount(); i += 2) {
            visit(ctx.getChild(i));
        }
        for(int i = elementNum - 1; i >= 0; i--) {
            codes.add(new IntermediateCode(VMInstructionType.pop, MemorySegment.TEMP, 0, i));
        }
        codes.add(new IntermediateCode(VMInstructionType.push, MemorySegment.TEMP, 0));
        return null;
    }

    /*
    boolExpression
    : additiveExpression relationalOperator additiveExpression
    | additiveExpression
    ;
     */
    @Override
    public Object visitBoolExpression(StoneLikeParser.BoolExpressionContext ctx) {
        if(ctx.getChildCount() != 1) {
            visit(ctx.getChild(0));
            visit(ctx.getChild(2));
            IntermediateCode c;
            switch(ctx.relationalOperator().getText()) {
                case "==":
                    c = new IntermediateCode(VMInstructionType.eq);
                    break;
                case "!=":
                    c = new IntermediateCode(VMInstructionType.ne);
                    break;
                case ">":
                    c = new IntermediateCode(VMInstructionType.gt);
                    break;
                case "<":
                    c = new IntermediateCode(VMInstructionType.lt);
                    break;
                case ">=":
                    c = new IntermediateCode(VMInstructionType.ge);
                    break;
                case "<=":
                    c = new IntermediateCode(VMInstructionType.le);
                    break;
                default:
                    c = null;
            }
            codes.add(c);
        }
        else {
            visitChildren(ctx);
        }
        return null;
    }


    @Override
    public Object visitRelationalOperator(StoneLikeParser.RelationalOperatorContext ctx) {
        return super.visitRelationalOperator(ctx);
    }

    /*
    additiveExpression
	: additiveExpression operator=('+'|'-') term
	| term
	;
     */
    @Override
    public Object visitAdditiveExpression(StoneLikeParser.AdditiveExpressionContext ctx) {
        if(ctx.getChildCount() != 1) {
            visit(ctx.getChild(0));
            visit(ctx.getChild(2));
            switch(ctx.operator.getText()) {
                case "+":
                    codes.add(new IntermediateCode(VMInstructionType.add));
                    break;
                case  "-":
                    codes.add(new IntermediateCode(VMInstructionType.sub));
                    break;
            }
        }
        else {
            visitChildren(ctx);
        }
        return null;
    }

    /*
    term
	: term operator=('*'|'/') factor
	| factor
	;
     */
    @Override
    public Object visitTerm(StoneLikeParser.TermContext ctx) {
        if(ctx.getChildCount() != 1) {
            visit(ctx.getChild(0));
            visit(ctx.getChild(2));
            switch(ctx.operator.getText()) {
                case "*":
                    codes.add(new IntermediateCode(VMInstructionType.mul));
                    break;
                case  "/":
                    codes.add(new IntermediateCode(VMInstructionType.div));
                    break;
            }
        }
        else {
            visitChildren(ctx);
        }
        return null;
    }

    /*
    factor
	: Identifier
	| Identifier '[' expression ']'
	| '(' expression ')'
	| NumberLiteral
	| StringLiteral
	| '-' factor
	| callStatement
	;
     */
    @Override
    public Object visitFactor(StoneLikeParser.FactorContext ctx) {
        ValueSymbol s;
        switch(ctx.getChildCount()) {
            case 1:
                if(ctx.IntegerLiteral() != null) {
                    int idx = addValueLiteral(new Double(ctx.IntegerLiteral().getText()));
                    codes.add(new IntermediateCode(VMInstructionType.push, MemorySegment.DATA, idx));
                }else if(ctx.RealLiteral() != null){
                    int idx = addValueLiteral(new Double(ctx.RealLiteral().getText()));
                    codes.add(new IntermediateCode(VMInstructionType.push, MemorySegment.DATA, idx));
                }
                else if(ctx.StringLiteral() != null) {
                    int idx = addValueLiteral(ctx.StringLiteral().getText());
                    codes.add(new IntermediateCode(VMInstructionType.push, MemorySegment.DATA, idx));
                }
                else if(ctx.Identifier() != null) {
                    s = currentScope.resolveValueSymbol(ctx.Identifier().getText());
                    if(s == null) {
                        throw new FatalError("使用了未定义的变量:" + ctx.Identifier().getText());
                    }
                    int ra=s.relativeMemoryAddress;
                    if(s.scope.getScopeType()== Scope.Type.GLOBAL){
                        codes.add(new IntermediateCode(VMInstructionType.push, MemorySegment.GLOBAL, ra));
                    }else {
                        codes.add(new IntermediateCode(VMInstructionType.push, MemorySegment.LOCAL, ra));
                    }
                }
                else if(ctx.callStatement() != null) {
                    visit(ctx.callStatement());
                }
                break;
            case 2:
                visit(ctx.getChild(1));
                codes.add(new IntermediateCode(VMInstructionType.neg));
                break;
            case 3:
                visit(ctx.getChild(1));
                break;
            case 4:
                s = currentScope.resolveValueSymbol(ctx.getChild(0).getText());
                if(s == null) {
                    //err
                    return null;
                }
                visit(ctx.getChild(2));
                int ra=s.relativeMemoryAddress;
                if(s.scope.getScopeType()== Scope.Type.GLOBAL){
                    codes.add(new IntermediateCode(VMInstructionType.push, MemorySegment.GLOBAL_HEAP, ra));
                }else {
                    codes.add(new IntermediateCode(VMInstructionType.push, MemorySegment.LOCAL_HEAP, ra));
                }
                break;
        }

        return null;
    }

    @Override
    public Object visitValueDeclaration(StoneLikeParser.ValueDeclarationContext ctx) {
        return super.visitValueDeclaration(ctx);
    }

    @Override
    public Object visitVariableDeclaration(StoneLikeParser.VariableDeclarationContext ctx) {
        inVarDeclareMode = true;
        visitChildren(ctx);
        inVarDeclareMode = false;
        return null;
    }

    @Override
    public Object visitConstantDeclaration(StoneLikeParser.ConstantDeclarationContext ctx) {
        inConstDeclareMode = true;
        visitChildren(ctx);
        inConstDeclareMode = false;
        return null;
    }


    /*
    initializer
	: Identifier '=' expression
	| Identifier '=' arrayExpression
	;
     */
    @Override
    public Object visitInitializer(StoneLikeParser.InitializerContext ctx) {
        visit(ctx.getChild(2));
        ValueSymbol s;

        if(inVarDeclareMode) {
            s = new ValueSymbol(ctx.Identifier().getText(), false);
        }
        else if(inConstDeclareMode) {
            s = new ValueSymbol(ctx.Identifier().getText(), true);
        }
        else {
            return null;
        }
        int ra = currentScope.defineValueSymbol(s).relativeMemoryAddress;
        codes.add(new IntermediateCode(VMInstructionType.pop, ra));
        return null;
    }


    /*
    assignStatement
	: leftValue '=' expression
	| Identifier '=' arrayExpression
	;
     */
    @Override
    public Object visitAssignStatement(StoneLikeParser.AssignStatementContext ctx) {
        //好多冗余代码，得简化一下

        //leftValue:Identifier '=' expression的情况
        if(ctx.getChild(0).getChildCount() == 1) {
            ValueSymbol s = currentScope.resolveValueSymbol(ctx.leftValue().getText());
            if(s == null) {
                throw new FatalError("使用了未定义的变量:" + ctx.leftValue().getText());
            }
            int ra = s.relativeMemoryAddress;
            visit(ctx.getChild(2));
            if(s.scope.getScopeType()== Scope.Type.GLOBAL){
                codes.add(new IntermediateCode(VMInstructionType.pop, MemorySegment.GLOBAL, ra));
            }else {
                codes.add(new IntermediateCode(VMInstructionType.pop, MemorySegment.LOCAL, ra));
            }
        }
        //对应于leftValue:Identifier '[' expression ']' '=' expression的情况
        else {
            ValueSymbol s = currentScope.resolveValueSymbol(ctx.leftValue().getChild(0).getText());
            if(s == null) {
                throw new FatalError("使用了未定义的变量:" + ctx.leftValue().getText());
            }
            int ra = s.relativeMemoryAddress;
            visit(ctx.getChild(2));
            visit(ctx.getChild(0));
            if(s.scope.getScopeType()== Scope.Type.GLOBAL){
                codes.add(new IntermediateCode(VMInstructionType.pop, MemorySegment.GLOBAL_HEAP, ra));
            }else {
                codes.add(new IntermediateCode(VMInstructionType.pop, MemorySegment.LOCAL_HEAP, ra));
            }
        }
        return null;
    }

    /*
    leftValue
	: Identifier
	| Identifier '[' expression ']'
	;
     */
    @Override
    public Object visitLeftValue(StoneLikeParser.LeftValueContext ctx) {
        return super.visitLeftValue(ctx);
    }

    @Override
    public Object visitWhileStatement(StoneLikeParser.WhileStatementContext ctx) {
        int start = codes.size();
        visit(ctx.expression());
        IntermediateCode c = new IntermediateCode(VMInstructionType.jne);
        codes.add(c);
        visit(ctx.codeBlock());
        IntermediateCode d = new IntermediateCode(VMInstructionType.j);
        codes.add(d);
        c.op1 = codes.size();
        d.op1 = start;
        return null;
    }

    @Override
    public Object visitIfStatement(StoneLikeParser.IfStatementContext ctx) {

        visit(ctx.expression());
        IntermediateCode c = new IntermediateCode(VMInstructionType.jne);
        codes.add(c);
        visit(ctx.codeBlock());
        IntermediateCode d = new IntermediateCode(VMInstructionType.j);
        codes.add(d);
        c.op1 = codes.size();
        if(ctx.elseClause() != null) {
            visit(ctx.elseClause());
        }
        d.op1 = codes.size();
        return null;
    }

    @Override
    public Object visitElseClause(StoneLikeParser.ElseClauseContext ctx) {
        return super.visitElseClause(ctx);
    }

}
