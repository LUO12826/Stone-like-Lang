// Generated from /Users/luohuizhou/Documents/javaProject/Stone-like-Lang/src/main/compiler/project/g4/StoneLike.g4 by ANTLR 4.9
package compiler.project.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StoneLikeParser}.
 */
public interface StoneLikeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StoneLikeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(StoneLikeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoneLikeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(StoneLikeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoneLikeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(StoneLikeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoneLikeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(StoneLikeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoneLikeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(StoneLikeParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoneLikeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(StoneLikeParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoneLikeParser#arrayExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpression(StoneLikeParser.ArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoneLikeParser#arrayExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpression(StoneLikeParser.ArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoneLikeParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(StoneLikeParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoneLikeParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(StoneLikeParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoneLikeParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(StoneLikeParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoneLikeParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(StoneLikeParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoneLikeParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(StoneLikeParser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoneLikeParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(StoneLikeParser.RelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoneLikeParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(StoneLikeParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoneLikeParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(StoneLikeParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoneLikeParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(StoneLikeParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoneLikeParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(StoneLikeParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoneLikeParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(StoneLikeParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoneLikeParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(StoneLikeParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoneLikeParser#valueDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterValueDeclaration(StoneLikeParser.ValueDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoneLikeParser#valueDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitValueDeclaration(StoneLikeParser.ValueDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoneLikeParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(StoneLikeParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoneLikeParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(StoneLikeParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoneLikeParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(StoneLikeParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoneLikeParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(StoneLikeParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoneLikeParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(StoneLikeParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoneLikeParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(StoneLikeParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoneLikeParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(StoneLikeParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoneLikeParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(StoneLikeParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoneLikeParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(StoneLikeParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoneLikeParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(StoneLikeParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoneLikeParser#parameterClause}.
	 * @param ctx the parse tree
	 */
	void enterParameterClause(StoneLikeParser.ParameterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoneLikeParser#parameterClause}.
	 * @param ctx the parse tree
	 */
	void exitParameterClause(StoneLikeParser.ParameterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoneLikeParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(StoneLikeParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoneLikeParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(StoneLikeParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoneLikeParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(StoneLikeParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoneLikeParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(StoneLikeParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoneLikeParser#leftValue}.
	 * @param ctx the parse tree
	 */
	void enterLeftValue(StoneLikeParser.LeftValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoneLikeParser#leftValue}.
	 * @param ctx the parse tree
	 */
	void exitLeftValue(StoneLikeParser.LeftValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoneLikeParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(StoneLikeParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoneLikeParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(StoneLikeParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoneLikeParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(StoneLikeParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoneLikeParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(StoneLikeParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoneLikeParser#elseClause}.
	 * @param ctx the parse tree
	 */
	void enterElseClause(StoneLikeParser.ElseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoneLikeParser#elseClause}.
	 * @param ctx the parse tree
	 */
	void exitElseClause(StoneLikeParser.ElseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoneLikeParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(StoneLikeParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoneLikeParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(StoneLikeParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoneLikeParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void enterCallStatement(StoneLikeParser.CallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoneLikeParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void exitCallStatement(StoneLikeParser.CallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StoneLikeParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(StoneLikeParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StoneLikeParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(StoneLikeParser.CodeBlockContext ctx);
}
