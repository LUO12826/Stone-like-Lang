// Generated from StoneLike.g4 by ANTLR 4.9
package compiler.project.antlr;
import compiler.project.antlr.StoneLikeListener;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

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
		LeftBarce=24, RightBrace=25, LeftBracket=26, RightBracket=27, Semicolon=28,
		Comma=29, Dquote=30, Identifier=31, NumberLiteral=32, StringLiteral=33,
		Alpha=34, Digit=35, Whitespce=36, Comment=37;
	public static final int
		RULE_program = 0, RULE_globalStatement = 1, RULE_functionBlockStatement = 2,
		RULE_statement = 3, RULE_expression = 4, RULE_arrayExpression = 5, RULE_expressionList = 6,
		RULE_boolExpression = 7, RULE_relationalOperator = 8, RULE_additiveExpression = 9,
		RULE_term = 10, RULE_factor = 11, RULE_valueDeclaration = 12, RULE_variableDeclaration = 13,
		RULE_constantDeclaration = 14, RULE_functionDeclaration = 15, RULE_initializerList = 16,
		RULE_initializer = 17, RULE_parameterClause = 18, RULE_parameterList = 19,
		RULE_assignStatement = 20, RULE_leftValue = 21, RULE_whileStatement = 22,
		RULE_ifStatement = 23, RULE_elseClause = 24, RULE_returnStatement = 25,
		RULE_callStatement = 26, RULE_commonCodeBlock = 27, RULE_functionBlock = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "globalStatement", "functionBlockStatement", "statement",
			"expression", "arrayExpression", "expressionList", "boolExpression",
			"relationalOperator", "additiveExpression", "term", "factor", "valueDeclaration",
			"variableDeclaration", "constantDeclaration", "functionDeclaration",
			"initializerList", "initializer", "parameterClause", "parameterList",
			"assignStatement", "leftValue", "whileStatement", "ifStatement", "elseClause",
			"returnStatement", "callStatement", "commonCodeBlock", "functionBlock"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'while'", "'return'", "'var'", "'const'", "'func'",
			"'+'", "'-'", "'*'", "'/'", "'='", "'=='", "'!='", "'<'", "'<='", "'>'",
			"'>='", "'!'", "'&&'", "'||'", "'('", "')'", "'{'", "'}'", "'['", "']'",
			"';'", "','", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "If", "Else", "While", "Return", "Var", "Const", "Func", "Add",
			"Sub", "Mul", "Div", "Assign", "Equal", "NotEqual", "Less", "LessEqual",
			"Greater", "GreaterEqual", "Not", "And", "Or", "LeftParen", "RightParen",
			"LeftBarce", "RightBrace", "LeftBracket", "RightBracket", "Semicolon",
			"Comma", "Dquote", "Identifier", "NumberLiteral", "StringLiteral", "Alpha",
			"Digit", "Whitespce", "Comment"
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
		public List<GlobalStatementContext> globalStatement() {
			return getRuleContexts(GlobalStatementContext.class);
		}
		public GlobalStatementContext globalStatement(int i) {
			return getRuleContext(GlobalStatementContext.class,i);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener) ((StoneLikeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitProgram(this);
		}
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
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << While) | (1L << Var) | (1L << Const) | (1L << Func) | (1L << Sub) | (1L << Not) | (1L << LeftParen) | (1L << Identifier) | (1L << NumberLiteral) | (1L << StringLiteral))) != 0)) {
				{
				{
				setState(58);
				globalStatement();
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Semicolon) {
					{
					{
					setState(59);
					match(Semicolon);
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(69);
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

	public static class GlobalStatementContext extends ParserRuleContext {
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
		public GlobalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterGlobalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitGlobalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitGlobalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalStatementContext globalStatement() throws RecognitionException {
		GlobalStatementContext _localctx = new GlobalStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_globalStatement);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				callStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				valueDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				functionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				assignStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(76);
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

	public static class FunctionBlockStatementContext extends ParserRuleContext {
		public CallStatementContext callStatement() {
			return getRuleContext(CallStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueDeclarationContext valueDeclaration() {
			return getRuleContext(ValueDeclarationContext.class,0);
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
		public FunctionBlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBlockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterFunctionBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitFunctionBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitFunctionBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBlockStatementContext functionBlockStatement() throws RecognitionException {
		FunctionBlockStatementContext _localctx = new FunctionBlockStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionBlockStatement);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				callStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				valueDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				assignStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				ifStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(85);
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
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				callStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				valueDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				assignStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode Not() { return getToken(StoneLikeParser.Not, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitExpression(this);
		}
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				{
				setState(97);
				match(Not);
				setState(98);
				expression(2);
				}
				break;
			case Sub:
			case LeftParen:
			case Identifier:
			case NumberLiteral:
			case StringLiteral:
				{
				setState(99);
				boolExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(108);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(102);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(103);
						match(And);
						setState(104);
						boolExpression();
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(105);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(106);
						match(Or);
						setState(107);
						boolExpression();
						}
						break;
					}
					}
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitArrayExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayExpressionContext arrayExpression() throws RecognitionException {
		ArrayExpressionContext _localctx = new ArrayExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrayExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(LeftBracket);
			setState(114);
			expression(0);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(115);
				match(Comma);
				setState(116);
				expression(0);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(RightBracket);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Sub:
			case Not:
			case LeftParen:
			case Identifier:
			case NumberLiteral:
			case StringLiteral:
				{
				setState(124);
				expression(0);
				}
				break;
			case LeftBracket:
				{
				setState(125);
				arrayExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(128);
				match(Comma);
				setState(131);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Sub:
				case Not:
				case LeftParen:
				case Identifier:
				case NumberLiteral:
				case StringLiteral:
					{
					setState(129);
					expression(0);
					}
					break;
				case LeftBracket:
					{
					setState(130);
					arrayExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(137);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitBoolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpressionContext boolExpression() throws RecognitionException {
		BoolExpressionContext _localctx = new BoolExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_boolExpression);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				additiveExpression(0);
				setState(139);
				relationalOperator();
				setState(140);
				additiveExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterRelationalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitRelationalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitRelationalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_relationalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitAdditiveExpression(this);
		}
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_additiveExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(148);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
					setState(150);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(151);
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
					setState(152);
					term(0);
					}
					}
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitTerm(this);
		}
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(159);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(161);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(162);
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
					setState(163);
					factor();
					}
					}
				}
				setState(168);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(StoneLikeParser.Identifier, 0); }
		public TerminalNode LeftBracket() { return getToken(StoneLikeParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(StoneLikeParser.RightBracket, 0); }
		public TerminalNode LeftParen() { return getToken(StoneLikeParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(StoneLikeParser.RightParen, 0); }
		public TerminalNode NumberLiteral() { return getToken(StoneLikeParser.NumberLiteral, 0); }
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_factor);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(Identifier);
				setState(171);
				match(LeftBracket);
				setState(172);
				expression(0);
				setState(173);
				match(RightBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(LeftParen);
				setState(176);
				expression(0);
				setState(177);
				match(RightParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				match(NumberLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(180);
				match(StringLiteral);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
				match(Sub);
				setState(182);
				factor();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(183);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterValueDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitValueDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitValueDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueDeclarationContext valueDeclaration() throws RecognitionException {
		ValueDeclarationContext _localctx = new ValueDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_valueDeclaration);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				variableDeclaration();
				}
				break;
			case Const:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(Var);
			setState(191);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitConstantDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitConstantDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constantDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(Const);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Func() { return getToken(StoneLikeParser.Func, 0); }
		public TerminalNode Identifier() { return getToken(StoneLikeParser.Identifier, 0); }
		public ParameterClauseContext parameterClause() {
			return getRuleContext(ParameterClauseContext.class,0);
		}
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(Func);
			setState(197);
			match(Identifier);
			setState(198);
			parameterClause();
			setState(199);
			functionBlock();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_initializerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			initializer();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(202);
				match(Comma);
				setState(203);
				initializer();
				}
				}
				setState(208);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_initializer);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(Identifier);
				setState(210);
				match(Assign);
				setState(211);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(Identifier);
				setState(213);
				match(Assign);
				setState(214);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterParameterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitParameterClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitParameterClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterClauseContext parameterClause() throws RecognitionException {
		ParameterClauseContext _localctx = new ParameterClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameterClause);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(LeftParen);
				setState(218);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(LeftParen);
				setState(220);
				parameterList();
				setState(221);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(Identifier);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(226);
				match(Comma);
				setState(227);
				match(Identifier);
				}
				}
				setState(232);
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
		public TerminalNode Identifier() { return getToken(StoneLikeParser.Identifier, 0); }
		public ArrayExpressionContext arrayExpression() {
			return getRuleContext(ArrayExpressionContext.class,0);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignStatement);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				leftValue();
				setState(234);
				match(Assign);
				setState(235);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(Identifier);
				setState(238);
				match(Assign);
				setState(239);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterLeftValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitLeftValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitLeftValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftValueContext leftValue() throws RecognitionException {
		LeftValueContext _localctx = new LeftValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_leftValue);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(Identifier);
				setState(244);
				match(LeftBracket);
				setState(245);
				expression(0);
				setState(246);
				match(RightBracket);
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
		public CommonCodeBlockContext commonCodeBlock() {
			return getRuleContext(CommonCodeBlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(While);
			setState(251);
			expression(0);
			setState(252);
			commonCodeBlock();
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
		public CommonCodeBlockContext commonCodeBlock() {
			return getRuleContext(CommonCodeBlockContext.class,0);
		}
		public List<ElseClauseContext> elseClause() {
			return getRuleContexts(ElseClauseContext.class);
		}
		public ElseClauseContext elseClause(int i) {
			return getRuleContext(ElseClauseContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(If);
			setState(255);
			expression(0);
			setState(256);
			commonCodeBlock();
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(257);
					elseClause();
					}
					}
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		public CommonCodeBlockContext commonCodeBlock() {
			return getRuleContext(CommonCodeBlockContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterElseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitElseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitElseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_elseClause);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(Else);
				setState(264);
				commonCodeBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(Else);
				setState(266);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_returnStatement);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(Return);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(Return);
				setState(271);
				expression(0);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallStatementContext callStatement() throws RecognitionException {
		CallStatementContext _localctx = new CallStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_callStatement);
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(Identifier);
				setState(275);
				match(LeftParen);
				setState(276);
				expressionList();
				setState(277);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(Identifier);
				setState(280);
				match(LeftParen);
				setState(281);
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

	public static class CommonCodeBlockContext extends ParserRuleContext {
		public TerminalNode LeftBarce() { return getToken(StoneLikeParser.LeftBarce, 0); }
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
		public CommonCodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonCodeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterCommonCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitCommonCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitCommonCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonCodeBlockContext commonCodeBlock() throws RecognitionException {
		CommonCodeBlockContext _localctx = new CommonCodeBlockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_commonCodeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(LeftBarce);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << While) | (1L << Var) | (1L << Const) | (1L << Sub) | (1L << Not) | (1L << LeftParen) | (1L << Identifier) | (1L << NumberLiteral) | (1L << StringLiteral))) != 0)) {
				{
				{
				setState(285);
				statement();
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Semicolon) {
					{
					{
					setState(286);
					match(Semicolon);
					}
					}
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			match(RightBrace);
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

	public static class FunctionBlockContext extends ParserRuleContext {
		public TerminalNode LeftBarce() { return getToken(StoneLikeParser.LeftBarce, 0); }
		public TerminalNode RightBrace() { return getToken(StoneLikeParser.RightBrace, 0); }
		public List<FunctionBlockStatementContext> functionBlockStatement() {
			return getRuleContexts(FunctionBlockStatementContext.class);
		}
		public FunctionBlockStatementContext functionBlockStatement(int i) {
			return getRuleContext(FunctionBlockStatementContext.class,i);
		}
		public List<TerminalNode> Semicolon() { return getTokens(StoneLikeParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(StoneLikeParser.Semicolon, i);
		}
		public FunctionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterFunctionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitFunctionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitFunctionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBlockContext functionBlock() throws RecognitionException {
		FunctionBlockContext _localctx = new FunctionBlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_functionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(LeftBarce);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << While) | (1L << Return) | (1L << Var) | (1L << Const) | (1L << Sub) | (1L << Not) | (1L << LeftParen) | (1L << Identifier) | (1L << NumberLiteral) | (1L << StringLiteral))) != 0)) {
				{
				{
				setState(300);
				functionBlockStatement();
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Semicolon) {
					{
					{
					setState(301);
					match(Semicolon);
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(312);
			match(RightBrace);
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
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 9:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 10:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u013d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\7\2?\n\2\f"+
		"\2\16\2B\13\2\7\2D\n\2\f\2\16\2G\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"P\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Y\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"a\n\5\3\6\3\6\3\6\3\6\5\6g\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6o\n\6\f\6\16"+
		"\6r\13\6\3\7\3\7\3\7\3\7\7\7x\n\7\f\7\16\7{\13\7\3\7\3\7\3\b\3\b\5\b\u0081"+
		"\n\b\3\b\3\b\3\b\5\b\u0086\n\b\7\b\u0088\n\b\f\b\16\b\u008b\13\b\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0092\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u009c\n\13\f\13\16\13\u009f\13\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00a7\n"+
		"\f\f\f\16\f\u00aa\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u00bb\n\r\3\16\3\16\5\16\u00bf\n\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\7\22\u00cf\n\22"+
		"\f\22\16\22\u00d2\13\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00da\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00e2\n\24\3\25\3\25\3\25\7\25\u00e7"+
		"\n\25\f\25\16\25\u00ea\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00f3"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00fb\n\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\7\31\u0105\n\31\f\31\16\31\u0108\13\31\3\32\3\32"+
		"\3\32\3\32\5\32\u010e\n\32\3\33\3\33\3\33\5\33\u0113\n\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\5\34\u011d\n\34\3\35\3\35\3\35\7\35\u0122"+
		"\n\35\f\35\16\35\u0125\13\35\7\35\u0127\n\35\f\35\16\35\u012a\13\35\3"+
		"\35\3\35\3\36\3\36\3\36\7\36\u0131\n\36\f\36\16\36\u0134\13\36\7\36\u0136"+
		"\n\36\f\36\16\36\u0139\13\36\3\36\3\36\3\36\2\5\n\24\26\37\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\5\3\2\17\24\3\2\n"+
		"\13\3\2\f\r\2\u0151\2E\3\2\2\2\4O\3\2\2\2\6X\3\2\2\2\b`\3\2\2\2\nf\3\2"+
		"\2\2\fs\3\2\2\2\16\u0080\3\2\2\2\20\u0091\3\2\2\2\22\u0093\3\2\2\2\24"+
		"\u0095\3\2\2\2\26\u00a0\3\2\2\2\30\u00ba\3\2\2\2\32\u00be\3\2\2\2\34\u00c0"+
		"\3\2\2\2\36\u00c3\3\2\2\2 \u00c6\3\2\2\2\"\u00cb\3\2\2\2$\u00d9\3\2\2"+
		"\2&\u00e1\3\2\2\2(\u00e3\3\2\2\2*\u00f2\3\2\2\2,\u00fa\3\2\2\2.\u00fc"+
		"\3\2\2\2\60\u0100\3\2\2\2\62\u010d\3\2\2\2\64\u0112\3\2\2\2\66\u011c\3"+
		"\2\2\28\u011e\3\2\2\2:\u012d\3\2\2\2<@\5\4\3\2=?\7\36\2\2>=\3\2\2\2?B"+
		"\3\2\2\2@>\3\2\2\2@A\3\2\2\2AD\3\2\2\2B@\3\2\2\2C<\3\2\2\2DG\3\2\2\2E"+
		"C\3\2\2\2EF\3\2\2\2F\3\3\2\2\2GE\3\2\2\2HP\5\66\34\2IP\5\n\6\2JP\5\32"+
		"\16\2KP\5 \21\2LP\5*\26\2MP\5.\30\2NP\5\60\31\2OH\3\2\2\2OI\3\2\2\2OJ"+
		"\3\2\2\2OK\3\2\2\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2P\5\3\2\2\2QY\5\66\34"+
		"\2RY\5\n\6\2SY\5\32\16\2TY\5*\26\2UY\5.\30\2VY\5\60\31\2WY\5\64\33\2X"+
		"Q\3\2\2\2XR\3\2\2\2XS\3\2\2\2XT\3\2\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2"+
		"Y\7\3\2\2\2Za\5\66\34\2[a\5\n\6\2\\a\5\32\16\2]a\5*\26\2^a\5.\30\2_a\5"+
		"\60\31\2`Z\3\2\2\2`[\3\2\2\2`\\\3\2\2\2`]\3\2\2\2`^\3\2\2\2`_\3\2\2\2"+
		"a\t\3\2\2\2bc\b\6\1\2cd\7\25\2\2dg\5\n\6\4eg\5\20\t\2fb\3\2\2\2fe\3\2"+
		"\2\2gp\3\2\2\2hi\f\6\2\2ij\7\26\2\2jo\5\20\t\2kl\f\5\2\2lm\7\27\2\2mo"+
		"\5\20\t\2nh\3\2\2\2nk\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\13\3\2\2"+
		"\2rp\3\2\2\2st\7\34\2\2ty\5\n\6\2uv\7\37\2\2vx\5\n\6\2wu\3\2\2\2x{\3\2"+
		"\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7\35\2\2}\r\3\2\2\2~\u0081"+
		"\5\n\6\2\177\u0081\5\f\7\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\u0089"+
		"\3\2\2\2\u0082\u0085\7\37\2\2\u0083\u0086\5\n\6\2\u0084\u0086\5\f\7\2"+
		"\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0082"+
		"\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\17\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\5\24\13\2\u008d\u008e\5\22"+
		"\n\2\u008e\u008f\5\24\13\2\u008f\u0092\3\2\2\2\u0090\u0092\5\24\13\2\u0091"+
		"\u008c\3\2\2\2\u0091\u0090\3\2\2\2\u0092\21\3\2\2\2\u0093\u0094\t\2\2"+
		"\2\u0094\23\3\2\2\2\u0095\u0096\b\13\1\2\u0096\u0097\5\26\f\2\u0097\u009d"+
		"\3\2\2\2\u0098\u0099\f\4\2\2\u0099\u009a\t\3\2\2\u009a\u009c\5\26\f\2"+
		"\u009b\u0098\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\25\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\b\f\1\2\u00a1"+
		"\u00a2\5\30\r\2\u00a2\u00a8\3\2\2\2\u00a3\u00a4\f\4\2\2\u00a4\u00a5\t"+
		"\4\2\2\u00a5\u00a7\5\30\r\2\u00a6\u00a3\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\27\3\2\2\2\u00aa\u00a8\3\2\2"+
		"\2\u00ab\u00bb\7!\2\2\u00ac\u00ad\7!\2\2\u00ad\u00ae\7\34\2\2\u00ae\u00af"+
		"\5\n\6\2\u00af\u00b0\7\35\2\2\u00b0\u00bb\3\2\2\2\u00b1\u00b2\7\30\2\2"+
		"\u00b2\u00b3\5\n\6\2\u00b3\u00b4\7\31\2\2\u00b4\u00bb\3\2\2\2\u00b5\u00bb"+
		"\7\"\2\2\u00b6\u00bb\7#\2\2\u00b7\u00b8\7\13\2\2\u00b8\u00bb\5\30\r\2"+
		"\u00b9\u00bb\5\66\34\2\u00ba\u00ab\3\2\2\2\u00ba\u00ac\3\2\2\2\u00ba\u00b1"+
		"\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b6\3\2\2\2\u00ba\u00b7\3\2\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\31\3\2\2\2\u00bc\u00bf\5\34\17\2\u00bd\u00bf\5\36"+
		"\20\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\33\3\2\2\2\u00c0\u00c1"+
		"\7\7\2\2\u00c1\u00c2\5\"\22\2\u00c2\35\3\2\2\2\u00c3\u00c4\7\b\2\2\u00c4"+
		"\u00c5\5\"\22\2\u00c5\37\3\2\2\2\u00c6\u00c7\7\t\2\2\u00c7\u00c8\7!\2"+
		"\2\u00c8\u00c9\5&\24\2\u00c9\u00ca\5:\36\2\u00ca!\3\2\2\2\u00cb\u00d0"+
		"\5$\23\2\u00cc\u00cd\7\37\2\2\u00cd\u00cf\5$\23\2\u00ce\u00cc\3\2\2\2"+
		"\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1#\3"+
		"\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7!\2\2\u00d4\u00d5\7\16\2\2\u00d5"+
		"\u00da\5\n\6\2\u00d6\u00d7\7!\2\2\u00d7\u00d8\7\16\2\2\u00d8\u00da\5\f"+
		"\7\2\u00d9\u00d3\3\2\2\2\u00d9\u00d6\3\2\2\2\u00da%\3\2\2\2\u00db\u00dc"+
		"\7\30\2\2\u00dc\u00e2\7\31\2\2\u00dd\u00de\7\30\2\2\u00de\u00df\5(\25"+
		"\2\u00df\u00e0\7\31\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1"+
		"\u00dd\3\2\2\2\u00e2\'\3\2\2\2\u00e3\u00e8\7!\2\2\u00e4\u00e5\7\37\2\2"+
		"\u00e5\u00e7\7!\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9)\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ec\5,\27\2\u00ec\u00ed\7\16\2\2\u00ed\u00ee\5\n\6\2\u00ee\u00f3\3"+
		"\2\2\2\u00ef\u00f0\7!\2\2\u00f0\u00f1\7\16\2\2\u00f1\u00f3\5\f\7\2\u00f2"+
		"\u00eb\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f3+\3\2\2\2\u00f4\u00fb\7!\2\2\u00f5"+
		"\u00f6\7!\2\2\u00f6\u00f7\7\34\2\2\u00f7\u00f8\5\n\6\2\u00f8\u00f9\7\35"+
		"\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f4\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fb"+
		"-\3\2\2\2\u00fc\u00fd\7\5\2\2\u00fd\u00fe\5\n\6\2\u00fe\u00ff\58\35\2"+
		"\u00ff/\3\2\2\2\u0100\u0101\7\3\2\2\u0101\u0102\5\n\6\2\u0102\u0106\5"+
		"8\35\2\u0103\u0105\5\62\32\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\61\3\2\2\2\u0108\u0106\3\2\2"+
		"\2\u0109\u010a\7\4\2\2\u010a\u010e\58\35\2\u010b\u010c\7\4\2\2\u010c\u010e"+
		"\5\60\31\2\u010d\u0109\3\2\2\2\u010d\u010b\3\2\2\2\u010e\63\3\2\2\2\u010f"+
		"\u0113\7\6\2\2\u0110\u0111\7\6\2\2\u0111\u0113\5\n\6\2\u0112\u010f\3\2"+
		"\2\2\u0112\u0110\3\2\2\2\u0113\65\3\2\2\2\u0114\u0115\7!\2\2\u0115\u0116"+
		"\7\30\2\2\u0116\u0117\5\16\b\2\u0117\u0118\7\31\2\2\u0118\u011d\3\2\2"+
		"\2\u0119\u011a\7!\2\2\u011a\u011b\7\30\2\2\u011b\u011d\7\31\2\2\u011c"+
		"\u0114\3\2\2\2\u011c\u0119\3\2\2\2\u011d\67\3\2\2\2\u011e\u0128\7\32\2"+
		"\2\u011f\u0123\5\b\5\2\u0120\u0122\7\36\2\2\u0121\u0120\3\2\2\2\u0122"+
		"\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0127\3\2"+
		"\2\2\u0125\u0123\3\2\2\2\u0126\u011f\3\2\2\2\u0127\u012a\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012b\u012c\7\33\2\2\u012c9\3\2\2\2\u012d\u0137\7\32\2\2\u012e\u0132"+
		"\5\6\4\2\u012f\u0131\7\36\2\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2"+
		"\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132"+
		"\3\2\2\2\u0135\u012e\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7\33"+
		"\2\2\u013b;\3\2\2\2!@EOX`fnpy\u0080\u0085\u0089\u0091\u009d\u00a8\u00ba"+
		"\u00be\u00d0\u00d9\u00e1\u00e8\u00f2\u00fa\u0106\u010d\u0112\u011c\u0123"+
		"\u0128\u0132\u0137";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
