// Generated from antlr/AlloyExprGrammar.g4 by ANTLR 4.7.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlloyExprGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, ID=38, ID_START=39, 
		ID_CHAR=40, WS=41;
	public static final int
		RULE_parse = 0, RULE_expr = 1, RULE_qt_expr = 2, RULE_set_expr = 3, RULE_collection = 4, 
		RULE_num_binary_op = 5, RULE_binary_op = 6, RULE_compare_op = 7, RULE_unary_op = 8, 
		RULE_closure_op = 9, RULE_quantifier = 10, RULE_name = 11, RULE_closure_field = 12, 
		RULE_number = 13;
	public static final String[] ruleNames = {
		"parse", "expr", "qt_expr", "set_expr", "collection", "num_binary_op", 
		"binary_op", "compare_op", "unary_op", "closure_op", "quantifier", "name", 
		"closure_field", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "':'", "'.'", "').'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'||'", "'or'", "'&&'", "'and'", "'implies'", "'=>'", "'iff'", 
		"'xor'", "'='", "'!='", "'in'", "'not in'", "'<'", "'>'", "'<='", "'>='", 
		"'!'", "'not'", "'no'", "'#'", "'^'", "'all'", "'some'", "'lone'", "'one'", 
		"'0'", "'1'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "ID", "ID_START", "ID_CHAR", "WS"
	};
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
	public String getGrammarFileName() { return "AlloyExprGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlloyExprGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AlloyExprGrammarParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			expr(0);
			setState(29);
			match(EOF);
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

	public static class ExprContext extends ParserRuleContext {
		public Qt_exprContext qt_expr() {
			return getRuleContext(Qt_exprContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Binary_opContext binary_op() {
			return getRuleContext(Binary_opContext.class,0);
		}
		public Unary_opContext unary_op() {
			return getRuleContext(Unary_opContext.class,0);
		}
		public Set_exprContext set_expr() {
			return getRuleContext(Set_exprContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Num_binary_opContext num_binary_op() {
			return getRuleContext(Num_binary_opContext.class,0);
		}
		public Compare_opContext compare_op() {
			return getRuleContext(Compare_opContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(32);
				qt_expr();
				}
				break;
			case 2:
				{
				setState(33);
				match(T__0);
				setState(34);
				expr(0);
				setState(35);
				match(T__1);
				setState(36);
				binary_op();
				setState(37);
				match(T__0);
				setState(38);
				expr(0);
				setState(39);
				match(T__1);
				}
				break;
			case 3:
				{
				setState(41);
				unary_op();
				setState(42);
				match(T__0);
				setState(43);
				expr(0);
				setState(44);
				match(T__1);
				}
				break;
			case 4:
				{
				setState(46);
				set_expr();
				}
				break;
			case 5:
				{
				setState(47);
				name();
				}
				break;
			case 6:
				{
				setState(48);
				number();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(59);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(51);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(52);
						num_binary_op();
						setState(53);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(55);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(56);
						compare_op();
						setState(57);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class Qt_exprContext extends ParserRuleContext {
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Set_exprContext set_expr() {
			return getRuleContext(Set_exprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public Qt_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qt_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).enterQt_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).exitQt_expr(this);
		}
	}

	public final Qt_exprContext qt_expr() throws RecognitionException {
		Qt_exprContext _localctx = new Qt_exprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_qt_expr);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				quantifier();
				setState(65);
				name();
				setState(66);
				match(T__2);
				setState(67);
				set_expr();
				setState(68);
				match(T__2);
				setState(69);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				quantifier();
				setState(72);
				name();
				setState(73);
				match(T__2);
				setState(74);
				collection();
				setState(75);
				match(T__2);
				setState(76);
				expr(0);
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

	public static class Set_exprContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public Closure_opContext closure_op() {
			return getRuleContext(Closure_opContext.class,0);
		}
		public Closure_fieldContext closure_field() {
			return getRuleContext(Closure_fieldContext.class,0);
		}
		public Set_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).enterSet_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).exitSet_expr(this);
		}
	}

	public final Set_exprContext set_expr() throws RecognitionException {
		Set_exprContext _localctx = new Set_exprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_set_expr);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				name();
				setState(81);
				match(T__3);
				setState(82);
				closure_op();
				setState(83);
				match(T__0);
				setState(84);
				closure_field();
				setState(85);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				name();
				setState(88);
				match(T__3);
				setState(89);
				closure_op();
				setState(90);
				match(T__0);
				setState(91);
				closure_field();
				setState(92);
				match(T__4);
				setState(93);
				name();
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

	public static class CollectionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public CollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).enterCollection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).exitCollection(this);
		}
	}

	public final CollectionContext collection() throws RecognitionException {
		CollectionContext _localctx = new CollectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_collection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			name();
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

	public static class Num_binary_opContext extends ParserRuleContext {
		public Num_binary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_binary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).enterNum_binary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).exitNum_binary_op(this);
		}
	}

	public final Num_binary_opContext num_binary_op() throws RecognitionException {
		Num_binary_opContext _localctx = new Num_binary_opContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_num_binary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
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

	public static class Binary_opContext extends ParserRuleContext {
		public Binary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).enterBinary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).exitBinary_op(this);
		}
	}

	public final Binary_opContext binary_op() throws RecognitionException {
		Binary_opContext _localctx = new Binary_opContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_binary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
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

	public static class Compare_opContext extends ParserRuleContext {
		public Compare_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).enterCompare_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).exitCompare_op(this);
		}
	}

	public final Compare_opContext compare_op() throws RecognitionException {
		Compare_opContext _localctx = new Compare_opContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_compare_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
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

	public static class Unary_opContext extends ParserRuleContext {
		public Unary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).enterUnary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).exitUnary_op(this);
		}
	}

	public final Unary_opContext unary_op() throws RecognitionException {
		Unary_opContext _localctx = new Unary_opContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
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

	public static class Closure_opContext extends ParserRuleContext {
		public Closure_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).enterClosure_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).exitClosure_op(this);
		}
	}

	public final Closure_opContext closure_op() throws RecognitionException {
		Closure_opContext _localctx = new Closure_opContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_closure_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__30) ) {
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

	public static class QuantifierContext extends ParserRuleContext {
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).enterQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).exitQuantifier(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AlloyExprGrammarParser.ID, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_name);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(ID);
				setState(113);
				match(T__3);
				setState(114);
				name();
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

	public static class Closure_fieldContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AlloyExprGrammarParser.ID, 0); }
		public Closure_fieldContext closure_field() {
			return getRuleContext(Closure_fieldContext.class,0);
		}
		public Closure_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).enterClosure_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).exitClosure_field(this);
		}
	}

	public final Closure_fieldContext closure_field() throws RecognitionException {
		Closure_fieldContext _localctx = new Closure_fieldContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_closure_field);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(ID);
				setState(119);
				match(T__5);
				setState(120);
				closure_field();
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !(_la==T__35 || _la==T__36) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0080\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\64\n\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3>\n\3\f\3\16\3A\13\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Q\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5b\n\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\5\rv\n\r\3\16\3\16"+
		"\3\16\3\16\5\16|\n\16\3\17\3\17\3\17\2\3\4\20\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\2\t\3\2\b\f\3\2\r\24\3\2\25\34\3\2\35 \4\2\n\n!!\4\2\37\37"+
		"\"%\3\2&\'\2|\2\36\3\2\2\2\4\63\3\2\2\2\6P\3\2\2\2\ba\3\2\2\2\nc\3\2\2"+
		"\2\fe\3\2\2\2\16g\3\2\2\2\20i\3\2\2\2\22k\3\2\2\2\24m\3\2\2\2\26o\3\2"+
		"\2\2\30u\3\2\2\2\32{\3\2\2\2\34}\3\2\2\2\36\37\5\4\3\2\37 \7\2\2\3 \3"+
		"\3\2\2\2!\"\b\3\1\2\"\64\5\6\4\2#$\7\3\2\2$%\5\4\3\2%&\7\4\2\2&\'\5\16"+
		"\b\2\'(\7\3\2\2()\5\4\3\2)*\7\4\2\2*\64\3\2\2\2+,\5\22\n\2,-\7\3\2\2-"+
		".\5\4\3\2./\7\4\2\2/\64\3\2\2\2\60\64\5\b\5\2\61\64\5\30\r\2\62\64\5\34"+
		"\17\2\63!\3\2\2\2\63#\3\2\2\2\63+\3\2\2\2\63\60\3\2\2\2\63\61\3\2\2\2"+
		"\63\62\3\2\2\2\64?\3\2\2\2\65\66\f\t\2\2\66\67\5\f\7\2\678\5\4\3\n8>\3"+
		"\2\2\29:\f\b\2\2:;\5\20\t\2;<\5\4\3\t<>\3\2\2\2=\65\3\2\2\2=9\3\2\2\2"+
		">A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\5\3\2\2\2A?\3\2\2\2BC\5\26\f\2CD\5\30"+
		"\r\2DE\7\5\2\2EF\5\b\5\2FG\7\5\2\2GH\5\4\3\2HQ\3\2\2\2IJ\5\26\f\2JK\5"+
		"\30\r\2KL\7\5\2\2LM\5\n\6\2MN\7\5\2\2NO\5\4\3\2OQ\3\2\2\2PB\3\2\2\2PI"+
		"\3\2\2\2Q\7\3\2\2\2RS\5\30\r\2ST\7\6\2\2TU\5\24\13\2UV\7\3\2\2VW\5\32"+
		"\16\2WX\7\4\2\2Xb\3\2\2\2YZ\5\30\r\2Z[\7\6\2\2[\\\5\24\13\2\\]\7\3\2\2"+
		"]^\5\32\16\2^_\7\7\2\2_`\5\30\r\2`b\3\2\2\2aR\3\2\2\2aY\3\2\2\2b\t\3\2"+
		"\2\2cd\5\30\r\2d\13\3\2\2\2ef\t\2\2\2f\r\3\2\2\2gh\t\3\2\2h\17\3\2\2\2"+
		"ij\t\4\2\2j\21\3\2\2\2kl\t\5\2\2l\23\3\2\2\2mn\t\6\2\2n\25\3\2\2\2op\t"+
		"\7\2\2p\27\3\2\2\2qv\7(\2\2rs\7(\2\2st\7\6\2\2tv\5\30\r\2uq\3\2\2\2ur"+
		"\3\2\2\2v\31\3\2\2\2w|\7(\2\2xy\7(\2\2yz\7\b\2\2z|\5\32\16\2{w\3\2\2\2"+
		"{x\3\2\2\2|\33\3\2\2\2}~\t\b\2\2~\35\3\2\2\2\t\63=?Pau{";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}