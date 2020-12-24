// Generated from antlr/AlloyExprGrammar.g4 by ANTLR 4.7.1
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlloyExprGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, ID=34, ID_START=35, ID_CHAR=36, WS=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"ID", "ID_START", "ID_CHAR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "':'", "'.'", "'+'", "'-'", "'||'", "'or'", "'&&'", 
		"'and'", "'implies'", "'=>'", "'iff'", "'='", "'!='", "'in'", "'not in'", 
		"'<'", "'>'", "'<='", "'>='", "'!'", "'not'", "'no'", "'#'", "'*'", "'^'", 
		"'all'", "'some'", "'lone'", "'one'", "'0'", "'1'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "ID", "ID_START", 
		"ID_CHAR", "WS"
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


	public AlloyExprGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AlloyExprGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00c8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		"!\3!\3\"\3\"\3#\3#\7#\u00b6\n#\f#\16#\u00b9\13#\3$\5$\u00bc\n$\3%\3%\5"+
		"%\u00c0\n%\3&\6&\u00c3\n&\r&\16&\u00c4\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"\3\2\5\5\2C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2\u00ca\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7Q\3\2\2\2\tS\3\2\2\2\13U\3\2\2\2\rW\3\2"+
		"\2\2\17Y\3\2\2\2\21\\\3\2\2\2\23_\3\2\2\2\25b\3\2\2\2\27f\3\2\2\2\31n"+
		"\3\2\2\2\33q\3\2\2\2\35u\3\2\2\2\37w\3\2\2\2!z\3\2\2\2#}\3\2\2\2%\u0084"+
		"\3\2\2\2\'\u0086\3\2\2\2)\u0088\3\2\2\2+\u008b\3\2\2\2-\u008e\3\2\2\2"+
		"/\u0090\3\2\2\2\61\u0094\3\2\2\2\63\u0097\3\2\2\2\65\u0099\3\2\2\2\67"+
		"\u009b\3\2\2\29\u009d\3\2\2\2;\u00a1\3\2\2\2=\u00a6\3\2\2\2?\u00ab\3\2"+
		"\2\2A\u00af\3\2\2\2C\u00b1\3\2\2\2E\u00b3\3\2\2\2G\u00bb\3\2\2\2I\u00bf"+
		"\3\2\2\2K\u00c2\3\2\2\2MN\7*\2\2N\4\3\2\2\2OP\7+\2\2P\6\3\2\2\2QR\7<\2"+
		"\2R\b\3\2\2\2ST\7\60\2\2T\n\3\2\2\2UV\7-\2\2V\f\3\2\2\2WX\7/\2\2X\16\3"+
		"\2\2\2YZ\7~\2\2Z[\7~\2\2[\20\3\2\2\2\\]\7q\2\2]^\7t\2\2^\22\3\2\2\2_`"+
		"\7(\2\2`a\7(\2\2a\24\3\2\2\2bc\7c\2\2cd\7p\2\2de\7f\2\2e\26\3\2\2\2fg"+
		"\7k\2\2gh\7o\2\2hi\7r\2\2ij\7n\2\2jk\7k\2\2kl\7g\2\2lm\7u\2\2m\30\3\2"+
		"\2\2no\7?\2\2op\7@\2\2p\32\3\2\2\2qr\7k\2\2rs\7h\2\2st\7h\2\2t\34\3\2"+
		"\2\2uv\7?\2\2v\36\3\2\2\2wx\7#\2\2xy\7?\2\2y \3\2\2\2z{\7k\2\2{|\7p\2"+
		"\2|\"\3\2\2\2}~\7p\2\2~\177\7q\2\2\177\u0080\7v\2\2\u0080\u0081\7\"\2"+
		"\2\u0081\u0082\7k\2\2\u0082\u0083\7p\2\2\u0083$\3\2\2\2\u0084\u0085\7"+
		">\2\2\u0085&\3\2\2\2\u0086\u0087\7@\2\2\u0087(\3\2\2\2\u0088\u0089\7>"+
		"\2\2\u0089\u008a\7?\2\2\u008a*\3\2\2\2\u008b\u008c\7@\2\2\u008c\u008d"+
		"\7?\2\2\u008d,\3\2\2\2\u008e\u008f\7#\2\2\u008f.\3\2\2\2\u0090\u0091\7"+
		"p\2\2\u0091\u0092\7q\2\2\u0092\u0093\7v\2\2\u0093\60\3\2\2\2\u0094\u0095"+
		"\7p\2\2\u0095\u0096\7q\2\2\u0096\62\3\2\2\2\u0097\u0098\7%\2\2\u0098\64"+
		"\3\2\2\2\u0099\u009a\7,\2\2\u009a\66\3\2\2\2\u009b\u009c\7`\2\2\u009c"+
		"8\3\2\2\2\u009d\u009e\7c\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7n\2\2\u00a0"+
		":\3\2\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7o\2\2\u00a4"+
		"\u00a5\7g\2\2\u00a5<\3\2\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7q\2\2\u00a8"+
		"\u00a9\7p\2\2\u00a9\u00aa\7g\2\2\u00aa>\3\2\2\2\u00ab\u00ac\7q\2\2\u00ac"+
		"\u00ad\7p\2\2\u00ad\u00ae\7g\2\2\u00ae@\3\2\2\2\u00af\u00b0\7\62\2\2\u00b0"+
		"B\3\2\2\2\u00b1\u00b2\7\63\2\2\u00b2D\3\2\2\2\u00b3\u00b7\5G$\2\u00b4"+
		"\u00b6\5I%\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2"+
		"\2\u00b7\u00b8\3\2\2\2\u00b8F\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc"+
		"\t\2\2\2\u00bb\u00ba\3\2\2\2\u00bcH\3\2\2\2\u00bd\u00c0\5G$\2\u00be\u00c0"+
		"\t\3\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0J\3\2\2\2\u00c1"+
		"\u00c3\t\4\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b&\2\2\u00c7"+
		"L\3\2\2\2\7\2\u00b7\u00bb\u00bf\u00c4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}