// Generated from E:/Francis/Documents/JavaWorkplace/Stone-like-Lang/src/main/compiler/project/g4\StoneLike.g4 by ANTLR 4.9
package compiler.project.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StoneLikeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		If=1, Else=2, While=3, Return=4, Var=5, Const=6, Func=7, Add=8, Sub=9, 
		Mul=10, Div=11, Assign=12, Equal=13, NotEqual=14, Less=15, LessEqual=16, 
		Greater=17, GreaterEqual=18, Not=19, And=20, Or=21, LeftParen=22, RightParen=23, 
		LeftBrace=24, RightBrace=25, LeftBracket=26, RightBracket=27, Semicolon=28, 
		Comma=29, Dquote=30, Dot=31, Identifier=32, IntegerLiteral=33, RealLiteral=34, 
		StringLiteral=35, Alpha=36, Digit=37, Whitespace=38, Comment=39;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_expression = 2, RULE_arrayExpression = 3, 
		RULE_expressionList = 4, RULE_boolExpression = 5, RULE_relationalOperator = 6, 
		RULE_additiveExpression = 7, RULE_term = 8, RULE_factor = 9, RULE_valueDeclaration = 10, 
		RULE_variableDeclaration = 11, RULE_constantDeclaration = 12, RULE_functionDeclaration = 13, 
		RULE_initializerList = 14, RULE_initializer = 15, RULE_parameterClause = 16, 
		RULE_parameterList = 17, RULE_assignStatement = 18, RULE_leftValue = 19, 
		RULE_whileStatement = 20, RULE_ifStatement = 21, RULE_elseClause = 22, 
		RULE_returnStatement = 23, RULE_callStatement = 24, RULE_codeBlock = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "expression", "arrayExpression", "expressionList", 
			"boolExpression", "relationalOperator", "additiveExpression", "term", 
			"factor", "valueDeclaration", "variableDeclaration", "constantDeclaration", 
			"functionDeclaration", "initializerList", "initializer", "parameterClause", 
			"parameterList", "assignStatement", "leftValue", "whileStatement", "ifStatement", 
			"elseClause", "returnStatement", "callStatement", "codeBlock"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'while'", "'return'", "'var'", "'const'", "'func'", 
			"'+'", "'-'", "'*'", "'/'", "'='", "'=='", "'!='", "'<'", "'<='", "'>'", 
			"'>='", "'!'", "'&&'", "'||'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"';'", "','", "'\"'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "If", "Else", "While", "Return", "Var", "Const", "Func", "Add", 
			"Sub", "Mul", "Div", "Assign", "Equal", "NotEqual", "Less", "LessEqual", 
			"Greater", "GreaterEqual", "Not", "And", "Or", "LeftParen", "RightParen", 
			"LeftBrace", "RightBrace", "LeftBracket", "RightBracket", "Semicolon", 
			"Comma", "Dquote", "Dot", "Identifier", "IntegerLiteral", "RealLiteral", 
			"StringLiteral", "Alpha", "Digit", "Whitespace", "Comment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "StoneLike.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StoneLikeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> Semicolon() { return getTokens(StoneLikeParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(StoneLikeParser.Semicolon, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << While) | (1L << Return) | (1L << Var) | (1L << Const) | (1L << Func) | (1L << Sub) | (1L << Not) | (1L << LeftParen) | (1L << Identifier) | (1L << IntegerLiteral) | (1L << RealLiteral) | (1L << StringLiteral))) != 0)) {
				{
				{
				setState(52);
				statement();
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Semicolon) {
					{
					{
					setState(53);
					match(Semicolon);
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public CallStatementContext callStatement() {
			return getRuleContext(CallStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueDeclarationContext valueDeclaration() {
			return getRuleContext(ValueDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				callStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				valueDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				functionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				assignStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(70);
				ifStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(71);
				returnStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode Not() { return getToken(StoneLikeParser.Not, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public TerminalNode And() { return getToken(StoneLikeParser.And, 0); }
		public TerminalNode Or() { return getToken(StoneLikeParser.Or, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				{
				setState(75);
				match(Not);
				setState(76);
				expression(4);
				}
				break;
			case Sub:
			case LeftParen:
			case Identifier:
			case IntegerLiteral:
			case RealLiteral:
			case StringLiteral:
				{
				setState(77);
				boolExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(86);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(80);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(81);
						match(And);
						setState(82);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(83);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(84);
						match(Or);
						setState(85);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArrayExpressionContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(StoneLikeParser.LeftBracket, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RightBracket() { return getToken(StoneLikeParser.RightBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(StoneLikeParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(StoneLikeParser.Comma, i);
		}
		public ArrayExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayExpressionContext arrayExpression() throws RecognitionException {
		ArrayExpressionContext _localctx = new ArrayExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arrayExpression);
		int _la;
		try {
			int _alt;
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(LeftBracket);
				setState(92);
				expression(0);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(93);
					match(Comma);
					setState(94);
					expression(0);
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(100);
				match(RightBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(LeftBracket);
				setState(103);
				expression(0);
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(104);
						match(Comma);
						setState(105);
						expression(0);
						}
						} 
					}
					setState(110);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				notifyErrorListeners("Missing ']'");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				expression(0);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(114);
					match(Comma);
					setState(115);
					expression(0);
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				match(RightBracket);
				notifyErrorListeners("Missing '['");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ArrayExpressionContext> arrayExpression() {
			return getRuleContexts(ArrayExpressionContext.class);
		}
		public ArrayExpressionContext arrayExpression(int i) {
			return getRuleContext(ArrayExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(StoneLikeParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(StoneLikeParser.Comma, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(126);
				expression(0);
				}
				break;
			case 2:
				{
				setState(127);
				arrayExpression();
				}
				break;
			}
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(130);
					match(Comma);
					setState(133);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(131);
						expression(0);
						}
						break;
					case 2:
						{
						setState(132);
						arrayExpression();
						}
						break;
					}
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public RelationalOperatorContext relationalOperator() {
			return getRuleContext(RelationalOperatorContext.class,0);
		}
		public BoolExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpressionContext boolExpression() throws RecognitionException {
		BoolExpressionContext _localctx = new BoolExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_boolExpression);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				additiveExpression(0);
				setState(141);
				relationalOperator();
				setState(142);
				additiveExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				additiveExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalOperatorContext extends ParserRuleContext {
		public TerminalNode LessEqual() { return getToken(StoneLikeParser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(StoneLikeParser.GreaterEqual, 0); }
		public TerminalNode Equal() { return getToken(StoneLikeParser.Equal, 0); }
		public TerminalNode Less() { return getToken(StoneLikeParser.Less, 0); }
		public TerminalNode Greater() { return getToken(StoneLikeParser.Greater, 0); }
		public TerminalNode NotEqual() { return getToken(StoneLikeParser.NotEqual, 0); }
		public RelationalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitRelationalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_relationalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << NotEqual) | (1L << Less) | (1L << LessEqual) | (1L << Greater) | (1L << GreaterEqual))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Token operator;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode Add() { return getToken(StoneLikeParser.Add, 0); }
		public TerminalNode Sub() { return getToken(StoneLikeParser.Sub, 0); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_additiveExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(150);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
					setState(152);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(153);
					((AdditiveExpressionContext)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==Add || _la==Sub) ) {
						((AdditiveExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(154);
					term(0);
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public Token operator;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode Mul() { return getToken(StoneLikeParser.Mul, 0); }
		public TerminalNode Div() { return getToken(StoneLikeParser.Div, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(161);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(163);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(164);
					((TermContext)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==Mul || _la==Div) ) {
						((TermContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(165);
					factor();
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(StoneLikeParser.Identifier, 0); }
		public TerminalNode LeftBracket() { return getToken(StoneLikeParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(StoneLikeParser.RightBracket, 0); }
		public TerminalNode LeftParen() { return getToken(StoneLikeParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(StoneLikeParser.RightParen, 0); }
		public TerminalNode IntegerLiteral() { return getToken(StoneLikeParser.IntegerLiteral, 0); }
		public TerminalNode RealLiteral() { return getToken(StoneLikeParser.RealLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(StoneLikeParser.StringLiteral, 0); }
		public TerminalNode Sub() { return getToken(StoneLikeParser.Sub, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public CallStatementContext callStatement() {
			return getRuleContext(CallStatementContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_factor);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(Identifier);
				setState(173);
				match(LeftBracket);
				setState(174);
				expression(0);
				setState(175);
				match(RightBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				match(LeftParen);
				setState(178);
				expression(0);
				setState(179);
				match(RightParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				match(IntegerLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				match(RealLiteral);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				match(StringLiteral);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
				match(Sub);
				setState(185);
				factor();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(186);
				callStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public ValueDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitValueDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueDeclarationContext valueDeclaration() throws RecognitionException {
		ValueDeclarationContext _localctx = new ValueDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_valueDeclaration);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				variableDeclaration();
				}
				break;
			case Const:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				constantDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(StoneLikeParser.Var, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(Var);
			setState(194);
			initializerList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(StoneLikeParser.Const, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitConstantDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constantDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(Const);
			setState(197);
			initializerList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Func() { return getToken(StoneLikeParser.Func, 0); }
		public TerminalNode Identifier() { return getToken(StoneLikeParser.Identifier, 0); }
		public ParameterClauseContext parameterClause() {
			return getRuleContext(ParameterClauseContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(Func);
			setState(200);
			match(Identifier);
			setState(201);
			parameterClause();
			setState(202);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerListContext extends ParserRuleContext {
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(StoneLikeParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(StoneLikeParser.Comma, i);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_initializerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			initializer();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(205);
				match(Comma);
				setState(206);
				initializer();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(StoneLikeParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(StoneLikeParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayExpressionContext arrayExpression() {
			return getRuleContext(ArrayExpressionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_initializer);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(Identifier);
				setState(213);
				match(Assign);
				setState(214);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(Identifier);
				setState(216);
				match(Assign);
				setState(217);
				arrayExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterClauseContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(StoneLikeParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(StoneLikeParser.RightParen, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitParameterClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterClauseContext parameterClause() throws RecognitionException {
		ParameterClauseContext _localctx = new ParameterClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameterClause);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(LeftParen);
				setState(221);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(LeftParen);
				setState(223);
				parameterList();
				setState(224);
				match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(StoneLikeParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(StoneLikeParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(StoneLikeParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(StoneLikeParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(Identifier);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(229);
				match(Comma);
				setState(230);
				match(Identifier);
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignStatementContext extends ParserRuleContext {
		public LeftValueContext leftValue() {
			return getRuleContext(LeftValueContext.class,0);
		}
		public TerminalNode Assign() { return getToken(StoneLikeParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayExpressionContext arrayExpression() {
			return getRuleContext(ArrayExpressionContext.class,0);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignStatement);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				leftValue();
				setState(237);
				match(Assign);
				setState(238);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				leftValue();
				setState(241);
				match(Assign);
				setState(242);
				arrayExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftValueContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(StoneLikeParser.Identifier, 0); }
		public TerminalNode LeftBracket() { return getToken(StoneLikeParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(StoneLikeParser.RightBracket, 0); }
		public LeftValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitLeftValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftValueContext leftValue() throws RecognitionException {
		LeftValueContext _localctx = new LeftValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_leftValue);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(Identifier);
				setState(248);
				match(LeftBracket);
				setState(249);
				expression(0);
				setState(250);
				match(RightBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				match(Identifier);
				setState(253);
				match(LeftBracket);
				setState(254);
				expression(0);
				notifyErrorListeners("Missing ']'");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				match(Identifier);
				setState(258);
				expression(0);
				setState(259);
				match(RightBracket);
				notifyErrorListeners("Missing '['");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(StoneLikeParser.While, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(While);
			setState(265);
			expression(0);
			setState(266);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(StoneLikeParser.If, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(If);
			setState(269);
			expression(0);
			setState(270);
			codeBlock();
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(271);
				elseClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseClauseContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(StoneLikeParser.Else, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitElseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_elseClause);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(Else);
				setState(275);
				codeBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(Else);
				setState(277);
				ifStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(StoneLikeParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_returnStatement);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(Return);
				setState(281);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(Return);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(StoneLikeParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(StoneLikeParser.LeftParen, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(StoneLikeParser.RightParen, 0); }
		public CallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallStatementContext callStatement() throws RecognitionException {
		CallStatementContext _localctx = new CallStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_callStatement);
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(Identifier);
				setState(286);
				match(LeftParen);
				setState(287);
				expressionList();
				setState(288);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(Identifier);
				setState(291);
				match(LeftParen);
				setState(292);
				match(RightParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(Identifier);
				setState(294);
				match(LeftParen);
				setState(295);
				expressionList();
				notifyErrorListeners("Missing ')'");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(298);
				match(Identifier);
				setState(299);
				expressionList();
				setState(300);
				match(RightParen);
				notifyErrorListeners("Missing ')'");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(303);
				match(Identifier);
				setState(304);
				match(LeftParen);
				notifyErrorListeners("Missing ')'");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(306);
				match(Identifier);
				setState(307);
				match(RightParen);
				notifyErrorListeners("Missing '('");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeBlockContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(StoneLikeParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(StoneLikeParser.RightBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> Semicolon() { return getTokens(StoneLikeParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(StoneLikeParser.Semicolon, i);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_codeBlock);
		int _la;
		try {
			int _alt;
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(LeftBrace);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << While) | (1L << Return) | (1L << Var) | (1L << Const) | (1L << Func) | (1L << Sub) | (1L << Not) | (1L << LeftParen) | (1L << Identifier) | (1L << IntegerLiteral) | (1L << RealLiteral) | (1L << StringLiteral))) != 0)) {
					{
					{
					setState(312);
					statement();
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Semicolon) {
						{
						{
						setState(313);
						match(Semicolon);
						}
						}
						setState(318);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(324);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(LeftBrace);
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(326);
						statement();
						setState(330);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(327);
								match(Semicolon);
								}
								} 
							}
							setState(332);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
						}
						}
						} 
					}
					setState(337);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				notifyErrorListeners("Missing '}'");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << While) | (1L << Return) | (1L << Var) | (1L << Const) | (1L << Func) | (1L << Sub) | (1L << Not) | (1L << LeftParen) | (1L << Identifier) | (1L << IntegerLiteral) | (1L << RealLiteral) | (1L << StringLiteral))) != 0)) {
					{
					{
					setState(339);
					statement();
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Semicolon) {
						{
						{
						setState(340);
						match(Semicolon);
						}
						}
						setState(345);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(350);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(351);
				match(RightBrace);
				notifyErrorListeners("Missing '{'");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 7:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 8:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0166\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\7\2>\n\2\f\2\16\2"+
		"A\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3K\n\3\3\4\3\4\3\4\3\4\5\4Q\n"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4Y\n\4\f\4\16\4\\\13\4\3\5\3\5\3\5\3\5\7"+
		"\5b\n\5\f\5\16\5e\13\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5m\n\5\f\5\16\5p\13\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5w\n\5\f\5\16\5z\13\5\3\5\3\5\3\5\5\5\177\n\5\3"+
		"\6\3\6\5\6\u0083\n\6\3\6\3\6\3\6\5\6\u0088\n\6\7\6\u008a\n\6\f\6\16\6"+
		"\u008d\13\6\3\7\3\7\3\7\3\7\3\7\5\7\u0094\n\7\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\7\t\u009e\n\t\f\t\16\t\u00a1\13\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u00a9\n\n\f\n\16\n\u00ac\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00be\n\13\3\f\3\f\5\f\u00c2"+
		"\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\7\20\u00d2\n\20\f\20\16\20\u00d5\13\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00dd\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e5\n\22\3\23\3"+
		"\23\3\23\7\23\u00ea\n\23\f\23\16\23\u00ed\13\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\5\24\u00f7\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0109\n\25\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u0113\n\27\3\30\3\30\3\30\3\30\5\30"+
		"\u0119\n\30\3\31\3\31\3\31\5\31\u011e\n\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\5\32\u0138\n\32\3\33\3\33\3\33\7\33\u013d\n\33"+
		"\f\33\16\33\u0140\13\33\7\33\u0142\n\33\f\33\16\33\u0145\13\33\3\33\3"+
		"\33\3\33\3\33\7\33\u014b\n\33\f\33\16\33\u014e\13\33\7\33\u0150\n\33\f"+
		"\33\16\33\u0153\13\33\3\33\3\33\3\33\7\33\u0158\n\33\f\33\16\33\u015b"+
		"\13\33\7\33\u015d\n\33\f\33\16\33\u0160\13\33\3\33\3\33\5\33\u0164\n\33"+
		"\3\33\2\5\6\20\22\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\2\5\3\2\17\24\3\2\n\13\3\2\f\r\2\u0182\2?\3\2\2\2\4J\3\2\2\2\6"+
		"P\3\2\2\2\b~\3\2\2\2\n\u0082\3\2\2\2\f\u0093\3\2\2\2\16\u0095\3\2\2\2"+
		"\20\u0097\3\2\2\2\22\u00a2\3\2\2\2\24\u00bd\3\2\2\2\26\u00c1\3\2\2\2\30"+
		"\u00c3\3\2\2\2\32\u00c6\3\2\2\2\34\u00c9\3\2\2\2\36\u00ce\3\2\2\2 \u00dc"+
		"\3\2\2\2\"\u00e4\3\2\2\2$\u00e6\3\2\2\2&\u00f6\3\2\2\2(\u0108\3\2\2\2"+
		"*\u010a\3\2\2\2,\u010e\3\2\2\2.\u0118\3\2\2\2\60\u011d\3\2\2\2\62\u0137"+
		"\3\2\2\2\64\u0163\3\2\2\2\66:\5\4\3\2\679\7\36\2\28\67\3\2\2\29<\3\2\2"+
		"\2:8\3\2\2\2:;\3\2\2\2;>\3\2\2\2<:\3\2\2\2=\66\3\2\2\2>A\3\2\2\2?=\3\2"+
		"\2\2?@\3\2\2\2@\3\3\2\2\2A?\3\2\2\2BK\5\62\32\2CK\5\6\4\2DK\5\26\f\2E"+
		"K\5\34\17\2FK\5&\24\2GK\5*\26\2HK\5,\27\2IK\5\60\31\2JB\3\2\2\2JC\3\2"+
		"\2\2JD\3\2\2\2JE\3\2\2\2JF\3\2\2\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\5\3"+
		"\2\2\2LM\b\4\1\2MN\7\25\2\2NQ\5\6\4\6OQ\5\f\7\2PL\3\2\2\2PO\3\2\2\2QZ"+
		"\3\2\2\2RS\f\5\2\2ST\7\26\2\2TY\5\6\4\6UV\f\4\2\2VW\7\27\2\2WY\5\6\4\5"+
		"XR\3\2\2\2XU\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\7\3\2\2\2\\Z\3\2"+
		"\2\2]^\7\34\2\2^c\5\6\4\2_`\7\37\2\2`b\5\6\4\2a_\3\2\2\2be\3\2\2\2ca\3"+
		"\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\35\2\2g\177\3\2\2\2hi\7\34\2"+
		"\2in\5\6\4\2jk\7\37\2\2km\5\6\4\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2"+
		"\2\2oq\3\2\2\2pn\3\2\2\2qr\b\5\1\2r\177\3\2\2\2sx\5\6\4\2tu\7\37\2\2u"+
		"w\5\6\4\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2"+
		"{|\7\35\2\2|}\b\5\1\2}\177\3\2\2\2~]\3\2\2\2~h\3\2\2\2~s\3\2\2\2\177\t"+
		"\3\2\2\2\u0080\u0083\5\6\4\2\u0081\u0083\5\b\5\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0081\3\2\2\2\u0083\u008b\3\2\2\2\u0084\u0087\7\37\2\2\u0085\u0088\5"+
		"\6\4\2\u0086\u0088\5\b\5\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\u008a\3\2\2\2\u0089\u0084\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\13\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f"+
		"\5\20\t\2\u008f\u0090\5\16\b\2\u0090\u0091\5\20\t\2\u0091\u0094\3\2\2"+
		"\2\u0092\u0094\5\20\t\2\u0093\u008e\3\2\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\r\3\2\2\2\u0095\u0096\t\2\2\2\u0096\17\3\2\2\2\u0097\u0098\b\t\1\2\u0098"+
		"\u0099\5\22\n\2\u0099\u009f\3\2\2\2\u009a\u009b\f\4\2\2\u009b\u009c\t"+
		"\3\2\2\u009c\u009e\5\22\n\2\u009d\u009a\3\2\2\2\u009e\u00a1\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\21\3\2\2\2\u00a1\u009f\3\2\2"+
		"\2\u00a2\u00a3\b\n\1\2\u00a3\u00a4\5\24\13\2\u00a4\u00aa\3\2\2\2\u00a5"+
		"\u00a6\f\4\2\2\u00a6\u00a7\t\4\2\2\u00a7\u00a9\5\24\13\2\u00a8\u00a5\3"+
		"\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\23\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00be\7\"\2\2\u00ae\u00af\7\"\2"+
		"\2\u00af\u00b0\7\34\2\2\u00b0\u00b1\5\6\4\2\u00b1\u00b2\7\35\2\2\u00b2"+
		"\u00be\3\2\2\2\u00b3\u00b4\7\30\2\2\u00b4\u00b5\5\6\4\2\u00b5\u00b6\7"+
		"\31\2\2\u00b6\u00be\3\2\2\2\u00b7\u00be\7#\2\2\u00b8\u00be\7$\2\2\u00b9"+
		"\u00be\7%\2\2\u00ba\u00bb\7\13\2\2\u00bb\u00be\5\24\13\2\u00bc\u00be\5"+
		"\62\32\2\u00bd\u00ad\3\2\2\2\u00bd\u00ae\3\2\2\2\u00bd\u00b3\3\2\2\2\u00bd"+
		"\u00b7\3\2\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00b9\3\2\2\2\u00bd\u00ba\3\2"+
		"\2\2\u00bd\u00bc\3\2\2\2\u00be\25\3\2\2\2\u00bf\u00c2\5\30\r\2\u00c0\u00c2"+
		"\5\32\16\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\27\3\2\2\2\u00c3"+
		"\u00c4\7\7\2\2\u00c4\u00c5\5\36\20\2\u00c5\31\3\2\2\2\u00c6\u00c7\7\b"+
		"\2\2\u00c7\u00c8\5\36\20\2\u00c8\33\3\2\2\2\u00c9\u00ca\7\t\2\2\u00ca"+
		"\u00cb\7\"\2\2\u00cb\u00cc\5\"\22\2\u00cc\u00cd\5\64\33\2\u00cd\35\3\2"+
		"\2\2\u00ce\u00d3\5 \21\2\u00cf\u00d0\7\37\2\2\u00d0\u00d2\5 \21\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\37\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7\"\2\2\u00d7\u00d8"+
		"\7\16\2\2\u00d8\u00dd\5\6\4\2\u00d9\u00da\7\"\2\2\u00da\u00db\7\16\2\2"+
		"\u00db\u00dd\5\b\5\2\u00dc\u00d6\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dd!\3"+
		"\2\2\2\u00de\u00df\7\30\2\2\u00df\u00e5\7\31\2\2\u00e0\u00e1\7\30\2\2"+
		"\u00e1\u00e2\5$\23\2\u00e2\u00e3\7\31\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00de"+
		"\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e5#\3\2\2\2\u00e6\u00eb\7\"\2\2\u00e7"+
		"\u00e8\7\37\2\2\u00e8\u00ea\7\"\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3"+
		"\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec%\3\2\2\2\u00ed\u00eb"+
		"\3\2\2\2\u00ee\u00ef\5(\25\2\u00ef\u00f0\7\16\2\2\u00f0\u00f1\5\6\4\2"+
		"\u00f1\u00f7\3\2\2\2\u00f2\u00f3\5(\25\2\u00f3\u00f4\7\16\2\2\u00f4\u00f5"+
		"\5\b\5\2\u00f5\u00f7\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f7"+
		"\'\3\2\2\2\u00f8\u0109\7\"\2\2\u00f9\u00fa\7\"\2\2\u00fa\u00fb\7\34\2"+
		"\2\u00fb\u00fc\5\6\4\2\u00fc\u00fd\7\35\2\2\u00fd\u0109\3\2\2\2\u00fe"+
		"\u00ff\7\"\2\2\u00ff\u0100\7\34\2\2\u0100\u0101\5\6\4\2\u0101\u0102\b"+
		"\25\1\2\u0102\u0109\3\2\2\2\u0103\u0104\7\"\2\2\u0104\u0105\5\6\4\2\u0105"+
		"\u0106\7\35\2\2\u0106\u0107\b\25\1\2\u0107\u0109\3\2\2\2\u0108\u00f8\3"+
		"\2\2\2\u0108\u00f9\3\2\2\2\u0108\u00fe\3\2\2\2\u0108\u0103\3\2\2\2\u0109"+
		")\3\2\2\2\u010a\u010b\7\5\2\2\u010b\u010c\5\6\4\2\u010c\u010d\5\64\33"+
		"\2\u010d+\3\2\2\2\u010e\u010f\7\3\2\2\u010f\u0110\5\6\4\2\u0110\u0112"+
		"\5\64\33\2\u0111\u0113\5.\30\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2"+
		"\u0113-\3\2\2\2\u0114\u0115\7\4\2\2\u0115\u0119\5\64\33\2\u0116\u0117"+
		"\7\4\2\2\u0117\u0119\5,\27\2\u0118\u0114\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"/\3\2\2\2\u011a\u011b\7\6\2\2\u011b\u011e\5\6\4\2\u011c\u011e\7\6\2\2"+
		"\u011d\u011a\3\2\2\2\u011d\u011c\3\2\2\2\u011e\61\3\2\2\2\u011f\u0120"+
		"\7\"\2\2\u0120\u0121\7\30\2\2\u0121\u0122\5\n\6\2\u0122\u0123\7\31\2\2"+
		"\u0123\u0138\3\2\2\2\u0124\u0125\7\"\2\2\u0125\u0126\7\30\2\2\u0126\u0138"+
		"\7\31\2\2\u0127\u0128\7\"\2\2\u0128\u0129\7\30\2\2\u0129\u012a\5\n\6\2"+
		"\u012a\u012b\b\32\1\2\u012b\u0138\3\2\2\2\u012c\u012d\7\"\2\2\u012d\u012e"+
		"\5\n\6\2\u012e\u012f\7\31\2\2\u012f\u0130\b\32\1\2\u0130\u0138\3\2\2\2"+
		"\u0131\u0132\7\"\2\2\u0132\u0133\7\30\2\2\u0133\u0138\b\32\1\2\u0134\u0135"+
		"\7\"\2\2\u0135\u0136\7\31\2\2\u0136\u0138\b\32\1\2\u0137\u011f\3\2\2\2"+
		"\u0137\u0124\3\2\2\2\u0137\u0127\3\2\2\2\u0137\u012c\3\2\2\2\u0137\u0131"+
		"\3\2\2\2\u0137\u0134\3\2\2\2\u0138\63\3\2\2\2\u0139\u0143\7\32\2\2\u013a"+
		"\u013e\5\4\3\2\u013b\u013d\7\36\2\2\u013c\u013b\3\2\2\2\u013d\u0140\3"+
		"\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0142\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0141\u013a\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146"+
		"\u0164\7\33\2\2\u0147\u0151\7\32\2\2\u0148\u014c\5\4\3\2\u0149\u014b\7"+
		"\36\2\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0148\3\2"+
		"\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0164\b\33\1\2\u0155\u0159\5"+
		"\4\3\2\u0156\u0158\7\36\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015c\u0155\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\7\33"+
		"\2\2\u0162\u0164\b\33\1\2\u0163\u0139\3\2\2\2\u0163\u0147\3\2\2\2\u0163"+
		"\u015e\3\2\2\2\u0164\65\3\2\2\2%:?JPXZcnx~\u0082\u0087\u008b\u0093\u009f"+
		"\u00aa\u00bd\u00c1\u00d3\u00dc\u00e4\u00eb\u00f6\u0108\u0112\u0118\u011d"+
		"\u0137\u013e\u0143\u014c\u0151\u0159\u015e\u0163";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}