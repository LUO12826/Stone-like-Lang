package compiler.project.antlr;// Generated from StoneLike.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StoneLikeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StoneLikeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StoneLikeParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(StoneLikeParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoneLikeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(StoneLikeParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoneLikeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(StoneLikeParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoneLikeParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(StoneLikeParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoneLikeParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(StoneLikeParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoneLikeParser#relationalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperator(StoneLikeParser.RelationalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoneLikeParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(StoneLikeParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoneLikeParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(StoneLikeParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoneLikeParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(StoneLikeParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoneLikeParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(StoneLikeParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoneLikeParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(StoneLikeParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoneLikeParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(StoneLikeParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoneLikeParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(StoneLikeParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoneLikeParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(StoneLikeParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoneLikeParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(StoneLikeParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoneLikeParser#parameterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterClause(StoneLikeParser.ParameterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoneLikeParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(StoneLikeParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoneLikeParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(StoneLikeParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoneLikeParser#leftValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftValue(StoneLikeParser.LeftValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoneLikeParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(StoneLikeParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoneLikeParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(StoneLikeParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoneLikeParser#elseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseClause(StoneLikeParser.ElseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoneLikeParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(StoneLikeParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoneLikeParser#callStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStatement(StoneLikeParser.CallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StoneLikeParser#codeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(StoneLikeParser.CodeBlockContext ctx);
}