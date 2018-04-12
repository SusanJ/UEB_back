// Generated from simpleLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOTS3456=1, DOT4=2, DOT5=3, DOT6=4, DOTS45=5, DOTS56=6, DOTS46=7, DOTS456=8, 
		DOTLOC=9, PERCENT=10, SEVENTH_TDS=11, MOST_LETTERS=12, DOT2=13, DOTS23=14, 
		DOTS25=15, DOTS256=16, DOTS235=17, DOTS236=18, DOTS2356=19, DOTS356=20, 
		LOWER_ROOT=21, DOTS34=22, DOTS36=23, DOTS126=24, DOTS345=25, DOTS346=26, 
		DOT3=27, ROOT=28, SPACE=29, NEWLINE=30, INK_INFO=31, LETTERA=32, LETTERB=33, 
		UPDIGS=34, NUM_FRAG=35, CAP_ZED=36;
	public static final int
		INK_PRINT=2;
	public static final int
		ANOTHER=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "INK_PRINT"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "ANOTHER"
	};

	public static final String[] ruleNames = {
		"HASH", "DOTS3456", "DOT4", "NDQUO", "DOT5", "CAPS_IND", "DOT6", "DOTS45", 
		"DOTS56", "DOTS46", "DOTS456", "DOTLOC", "PERCENT", "SEVENTH_TDS", "MOST_LETTERS", 
		"LOW_ONE", "DOT2", "DOTS23", "DOTS25", "FULL_STOP", "DOTS256", "DOTS235", 
		"DOTS236", "DOTS2356", "DOTS356", "LOWER_ROOT", "FRAC_LINE", "DOTS34", 
		"DOTS36", "DOTS126", "DOTS345", "DOTS346", "DOT3", "ROOT", "ASPACE", "SPACE", 
		"NEWLINE", "INK_INFO", "LETTERA", "LETTERB", "UPDIGS", "NUM_FRAG", "CAP_ZED"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'@'", null, null, "'^'", "';'", "'.'", "'_'", null, null, 
		null, null, null, "'2'", "'3'", null, "'6'", "'8'", "'7'", "'0'", null, 
		null, "'-'", "'<'", "'>'", "'+'", "'''", null, null, null, null, "'a'", 
		"'b'", null, null, "'Z'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DOTS3456", "DOT4", "DOT5", "DOT6", "DOTS45", "DOTS56", "DOTS46", 
		"DOTS456", "DOTLOC", "PERCENT", "SEVENTH_TDS", "MOST_LETTERS", "DOT2", 
		"DOTS23", "DOTS25", "DOTS256", "DOTS235", "DOTS236", "DOTS2356", "DOTS356", 
		"LOWER_ROOT", "DOTS34", "DOTS36", "DOTS126", "DOTS345", "DOTS346", "DOT3", 
		"ROOT", "SPACE", "NEWLINE", "INK_INFO", "LETTERA", "LETTERB", "UPDIGS", 
		"NUM_FRAG", "CAP_ZED"
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


	public simpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "simpleLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 33:
			ROOT_action((RuleContext)_localctx, actionIndex);
			break;
		case 41:
			NUM_FRAG_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ROOT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println( "backslash? :|"+getText()+"|");
			break;
		}
	}
	private void NUM_FRAG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println( "NUM_FRAG: "+getText() );
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00c9\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\5#\u00a6"+
		"\n#\3$\3$\3%\3%\3&\6&\u00ad\n&\r&\16&\u00ae\3\'\3\'\3\'\3\'\7\'\u00b5"+
		"\n\'\f\'\16\'\u00b8\13\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3"+
		"+\3,\3,\3\u00b6\2-\4\2\6\3\b\4\n\2\f\5\16\2\20\6\22\7\24\b\26\t\30\n\32"+
		"\13\34\f\36\r \16\"\2$\17&\20(\21*\2,\22.\23\60\24\62\25\64\26\66\278"+
		"\2:\30<\31>\32@\33B\34D\35F\36H\2J\37L N!P\"R#T$V%X&\4\2\3\7\3\2m|\4\2"+
		"\67\67;;\n\2##&(*,<<??AA]]__\4\2\f\f\17\17\3\2el\2\u00c3\2\6\3\2\2\2\2"+
		"\b\3\2\2\2\2\f\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2"+
		"\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2"+
		"$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62"+
		"\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2"+
		"@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3"+
		"\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\3X\3\2\2\2\4Z\3\2\2"+
		"\2\6\\\3\2\2\2\b^\3\2\2\2\n`\3\2\2\2\fb\3\2\2\2\16d\3\2\2\2\20f\3\2\2"+
		"\2\22h\3\2\2\2\24j\3\2\2\2\26l\3\2\2\2\30n\3\2\2\2\32p\3\2\2\2\34s\3\2"+
		"\2\2\36v\3\2\2\2 z\3\2\2\2\"|\3\2\2\2$~\3\2\2\2&\u0080\3\2\2\2(\u0082"+
		"\3\2\2\2*\u0084\3\2\2\2,\u0086\3\2\2\2.\u0088\3\2\2\2\60\u008a\3\2\2\2"+
		"\62\u008c\3\2\2\2\64\u008e\3\2\2\2\66\u0090\3\2\2\28\u0092\3\2\2\2:\u0094"+
		"\3\2\2\2<\u0096\3\2\2\2>\u0098\3\2\2\2@\u009a\3\2\2\2B\u009c\3\2\2\2D"+
		"\u009e\3\2\2\2F\u00a5\3\2\2\2H\u00a7\3\2\2\2J\u00a9\3\2\2\2L\u00ac\3\2"+
		"\2\2N\u00b0\3\2\2\2P\u00be\3\2\2\2R\u00c0\3\2\2\2T\u00c2\3\2\2\2V\u00c4"+
		"\3\2\2\2X\u00c7\3\2\2\2Z[\7%\2\2[\5\3\2\2\2\\]\5\4\2\2]\7\3\2\2\2^_\7"+
		"B\2\2_\t\3\2\2\2`a\7$\2\2a\13\3\2\2\2bc\5\n\5\2c\r\3\2\2\2de\7.\2\2e\17"+
		"\3\2\2\2fg\5\16\7\2g\21\3\2\2\2hi\7`\2\2i\23\3\2\2\2jk\7=\2\2k\25\3\2"+
		"\2\2lm\7\60\2\2m\27\3\2\2\2no\7a\2\2o\31\3\2\2\2pq\7\60\2\2qr\7?\2\2r"+
		"\33\3\2\2\2st\7\60\2\2tu\7\62\2\2u\35\3\2\2\2vw\7\60\2\2wx\7%\2\2xy\7"+
		"A\2\2y\37\3\2\2\2z{\t\2\2\2{!\3\2\2\2|}\7\63\2\2}#\3\2\2\2~\177\5\"\21"+
		"\2\177%\3\2\2\2\u0080\u0081\7\64\2\2\u0081\'\3\2\2\2\u0082\u0083\7\65"+
		"\2\2\u0083)\3\2\2\2\u0084\u0085\7\66\2\2\u0085+\3\2\2\2\u0086\u0087\5"+
		"*\25\2\u0087-\3\2\2\2\u0088\u0089\78\2\2\u0089/\3\2\2\2\u008a\u008b\7"+
		":\2\2\u008b\61\3\2\2\2\u008c\u008d\79\2\2\u008d\63\3\2\2\2\u008e\u008f"+
		"\7\62\2\2\u008f\65\3\2\2\2\u0090\u0091\t\3\2\2\u0091\67\3\2\2\2\u0092"+
		"\u0093\7\61\2\2\u00939\3\2\2\2\u0094\u0095\58\34\2\u0095;\3\2\2\2\u0096"+
		"\u0097\7/\2\2\u0097=\3\2\2\2\u0098\u0099\7>\2\2\u0099?\3\2\2\2\u009a\u009b"+
		"\7@\2\2\u009bA\3\2\2\2\u009c\u009d\7-\2\2\u009dC\3\2\2\2\u009e\u009f\7"+
		")\2\2\u009fE\3\2\2\2\u00a0\u00a6\t\4\2\2\u00a1\u00a2\7^\2\2\u00a2\u00a3"+
		"\7^\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\b#\2\2\u00a5\u00a0\3\2\2\2\u00a5"+
		"\u00a1\3\2\2\2\u00a6G\3\2\2\2\u00a7\u00a8\7\"\2\2\u00a8I\3\2\2\2\u00a9"+
		"\u00aa\5H$\2\u00aaK\3\2\2\2\u00ab\u00ad\t\5\2\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00afM\3\2\2\2"+
		"\u00b0\u00b1\7\61\2\2\u00b1\u00b2\7\61\2\2\u00b2\u00b6\3\2\2\2\u00b3\u00b5"+
		"\13\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b7\3\2\2\2"+
		"\u00b6\u00b4\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba"+
		"\7\61\2\2\u00ba\u00bb\7\61\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\b\'\3\2"+
		"\u00bdO\3\2\2\2\u00be\u00bf\7c\2\2\u00bfQ\3\2\2\2\u00c0\u00c1\7d\2\2\u00c1"+
		"S\3\2\2\2\u00c2\u00c3\t\6\2\2\u00c3U\3\2\2\2\u00c4\u00c5\5T*\2\u00c5\u00c6"+
		"\b+\4\2\u00c6W\3\2\2\2\u00c7\u00c8\7\\\2\2\u00c8Y\3\2\2\2\7\2\3\u00a5"+
		"\u00ae\u00b6\5\3#\2\2\4\2\3+\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}