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
		LETTERK=23, MOST_LETTERS=24, DOT2=25, DOTS23=26, DOTS25=27, DOTS256=28, 
		DOTS235=29, DOTS2356=30, DOTS236=31, DOTS356=32, LOWER_ROOT=33, DOTS34=34, 
		DOTS36=35, DOTS126=36, DOTS345=37, DOTS346=38, DOT3=39, DOTS146=40, DOTS156=41, 
		AND=42, FOR=43, OF=44, THE=45, WITH=46, DOTS16=47, DOTS1456=48, DOTS1256=49, 
		ROOT=50, SPACE=51, NEWLINE=52, INK_INFO=53, LETTERA=54, LETTERB=55, UPDIGS=56, 
		START_DIS=57, END_DIS=58, NEM0=59, NEM1=60, NEM2=61, NEM3=62, NEM4=63, 
		NEM5=64, NEM_BASELINE=65, NEM_DECPT=66, NEM_EQUALS=67, NEM_FACTORIAL=68, 
		NEM_MINUS=69, NEM_NEWLINE=70, NEM_PLUS=71, NEM_SPACE=72, NEM_SUPER=73, 
		NEM_SUB=74, NEM_INTEGRAL=75, NEM_OFENCE=76, NEM_CFENCE=77, NEM_VBAR=78, 
		LC_ID=79, ANOTHER_SPACE=80, CAP_ZED=81;
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
		"LETTERK", "MOST_LETTERS", "LOW_ONE", "DOT2", "LOW_TWO", "DOTS23", "LOW_THREE", 
		"DOTS25", "FULL_STOP", "DOTS256", "DOTS235", "DOTS2356", "DOTS236", "LOW_ZERO", 
		"DOTS356", "LOW_FIVE", "LOW_NINE", "LOWER_ROOT", "FRAC_LINE", "DOTS34", 
		"HYPorMINUS", "DOTS36", "LESSTHAN", "DOTS126", "GREATERTHAN", "DOTS345", 
		"PLUS_SIGN", "DOTS346", "DOT3", "PCENT", "DOTS146", "COLON", "DOTS156", 
		"OPAREN", "CPAREN", "OBRAK", "CBRAK", "AMPER", "EQSIGN", "EXCLAM", "ASTER", 
		"BSLASH", "QMARK", "DOLLAR", "AND", "FOR", "OF", "THE", "WITH", "DOTS16", 
		"DOTS1456", "DOTS1256", "ROOT", "ASPACE", "SPACE", "WINNL", "NEWLINE", 
		"INK_INFO", "LETTERA", "LETTERB", "UPDIGS", "START_DIS", "END_DIS", "NEM0", 
		"NEM1", "NEM2", "NEM3", "NEM4", "NEM5", "NEM_BASELINE", "NEM_DECPT", "NEM_EQUALS", 
		"NEM_FACTORIAL", "NEM_MINUS", "NEM_NEWLINE", "NEM_PLUS", "NEM_SPACE", 
		"NEM_SUPER", "NEM_SUB", "NEM_INTEGRAL", "NEM_OFENCE", "NEM_CFENCE", "NEM_VBAR", 
		"LC_ID", "ANOTHER_SPACE", "CAP_ZED"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "'k'", 
		null, null, null, "'3'", null, "'6'", "'7'", "'8'", null, null, null, 
		null, null, null, null, "'''", null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "'a'", "'b'", null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "'Z'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DOTS3456", "DOT4", "DOT5", "DOT6", "DOTS45", "DOTS56", "DOTS46", 
		"DOTS456", "FLC46", "FLC56", "DOTLOC", "PERCENT", "SEVENTH_TDS", "ILC5", 
		"ILC45", "ILC456", "BESF", "CHSF", "SHSF", "STSF", "OURSELVES", "THSF", 
		"LETTERK", "MOST_LETTERS", "DOT2", "DOTS23", "DOTS25", "DOTS256", "DOTS235", 
		"DOTS2356", "DOTS236", "DOTS356", "LOWER_ROOT", "DOTS34", "DOTS36", "DOTS126", 
		"DOTS345", "DOTS346", "DOT3", "DOTS146", "DOTS156", "AND", "FOR", "OF", 
		"THE", "WITH", "DOTS16", "DOTS1456", "DOTS1256", "ROOT", "SPACE", "NEWLINE", 
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
		case 113:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2S\u0233\b\1\b\1\b"+
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
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0125\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u012d\n\30\3\31\3\31\3\31\5\31\u0132\n\31\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u013c\n\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u0146\n\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0155\n\37\3 \3 \3!\3!\3\"\3"+
		"\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3"+
		"-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\5\61\u017b\n\61\3\62\3\62\3\63\3\63"+
		"\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3"+
		"<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3"+
		"H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3"+
		"S\3T\3T\3T\3T\5T\u01c5\nT\3U\3U\3V\3V\3W\6W\u01cc\nW\rW\16W\u01cd\3X\3"+
		"X\3Y\3Y\3Y\3Y\7Y\u01d6\nY\fY\16Y\u01d9\13Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3[\3["+
		"\3\\\3\\\3]\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3"+
		"c\3c\3d\3d\3e\3e\3f\3f\3g\3g\3g\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3"+
		"m\3m\3n\3n\3o\3o\3p\3p\5p\u0219\np\3p\3p\3q\3q\5q\u021f\nq\3q\3q\3r\3"+
		"r\3s\3s\7s\u0227\ns\fs\16s\u022a\13s\3s\3s\3t\3t\3t\3t\3u\3u\3\u01d7\2"+
		"v\5\2\7\3\t\2\13\4\r\2\17\5\21\2\23\6\25\2\27\7\31\2\33\b\35\2\37\t!\2"+
		"#\n%\13\'\f)\r+\16-\17/\20\61\21\63\22\65\23\67\249\25;\26=\27?\30A\31"+
		"C\32E\2G\33I\2K\34M\2O\35Q\2S\36U\37W Y![\2]\"_\2a\2c#e\2g$i\2k%m\2o&"+
		"q\2s\'u\2w(y){\2}*\177\2\u0081+\u0083\2\u0085\2\u0087\2\u0089\2\u008b"+
		"\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099,\u009b-\u009d"+
		".\u009f/\u00a1\60\u00a3\61\u00a5\62\u00a7\63\u00a9\64\u00ab\2\u00ad\65"+
		"\u00af\2\u00b1\66\u00b3\67\u00b58\u00b79\u00b9:\u00bb;\u00bd<\u00bf=\u00c1"+
		">\u00c3?\u00c5@\u00c7A\u00c9B\u00cbC\u00cdD\u00cfE\u00d1F\u00d3G\u00d5"+
		"H\u00d7I\u00d9J\u00dbK\u00ddL\u00dfM\u00e1N\u00e3O\u00e5P\u00e7Q\u00e9"+
		"R\u00ebS\5\2\3\4\16\5\2fgppuv\b\2ggiinnppuv{{\7\2fhjjmwyy{{\4\2wwyy\7"+
		"\2eejjoouuyy\t\2eehhjjnnppuv{{\4\2oouu\4\2hhoo\3\2n|\4\2\f\f\17\17\3\2"+
		"el\4\2C\\c|\2\u0225\2\7\3\2\2\2\2\13\3\2\2\2\2\17\3\2\2\2\2\23\3\2\2\2"+
		"\2\27\3\2\2\2\2\33\3\2\2\2\2\37\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2G\3\2\2\2\2K\3\2\2\2\2O\3\2\2\2\2S\3\2\2\2"+
		"\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2]\3\2\2\2\2c\3\2\2\2\2g\3\2\2\2\2k"+
		"\3\2\2\2\2o\3\2\2\2\2s\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2}\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ad\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2"+
		"\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\3\u00bd\3\2\2\2\3\u00bf"+
		"\3\2\2\2\3\u00c1\3\2\2\2\3\u00c3\3\2\2\2\3\u00c5\3\2\2\2\3\u00c7\3\2\2"+
		"\2\3\u00c9\3\2\2\2\3\u00cb\3\2\2\2\3\u00cd\3\2\2\2\3\u00cf\3\2\2\2\3\u00d1"+
		"\3\2\2\2\3\u00d3\3\2\2\2\3\u00d5\3\2\2\2\3\u00d7\3\2\2\2\3\u00d9\3\2\2"+
		"\2\3\u00db\3\2\2\2\3\u00dd\3\2\2\2\3\u00df\3\2\2\2\3\u00e1\3\2\2\2\3\u00e3"+
		"\3\2\2\2\3\u00e5\3\2\2\2\3\u00e7\3\2\2\2\4\u00e9\3\2\2\2\4\u00eb\3\2\2"+
		"\2\5\u00ed\3\2\2\2\7\u00ef\3\2\2\2\t\u00f1\3\2\2\2\13\u00f3\3\2\2\2\r"+
		"\u00f5\3\2\2\2\17\u00f7\3\2\2\2\21\u00f9\3\2\2\2\23\u00fb\3\2\2\2\25\u00fd"+
		"\3\2\2\2\27\u00ff\3\2\2\2\31\u0101\3\2\2\2\33\u0103\3\2\2\2\35\u0105\3"+
		"\2\2\2\37\u0107\3\2\2\2!\u0109\3\2\2\2#\u010b\3\2\2\2%\u010d\3\2\2\2\'"+
		"\u0110\3\2\2\2)\u0113\3\2\2\2+\u0116\3\2\2\2-\u0119\3\2\2\2/\u011d\3\2"+
		"\2\2\61\u0126\3\2\2\2\63\u012e\3\2\2\2\65\u0133\3\2\2\2\67\u013b\3\2\2"+
		"\29\u013d\3\2\2\2;\u0145\3\2\2\2=\u0147\3\2\2\2?\u0154\3\2\2\2A\u0156"+
		"\3\2\2\2C\u0158\3\2\2\2E\u015a\3\2\2\2G\u015c\3\2\2\2I\u015e\3\2\2\2K"+
		"\u0160\3\2\2\2M\u0162\3\2\2\2O\u0164\3\2\2\2Q\u0166\3\2\2\2S\u0168\3\2"+
		"\2\2U\u016a\3\2\2\2W\u016c\3\2\2\2Y\u016e\3\2\2\2[\u0170\3\2\2\2]\u0172"+
		"\3\2\2\2_\u0174\3\2\2\2a\u0176\3\2\2\2c\u017a\3\2\2\2e\u017c\3\2\2\2g"+
		"\u017e\3\2\2\2i\u0180\3\2\2\2k\u0182\3\2\2\2m\u0184\3\2\2\2o\u0186\3\2"+
		"\2\2q\u0188\3\2\2\2s\u018a\3\2\2\2u\u018c\3\2\2\2w\u018e\3\2\2\2y\u0190"+
		"\3\2\2\2{\u0192\3\2\2\2}\u0194\3\2\2\2\177\u0196\3\2\2\2\u0081\u0198\3"+
		"\2\2\2\u0083\u019a\3\2\2\2\u0085\u019c\3\2\2\2\u0087\u019e\3\2\2\2\u0089"+
		"\u01a0\3\2\2\2\u008b\u01a2\3\2\2\2\u008d\u01a4\3\2\2\2\u008f\u01a6\3\2"+
		"\2\2\u0091\u01a8\3\2\2\2\u0093\u01aa\3\2\2\2\u0095\u01ac\3\2\2\2\u0097"+
		"\u01ae\3\2\2\2\u0099\u01b0\3\2\2\2\u009b\u01b2\3\2\2\2\u009d\u01b4\3\2"+
		"\2\2\u009f\u01b6\3\2\2\2\u00a1\u01b8\3\2\2\2\u00a3\u01ba\3\2\2\2\u00a5"+
		"\u01bc\3\2\2\2\u00a7\u01be\3\2\2\2\u00a9\u01c4\3\2\2\2\u00ab\u01c6\3\2"+
		"\2\2\u00ad\u01c8\3\2\2\2\u00af\u01cb\3\2\2\2\u00b1\u01cf\3\2\2\2\u00b3"+
		"\u01d1\3\2\2\2\u00b5\u01df\3\2\2\2\u00b7\u01e1\3\2\2\2\u00b9\u01e3\3\2"+
		"\2\2\u00bb\u01e5\3\2\2\2\u00bd\u01eb\3\2\2\2\u00bf\u01f1\3\2\2\2\u00c1"+
		"\u01f3\3\2\2\2\u00c3\u01f5\3\2\2\2\u00c5\u01f7\3\2\2\2\u00c7\u01f9\3\2"+
		"\2\2\u00c9\u01fb\3\2\2\2\u00cb\u01fd\3\2\2\2\u00cd\u01ff\3\2\2\2\u00cf"+
		"\u0201\3\2\2\2\u00d1\u0206\3\2\2\2\u00d3\u0208\3\2\2\2\u00d5\u020a\3\2"+
		"\2\2\u00d7\u020c\3\2\2\2\u00d9\u020e\3\2\2\2\u00db\u0210\3\2\2\2\u00dd"+
		"\u0212\3\2\2\2\u00df\u0214\3\2\2\2\u00e1\u0218\3\2\2\2\u00e3\u021e\3\2"+
		"\2\2\u00e5\u0222\3\2\2\2\u00e7\u0224\3\2\2\2\u00e9\u022d\3\2\2\2\u00eb"+
		"\u0231\3\2\2\2\u00ed\u00ee\7%\2\2\u00ee\6\3\2\2\2\u00ef\u00f0\5\5\2\2"+
		"\u00f0\b\3\2\2\2\u00f1\u00f2\7B\2\2\u00f2\n\3\2\2\2\u00f3\u00f4\5\t\4"+
		"\2\u00f4\f\3\2\2\2\u00f5\u00f6\7$\2\2\u00f6\16\3\2\2\2\u00f7\u00f8\5\r"+
		"\6\2\u00f8\20\3\2\2\2\u00f9\u00fa\7.\2\2\u00fa\22\3\2\2\2\u00fb\u00fc"+
		"\5\21\b\2\u00fc\24\3\2\2\2\u00fd\u00fe\7`\2\2\u00fe\26\3\2\2\2\u00ff\u0100"+
		"\5\25\n\2\u0100\30\3\2\2\2\u0101\u0102\7=\2\2\u0102\32\3\2\2\2\u0103\u0104"+
		"\5\31\f\2\u0104\34\3\2\2\2\u0105\u0106\7\60\2\2\u0106\36\3\2\2\2\u0107"+
		"\u0108\5\35\16\2\u0108 \3\2\2\2\u0109\u010a\7a\2\2\u010a\"\3\2\2\2\u010b"+
		"\u010c\5!\20\2\u010c$\3\2\2\2\u010d\u010e\5\35\16\2\u010e\u010f\t\2\2"+
		"\2\u010f&\3\2\2\2\u0110\u0111\5\31\f\2\u0111\u0112\t\3\2\2\u0112(\3\2"+
		"\2\2\u0113\u0114\7\60\2\2\u0114\u0115\7?\2\2\u0115*\3\2\2\2\u0116\u0117"+
		"\7\60\2\2\u0117\u0118\7\62\2\2\u0118,\3\2\2\2\u0119\u011a\7\60\2\2\u011a"+
		"\u011b\7%\2\2\u011b\u011c\7A\2\2\u011c.\3\2\2\2\u011d\u0124\5\r\6\2\u011e"+
		"\u0125\t\4\2\2\u011f\u0125\5\u0091H\2\u0120\u0125\5\u0095J\2\u0121\u0125"+
		"\5\177?\2\u0122\u0125\5\u0093I\2\u0123\u0125\5\u008fG\2\u0124\u011e\3"+
		"\2\2\2\u0124\u011f\3\2\2\2\u0124\u0120\3\2\2\2\u0124\u0121\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125\60\3\2\2\2\u0126\u012c\5\25\n"+
		"\2\u0127\u012d\t\5\2\2\u0128\u012d\5\u0091H\2\u0129\u012d\5\u0095J\2\u012a"+
		"\u012d\5\177?\2\u012b\u012d\5\u008fG\2\u012c\u0127\3\2\2\2\u012c\u0128"+
		"\3\2\2\2\u012c\u0129\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d"+
		"\62\3\2\2\2\u012e\u0131\5!\20\2\u012f\u0132\t\6\2\2\u0130\u0132\5\u008f"+
		"G\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132\64\3\2\2\2\u0133\u0134"+
		"\5I$\2\u0134\u0135\t\7\2\2\u0135\66\3\2\2\2\u0136\u0137\5\u0091H\2\u0137"+
		"\u0138\7p\2\2\u0138\u013c\3\2\2\2\u0139\u013a\t\b\2\2\u013a\u013c\5\u0091"+
		"H\2\u013b\u0136\3\2\2\2\u013b\u0139\3\2\2\2\u013c8\3\2\2\2\u013d\u013e"+
		"\5{=\2\u013e\u013f\7f\2\2\u013f:\3\2\2\2\u0140\u0141\7c\2\2\u0141\u0142"+
		"\7i\2\2\u0142\u0146\5\u0093I\2\u0143\u0144\t\t\2\2\u0144\u0146\5\u0093"+
		"I\2\u0145\u0140\3\2\2\2\u0145\u0143\3\2\2\2\u0146<\3\2\2\2\u0147\u0148"+
		"\5\17\7\2\u0148\u0149\5\u0093I\2\u0149\u014a\7t\2\2\u014a\u014b\7x\2\2"+
		"\u014b\u014c\7u\2\2\u014c>\3\2\2\2\u014d\u014e\7c\2\2\u014e\u014f\7n\2"+
		"\2\u014f\u0155\5\u0095J\2\u0150\u0151\5\u0095J\2\u0151\u0152\7{\2\2\u0152"+
		"\u0153\7h\2\2\u0153\u0155\3\2\2\2\u0154\u014d\3\2\2\2\u0154\u0150\3\2"+
		"\2\2\u0155@\3\2\2\2\u0156\u0157\7m\2\2\u0157B\3\2\2\2\u0158\u0159\t\n"+
		"\2\2\u0159D\3\2\2\2\u015a\u015b\7\63\2\2\u015bF\3\2\2\2\u015c\u015d\5"+
		"E\"\2\u015dH\3\2\2\2\u015e\u015f\7\64\2\2\u015fJ\3\2\2\2\u0160\u0161\5"+
		"I$\2\u0161L\3\2\2\2\u0162\u0163\7\65\2\2\u0163N\3\2\2\2\u0164\u0165\7"+
		"\65\2\2\u0165P\3\2\2\2\u0166\u0167\7\66\2\2\u0167R\3\2\2\2\u0168\u0169"+
		"\5Q(\2\u0169T\3\2\2\2\u016a\u016b\78\2\2\u016bV\3\2\2\2\u016c\u016d\7"+
		"9\2\2\u016dX\3\2\2\2\u016e\u016f\7:\2\2\u016fZ\3\2\2\2\u0170\u0171\7\62"+
		"\2\2\u0171\\\3\2\2\2\u0172\u0173\5[-\2\u0173^\3\2\2\2\u0174\u0175\7\67"+
		"\2\2\u0175`\3\2\2\2\u0176\u0177\7;\2\2\u0177b\3\2\2\2\u0178\u017b\5_/"+
		"\2\u0179\u017b\5a\60\2\u017a\u0178\3\2\2\2\u017a\u0179\3\2\2\2\u017bd"+
		"\3\2\2\2\u017c\u017d\7\61\2\2\u017df\3\2\2\2\u017e\u017f\5e\62\2\u017f"+
		"h\3\2\2\2\u0180\u0181\7/\2\2\u0181j\3\2\2\2\u0182\u0183\5i\64\2\u0183"+
		"l\3\2\2\2\u0184\u0185\7>\2\2\u0185n\3\2\2\2\u0186\u0187\5m\66\2\u0187"+
		"p\3\2\2\2\u0188\u0189\7@\2\2\u0189r\3\2\2\2\u018a\u018b\5q8\2\u018bt\3"+
		"\2\2\2\u018c\u018d\7-\2\2\u018dv\3\2\2\2\u018e\u018f\5u:\2\u018fx\3\2"+
		"\2\2\u0190\u0191\7)\2\2\u0191z\3\2\2\2\u0192\u0193\7\'\2\2\u0193|\3\2"+
		"\2\2\u0194\u0195\5{=\2\u0195~\3\2\2\2\u0196\u0197\7<\2\2\u0197\u0080\3"+
		"\2\2\2\u0198\u0199\5\177?\2\u0199\u0082\3\2\2\2\u019a\u019b\7*\2\2\u019b"+
		"\u0084\3\2\2\2\u019c\u019d\7+\2\2\u019d\u0086\3\2\2\2\u019e\u019f\7]\2"+
		"\2\u019f\u0088\3\2\2\2\u01a0\u01a1\7_\2\2\u01a1\u008a\3\2\2\2\u01a2\u01a3"+
		"\7(\2\2\u01a3\u008c\3\2\2\2\u01a4\u01a5\7?\2\2\u01a5\u008e\3\2\2\2\u01a6"+
		"\u01a7\7#\2\2\u01a7\u0090\3\2\2\2\u01a8\u01a9\7,\2\2\u01a9\u0092\3\2\2"+
		"\2\u01aa\u01ab\7^\2\2\u01ab\u0094\3\2\2\2\u01ac\u01ad\7A\2\2\u01ad\u0096"+
		"\3\2\2\2\u01ae\u01af\7&\2\2\u01af\u0098\3\2\2\2\u01b0\u01b1\5\u008bE\2"+
		"\u01b1\u009a\3\2\2\2\u01b2\u01b3\5\u008dF\2\u01b3\u009c\3\2\2\2\u01b4"+
		"\u01b5\5\u0083A\2\u01b5\u009e\3\2\2\2\u01b6\u01b7\5\u008fG\2\u01b7\u00a0"+
		"\3\2\2\2\u01b8\u01b9\5\u0085B\2\u01b9\u00a2\3\2\2\2\u01ba\u01bb\5\u0091"+
		"H\2\u01bb\u00a4\3\2\2\2\u01bc\u01bd\5\u0095J\2\u01bd\u00a6\3\2\2\2\u01be"+
		"\u01bf\5\u0093I\2\u01bf\u00a8\3\2\2\2\u01c0\u01c5\5\u0087C\2\u01c1\u01c5"+
		"\5\u0089D\2\u01c2\u01c5\5\u0097K\2\u01c3\u01c5\5{=\2\u01c4\u01c0\3\2\2"+
		"\2\u01c4\u01c1\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5\u00aa"+
		"\3\2\2\2\u01c6\u01c7\7\"\2\2\u01c7\u00ac\3\2\2\2\u01c8\u01c9\5\u00abU"+
		"\2\u01c9\u00ae\3\2\2\2\u01ca\u01cc\t\13\2\2\u01cb\u01ca\3\2\2\2\u01cc"+
		"\u01cd\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u00b0\3\2"+
		"\2\2\u01cf\u01d0\5\u00afW\2\u01d0\u00b2\3\2\2\2\u01d1\u01d2\7\61\2\2\u01d2"+
		"\u01d3\7\61\2\2\u01d3\u01d7\3\2\2\2\u01d4\u01d6\13\2\2\2\u01d5\u01d4\3"+
		"\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8"+
		"\u01da\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01db\7\61\2\2\u01db\u01dc\7"+
		"\61\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\bY\2\2\u01de\u00b4\3\2\2\2\u01df"+
		"\u01e0\7c\2\2\u01e0\u00b6\3\2\2\2\u01e1\u01e2\7d\2\2\u01e2\u00b8\3\2\2"+
		"\2\u01e3\u01e4\t\f\2\2\u01e4\u00ba\3\2\2\2\u01e5\u01e6\5!\20\2\u01e6\u01e7"+
		"\5{=\2\u01e7\u01e8\5\u00abU\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\b]\3\2\u01ea"+
		"\u00bc\3\2\2\2\u01eb\u01ec\5!\20\2\u01ec\u01ed\5\177?\2\u01ed\u01ee\5"+
		"\u00abU\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\b^\4\2\u01f0\u00be\3\2\2\2\u01f1"+
		"\u01f2\5[-\2\u01f2\u00c0\3\2\2\2\u01f3\u01f4\5E\"\2\u01f4\u00c2\3\2\2"+
		"\2\u01f5\u01f6\5I$\2\u01f6\u00c4\3\2\2\2\u01f7\u01f8\5M&\2\u01f8\u00c6"+
		"\3\2\2\2\u01f9\u01fa\5Q(\2\u01fa\u00c8\3\2\2\2\u01fb\u01fc\5_/\2\u01fc"+
		"\u00ca\3\2\2\2\u01fd\u01fe\5\r\6\2\u01fe\u00cc\3\2\2\2\u01ff\u0200\5\35"+
		"\16\2\u0200\u00ce\3\2\2\2\u0201\u0202\5\u00abU\2\u0202\u0203\5\35\16\2"+
		"\u0203\u0204\5A \2\u0204\u0205\5\u00abU\2\u0205\u00d0\3\2\2\2\u0206\u0207"+
		"\5\u008bE\2\u0207\u00d2\3\2\2\2\u0208\u0209\5i\64\2\u0209\u00d4\3\2\2"+
		"\2\u020a\u020b\5\u00afW\2\u020b\u00d6\3\2\2\2\u020c\u020d\5u:\2\u020d"+
		"\u00d8\3\2\2\2\u020e\u020f\5\u00abU\2\u020f\u00da\3\2\2\2\u0210\u0211"+
		"\5\25\n\2\u0211\u00dc\3\2\2\2\u0212\u0213\5\31\f\2\u0213\u00de\3\2\2\2"+
		"\u0214\u0215\5\u008fG\2\u0215\u00e0\3\2\2\2\u0216\u0219\5\35\16\2\u0217"+
		"\u0219\5\t\4\2\u0218\u0216\3\2\2\2\u0218\u0217\3\2\2\2\u0218\u0219\3\2"+
		"\2\2\u0219\u021a\3\2\2\2\u021a\u021b\5\u0083A\2\u021b\u00e2\3\2\2\2\u021c"+
		"\u021f\5\35\16\2\u021d\u021f\5\t\4\2\u021e\u021c\3\2\2\2\u021e\u021d\3"+
		"\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\5\u0085B\2"+
		"\u0221\u00e4\3\2\2\2\u0222\u0223\5\u0093I\2\u0223\u00e6\3\2\2\2\u0224"+
		"\u0228\t\r\2\2\u0225\u0227\t\r\2\2\u0226\u0225\3\2\2\2\u0227\u022a\3\2"+
		"\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\3\2\2\2\u022a"+
		"\u0228\3\2\2\2\u022b\u022c\bs\5\2\u022c\u00e8\3\2\2\2\u022d\u022e\5\u00ab"+
		"U\2\u022e\u022f\3\2\2\2\u022f\u0230\bt\4\2\u0230\u00ea\3\2\2\2\u0231\u0232"+
		"\7\\\2\2\u0232\u00ec\3\2\2\2\22\2\3\4\u0124\u012c\u0131\u013b\u0145\u0154"+
		"\u017a\u01c4\u01cd\u01d7\u0218\u021e\u0228\6\2\4\2\7\3\2\6\2\2\3s\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}