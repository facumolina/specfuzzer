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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, ID=40, ID_START=41, ID_CHAR=42, WS=43;
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
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "ID", "ID_START", 
		"ID_CHAR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "':'", "'.'", "').'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'||'", "'or'", "'&&'", "'and'", "'implies'", "'=>'", "'iff'", 
		"'xor'", "'&'", "'='", "'!='", "'in'", "'not in'", "'<'", "'>'", "'<='", 
		"'>='", "'!'", "'not'", "'no'", "'#'", "'^'", "'all'", "'some'", "'lone'", 
		"'one'", "'0'", "'1'", "'-1'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "ID", "ID_START", "ID_CHAR", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u00e4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\7)\u00d2\n)\f)\16)\u00d5\13)\3*\5"+
		"*\u00d8\n*\3+\3+\5+\u00dc\n+\3,\6,\u00df\n,\r,\16,\u00e0\3,\3,\2\2-\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-\3\2\5\5\2C\\aac|\3\2\62;\5\2\13\f\17\17"+
		"\"\"\2\u00e6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5[\3\2\2\2\7]\3\2\2\2\t_\3"+
		"\2\2\2\13a\3\2\2\2\rd\3\2\2\2\17f\3\2\2\2\21h\3\2\2\2\23j\3\2\2\2\25l"+
		"\3\2\2\2\27n\3\2\2\2\31q\3\2\2\2\33t\3\2\2\2\35w\3\2\2\2\37{\3\2\2\2!"+
		"\u0083\3\2\2\2#\u0086\3\2\2\2%\u008a\3\2\2\2\'\u008e\3\2\2\2)\u0090\3"+
		"\2\2\2+\u0092\3\2\2\2-\u0095\3\2\2\2/\u0098\3\2\2\2\61\u009f\3\2\2\2\63"+
		"\u00a1\3\2\2\2\65\u00a3\3\2\2\2\67\u00a6\3\2\2\29\u00a9\3\2\2\2;\u00ab"+
		"\3\2\2\2=\u00af\3\2\2\2?\u00b2\3\2\2\2A\u00b4\3\2\2\2C\u00b6\3\2\2\2E"+
		"\u00ba\3\2\2\2G\u00bf\3\2\2\2I\u00c4\3\2\2\2K\u00c8\3\2\2\2M\u00ca\3\2"+
		"\2\2O\u00cc\3\2\2\2Q\u00cf\3\2\2\2S\u00d7\3\2\2\2U\u00db\3\2\2\2W\u00de"+
		"\3\2\2\2YZ\7*\2\2Z\4\3\2\2\2[\\\7+\2\2\\\6\3\2\2\2]^\7<\2\2^\b\3\2\2\2"+
		"_`\7\60\2\2`\n\3\2\2\2ab\7+\2\2bc\7\60\2\2c\f\3\2\2\2de\7-\2\2e\16\3\2"+
		"\2\2fg\7/\2\2g\20\3\2\2\2hi\7,\2\2i\22\3\2\2\2jk\7\61\2\2k\24\3\2\2\2"+
		"lm\7\'\2\2m\26\3\2\2\2no\7~\2\2op\7~\2\2p\30\3\2\2\2qr\7q\2\2rs\7t\2\2"+
		"s\32\3\2\2\2tu\7(\2\2uv\7(\2\2v\34\3\2\2\2wx\7c\2\2xy\7p\2\2yz\7f\2\2"+
		"z\36\3\2\2\2{|\7k\2\2|}\7o\2\2}~\7r\2\2~\177\7n\2\2\177\u0080\7k\2\2\u0080"+
		"\u0081\7g\2\2\u0081\u0082\7u\2\2\u0082 \3\2\2\2\u0083\u0084\7?\2\2\u0084"+
		"\u0085\7@\2\2\u0085\"\3\2\2\2\u0086\u0087\7k\2\2\u0087\u0088\7h\2\2\u0088"+
		"\u0089\7h\2\2\u0089$\3\2\2\2\u008a\u008b\7z\2\2\u008b\u008c\7q\2\2\u008c"+
		"\u008d\7t\2\2\u008d&\3\2\2\2\u008e\u008f\7(\2\2\u008f(\3\2\2\2\u0090\u0091"+
		"\7?\2\2\u0091*\3\2\2\2\u0092\u0093\7#\2\2\u0093\u0094\7?\2\2\u0094,\3"+
		"\2\2\2\u0095\u0096\7k\2\2\u0096\u0097\7p\2\2\u0097.\3\2\2\2\u0098\u0099"+
		"\7p\2\2\u0099\u009a\7q\2\2\u009a\u009b\7v\2\2\u009b\u009c\7\"\2\2\u009c"+
		"\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\60\3\2\2\2\u009f\u00a0\7>\2\2\u00a0"+
		"\62\3\2\2\2\u00a1\u00a2\7@\2\2\u00a2\64\3\2\2\2\u00a3\u00a4\7>\2\2\u00a4"+
		"\u00a5\7?\2\2\u00a5\66\3\2\2\2\u00a6\u00a7\7@\2\2\u00a7\u00a8\7?\2\2\u00a8"+
		"8\3\2\2\2\u00a9\u00aa\7#\2\2\u00aa:\3\2\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad"+
		"\7q\2\2\u00ad\u00ae\7v\2\2\u00ae<\3\2\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1"+
		"\7q\2\2\u00b1>\3\2\2\2\u00b2\u00b3\7%\2\2\u00b3@\3\2\2\2\u00b4\u00b5\7"+
		"`\2\2\u00b5B\3\2\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9"+
		"\7n\2\2\u00b9D\3\2\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd"+
		"\7o\2\2\u00bd\u00be\7g\2\2\u00beF\3\2\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1"+
		"\7q\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7g\2\2\u00c3H\3\2\2\2\u00c4\u00c5"+
		"\7q\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7g\2\2\u00c7J\3\2\2\2\u00c8\u00c9"+
		"\7\62\2\2\u00c9L\3\2\2\2\u00ca\u00cb\7\63\2\2\u00cbN\3\2\2\2\u00cc\u00cd"+
		"\7/\2\2\u00cd\u00ce\7\63\2\2\u00ceP\3\2\2\2\u00cf\u00d3\5S*\2\u00d0\u00d2"+
		"\5U+\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4R\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d8\t\2\2\2"+
		"\u00d7\u00d6\3\2\2\2\u00d8T\3\2\2\2\u00d9\u00dc\5S*\2\u00da\u00dc\t\3"+
		"\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dcV\3\2\2\2\u00dd\u00df"+
		"\t\4\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\b,\2\2\u00e3X\3\2\2\2\7"+
		"\2\u00d3\u00d7\u00db\u00e0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}