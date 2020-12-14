// Generated from TinyScript.g4 by ANTLR 4.9
package compiler.project.antlrtest;
import compiler.project.antlrtest.TinyScriptParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TinyScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TinyScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TinyScriptParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TinyScriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(TinyScriptParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#quoteExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuoteExpr(TinyScriptParser.QuoteExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(TinyScriptParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(TinyScriptParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#declareStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareStatement(TinyScriptParser.DeclareStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(TinyScriptParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(TinyScriptParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(TinyScriptParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(TinyScriptParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#commonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonExpression(TinyScriptParser.CommonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#assignAbleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignAbleStatement(TinyScriptParser.AssignAbleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#declareExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareExpression(TinyScriptParser.DeclareExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TinyScriptParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#andAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndAndExpression(TinyScriptParser.AndAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#cmpExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpExpression(TinyScriptParser.CmpExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#addExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(TinyScriptParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#mulExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpression(TinyScriptParser.MulExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(TinyScriptParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(TinyScriptParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#variableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(TinyScriptParser.VariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#basicType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicType(TinyScriptParser.BasicTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#declarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarators(TinyScriptParser.DeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(TinyScriptParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(TinyScriptParser.NumericLiteralContext ctx);
}
