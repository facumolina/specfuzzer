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
		T__9=10, T__10=11, T__11=12, WS=13;
	public static final int
		RULE_expr = 0, RULE_qt_expr = 1, RULE_set_expr = 2, RULE_qt_obj_cmp = 3, 
		RULE_type_id = 4, RULE_field_id = 5, RULE_closure_op = 6, RULE_quantifier = 7;
	public static final String[] ruleNames = {
		"expr", "qt_expr", "set_expr", "qt_obj_cmp", "type_id", "field_id", "closure_op", 
		"quantifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'n'", "':'", "'.'", "'('", "')'", "'n != null'", "'List'", "'next'", 
		"'*'", "'^'", "'all'", "'some'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "WS"
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
	public static class ExprContext extends ParserRuleContext {
		public Qt_exprContext qt_expr() {
			return getRuleContext(Qt_exprContext.class,0);
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
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			qt_expr();
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

	public static class Qt_exprContext extends ParserRuleContext {
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public Set_exprContext set_expr() {
			return getRuleContext(Set_exprContext.class,0);
		}
		public Qt_obj_cmpContext qt_obj_cmp() {
			return getRuleContext(Qt_obj_cmpContext.class,0);
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
		enterRule(_localctx, 2, RULE_qt_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			quantifier();
			setState(19);
			match(T__0);
			setState(20);
			match(T__1);
			setState(21);
			set_expr();
			setState(22);
			match(T__1);
			setState(23);
			qt_obj_cmp();
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
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class,0);
		}
		public Closure_opContext closure_op() {
			return getRuleContext(Closure_opContext.class,0);
		}
		public Field_idContext field_id() {
			return getRuleContext(Field_idContext.class,0);
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
		enterRule(_localctx, 4, RULE_set_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			type_id();
			setState(26);
			match(T__2);
			setState(27);
			closure_op();
			setState(28);
			match(T__3);
			setState(29);
			field_id();
			setState(30);
			match(T__4);
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

	public static class Qt_obj_cmpContext extends ParserRuleContext {
		public Qt_obj_cmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qt_obj_cmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).enterQt_obj_cmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).exitQt_obj_cmp(this);
		}
	}

	public final Qt_obj_cmpContext qt_obj_cmp() throws RecognitionException {
		Qt_obj_cmpContext _localctx = new Qt_obj_cmpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_qt_obj_cmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__5);
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

	public static class Type_idContext extends ParserRuleContext {
		public Type_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).enterType_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).exitType_id(this);
		}
	}

	public final Type_idContext type_id() throws RecognitionException {
		Type_idContext _localctx = new Type_idContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__6);
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

	public static class Field_idContext extends ParserRuleContext {
		public Field_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).enterField_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyExprGrammarListener ) ((AlloyExprGrammarListener)listener).exitField_id(this);
		}
	}

	public final Field_idContext field_id() throws RecognitionException {
		Field_idContext _localctx = new Field_idContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_field_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__7);
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
		enterRule(_localctx, 12, RULE_closure_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
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
		enterRule(_localctx, 14, RULE_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17-\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\4\3\2\13\f\3\2\r\16\2$\2"+
		"\22\3\2\2\2\4\24\3\2\2\2\6\33\3\2\2\2\b\"\3\2\2\2\n$\3\2\2\2\f&\3\2\2"+
		"\2\16(\3\2\2\2\20*\3\2\2\2\22\23\5\4\3\2\23\3\3\2\2\2\24\25\5\20\t\2\25"+
		"\26\7\3\2\2\26\27\7\4\2\2\27\30\5\6\4\2\30\31\7\4\2\2\31\32\5\b\5\2\32"+
		"\5\3\2\2\2\33\34\5\n\6\2\34\35\7\5\2\2\35\36\5\16\b\2\36\37\7\6\2\2\37"+
		" \5\f\7\2 !\7\7\2\2!\7\3\2\2\2\"#\7\b\2\2#\t\3\2\2\2$%\7\t\2\2%\13\3\2"+
		"\2\2&\'\7\n\2\2\'\r\3\2\2\2()\t\2\2\2)\17\3\2\2\2*+\t\3\2\2+\21\3\2\2"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}