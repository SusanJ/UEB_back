// Generated from simpleLexer.g4 by ANTLR 4.7.1
package org.dotlessbraille.antlr; 
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
		FLC46=9, FLC56=10, DOTLOC=11, PERCENT=12, SEVENTH_TDS=13, ILC5=14, ILC45=15, 
		ILC456=16, BESF=17, CHSF=18, SHSF=19, STSF=20, OURSELVES=21, THSF=22, 
		ERSF=23, ONESELF=24, THMSLVS=25, CONCV=26, LETTERK=27, MOST_LETTERS=28, 
		DOT2=29, DOTS23=30, DOTS25=31, DOTS256=32, DOTS235=33, DOTS2356=34, DOTS236=35, 
		DOTS356=36, DOTS26=37, DOTS35=38, DOTS34=39, DOTS36=40, DOTS126=41, DOTS345=42, 
		DOTS346=43, DOT3=44, DOTS146=45, DOTS156=46, AND=47, FOR=48, OF=49, THE=50, 
		WITH=51, DOTS16=52, DOTS1456=53, DOTS1256=54, DOTS12456=55, DOTS246=56, 
		DOTS1246=57, SPACE=58, NEWLINE=59, INK_INFO=60, LETTERA=61, LETTERB=62, 
		UPDIGS=63, START_DIS=64, END_DIS=65, NEM0=66, NEM1=67, NEM2=68, NEM3=69, 
		NEM4=70, NEM5=71, NEM_BASELINE=72, NEM_DECPT=73, NEM_EQUALS=74, NEM_FACTORIAL=75, 
		NEM_MINUS=76, NEM_NEWLINE=77, NEM_PLUS=78, NEM_SPACE=79, NEM_SUPER=80, 
		NEM_SUB=81, NEM_INTEGRAL=82, NEM_OFENCE=83, NEM_CFENCE=84, NEM_VBAR=85, 
		LC_ID=86, ANOTHER_SPACE=87, CAP_ZED=88;
	public static final int
		INK_PRINT=2;
	public static final int
		NEMETH=1, ANOTHER=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "INK_PRINT"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "NEMETH", "ANOTHER"
	};

	public static final String[] ruleNames = {
		"HASH", "DOTS3456", "ATSIGN", "DOT4", "NDQUO", "DOT5", "CAPS_IND", "DOT6", 
		"CARET", "DOTS45", "SEMICOLON", "DOTS56", "ABPERIOD", "DOTS46", "USCORE", 
		"DOTS456", "FLC46", "FLC56", "DOTLOC", "PERCENT", "SEVENTH_TDS", "ILC5", 
		"ILC45", "ILC456", "BESF", "CHSF", "SHSF", "STSF", "OURSELVES", "THSF", 
		"ERSF", "ONESELF", "THMSLVS", "CONCV", "LETTERK", "MOST_LETTERS", "LOW_ONE", 
		"DOT2", "LOW_TWO", "DOTS23", "LOW_THREE", "DOTS25", "FULL_STOP", "DOTS256", 
		"DOTS235", "DOTS2356", "DOTS236", "LOW_ZERO", "DOTS356", "LOW_FIVE", "DOTS26", 
		"LOW_NINE", "DOTS35", "FRAC_LINE", "DOTS34", "HYPorMINUS", "DOTS36", "LESSTHAN", 
		"DOTS126", "GREATERTHAN", "DOTS345", "PLUS_SIGN", "DOTS346", "DOT3", "PCENT", 
		"DOTS146", "COLON", "DOTS156", "AMPER", "EQSIGN", "OPAREN", "EXCLAM", 
		"CPAREN", "OBRAK", "CBRAK", "DOLLAR", "ASTER", "QMARK", "BSLASH", "AND", 
		"FOR", "OF", "THE", "WITH", "DOTS16", "DOTS1456", "DOTS1256", "DOTS12456", 
		"DOTS246", "DOTS1246", "ASPACE", "SPACE", "WINNL", "NEWLINE", "INK_INFO", 
		"LETTERA", "LETTERB", "UPDIGS", "START_DIS", "END_DIS", "NEM0", "NEM1", 
		"NEM2", "NEM3", "NEM4", "NEM5", "NEM_BASELINE", "NEM_DECPT", "NEM_EQUALS", 
		"NEM_FACTORIAL", "NEM_MINUS", "NEM_NEWLINE", "NEM_PLUS", "NEM_SPACE", 
		"NEM_SUPER", "NEM_SUB", "NEM_INTEGRAL", "NEM_OFENCE", "NEM_CFENCE", "NEM_VBAR", 
		"LC_ID", "ANOTHER_SPACE", "CAP_ZED"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'k'", null, null, null, "'3'", null, "'6'", "'7'", 
		"'8'", null, null, null, null, null, null, null, null, "'''", null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'a'", "'b'", null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "'Z'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DOTS3456", "DOT4", "DOT5", "DOT6", "DOTS45", "DOTS56", "DOTS46", 
		"DOTS456", "FLC46", "FLC56", "DOTLOC", "PERCENT", "SEVENTH_TDS", "ILC5", 
		"ILC45", "ILC456", "BESF", "CHSF", "SHSF", "STSF", "OURSELVES", "THSF", 
		"ERSF", "ONESELF", "THMSLVS", "CONCV", "LETTERK", "MOST_LETTERS", "DOT2", 
		"DOTS23", "DOTS25", "DOTS256", "DOTS235", "DOTS2356", "DOTS236", "DOTS356", 
		"DOTS26", "DOTS35", "DOTS34", "DOTS36", "DOTS126", "DOTS345", "DOTS346", 
		"DOT3", "DOTS146", "DOTS156", "AND", "FOR", "OF", "THE", "WITH", "DOTS16", 
		"DOTS1456", "DOTS1256", "DOTS12456", "DOTS246", "DOTS1246", "SPACE", "NEWLINE", 
		"INK_INFO", "LETTERA", "LETTERB", "UPDIGS", "START_DIS", "END_DIS", "NEM0", 
		"NEM1", "NEM2", "NEM3", "NEM4", "NEM5", "NEM_BASELINE", "NEM_DECPT", "NEM_EQUALS", 
		"NEM_FACTORIAL", "NEM_MINUS", "NEM_NEWLINE", "NEM_PLUS", "NEM_SPACE", 
		"NEM_SUPER", "NEM_SUB", "NEM_INTEGRAL", "NEM_OFENCE", "NEM_CFENCE", "NEM_VBAR", 
		"LC_ID", "ANOTHER_SPACE", "CAP_ZED"
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
		case 120:
			LC_ID_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void LC_ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 if (getText().length() == 1) {     //MI or MN (Roman numeral)
			               setType( simpleParser.LATIN_LETTER );
			          }
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2Z\u025e\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t"+
		"<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4"+
		"H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\t"+
		"S\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^"+
		"\4_\t_\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j"+
		"\tj\4k\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu"+
		"\4v\tv\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u0133\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u013b"+
		"\n\30\3\31\3\31\3\31\5\31\u0140\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u014a\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u0154"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u0162\n\37\3 \3 \3 \3 \3 \3 \3 \5 \u016b\n \3 \3 \3 \3 \5 \u0171\n \3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\5#\u0180\n#\3$\3$\3%\3%\3&"+
		"\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67"+
		"\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C"+
		"\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N"+
		"\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z"+
		"\3Z\3[\3[\3\\\3\\\3]\3]\3^\6^\u01f7\n^\r^\16^\u01f8\3_\3_\3`\3`\3`\3`"+
		"\7`\u0201\n`\f`\16`\u0204\13`\3`\3`\3`\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3"+
		"d\3d\3d\3d\3e\3e\3e\3e\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3"+
		"l\3m\3m\3n\3n\3n\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3"+
		"v\3w\3w\5w\u0244\nw\3w\3w\3x\3x\5x\u024a\nx\3x\3x\3y\3y\3z\3z\7z\u0252"+
		"\nz\fz\16z\u0255\13z\3z\3z\3{\3{\3{\3{\3|\3|\3\u0202\2}\5\2\7\3\t\2\13"+
		"\4\r\2\17\5\21\2\23\6\25\2\27\7\31\2\33\b\35\2\37\t!\2#\n%\13\'\f)\r+"+
		"\16-\17/\20\61\21\63\22\65\23\67\249\25;\26=\27?\30A\31C\32E\33G\34I\35"+
		"K\36M\2O\37Q\2S U\2W!Y\2[\"]#_$a%c\2e&g\2i\'k\2m(o\2q)s\2u*w\2y+{\2},"+
		"\177\2\u0081-\u0083.\u0085\2\u0087/\u0089\2\u008b\60\u008d\2\u008f\2\u0091"+
		"\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f\2\u00a1\2\u00a3"+
		"\61\u00a5\62\u00a7\63\u00a9\64\u00ab\65\u00ad\66\u00af\67\u00b18\u00b3"+
		"9\u00b5:\u00b7;\u00b9\2\u00bb<\u00bd\2\u00bf=\u00c1>\u00c3?\u00c5@\u00c7"+
		"A\u00c9B\u00cbC\u00cdD\u00cfE\u00d1F\u00d3G\u00d5H\u00d7I\u00d9J\u00db"+
		"K\u00ddL\u00dfM\u00e1N\u00e3O\u00e5P\u00e7Q\u00e9R\u00ebS\u00edT\u00ef"+
		"U\u00f1V\u00f3W\u00f5X\u00f7Y\u00f9Z\5\2\3\4\16\5\2fgppuv\b\2ggiinnpp"+
		"uv{{\7\2fhjjmwyy{{\4\2wwyy\7\2eejjoouuyy\t\2eehhjjnnppuv{{\4\2oouu\4\2"+
		"hhoo\3\2n|\4\2\f\f\17\17\3\2el\4\2C\\c|\2\u024f\2\7\3\2\2\2\2\13\3\2\2"+
		"\2\2\17\3\2\2\2\2\23\3\2\2\2\2\27\3\2\2\2\2\33\3\2\2\2\2\37\3\2\2\2\2"+
		"#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3"+
		"\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2"+
		"\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G"+
		"\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2O\3\2\2\2\2S\3\2\2\2\2W\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2e\3\2\2\2\2i\3\2\2\2\2m\3\2\2\2"+
		"\2q\3\2\2\2\2u\3\2\2\2\2y\3\2\2\2\2}\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3"+
		"\2\2\2\2\u0087\3\2\2\2\2\u008b\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2"+
		"\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af"+
		"\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2"+
		"\2\2\u00bb\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5"+
		"\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\3\u00cb\3\2\2\2\3\u00cd\3\2\2"+
		"\2\3\u00cf\3\2\2\2\3\u00d1\3\2\2\2\3\u00d3\3\2\2\2\3\u00d5\3\2\2\2\3\u00d7"+
		"\3\2\2\2\3\u00d9\3\2\2\2\3\u00db\3\2\2\2\3\u00dd\3\2\2\2\3\u00df\3\2\2"+
		"\2\3\u00e1\3\2\2\2\3\u00e3\3\2\2\2\3\u00e5\3\2\2\2\3\u00e7\3\2\2\2\3\u00e9"+
		"\3\2\2\2\3\u00eb\3\2\2\2\3\u00ed\3\2\2\2\3\u00ef\3\2\2\2\3\u00f1\3\2\2"+
		"\2\3\u00f3\3\2\2\2\3\u00f5\3\2\2\2\4\u00f7\3\2\2\2\4\u00f9\3\2\2\2\5\u00fb"+
		"\3\2\2\2\7\u00fd\3\2\2\2\t\u00ff\3\2\2\2\13\u0101\3\2\2\2\r\u0103\3\2"+
		"\2\2\17\u0105\3\2\2\2\21\u0107\3\2\2\2\23\u0109\3\2\2\2\25\u010b\3\2\2"+
		"\2\27\u010d\3\2\2\2\31\u010f\3\2\2\2\33\u0111\3\2\2\2\35\u0113\3\2\2\2"+
		"\37\u0115\3\2\2\2!\u0117\3\2\2\2#\u0119\3\2\2\2%\u011b\3\2\2\2\'\u011e"+
		"\3\2\2\2)\u0121\3\2\2\2+\u0124\3\2\2\2-\u0127\3\2\2\2/\u012b\3\2\2\2\61"+
		"\u0134\3\2\2\2\63\u013c\3\2\2\2\65\u0141\3\2\2\2\67\u0149\3\2\2\29\u014b"+
		"\3\2\2\2;\u0153\3\2\2\2=\u0155\3\2\2\2?\u0161\3\2\2\2A\u0170\3\2\2\2C"+
		"\u0172\3\2\2\2E\u0176\3\2\2\2G\u017b\3\2\2\2I\u0181\3\2\2\2K\u0183\3\2"+
		"\2\2M\u0185\3\2\2\2O\u0187\3\2\2\2Q\u0189\3\2\2\2S\u018b\3\2\2\2U\u018d"+
		"\3\2\2\2W\u018f\3\2\2\2Y\u0191\3\2\2\2[\u0193\3\2\2\2]\u0195\3\2\2\2_"+
		"\u0197\3\2\2\2a\u0199\3\2\2\2c\u019b\3\2\2\2e\u019d\3\2\2\2g\u019f\3\2"+
		"\2\2i\u01a1\3\2\2\2k\u01a3\3\2\2\2m\u01a5\3\2\2\2o\u01a7\3\2\2\2q\u01a9"+
		"\3\2\2\2s\u01ab\3\2\2\2u\u01ad\3\2\2\2w\u01af\3\2\2\2y\u01b1\3\2\2\2{"+
		"\u01b3\3\2\2\2}\u01b5\3\2\2\2\177\u01b7\3\2\2\2\u0081\u01b9\3\2\2\2\u0083"+
		"\u01bb\3\2\2\2\u0085\u01bd\3\2\2\2\u0087\u01bf\3\2\2\2\u0089\u01c1\3\2"+
		"\2\2\u008b\u01c3\3\2\2\2\u008d\u01c5\3\2\2\2\u008f\u01c7\3\2\2\2\u0091"+
		"\u01c9\3\2\2\2\u0093\u01cb\3\2\2\2\u0095\u01cd\3\2\2\2\u0097\u01cf\3\2"+
		"\2\2\u0099\u01d1\3\2\2\2\u009b\u01d3\3\2\2\2\u009d\u01d5\3\2\2\2\u009f"+
		"\u01d7\3\2\2\2\u00a1\u01d9\3\2\2\2\u00a3\u01db\3\2\2\2\u00a5\u01dd\3\2"+
		"\2\2\u00a7\u01df\3\2\2\2\u00a9\u01e1\3\2\2\2\u00ab\u01e3\3\2\2\2\u00ad"+
		"\u01e5\3\2\2\2\u00af\u01e7\3\2\2\2\u00b1\u01e9\3\2\2\2\u00b3\u01eb\3\2"+
		"\2\2\u00b5\u01ed\3\2\2\2\u00b7\u01ef\3\2\2\2\u00b9\u01f1\3\2\2\2\u00bb"+
		"\u01f3\3\2\2\2\u00bd\u01f6\3\2\2\2\u00bf\u01fa\3\2\2\2\u00c1\u01fc\3\2"+
		"\2\2\u00c3\u020a\3\2\2\2\u00c5\u020c\3\2\2\2\u00c7\u020e\3\2\2\2\u00c9"+
		"\u0210\3\2\2\2\u00cb\u0216\3\2\2\2\u00cd\u021c\3\2\2\2\u00cf\u021e\3\2"+
		"\2\2\u00d1\u0220\3\2\2\2\u00d3\u0222\3\2\2\2\u00d5\u0224\3\2\2\2\u00d7"+
		"\u0226\3\2\2\2\u00d9\u0228\3\2\2\2\u00db\u022a\3\2\2\2\u00dd\u022c\3\2"+
		"\2\2\u00df\u0231\3\2\2\2\u00e1\u0233\3\2\2\2\u00e3\u0235\3\2\2\2\u00e5"+
		"\u0237\3\2\2\2\u00e7\u0239\3\2\2\2\u00e9\u023b\3\2\2\2\u00eb\u023d\3\2"+
		"\2\2\u00ed\u023f\3\2\2\2\u00ef\u0243\3\2\2\2\u00f1\u0249\3\2\2\2\u00f3"+
		"\u024d\3\2\2\2\u00f5\u024f\3\2\2\2\u00f7\u0258\3\2\2\2\u00f9\u025c\3\2"+
		"\2\2\u00fb\u00fc\7%\2\2\u00fc\6\3\2\2\2\u00fd\u00fe\5\5\2\2\u00fe\b\3"+
		"\2\2\2\u00ff\u0100\7B\2\2\u0100\n\3\2\2\2\u0101\u0102\5\t\4\2\u0102\f"+
		"\3\2\2\2\u0103\u0104\7$\2\2\u0104\16\3\2\2\2\u0105\u0106\5\r\6\2\u0106"+
		"\20\3\2\2\2\u0107\u0108\7.\2\2\u0108\22\3\2\2\2\u0109\u010a\5\21\b\2\u010a"+
		"\24\3\2\2\2\u010b\u010c\7`\2\2\u010c\26\3\2\2\2\u010d\u010e\5\25\n\2\u010e"+
		"\30\3\2\2\2\u010f\u0110\7=\2\2\u0110\32\3\2\2\2\u0111\u0112\5\31\f\2\u0112"+
		"\34\3\2\2\2\u0113\u0114\7\60\2\2\u0114\36\3\2\2\2\u0115\u0116\5\35\16"+
		"\2\u0116 \3\2\2\2\u0117\u0118\7a\2\2\u0118\"\3\2\2\2\u0119\u011a\5!\20"+
		"\2\u011a$\3\2\2\2\u011b\u011c\5\35\16\2\u011c\u011d\t\2\2\2\u011d&\3\2"+
		"\2\2\u011e\u011f\5\31\f\2\u011f\u0120\t\3\2\2\u0120(\3\2\2\2\u0121\u0122"+
		"\7\60\2\2\u0122\u0123\7?\2\2\u0123*\3\2\2\2\u0124\u0125\7\60\2\2\u0125"+
		"\u0126\7\62\2\2\u0126,\3\2\2\2\u0127\u0128\7\60\2\2\u0128\u0129\7%\2\2"+
		"\u0129\u012a\7A\2\2\u012a.\3\2\2\2\u012b\u0132\5\r\6\2\u012c\u0133\t\4"+
		"\2\2\u012d\u0133\5\u009dN\2\u012e\u0133\5\u009fO\2\u012f\u0133\5\u0089"+
		"D\2\u0130\u0133\5\u00a1P\2\u0131\u0133\5\u0093I\2\u0132\u012c\3\2\2\2"+
		"\u0132\u012d\3\2\2\2\u0132\u012e\3\2\2\2\u0132\u012f\3\2\2\2\u0132\u0130"+
		"\3\2\2\2\u0132\u0131\3\2\2\2\u0133\60\3\2\2\2\u0134\u013a\5\25\n\2\u0135"+
		"\u013b\t\5\2\2\u0136\u013b\5\u009dN\2\u0137\u013b\5\u009fO\2\u0138\u013b"+
		"\5\u0089D\2\u0139\u013b\5\u0093I\2\u013a\u0135\3\2\2\2\u013a\u0136\3\2"+
		"\2\2\u013a\u0137\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b"+
		"\62\3\2\2\2\u013c\u013f\5!\20\2\u013d\u0140\t\6\2\2\u013e\u0140\5\u0093"+
		"I\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140\64\3\2\2\2\u0141\u0142"+
		"\5Q(\2\u0142\u0143\t\7\2\2\u0143\66\3\2\2\2\u0144\u0145\5\u009dN\2\u0145"+
		"\u0146\7p\2\2\u0146\u014a\3\2\2\2\u0147\u0148\t\b\2\2\u0148\u014a\5\u009d"+
		"N\2\u0149\u0144\3\2\2\2\u0149\u0147\3\2\2\2\u014a8\3\2\2\2\u014b\u014c"+
		"\5\u0085B\2\u014c\u014d\7f\2\2\u014d:\3\2\2\2\u014e\u014f\7c\2\2\u014f"+
		"\u0150\7i\2\2\u0150\u0154\5\u00a1P\2\u0151\u0152\t\t\2\2\u0152\u0154\5"+
		"\u00a1P\2\u0153\u014e\3\2\2\2\u0153\u0151\3\2\2\2\u0154<\3\2\2\2\u0155"+
		"\u0156\5\u00a1P\2\u0156\u0157\7t\2\2\u0157\u0158\7x\2\2\u0158\u0159\7"+
		"u\2\2\u0159>\3\2\2\2\u015a\u015b\7c\2\2\u015b\u015c\7n\2\2\u015c\u0162"+
		"\5\u009fO\2\u015d\u015e\5\u009fO\2\u015e\u015f\7{\2\2\u015f\u0160\7h\2"+
		"\2\u0160\u0162\3\2\2\2\u0161\u015a\3\2\2\2\u0161\u015d\3\2\2\2\u0162@"+
		"\3\2\2\2\u0163\u0164\7r\2\2\u0164\u0165\5\u0099L\2\u0165\u016a\3\2\2\2"+
		"\u0166\u016b\7j\2\2\u0167\u0168\7e\2\2\u0168\u0169\7x\2\2\u0169\u016b"+
		"\7i\2\2\u016a\u0166\3\2\2\2\u016a\u0167\3\2\2\2\u016b\u0171\3\2\2\2\u016c"+
		"\u016d\7j\2\2\u016d\u016e\5\u0099L\2\u016e\u016f\7h\2\2\u016f\u0171\3"+
		"\2\2\2\u0170\u0163\3\2\2\2\u0170\u016c\3\2\2\2\u0171B\3\2\2\2\u0172\u0173"+
		"\5\17\7\2\u0173\u0174\7q\2\2\u0174\u0175\7h\2\2\u0175D\3\2\2\2\u0176\u0177"+
		"\5\u0093I\2\u0177\u0178\7o\2\2\u0178\u0179\7x\2\2\u0179\u017a\7u\2\2\u017a"+
		"F\3\2\2\2\u017b\u017c\7\65\2\2\u017c\u017d\7e\2\2\u017d\u017f\7x\2\2\u017e"+
		"\u0180\7i\2\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180H\3\2\2\2\u0181"+
		"\u0182\7m\2\2\u0182J\3\2\2\2\u0183\u0184\t\n\2\2\u0184L\3\2\2\2\u0185"+
		"\u0186\7\63\2\2\u0186N\3\2\2\2\u0187\u0188\5M&\2\u0188P\3\2\2\2\u0189"+
		"\u018a\7\64\2\2\u018aR\3\2\2\2\u018b\u018c\5Q(\2\u018cT\3\2\2\2\u018d"+
		"\u018e\7\65\2\2\u018eV\3\2\2\2\u018f\u0190\7\65\2\2\u0190X\3\2\2\2\u0191"+
		"\u0192\7\66\2\2\u0192Z\3\2\2\2\u0193\u0194\5Y,\2\u0194\\\3\2\2\2\u0195"+
		"\u0196\78\2\2\u0196^\3\2\2\2\u0197\u0198\79\2\2\u0198`\3\2\2\2\u0199\u019a"+
		"\7:\2\2\u019ab\3\2\2\2\u019b\u019c\7\62\2\2\u019cd\3\2\2\2\u019d\u019e"+
		"\5c\61\2\u019ef\3\2\2\2\u019f\u01a0\7\67\2\2\u01a0h\3\2\2\2\u01a1\u01a2"+
		"\5g\63\2\u01a2j\3\2\2\2\u01a3\u01a4\7;\2\2\u01a4l\3\2\2\2\u01a5\u01a6"+
		"\5k\65\2\u01a6n\3\2\2\2\u01a7\u01a8\7\61\2\2\u01a8p\3\2\2\2\u01a9\u01aa"+
		"\5o\67\2\u01aar\3\2\2\2\u01ab\u01ac\7/\2\2\u01act\3\2\2\2\u01ad\u01ae"+
		"\5s9\2\u01aev\3\2\2\2\u01af\u01b0\7>\2\2\u01b0x\3\2\2\2\u01b1\u01b2\5"+
		"w;\2\u01b2z\3\2\2\2\u01b3\u01b4\7@\2\2\u01b4|\3\2\2\2\u01b5\u01b6\5{="+
		"\2\u01b6~\3\2\2\2\u01b7\u01b8\7-\2\2\u01b8\u0080\3\2\2\2\u01b9\u01ba\5"+
		"\177?\2\u01ba\u0082\3\2\2\2\u01bb\u01bc\7)\2\2\u01bc\u0084\3\2\2\2\u01bd"+
		"\u01be\7\'\2\2\u01be\u0086\3\2\2\2\u01bf\u01c0\5\u0085B\2\u01c0\u0088"+
		"\3\2\2\2\u01c1\u01c2\7<\2\2\u01c2\u008a\3\2\2\2\u01c3\u01c4\5\u0089D\2"+
		"\u01c4\u008c\3\2\2\2\u01c5\u01c6\7(\2\2\u01c6\u008e\3\2\2\2\u01c7\u01c8"+
		"\7?\2\2\u01c8\u0090\3\2\2\2\u01c9\u01ca\7*\2\2\u01ca\u0092\3\2\2\2\u01cb"+
		"\u01cc\7#\2\2\u01cc\u0094\3\2\2\2\u01cd\u01ce\7+\2\2\u01ce\u0096\3\2\2"+
		"\2\u01cf\u01d0\7]\2\2\u01d0\u0098\3\2\2\2\u01d1\u01d2\7_\2\2\u01d2\u009a"+
		"\3\2\2\2\u01d3\u01d4\7&\2\2\u01d4\u009c\3\2\2\2\u01d5\u01d6\7,\2\2\u01d6"+
		"\u009e\3\2\2\2\u01d7\u01d8\7A\2\2\u01d8\u00a0\3\2\2\2\u01d9\u01da\7^\2"+
		"\2\u01da\u00a2\3\2\2\2\u01db\u01dc\5\u008dF\2\u01dc\u00a4\3\2\2\2\u01dd"+
		"\u01de\5\u008fG\2\u01de\u00a6\3\2\2\2\u01df\u01e0\5\u0091H\2\u01e0\u00a8"+
		"\3\2\2\2\u01e1\u01e2\5\u0093I\2\u01e2\u00aa\3\2\2\2\u01e3\u01e4\5\u0095"+
		"J\2\u01e4\u00ac\3\2\2\2\u01e5\u01e6\5\u009dN\2\u01e6\u00ae\3\2\2\2\u01e7"+
		"\u01e8\5\u009fO\2\u01e8\u00b0\3\2\2\2\u01e9\u01ea\5\u00a1P\2\u01ea\u00b2"+
		"\3\2\2\2\u01eb\u01ec\5\u0099L\2\u01ec\u00b4\3\2\2\2\u01ed\u01ee\5\u0097"+
		"K\2\u01ee\u00b6\3\2\2\2\u01ef\u01f0\5\u009bM\2\u01f0\u00b8\3\2\2\2\u01f1"+
		"\u01f2\7\"\2\2\u01f2\u00ba\3\2\2\2\u01f3\u01f4\5\u00b9\\\2\u01f4\u00bc"+
		"\3\2\2\2\u01f5\u01f7\t\13\2\2\u01f6\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2"+
		"\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u00be\3\2\2\2\u01fa\u01fb"+
		"\5\u00bd^\2\u01fb\u00c0\3\2\2\2\u01fc\u01fd\7\61\2\2\u01fd\u01fe\7\61"+
		"\2\2\u01fe\u0202\3\2\2\2\u01ff\u0201\13\2\2\2\u0200\u01ff\3\2\2\2\u0201"+
		"\u0204\3\2\2\2\u0202\u0203\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u0205\3\2"+
		"\2\2\u0204\u0202\3\2\2\2\u0205\u0206\7\61\2\2\u0206\u0207\7\61\2\2\u0207"+
		"\u0208\3\2\2\2\u0208\u0209\b`\2\2\u0209\u00c2\3\2\2\2\u020a\u020b\7c\2"+
		"\2\u020b\u00c4\3\2\2\2\u020c\u020d\7d\2\2\u020d\u00c6\3\2\2\2\u020e\u020f"+
		"\t\f\2\2\u020f\u00c8\3\2\2\2\u0210\u0211\5!\20\2\u0211\u0212\5\u0085B"+
		"\2\u0212\u0213\5\u00b9\\\2\u0213\u0214\3\2\2\2\u0214\u0215\bd\3\2\u0215"+
		"\u00ca\3\2\2\2\u0216\u0217\5!\20\2\u0217\u0218\5\u0089D\2\u0218\u0219"+
		"\5\u00b9\\\2\u0219\u021a\3\2\2\2\u021a\u021b\be\4\2\u021b\u00cc\3\2\2"+
		"\2\u021c\u021d\5c\61\2\u021d\u00ce\3\2\2\2\u021e\u021f\5M&\2\u021f\u00d0"+
		"\3\2\2\2\u0220\u0221\5Q(\2\u0221\u00d2\3\2\2\2\u0222\u0223\5U*\2\u0223"+
		"\u00d4\3\2\2\2\u0224\u0225\5Y,\2\u0225\u00d6\3\2\2\2\u0226\u0227\5g\63"+
		"\2\u0227\u00d8\3\2\2\2\u0228\u0229\5\r\6\2\u0229\u00da\3\2\2\2\u022a\u022b"+
		"\5\35\16\2\u022b\u00dc\3\2\2\2\u022c\u022d\5\u00b9\\\2\u022d\u022e\5\35"+
		"\16\2\u022e\u022f\5I$\2\u022f\u0230\5\u00b9\\\2\u0230\u00de\3\2\2\2\u0231"+
		"\u0232\5\u008dF\2\u0232\u00e0\3\2\2\2\u0233\u0234\5s9\2\u0234\u00e2\3"+
		"\2\2\2\u0235\u0236\5\u00bd^\2\u0236\u00e4\3\2\2\2\u0237\u0238\5\177?\2"+
		"\u0238\u00e6\3\2\2\2\u0239\u023a\5\u00b9\\\2\u023a\u00e8\3\2\2\2\u023b"+
		"\u023c\5\25\n\2\u023c\u00ea\3\2\2\2\u023d\u023e\5\31\f\2\u023e\u00ec\3"+
		"\2\2\2\u023f\u0240\5\u0093I\2\u0240\u00ee\3\2\2\2\u0241\u0244\5\35\16"+
		"\2\u0242\u0244\5\t\4\2\u0243\u0241\3\2\2\2\u0243\u0242\3\2\2\2\u0243\u0244"+
		"\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\5\u0091H\2\u0246\u00f0\3\2\2"+
		"\2\u0247\u024a\5\35\16\2\u0248\u024a\5\t\4\2\u0249\u0247\3\2\2\2\u0249"+
		"\u0248\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\5\u0095"+
		"J\2\u024c\u00f2\3\2\2\2\u024d\u024e\5\u00a1P\2\u024e\u00f4\3\2\2\2\u024f"+
		"\u0253\t\r\2\2\u0250\u0252\t\r\2\2\u0251\u0250\3\2\2\2\u0252\u0255\3\2"+
		"\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0256\3\2\2\2\u0255"+
		"\u0253\3\2\2\2\u0256\u0257\bz\5\2\u0257\u00f6\3\2\2\2\u0258\u0259\5\u00b9"+
		"\\\2\u0259\u025a\3\2\2\2\u025a\u025b\b{\4\2\u025b\u00f8\3\2\2\2\u025c"+
		"\u025d\7\\\2\2\u025d\u00fa\3\2\2\2\23\2\3\4\u0132\u013a\u013f\u0149\u0153"+
		"\u0161\u016a\u0170\u017f\u01f8\u0202\u0243\u0249\u0253\6\2\4\2\7\3\2\6"+
		"\2\2\3z\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}