package compiler.project.antlrtest;

import compiler.project.vm.IntermediateCode;
import compiler.project.vm.MemorySegment;
import compiler.project.vm.VMInstructionType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: 骆荟州
 * @createTime: 2020/12/14 6:32 下午
 * @updateTime:
 */
public class CodeGenVisitor extends TinyScriptBaseVisitor<Object> {

    PrintStream ps = System.out;

    public List<IntermediateCode> codes = new ArrayList<IntermediateCode>();

    private Map<String, Integer> symbolTable = new HashMap<>();

    private boolean inDeclareMode = false;

    private int memAddress = 0;

    @Override
    public Object visitProgram(TinyScriptParser.ProgramContext ctx) {
        ps.println("visitProgram");
        visitChildren(ctx);
        codes.add(new IntermediateCode(VMInstructionType.halt));
        return null;
    }

    @Override
    public Object visitStatement(TinyScriptParser.StatementContext ctx) {
        ps.println("visitStatement");
        return super.visitStatement(ctx);
    }

    @Override
    public Object visitIfStatement(TinyScriptParser.IfStatementContext ctx) {
        ps.println("visitIfStatement");

        visit(ctx.quoteExpr());
        IntermediateCode c = new IntermediateCode(VMInstructionType.jne);
        codes.add(c);
        IntermediateCode b = new IntermediateCode(VMInstructionType.pop, MemorySegment.NULL);
        codes.add(b);
        visit(ctx.blockStatement(0));
        c.op1 = codes.size();
        if(ctx.getChildCount() > 3) {
            visit((ctx.blockStatement(1)));
        }
        return null;
    }

    @Override
    public Object visitQuoteExpr(TinyScriptParser.QuoteExprContext ctx) {
        ps.println("visitQuoteExpr");
        return super.visitQuoteExpr(ctx);
    }

    @Override
    public Object visitBlockStatement(TinyScriptParser.BlockStatementContext ctx) {
        ps.println("visitBlockStatement");
        return super.visitBlockStatement(ctx);
    }

    @Override
    public Object visitAssignStatement(TinyScriptParser.AssignStatementContext ctx) {
        ps.println("visitAssignStatement");
        return super.visitAssignStatement(ctx);
    }

    @Override
    public Object visitDeclareStatement(TinyScriptParser.DeclareStatementContext ctx) {
        ps.println("visitDeclareStatement");
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitPrintStatement(TinyScriptParser.PrintStatementContext ctx) {
        ps.println("visitPrintStatement");
        visitChildren(ctx);
        IntermediateCode c = new IntermediateCode(VMInstructionType.print);
        codes.add(c);
        IntermediateCode d = new IntermediateCode(VMInstructionType.pop, MemorySegment.NULL);
        codes.add(d);
        return null;
    }

    @Override
    public Object visitWhileStatement(TinyScriptParser.WhileStatementContext ctx) {
        ps.println("visitWhileStatement");
        return super.visitWhileStatement(ctx);
    }

    @Override
    public Object visitDoWhileStatement(TinyScriptParser.DoWhileStatementContext ctx) {
        return super.visitDoWhileStatement(ctx);
    }

    @Override
    public Object visitForStatement(TinyScriptParser.ForStatementContext ctx) {
        ps.println("visitWhileStatement");

        return super.visitForStatement(ctx);
    }

    @Override
    public Object visitCommonExpression(TinyScriptParser.CommonExpressionContext ctx) {
        ps.println("visitCommonExpression");
        return super.visitCommonExpression(ctx);
    }

    @Override
    public Object visitAssignAbleStatement(TinyScriptParser.AssignAbleStatementContext ctx) {
        ps.println("visitAssignAbleStatement");
        return super.visitAssignAbleStatement(ctx);
    }

    @Override
    public Object visitDeclareExpression(TinyScriptParser.DeclareExpressionContext ctx) {
        ps.println("visitDeclareExpression");
        return super.visitDeclareExpression(ctx);
    }

    @Override
    public Object visitExpression(TinyScriptParser.ExpressionContext ctx) {
        ps.println("visitExpression");
        visitChildren(ctx);
        if(ctx.getChildCount() != 1) {
            IntermediateCode c = new IntermediateCode(VMInstructionType.or);
            codes.add(c);
        }
        return null;
    }

    @Override
    public Object visitAndAndExpression(TinyScriptParser.AndAndExpressionContext ctx) {
        ps.println("visitAndAndExpression");
        visitChildren(ctx);
        if(ctx.getChildCount() != 1) {
            IntermediateCode c = new IntermediateCode(VMInstructionType.and);
            codes.add(c);
        }
        return null;
    }

    @Override
    public Object visitCmpExpression(TinyScriptParser.CmpExpressionContext ctx) {
        ps.println("visitCmpExpression");
        visitChildren(ctx);
        if(ctx.getChildCount() != 1) {
            String op = ctx.getChild(1).getText();
            IntermediateCode c;
            switch(op) {
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
        return null;
    }

    @Override
    public Object visitAddExpression(TinyScriptParser.AddExpressionContext ctx) {
        ps.println("visitAddExpression");

        if(ctx.getChildCount() != 1) {
            for(int i = 1; i < ctx.getChildCount() - 1; i = i + 2) {
                if(i == 1) {
                    visit(ctx.getChild(0));
                    visit(ctx.getChild(2));
                    insertAddMulExpression(ctx.getChild(1).getText());
                }
                else {
                    visit(ctx.getChild(i + 1));
                    insertAddMulExpression(ctx.getChild(i).getText());
                }
            }
        }
        else {
            visitChildren(ctx);
        }

        return null;
    }

    void insertAddMulExpression(String op) {
        IntermediateCode c;
        switch(op) {
            case "+":
                c = new IntermediateCode(VMInstructionType.add);
                break;
            case "-":
                c = new IntermediateCode(VMInstructionType.sub);
                break;
            case "*":
                c = new IntermediateCode(VMInstructionType.mul);
                break;
            case "/":
                c = new IntermediateCode(VMInstructionType.div);
                break;
            default:
                c = null;
        }
        codes.add(c);
    }

    @Override
    public Object visitMulExpression(TinyScriptParser.MulExpressionContext ctx) {
        ps.println("visitMulExpression");
        if(ctx.getChildCount() != 1) {
            for(int i = 1; i < ctx.getChildCount() - 1; i = i + 2) {
                if(i == 1) {
                    visit(ctx.getChild(0));
                    visit(ctx.getChild(2));
                    insertAddMulExpression(ctx.getChild(1).getText());
                }
                else {
                    visit(ctx.getChild(i + 1));
                    insertAddMulExpression(ctx.getChild(i).getText());
                }
            }
        }
        else {
            visitChildren(ctx);
        }

        return null;
    }

    @Override
    public Object visitUnaryExpression(TinyScriptParser.UnaryExpressionContext ctx) {
        ps.println("visitUnaryExpression");
        IntermediateCode c;
        visitChildren(ctx);
        if(ctx.getChildCount() == 1) {

        }
        else {
            if(ctx.getChild(0).getText().equals("-")) {
                c = new IntermediateCode(VMInstructionType.neg);
            }
            else {
                c = new IntermediateCode(VMInstructionType.not);
            }
            codes.add(c);
        }

        return null;
    }

    @Override
    public Object visitPrimaryExpression(TinyScriptParser.PrimaryExpressionContext ctx) {
        ps.println("visitPrimaryExpression");
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitVariableExpression(TinyScriptParser.VariableExpressionContext ctx) {
        ps.println("visitVariableExpression");
        if(ctx.getChildCount() == 3) {
            visit(ctx.getChild(1));
            return null;
        }
        String s = ctx.Identifier().getText();
        int addr = symbolTable.get(s);
        IntermediateCode c = new IntermediateCode(VMInstructionType.push, addr);
        codes.add(c);
        return null;
    }

    @Override
    public Object visitBasicType(TinyScriptParser.BasicTypeContext ctx) {
        ps.println("visitBasicType");
        return super.visitBasicType(ctx);
    }

    @Override
    public Object visitDeclarators(TinyScriptParser.DeclaratorsContext ctx) {
        ps.println("visitDeclarators");
        inDeclareMode = true;
        visitChildren(ctx);
        inDeclareMode = false;
        return null;
    }

    @Override
    public Object visitAssign(TinyScriptParser.AssignContext ctx) {
        ps.println("visitAssign");
        visitChildren(ctx);
        IntermediateCode c;
        if(inDeclareMode) {
            symbolTable.put(ctx.Identifier().getText(), memAddress);
            c = new IntermediateCode(VMInstructionType.pop, memAddress);
            memAddress++;
        }
        else {
            memAddress = symbolTable.get(ctx.Identifier().getText());
            c = new IntermediateCode(VMInstructionType.pop, memAddress);
        }
        codes.add(c);
        return null;
    }

    @Override
    public Object visitNumericLiteral(TinyScriptParser.NumericLiteralContext ctx) {
        ps.println("visitNumericLiteral");
        String s = ctx.Decimal().getText();
        IntermediateCode c =
                new IntermediateCode(VMInstructionType.push, MemorySegment.DATA, new Integer(s));
        codes.add(c);

        return null;
    }
}
