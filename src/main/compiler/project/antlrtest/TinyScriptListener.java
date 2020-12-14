// Generated from TinyScript.g4 by ANTLR 4.9
package compiler.project.antlrtest;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TinyScriptParser}.
 */
public interface TinyScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TinyScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TinyScriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TinyScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TinyScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(TinyScriptParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(TinyScriptParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#quoteExpr}.
	 * @param ctx the parse tree
	 */
	void enterQuoteExpr(TinyScriptParser.QuoteExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#quoteExpr}.
	 * @param ctx the parse tree
	 */
	void exitQuoteExpr(TinyScriptParser.QuoteExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(TinyScriptParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(TinyScriptParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(TinyScriptParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(TinyScriptParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#declareStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclareStatement(TinyScriptParser.DeclareStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#declareStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclareStatement(TinyScriptParser.DeclareStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(TinyScriptParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(TinyScriptParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(TinyScriptParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(TinyScriptParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(TinyScriptParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(TinyScriptParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(TinyScriptParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(TinyScriptParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#commonExpression}.
	 * @param ctx the parse tree
	 */
	void enterCommonExpression(TinyScriptParser.CommonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#commonExpression}.
	 * @param ctx the parse tree
	 */
	void exitCommonExpression(TinyScriptParser.CommonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#assignAbleStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignAbleStatement(TinyScriptParser.AssignAbleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#assignAbleStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignAbleStatement(TinyScriptParser.AssignAbleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#declareExpression}.
	 * @param ctx the parse tree
	 */
	void enterDeclareExpression(TinyScriptParser.DeclareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#declareExpression}.
	 * @param ctx the parse tree
	 */
	void exitDeclareExpression(TinyScriptParser.DeclareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TinyScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TinyScriptParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#andAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndAndExpression(TinyScriptParser.AndAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#andAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndAndExpression(TinyScriptParser.AndAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#cmpExpression}.
	 * @param ctx the parse tree
	 */
	void enterCmpExpression(TinyScriptParser.CmpExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#cmpExpression}.
	 * @param ctx the parse tree
	 */
	void exitCmpExpression(TinyScriptParser.CmpExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(TinyScriptParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(TinyScriptParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#mulExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpression(TinyScriptParser.MulExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#mulExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpression(TinyScriptParser.MulExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(TinyScriptParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(TinyScriptParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(TinyScriptParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(TinyScriptParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#variableExpression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(TinyScriptParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#variableExpression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(TinyScriptParser.VariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#basicType}.
	 * @param ctx the parse tree
	 */
	void enterBasicType(TinyScriptParser.BasicTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#basicType}.
	 * @param ctx the parse tree
	 */
	void exitBasicType(TinyScriptParser.BasicTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#declarators}.
	 * @param ctx the parse tree
	 */
	void enterDeclarators(TinyScriptParser.DeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#declarators}.
	 * @param ctx the parse tree
	 */
	void exitDeclarators(TinyScriptParser.DeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(TinyScriptParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(TinyScriptParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(TinyScriptParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(TinyScriptParser.NumericLiteralContext ctx);
}
