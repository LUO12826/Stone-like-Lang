package compiler.project.codegen;

import com.sun.tools.javac.util.FatalError;
import compiler.project.antlr.StoneLikeBaseVisitor;
import compiler.project.antlr.StoneLikeParser;
import compiler.project.vm.Executable;
import compiler.project.vm.IntermediateCode;
import compiler.project.vm.MemorySegment;
import compiler.project.vm.VMInstructionType;

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

    public List<IntermediateCode> codes = new ArrayList<IntermediateCode>();

    public List<Object> dataSegment = new ArrayList<>();

    private int valueLiteralIndex = -1;

    private boolean inVarDeclareMode = false;

    private boolean inConstDeclareMode = false;

    private Scope globalScope;

    private Scope currentScope;

    public Executable getExecutable() {
        return new Executable(dataSegment, codes);
    }

    private int addValueLiteral(Object obj) {
        valueLiteralIndex++;
        dataSegment.add(obj);
        return valueLiteralIndex;
    }

    @Override
    public Object visitProgram(StoneLikeParser.ProgramContext ctx) {
        globalScope = new Scope(null);
        currentScope = globalScope;
        visitChildren(ctx);
        codes.add(new IntermediateCode(VMInstructionType.halt));
        return null;
    }

    @Override
    public Object visitGlobalStatement(StoneLikeParser.GlobalStatementContext ctx) {
        return super.visitGlobalStatement(ctx);
    }

    @Override
    public Object visitFunctionBlockStatement(StoneLikeParser.FunctionBlockStatementContext ctx) {
        return super.visitFunctionBlockStatement(ctx);
    }

    @Override
    public Object visitStatement(StoneLikeParser.StatementContext ctx) {
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
    public Object visitArrayExpression(StoneLikeParser.ArrayExpressionContext ctx) {
        int elementNum = ctx.getChildCount() / 2;
        int idx = addValueLiteral(new Object[elementNum]);
        codes.add(new IntermediateCode(VMInstructionType.push, MemorySegment.CONSTANT, idx));
        codes.add(new IntermediateCode(VMInstructionType.pop, MemorySegment.STATIC, 0));
        for(int i = 1; i < ctx.getChildCount(); i += 2) {
            visit(ctx.getChild(i));
        }
        for(int i = elementNum - 1; i >= 0; i--) {
            codes.add(new IntermediateCode(VMInstructionType.pop, MemorySegment.STATIC, 0, i));
        }
        codes.add(new IntermediateCode(VMInstructionType.push, MemorySegment.STATIC, 0));
        return null;
    }

    @Override
    public Object visitExpressionList(StoneLikeParser.ExpressionListContext ctx) {
        return super.visitExpressionList(ctx);
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
                if(ctx.NumberLiteral() != null) {
                    int idx = addValueLiteral(new Double(ctx.NumberLiteral().getText()));
                    codes.add(new IntermediateCode(VMInstructionType.push, MemorySegment.CONSTANT, idx));
                }
                else if(ctx.StringLiteral() != null) {
                    int idx = addValueLiteral(ctx.StringLiteral().getText());
                    codes.add(new IntermediateCode(VMInstructionType.push, MemorySegment.CONSTANT, idx));
                }
                else if(ctx.Identifier() != null) {
                    s = currentScope.resolveValueSymbol(ctx.Identifier().getText());
                    if(s == null) {
                        throw new FatalError("使用了未定义的变量:" + ctx.Identifier().getText());
                    }
                    codes.add(new IntermediateCode(VMInstructionType.push, s.relativeMemoryAddress));
                }
                else if(ctx.callStatement() != null) {

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
                codes.add(new IntermediateCode(VMInstructionType.push, MemorySegment.HEAP, s.relativeMemoryAddress));
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

    @Override
    public Object visitFunctionDeclaration(StoneLikeParser.FunctionDeclarationContext ctx) {
        return super.visitFunctionDeclaration(ctx);
    }

    @Override
    public Object visitInitializerList(StoneLikeParser.InitializerListContext ctx) {
        return super.visitInitializerList(ctx);
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

    @Override
    public Object visitParameterClause(StoneLikeParser.ParameterClauseContext ctx) {
        return super.visitParameterClause(ctx);
    }

    @Override
    public Object visitParameterList(StoneLikeParser.ParameterListContext ctx) {
        return super.visitParameterList(ctx);
    }

    /*
    assignStatement
	: leftValue '=' expression
	| Identifier '=' arrayExpression
	;
     */
    @Override
    public Object visitAssignStatement(StoneLikeParser.AssignStatementContext ctx) {


        //对应于Identifier '=' arrayExpression的情况
        if(ctx.Identifier() != null) {
            ValueSymbol s = currentScope.resolveValueSymbol(ctx.Identifier().getText());
            if(s == null) {
                throw new FatalError("使用了未定义的变量:" + ctx.Identifier().getText());
            }
            int ra = s.relativeMemoryAddress;
            visit(ctx.getChild(2));
            codes.add(new IntermediateCode(VMInstructionType.pop, ra));
        }
        //leftValue:Identifier '=' expression的情况
        else if(ctx.getChild(0).getChildCount() == 1) {
            ValueSymbol s = currentScope.resolveValueSymbol(ctx.leftValue().getText());
            if(s == null) {
                throw new FatalError("使用了未定义的变量:" + ctx.Identifier().getText());
            }
            int ra = s.relativeMemoryAddress;
            visit(ctx.getChild(2));
            codes.add(new IntermediateCode(VMInstructionType.pop, ra));
        }
        //对应于leftValue:Identifier '[' expression ']' '=' expression的情况
        else {
            ValueSymbol s = currentScope.resolveValueSymbol(ctx.leftValue().getChild(0).getText());
            if(s == null) {
                throw new FatalError("使用了未定义的变量:" + ctx.Identifier().getText());
            }
            int ra = s.relativeMemoryAddress;
            visit(ctx.getChild(2));
            visit(ctx.getChild(0));
            codes.add(new IntermediateCode(VMInstructionType.pop, MemorySegment.HEAP, ra));
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
        codes.add(new IntermediateCode(VMInstructionType.pop, MemorySegment.NULL));
        visit(ctx.commonCodeBlock());
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
        codes.add(new IntermediateCode(VMInstructionType.pop, MemorySegment.NULL));
        visit(ctx.commonCodeBlock());
        IntermediateCode d = new IntermediateCode(VMInstructionType.j);
        codes.add(d);
        c.op1 = codes.size();
        if(ctx.elseClause() != null && ctx.elseClause().size() > 0) {
            ctx.elseClause().forEach(this::visit);
        }
        d.op1 = codes.size();
        return null;
    }

    @Override
    public Object visitElseClause(StoneLikeParser.ElseClauseContext ctx) {
        return super.visitElseClause(ctx);
    }

    @Override
    public Object visitReturnStatement(StoneLikeParser.ReturnStatementContext ctx) {
        return super.visitReturnStatement(ctx);
    }

    @Override
    public Object visitCallStatement(StoneLikeParser.CallStatementContext ctx) {
        return super.visitCallStatement(ctx);
    }

    @Override
    public Object visitCommonCodeBlock(StoneLikeParser.CommonCodeBlockContext ctx) {
        return super.visitCommonCodeBlock(ctx);
    }

    @Override
    public Object visitFunctionBlock(StoneLikeParser.FunctionBlockContext ctx) {
        return super.visitFunctionBlock(ctx);
    }
}
