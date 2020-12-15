// Generated from StoneLike.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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
		RULE_statements = 0, RULE_statement = 1, RULE_expression = 2, RULE_expressionList = 3, 
		RULE_boolExpression = 4, RULE_relationalOperator = 5, RULE_additiveExpression = 6, 
		RULE_term = 7, RULE_factor = 8, RULE_declaration = 9, RULE_variableDeclaration = 10, 
		RULE_constantDeclaration = 11, RULE_functionDeclaration = 12, RULE_initializerList = 13, 
		RULE_initializer = 14, RULE_parameterClause = 15, RULE_parameterList = 16, 
		RULE_assignStatement = 17, RULE_leftValue = 18, RULE_whileStatement = 19, 
		RULE_ifStatement = 20, RULE_elseClause = 21, RULE_returnStatement = 22, 
		RULE_callStatement = 23, RULE_codeBlock = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"statements", "statement", "expression", "expressionList", "boolExpression", 
			"relationalOperator", "additiveExpression", "term", "factor", "declaration", 
			"variableDeclaration", "constantDeclaration", "functionDeclaration", 
			"initializerList", "initializer", "parameterClause", "parameterList", 
			"assignStatement", "leftValue", "whileStatement", "ifStatement", "elseClause", 
			"returnStatement", "callStatement", "codeBlock"
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(StoneLikeParser.Semicolon, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			statement();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Semicolon) {
				{
				setState(51);
				match(Semicolon);
				}
			}

			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << While) | (1L << Return) | (1L << Var) | (1L << Const) | (1L << Func) | (1L << Sub) | (1L << Not) | (1L << LeftParen) | (1L << Identifier) | (1L << NumberLiteral) | (1L << StringLiteral))) != 0)) {
				{
				setState(54);
				statements();
				}
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
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
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				callStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				assignStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
				ifStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(63);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				{
				setState(67);
				match(Not);
				setState(68);
				expression(2);
				}
				break;
			case Sub:
			case LeftParen:
			case Identifier:
			case NumberLiteral:
			case StringLiteral:
				{
				setState(69);
				boolExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(78);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(72);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(73);
						match(And);
						setState(74);
						boolExpression();
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(75);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(76);
						match(Or);
						setState(77);
						boolExpression();
						}
						break;
					}
					} 
				}
				setState(82);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(StoneLikeParser.Comma, 0); }
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
		return expressionList(0);
	}

	private ExpressionListContext expressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, _parentState);
		ExpressionListContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(84);
			expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressionList);
					setState(86);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(87);
					match(Comma);
					setState(88);
					expression(0);
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		enterRule(_localctx, 8, RULE_boolExpression);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				additiveExpression(0);
				setState(95);
				relationalOperator();
				setState(96);
				additiveExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
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
		enterRule(_localctx, 10, RULE_relationalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_additiveExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(104);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
					setState(106);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(107);
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
					setState(108);
					term(0);
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(115);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(117);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(118);
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
					setState(119);
					factor();
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 16, RULE_factor);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(Identifier);
				setState(127);
				match(LeftBracket);
				setState(128);
				expression(0);
				setState(129);
				match(RightBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(LeftParen);
				setState(132);
				expression(0);
				setState(133);
				match(RightParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				match(NumberLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				match(StringLiteral);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(137);
				match(Sub);
				setState(138);
				factor();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(139);
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

	public static class DeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaration);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				variableDeclaration();
				}
				break;
			case Const:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				constantDeclaration();
				}
				break;
			case Func:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				functionDeclaration();
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
		enterRule(_localctx, 20, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(Var);
			setState(148);
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
		enterRule(_localctx, 22, RULE_constantDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(Const);
			setState(151);
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
		enterRule(_localctx, 24, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(Func);
			setState(154);
			match(Identifier);
			setState(155);
			parameterClause();
			setState(156);
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
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public TerminalNode Comma() { return getToken(StoneLikeParser.Comma, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
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
		enterRule(_localctx, 26, RULE_initializerList);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				initializer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				initializer();
				setState(160);
				match(Comma);
				setState(161);
				initializerList();
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

	public static class InitializerContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(StoneLikeParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(StoneLikeParser.Assign, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(StoneLikeParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(StoneLikeParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(StoneLikeParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(StoneLikeParser.RightBracket, i);
		}
		public List<TerminalNode> Comma() { return getTokens(StoneLikeParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(StoneLikeParser.Comma, i);
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
		enterRule(_localctx, 28, RULE_initializer);
		int _la;
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(Identifier);
				setState(166);
				match(Assign);
				setState(167);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(Identifier);
				setState(169);
				match(LeftBracket);
				setState(170);
				expression(0);
				setState(171);
				match(RightBracket);
				setState(172);
				match(Assign);
				setState(173);
				match(LeftBracket);
				setState(174);
				expression(0);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(175);
					match(Comma);
					setState(176);
					expression(0);
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(182);
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
		enterRule(_localctx, 30, RULE_parameterClause);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(LeftParen);
				setState(187);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(LeftParen);
				setState(189);
				parameterList();
				setState(190);
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
		public TerminalNode Identifier() { return getToken(StoneLikeParser.Identifier, 0); }
		public TerminalNode LeftBracket() { return getToken(StoneLikeParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(StoneLikeParser.RightBracket, 0); }
		public TerminalNode Comma() { return getToken(StoneLikeParser.Comma, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
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
		enterRule(_localctx, 32, RULE_parameterList);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(Identifier);
				setState(196);
				match(LeftBracket);
				setState(197);
				match(RightBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(Identifier);
				setState(199);
				match(Comma);
				setState(200);
				parameterList();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				match(Identifier);
				setState(202);
				match(LeftBracket);
				setState(203);
				match(RightBracket);
				setState(204);
				match(Comma);
				setState(205);
				parameterList();
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

	public static class AssignStatementContext extends ParserRuleContext {
		public LeftValueContext leftValue() {
			return getRuleContext(LeftValueContext.class,0);
		}
		public TerminalNode Assign() { return getToken(StoneLikeParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 34, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			leftValue();
			setState(209);
			match(Assign);
			setState(210);
			expression(0);
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
		enterRule(_localctx, 36, RULE_leftValue);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(Identifier);
				setState(214);
				match(LeftBracket);
				setState(215);
				expression(0);
				setState(216);
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
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
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
		enterRule(_localctx, 38, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(While);
			setState(221);
			expression(0);
			setState(222);
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
		enterRule(_localctx, 40, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(If);
			setState(225);
			expression(0);
			setState(226);
			codeBlock();
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(227);
					elseClause();
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 42, RULE_elseClause);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(Else);
				setState(234);
				codeBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(Else);
				setState(236);
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
		enterRule(_localctx, 44, RULE_returnStatement);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(Return);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(Return);
				setState(241);
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
		enterRule(_localctx, 46, RULE_callStatement);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(Identifier);
				setState(245);
				match(LeftParen);
				setState(246);
				expressionList(0);
				setState(247);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(Identifier);
				setState(250);
				match(LeftParen);
				setState(251);
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

	public static class CodeBlockContext extends ParserRuleContext {
		public TerminalNode LeftBarce() { return getToken(StoneLikeParser.LeftBarce, 0); }
		public TerminalNode RightBrace() { return getToken(StoneLikeParser.RightBrace, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoneLikeListener ) ((StoneLikeListener)listener).exitCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoneLikeVisitor ) return ((StoneLikeVisitor<? extends T>)visitor).visitCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_codeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(LeftBarce);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << While) | (1L << Return) | (1L << Var) | (1L << Const) | (1L << Func) | (1L << Sub) | (1L << Not) | (1L << LeftParen) | (1L << Identifier) | (1L << NumberLiteral) | (1L << StringLiteral))) != 0)) {
				{
				setState(255);
				statements();
				}
			}

			setState(258);
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
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 3:
			return expressionList_sempred((ExpressionListContext)_localctx, predIndex);
		case 6:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 7:
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
	private boolean expressionList_sempred(ExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0107\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\5\2\67\n\2\3\2\5\2:\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3C\n\3\3\4\3\4\3\4\3\4\5\4I\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4Q\n\4\f"+
		"\4\16\4T\13\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\\\n\5\f\5\16\5_\13\5\3\6\3\6"+
		"\3\6\3\6\3\6\5\6f\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bp\n\b\f\b\16"+
		"\bs\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t{\n\t\f\t\16\t~\13\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008f\n\n\3\13\3\13"+
		"\3\13\5\13\u0094\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00a6\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00b4\n\20\f\20\16\20\u00b7\13\20"+
		"\3\20\3\20\5\20\u00bb\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c3\n"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d1"+
		"\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00dd\n\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00e7\n\26\f\26\16\26\u00ea"+
		"\13\26\3\27\3\27\3\27\3\27\5\27\u00f0\n\27\3\30\3\30\3\30\5\30\u00f5\n"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00ff\n\31\3\32\3\32"+
		"\5\32\u0103\n\32\3\32\3\32\3\32\2\6\6\b\16\20\33\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\2\5\3\2\17\24\3\2\n\13\3\2\f\r\2\u0111"+
		"\2\64\3\2\2\2\4B\3\2\2\2\6H\3\2\2\2\bU\3\2\2\2\ne\3\2\2\2\fg\3\2\2\2\16"+
		"i\3\2\2\2\20t\3\2\2\2\22\u008e\3\2\2\2\24\u0093\3\2\2\2\26\u0095\3\2\2"+
		"\2\30\u0098\3\2\2\2\32\u009b\3\2\2\2\34\u00a5\3\2\2\2\36\u00ba\3\2\2\2"+
		" \u00c2\3\2\2\2\"\u00d0\3\2\2\2$\u00d2\3\2\2\2&\u00dc\3\2\2\2(\u00de\3"+
		"\2\2\2*\u00e2\3\2\2\2,\u00ef\3\2\2\2.\u00f4\3\2\2\2\60\u00fe\3\2\2\2\62"+
		"\u0100\3\2\2\2\64\66\5\4\3\2\65\67\7\36\2\2\66\65\3\2\2\2\66\67\3\2\2"+
		"\2\679\3\2\2\28:\5\2\2\298\3\2\2\29:\3\2\2\2:\3\3\2\2\2;C\5\60\31\2<C"+
		"\5\6\4\2=C\5\24\13\2>C\5$\23\2?C\5(\25\2@C\5*\26\2AC\5.\30\2B;\3\2\2\2"+
		"B<\3\2\2\2B=\3\2\2\2B>\3\2\2\2B?\3\2\2\2B@\3\2\2\2BA\3\2\2\2C\5\3\2\2"+
		"\2DE\b\4\1\2EF\7\25\2\2FI\5\6\4\4GI\5\n\6\2HD\3\2\2\2HG\3\2\2\2IR\3\2"+
		"\2\2JK\f\6\2\2KL\7\26\2\2LQ\5\n\6\2MN\f\5\2\2NO\7\27\2\2OQ\5\n\6\2PJ\3"+
		"\2\2\2PM\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\7\3\2\2\2TR\3\2\2\2UV"+
		"\b\5\1\2VW\5\6\4\2W]\3\2\2\2XY\f\4\2\2YZ\7\37\2\2Z\\\5\6\4\2[X\3\2\2\2"+
		"\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\t\3\2\2\2_]\3\2\2\2`a\5\16\b\2ab\5\f"+
		"\7\2bc\5\16\b\2cf\3\2\2\2df\5\16\b\2e`\3\2\2\2ed\3\2\2\2f\13\3\2\2\2g"+
		"h\t\2\2\2h\r\3\2\2\2ij\b\b\1\2jk\5\20\t\2kq\3\2\2\2lm\f\4\2\2mn\t\3\2"+
		"\2np\5\20\t\2ol\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\17\3\2\2\2sq\3"+
		"\2\2\2tu\b\t\1\2uv\5\22\n\2v|\3\2\2\2wx\f\4\2\2xy\t\4\2\2y{\5\22\n\2z"+
		"w\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\21\3\2\2\2~|\3\2\2\2\177\u008f"+
		"\7!\2\2\u0080\u0081\7!\2\2\u0081\u0082\7\34\2\2\u0082\u0083\5\6\4\2\u0083"+
		"\u0084\7\35\2\2\u0084\u008f\3\2\2\2\u0085\u0086\7\30\2\2\u0086\u0087\5"+
		"\6\4\2\u0087\u0088\7\31\2\2\u0088\u008f\3\2\2\2\u0089\u008f\7\"\2\2\u008a"+
		"\u008f\7#\2\2\u008b\u008c\7\13\2\2\u008c\u008f\5\22\n\2\u008d\u008f\5"+
		"\60\31\2\u008e\177\3\2\2\2\u008e\u0080\3\2\2\2\u008e\u0085\3\2\2\2\u008e"+
		"\u0089\3\2\2\2\u008e\u008a\3\2\2\2\u008e\u008b\3\2\2\2\u008e\u008d\3\2"+
		"\2\2\u008f\23\3\2\2\2\u0090\u0094\5\26\f\2\u0091\u0094\5\30\r\2\u0092"+
		"\u0094\5\32\16\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3"+
		"\2\2\2\u0094\25\3\2\2\2\u0095\u0096\7\7\2\2\u0096\u0097\5\34\17\2\u0097"+
		"\27\3\2\2\2\u0098\u0099\7\b\2\2\u0099\u009a\5\34\17\2\u009a\31\3\2\2\2"+
		"\u009b\u009c\7\t\2\2\u009c\u009d\7!\2\2\u009d\u009e\5 \21\2\u009e\u009f"+
		"\5\62\32\2\u009f\33\3\2\2\2\u00a0\u00a6\5\36\20\2\u00a1\u00a2\5\36\20"+
		"\2\u00a2\u00a3\7\37\2\2\u00a3\u00a4\5\34\17\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u00a0\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6\35\3\2\2\2\u00a7\u00a8\7!\2\2"+
		"\u00a8\u00a9\7\16\2\2\u00a9\u00bb\5\6\4\2\u00aa\u00ab\7!\2\2\u00ab\u00ac"+
		"\7\34\2\2\u00ac\u00ad\5\6\4\2\u00ad\u00ae\7\35\2\2\u00ae\u00af\7\16\2"+
		"\2\u00af\u00b0\7\34\2\2\u00b0\u00b5\5\6\4\2\u00b1\u00b2\7\37\2\2\u00b2"+
		"\u00b4\5\6\4\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00b9\7\35\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00a7\3\2\2\2\u00ba\u00aa\3"+
		"\2\2\2\u00bb\37\3\2\2\2\u00bc\u00bd\7\30\2\2\u00bd\u00c3\7\31\2\2\u00be"+
		"\u00bf\7\30\2\2\u00bf\u00c0\5\"\22\2\u00c0\u00c1\7\31\2\2\u00c1\u00c3"+
		"\3\2\2\2\u00c2\u00bc\3\2\2\2\u00c2\u00be\3\2\2\2\u00c3!\3\2\2\2\u00c4"+
		"\u00d1\7!\2\2\u00c5\u00c6\7!\2\2\u00c6\u00c7\7\34\2\2\u00c7\u00d1\7\35"+
		"\2\2\u00c8\u00c9\7!\2\2\u00c9\u00ca\7\37\2\2\u00ca\u00d1\5\"\22\2\u00cb"+
		"\u00cc\7!\2\2\u00cc\u00cd\7\34\2\2\u00cd\u00ce\7\35\2\2\u00ce\u00cf\7"+
		"\37\2\2\u00cf\u00d1\5\"\22\2\u00d0\u00c4\3\2\2\2\u00d0\u00c5\3\2\2\2\u00d0"+
		"\u00c8\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d1#\3\2\2\2\u00d2\u00d3\5&\24\2"+
		"\u00d3\u00d4\7\16\2\2\u00d4\u00d5\5\6\4\2\u00d5%\3\2\2\2\u00d6\u00dd\7"+
		"!\2\2\u00d7\u00d8\7!\2\2\u00d8\u00d9\7\34\2\2\u00d9\u00da\5\6\4\2\u00da"+
		"\u00db\7\35\2\2\u00db\u00dd\3\2\2\2\u00dc\u00d6\3\2\2\2\u00dc\u00d7\3"+
		"\2\2\2\u00dd\'\3\2\2\2\u00de\u00df\7\5\2\2\u00df\u00e0\5\6\4\2\u00e0\u00e1"+
		"\5\62\32\2\u00e1)\3\2\2\2\u00e2\u00e3\7\3\2\2\u00e3\u00e4\5\6\4\2\u00e4"+
		"\u00e8\5\62\32\2\u00e5\u00e7\5,\27\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3"+
		"\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9+\3\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00eb\u00ec\7\4\2\2\u00ec\u00f0\5\62\32\2\u00ed\u00ee\7\4\2\2"+
		"\u00ee\u00f0\5*\26\2\u00ef\u00eb\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0-\3"+
		"\2\2\2\u00f1\u00f5\7\6\2\2\u00f2\u00f3\7\6\2\2\u00f3\u00f5\5\6\4\2\u00f4"+
		"\u00f1\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5/\3\2\2\2\u00f6\u00f7\7!\2\2\u00f7"+
		"\u00f8\7\30\2\2\u00f8\u00f9\5\b\5\2\u00f9\u00fa\7\31\2\2\u00fa\u00ff\3"+
		"\2\2\2\u00fb\u00fc\7!\2\2\u00fc\u00fd\7\30\2\2\u00fd\u00ff\7\31\2\2\u00fe"+
		"\u00f6\3\2\2\2\u00fe\u00fb\3\2\2\2\u00ff\61\3\2\2\2\u0100\u0102\7\32\2"+
		"\2\u0101\u0103\5\2\2\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0105\7\33\2\2\u0105\63\3\2\2\2\31\669BHPR]eq|\u008e\u0093"+
		"\u00a5\u00b5\u00ba\u00c2\u00d0\u00dc\u00e8\u00ef\u00f4\u00fe\u0102";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}