// Generated from simpleParser.g4 by ANTLR 4.7.1
 package org.dotlessbraille.antlr; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleParser extends Parser {
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
		LC_ID=86, ANOTHER_SPACE=87, CAP_ZED=88, LATIN_LETTER=89, FUN_NAME=90;
	public static final int
		RULE_text = 0, RULE_line = 1, RULE_capsWordInd = 2, RULE_capsPassageInd = 3, 
		RULE_rootlessToken = 4, RULE_nemethStartDisplay = 5, RULE_nemethEndDisplay = 6, 
		RULE_nemethStartInline = 7, RULE_nemethEndInline = 8, RULE_item = 9, RULE_symseq = 10, 
		RULE_space = 11, RULE_hyphen = 12, RULE_dash = 13, RULE_long_dash = 14, 
		RULE_separator = 15, RULE_trailingSep = 16, RULE_roots = 17, RULE_letters = 18, 
		RULE_saLetters = 19, RULE_ucLetters = 20, RULE_prefix = 21, RULE_largeWords = 22, 
		RULE_strong_ws = 23, RULE_shortForms = 24, RULE_initLetCons = 25, RULE_finalLetCons = 26, 
		RULE_strong_gs = 27, RULE_standingAlone = 28, RULE_pr_token = 29, RULE_updigs = 30, 
		RULE_numspacedig = 31, RULE_numind = 32, RULE_numfrag = 33, RULE_nemInteger = 34, 
		RULE_nemReal = 35, RULE_nemOp = 36, RULE_nemComp = 37, RULE_nemId = 38, 
		RULE_nemOGroup = 39, RULE_nemCGroup = 40, RULE_nemSyms = 41, RULE_d4_hash = 42, 
		RULE_d45_hash = 43, RULE_d456_hash = 44, RULE_d5_hash = 45, RULE_d46_hash = 46, 
		RULE_tfPrefix = 47, RULE_tfStartRoot = 48, RULE_tfTermRoot = 49, RULE_tfStartIndicator = 50, 
		RULE_tfTermIndicator = 51, RULE_tfSymbolInd = 52, RULE_tfWordInd = 53, 
		RULE_subsup = 54, RULE_encl1 = 55, RULE_encl2 = 56, RULE_encl3 = 57, RULE_scrip = 58, 
		RULE_preAlone = 59, RULE_postAlone = 60;
	public static final String[] ruleNames = {
		"text", "line", "capsWordInd", "capsPassageInd", "rootlessToken", "nemethStartDisplay", 
		"nemethEndDisplay", "nemethStartInline", "nemethEndInline", "item", "symseq", 
		"space", "hyphen", "dash", "long_dash", "separator", "trailingSep", "roots", 
		"letters", "saLetters", "ucLetters", "prefix", "largeWords", "strong_ws", 
		"shortForms", "initLetCons", "finalLetCons", "strong_gs", "standingAlone", 
		"pr_token", "updigs", "numspacedig", "numind", "numfrag", "nemInteger", 
		"nemReal", "nemOp", "nemComp", "nemId", "nemOGroup", "nemCGroup", "nemSyms", 
		"d4_hash", "d45_hash", "d456_hash", "d5_hash", "d46_hash", "tfPrefix", 
		"tfStartRoot", "tfTermRoot", "tfStartIndicator", "tfTermIndicator", "tfSymbolInd", 
		"tfWordInd", "subsup", "encl1", "encl2", "encl3", "scrip", "preAlone", 
		"postAlone"
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
		"LC_ID", "ANOTHER_SPACE", "CAP_ZED", "LATIN_LETTER", "FUN_NAME"
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
	public String getGrammarFileName() { return "simpleParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	 boolean line_cont = false; 
	public simpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TextContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				line();
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOTS3456) | (1L << DOT4) | (1L << DOT5) | (1L << DOT6) | (1L << DOTS45) | (1L << DOTS56) | (1L << DOTS46) | (1L << DOTS456) | (1L << FLC46) | (1L << FLC56) | (1L << ILC5) | (1L << ILC45) | (1L << ILC456) | (1L << BESF) | (1L << CHSF) | (1L << SHSF) | (1L << STSF) | (1L << OURSELVES) | (1L << THSF) | (1L << ERSF) | (1L << ONESELF) | (1L << THMSLVS) | (1L << CONCV) | (1L << LETTERK) | (1L << MOST_LETTERS) | (1L << DOT2) | (1L << DOTS23) | (1L << DOTS25) | (1L << DOTS256) | (1L << DOTS235) | (1L << DOTS2356) | (1L << DOTS236) | (1L << DOTS356) | (1L << DOTS26) | (1L << DOTS35) | (1L << DOTS34) | (1L << DOTS36) | (1L << DOTS126) | (1L << DOTS345) | (1L << DOTS346) | (1L << DOT3) | (1L << DOTS146) | (1L << DOTS156) | (1L << AND) | (1L << FOR) | (1L << OF) | (1L << THE) | (1L << WITH) | (1L << DOTS16) | (1L << DOTS1456) | (1L << DOTS1256) | (1L << DOTS12456) | (1L << DOTS246) | (1L << DOTS1246) | (1L << SPACE) | (1L << NEWLINE) | (1L << LETTERA) | (1L << LETTERB) | (1L << UPDIGS))) != 0) || _la==START_DIS || _la==END_DIS );
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

	public static class LineContext extends ParserRuleContext {
		public TerminalNode NEM_NEWLINE() { return getToken(simpleParser.NEM_NEWLINE, 0); }
		public TerminalNode NEWLINE() { return getToken(simpleParser.NEWLINE, 0); }
		public NemethStartDisplayContext nemethStartDisplay() {
			return getRuleContext(NemethStartDisplayContext.class,0);
		}
		public NemethEndDisplayContext nemethEndDisplay() {
			return getRuleContext(NemethEndDisplayContext.class,0);
		}
		public NemethStartInlineContext nemethStartInline() {
			return getRuleContext(NemethStartInlineContext.class,0);
		}
		public NemethEndInlineContext nemethEndInline() {
			return getRuleContext(NemethEndInlineContext.class,0);
		}
		public List<NemSymsContext> nemSyms() {
			return getRuleContexts(NemSymsContext.class);
		}
		public NemSymsContext nemSyms(int i) {
			return getRuleContext(NemSymsContext.class,i);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public List<TrailingSepContext> trailingSep() {
			return getRuleContexts(TrailingSepContext.class);
		}
		public TrailingSepContext trailingSep(int i) {
			return getRuleContext(TrailingSepContext.class,i);
		}
		public List<StandingAloneContext> standingAlone() {
			return getRuleContexts(StandingAloneContext.class);
		}
		public StandingAloneContext standingAlone(int i) {
			return getRuleContext(StandingAloneContext.class,i);
		}
		public SymseqContext symseq() {
			return getRuleContext(SymseqContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public List<NumfragContext> numfrag() {
			return getRuleContexts(NumfragContext.class);
		}
		public NumfragContext numfrag(int i) {
			return getRuleContext(NumfragContext.class,i);
		}
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			int _alt;
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case START_DIS:
					{
					setState(127);
					nemethStartDisplay();
					}
					break;
				case END_DIS:
					{
					setState(128);
					nemethEndDisplay();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(131);
				_la = _input.LA(1);
				if ( !(_la==NEWLINE || _la==NEM_NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case START_DIS:
					{
					setState(133);
					nemethStartInline();
					}
					break;
				case END_DIS:
					{
					setState(134);
					nemethEndInline();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				{
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(137);
					nemSyms();
					}
					}
					setState(140); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEM0 - 66)) | (1L << (NEM1 - 66)) | (1L << (NEM2 - 66)) | (1L << (NEM3 - 66)) | (1L << (NEM4 - 66)) | (1L << (NEM5 - 66)) | (1L << (NEM_DECPT - 66)) | (1L << (NEM_EQUALS - 66)) | (1L << (NEM_FACTORIAL - 66)) | (1L << (NEM_MINUS - 66)) | (1L << (NEM_PLUS - 66)) | (1L << (NEM_SPACE - 66)) | (1L << (NEM_OFENCE - 66)) | (1L << (NEM_CFENCE - 66)) | (1L << (NEM_VBAR - 66)) | (1L << (LC_ID - 66)) | (1L << (LATIN_LETTER - 66)))) != 0) );
				}
				setState(142);
				_la = _input.LA(1);
				if ( !(_la==NEWLINE || _la==NEM_NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(144);
					space();
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					{
					setState(150);
					standingAlone();
					}
					}
					break;
				case 2:
					{
					{
					setState(151);
					symseq();
					}
					}
					break;
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(155); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(154);
								separator();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(157); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(174);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
						case 1:
							{
							{
							setState(159);
							standingAlone();
							}
							}
							break;
						case 2:
							{
							{
							setState(170); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									setState(170);
									_errHandler.sync(this);
									switch (_input.LA(1)) {
									case DOTS3456:
										{
										setState(161); 
										_errHandler.sync(this);
										_alt = 1;
										do {
											switch (_alt) {
											case 1:
												{
												{
												setState(160);
												numfrag();
												}
												}
												break;
											default:
												throw new NoViableAltException(this);
											}
											setState(163); 
											_errHandler.sync(this);
											_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
										} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
										}
										break;
									case DOT4:
									case DOT5:
									case DOT6:
									case DOTS45:
									case DOTS56:
									case DOTS46:
									case DOTS456:
									case FLC46:
									case FLC56:
									case ILC5:
									case ILC45:
									case ILC456:
									case LETTERK:
									case MOST_LETTERS:
									case DOT2:
									case DOTS23:
									case DOTS25:
									case DOTS256:
									case DOTS235:
									case DOTS2356:
									case DOTS236:
									case DOTS356:
									case DOTS26:
									case DOTS35:
									case DOTS34:
									case DOTS36:
									case DOTS126:
									case DOTS345:
									case DOTS346:
									case DOT3:
									case DOTS146:
									case DOTS156:
									case AND:
									case FOR:
									case OF:
									case THE:
									case WITH:
									case DOTS16:
									case DOTS1456:
									case DOTS1256:
									case DOTS12456:
									case DOTS246:
									case DOTS1246:
									case LETTERA:
									case LETTERB:
									case UPDIGS:
										{
										setState(166); 
										_errHandler.sync(this);
										_alt = 1;
										do {
											switch (_alt) {
											case 1:
												{
												{
												setState(165);
												item();
												}
												}
												break;
											default:
												throw new NoViableAltException(this);
											}
											setState(168); 
											_errHandler.sync(this);
											_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
										} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
										}
										break;
									default:
										throw new NoViableAltException(this);
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(172); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							}
							}
							break;
						}
						}
						} 
					}
					setState(180);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT5) | (1L << DOT6) | (1L << DOTS36) | (1L << SPACE))) != 0)) {
					{
					{
					setState(181);
					trailingSep();
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(187);
				match(NEWLINE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(189);
					space();
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
				match(NEWLINE);
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

	public static class CapsWordIndContext extends ParserRuleContext {
		public List<TerminalNode> DOT6() { return getTokens(simpleParser.DOT6); }
		public TerminalNode DOT6(int i) {
			return getToken(simpleParser.DOT6, i);
		}
		public CapsWordIndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capsWordInd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterCapsWordInd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitCapsWordInd(this);
		}
	}

	public final CapsWordIndContext capsWordInd() throws RecognitionException {
		CapsWordIndContext _localctx = new CapsWordIndContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_capsWordInd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(198);
			match(DOT6);
			}
			{
			setState(199);
			match(DOT6);
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

	public static class CapsPassageIndContext extends ParserRuleContext {
		public List<TerminalNode> DOT6() { return getTokens(simpleParser.DOT6); }
		public TerminalNode DOT6(int i) {
			return getToken(simpleParser.DOT6, i);
		}
		public CapsPassageIndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capsPassageInd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterCapsPassageInd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitCapsPassageInd(this);
		}
	}

	public final CapsPassageIndContext capsPassageInd() throws RecognitionException {
		CapsPassageIndContext _localctx = new CapsPassageIndContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_capsPassageInd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(201);
			match(DOT6);
			}
			{
			setState(202);
			match(DOT6);
			}
			{
			setState(203);
			match(DOT6);
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

	public static class RootlessTokenContext extends ParserRuleContext {
		public TerminalNode DOTS56() { return getToken(simpleParser.DOTS56, 0); }
		public RootlessTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rootlessToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterRootlessToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitRootlessToken(this);
		}
	}

	public final RootlessTokenContext rootlessToken() throws RecognitionException {
		RootlessTokenContext _localctx = new RootlessTokenContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rootlessToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(DOTS56);
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

	public static class NemethStartDisplayContext extends ParserRuleContext {
		public TerminalNode START_DIS() { return getToken(simpleParser.START_DIS, 0); }
		public NemethStartDisplayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemethStartDisplay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterNemethStartDisplay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitNemethStartDisplay(this);
		}
	}

	public final NemethStartDisplayContext nemethStartDisplay() throws RecognitionException {
		NemethStartDisplayContext _localctx = new NemethStartDisplayContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nemethStartDisplay);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(START_DIS);
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

	public static class NemethEndDisplayContext extends ParserRuleContext {
		public TerminalNode END_DIS() { return getToken(simpleParser.END_DIS, 0); }
		public NemethEndDisplayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemethEndDisplay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterNemethEndDisplay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitNemethEndDisplay(this);
		}
	}

	public final NemethEndDisplayContext nemethEndDisplay() throws RecognitionException {
		NemethEndDisplayContext _localctx = new NemethEndDisplayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nemethEndDisplay);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(END_DIS);
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

	public static class NemethStartInlineContext extends ParserRuleContext {
		public TerminalNode START_DIS() { return getToken(simpleParser.START_DIS, 0); }
		public NemethStartInlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemethStartInline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterNemethStartInline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitNemethStartInline(this);
		}
	}

	public final NemethStartInlineContext nemethStartInline() throws RecognitionException {
		NemethStartInlineContext _localctx = new NemethStartInlineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nemethStartInline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(START_DIS);
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

	public static class NemethEndInlineContext extends ParserRuleContext {
		public TerminalNode END_DIS() { return getToken(simpleParser.END_DIS, 0); }
		public NemethEndInlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemethEndInline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterNemethEndInline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitNemethEndInline(this);
		}
	}

	public final NemethEndInlineContext nemethEndInline() throws RecognitionException {
		NemethEndInlineContext _localctx = new NemethEndInlineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nemethEndInline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(END_DIS);
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

	public static class ItemContext extends ParserRuleContext {
		public CapsPassageIndContext capsPassageInd() {
			return getRuleContext(CapsPassageIndContext.class,0);
		}
		public CapsWordIndContext capsWordInd() {
			return getRuleContext(CapsWordIndContext.class,0);
		}
		public RootlessTokenContext rootlessToken() {
			return getRuleContext(RootlessTokenContext.class,0);
		}
		public Pr_tokenContext pr_token() {
			return getRuleContext(Pr_tokenContext.class,0);
		}
		public ScripContext scrip() {
			return getRuleContext(ScripContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitItem(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(215);
				capsPassageInd();
				}
				break;
			case 2:
				{
				setState(216);
				capsWordInd();
				}
				break;
			case 3:
				{
				setState(217);
				rootlessToken();
				}
				break;
			case 4:
				{
				setState(218);
				pr_token();
				}
				break;
			case 5:
				{
				setState(219);
				scrip();
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

	public static class SymseqContext extends ParserRuleContext {
		public List<NumfragContext> numfrag() {
			return getRuleContexts(NumfragContext.class);
		}
		public NumfragContext numfrag(int i) {
			return getRuleContext(NumfragContext.class,i);
		}
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public SymseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterSymseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitSymseq(this);
		}
	}

	public final SymseqContext symseq() throws RecognitionException {
		SymseqContext _localctx = new SymseqContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_symseq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(224);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOTS3456:
						{
						setState(222);
						numfrag();
						}
						break;
					case DOT4:
					case DOT5:
					case DOT6:
					case DOTS45:
					case DOTS56:
					case DOTS46:
					case DOTS456:
					case FLC46:
					case FLC56:
					case ILC5:
					case ILC45:
					case ILC456:
					case LETTERK:
					case MOST_LETTERS:
					case DOT2:
					case DOTS23:
					case DOTS25:
					case DOTS256:
					case DOTS235:
					case DOTS2356:
					case DOTS236:
					case DOTS356:
					case DOTS26:
					case DOTS35:
					case DOTS34:
					case DOTS36:
					case DOTS126:
					case DOTS345:
					case DOTS346:
					case DOT3:
					case DOTS146:
					case DOTS156:
					case AND:
					case FOR:
					case OF:
					case THE:
					case WITH:
					case DOTS16:
					case DOTS1456:
					case DOTS1256:
					case DOTS12456:
					case DOTS246:
					case DOTS1246:
					case LETTERA:
					case LETTERB:
					case UPDIGS:
						{
						setState(223);
						item();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(226); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class SpaceContext extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(simpleParser.SPACE, 0); }
		public SpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitSpace(this);
		}
	}

	public final SpaceContext space() throws RecognitionException {
		SpaceContext _localctx = new SpaceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(SPACE);
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

	public static class HyphenContext extends ParserRuleContext {
		public TerminalNode DOTS36() { return getToken(simpleParser.DOTS36, 0); }
		public HyphenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hyphen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterHyphen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitHyphen(this);
		}
	}

	public final HyphenContext hyphen() throws RecognitionException {
		HyphenContext _localctx = new HyphenContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_hyphen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(DOTS36);
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

	public static class DashContext extends ParserRuleContext {
		public TerminalNode DOT6() { return getToken(simpleParser.DOT6, 0); }
		public TerminalNode DOTS36() { return getToken(simpleParser.DOTS36, 0); }
		public DashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterDash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitDash(this);
		}
	}

	public final DashContext dash() throws RecognitionException {
		DashContext _localctx = new DashContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(DOT6);
			setState(233);
			match(DOTS36);
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

	public static class Long_dashContext extends ParserRuleContext {
		public TerminalNode DOT5() { return getToken(simpleParser.DOT5, 0); }
		public TerminalNode DOT6() { return getToken(simpleParser.DOT6, 0); }
		public TerminalNode DOTS36() { return getToken(simpleParser.DOTS36, 0); }
		public Long_dashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_long_dash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterLong_dash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitLong_dash(this);
		}
	}

	public final Long_dashContext long_dash() throws RecognitionException {
		Long_dashContext _localctx = new Long_dashContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_long_dash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(DOT5);
			setState(236);
			match(DOT6);
			setState(237);
			match(DOTS36);
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

	public static class SeparatorContext extends ParserRuleContext {
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public HyphenContext hyphen() {
			return getRuleContext(HyphenContext.class,0);
		}
		public DashContext dash() {
			return getRuleContext(DashContext.class,0);
		}
		public Long_dashContext long_dash() {
			return getRuleContext(Long_dashContext.class,0);
		}
		public SeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitSeparator(this);
		}
	}

	public final SeparatorContext separator() throws RecognitionException {
		SeparatorContext _localctx = new SeparatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_separator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPACE:
				{
				setState(239);
				space();
				}
				break;
			case DOTS36:
				{
				setState(240);
				hyphen();
				}
				break;
			case DOT6:
				{
				setState(241);
				dash();
				}
				break;
			case DOT5:
				{
				setState(242);
				long_dash();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TrailingSepContext extends ParserRuleContext {
		public SeparatorContext separator() {
			return getRuleContext(SeparatorContext.class,0);
		}
		public TrailingSepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingSep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterTrailingSep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitTrailingSep(this);
		}
	}

	public final TrailingSepContext trailingSep() throws RecognitionException {
		TrailingSepContext _localctx = new TrailingSepContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_trailingSep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			separator();
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

	public static class RootsContext extends ParserRuleContext {
		public TerminalNode DOTS356() { return getToken(simpleParser.DOTS356, 0); }
		public TerminalNode DOTS36() { return getToken(simpleParser.DOTS36, 0); }
		public TerminalNode DOTS26() { return getToken(simpleParser.DOTS26, 0); }
		public TerminalNode DOTS35() { return getToken(simpleParser.DOTS35, 0); }
		public TerminalNode DOT2() { return getToken(simpleParser.DOT2, 0); }
		public TerminalNode DOTS23() { return getToken(simpleParser.DOTS23, 0); }
		public TerminalNode DOTS25() { return getToken(simpleParser.DOTS25, 0); }
		public TerminalNode DOTS256() { return getToken(simpleParser.DOTS256, 0); }
		public TerminalNode DOTS235() { return getToken(simpleParser.DOTS235, 0); }
		public TerminalNode DOTS236() { return getToken(simpleParser.DOTS236, 0); }
		public TerminalNode DOTS2356() { return getToken(simpleParser.DOTS2356, 0); }
		public TerminalNode DOTS34() { return getToken(simpleParser.DOTS34, 0); }
		public TerminalNode DOTS126() { return getToken(simpleParser.DOTS126, 0); }
		public TerminalNode DOTS345() { return getToken(simpleParser.DOTS345, 0); }
		public TerminalNode DOTS346() { return getToken(simpleParser.DOTS346, 0); }
		public TerminalNode DOT3() { return getToken(simpleParser.DOT3, 0); }
		public TerminalNode DOTS12456() { return getToken(simpleParser.DOTS12456, 0); }
		public TerminalNode DOTS246() { return getToken(simpleParser.DOTS246, 0); }
		public TerminalNode DOTS1246() { return getToken(simpleParser.DOTS1246, 0); }
		public LargeWordsContext largeWords() {
			return getRuleContext(LargeWordsContext.class,0);
		}
		public TerminalNode DOTS16() { return getToken(simpleParser.DOTS16, 0); }
		public TerminalNode DOTS1456() { return getToken(simpleParser.DOTS1456, 0); }
		public TerminalNode DOTS1256() { return getToken(simpleParser.DOTS1256, 0); }
		public TerminalNode DOTS146() { return getToken(simpleParser.DOTS146, 0); }
		public TerminalNode DOTS156() { return getToken(simpleParser.DOTS156, 0); }
		public RootsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roots; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterRoots(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitRoots(this);
		}
	}

	public final RootsContext roots() throws RecognitionException {
		RootsContext _localctx = new RootsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_roots);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOTS356:
				{
				setState(247);
				match(DOTS356);
				}
				break;
			case DOTS36:
				{
				setState(248);
				match(DOTS36);
				}
				break;
			case DOTS26:
				{
				setState(249);
				match(DOTS26);
				}
				break;
			case DOTS35:
				{
				setState(250);
				match(DOTS35);
				}
				break;
			case DOT2:
				{
				setState(251);
				match(DOT2);
				}
				break;
			case DOTS23:
				{
				setState(252);
				match(DOTS23);
				}
				break;
			case DOTS25:
				{
				setState(253);
				match(DOTS25);
				}
				break;
			case DOTS256:
				{
				setState(254);
				match(DOTS256);
				}
				break;
			case DOTS235:
				{
				setState(255);
				match(DOTS235);
				}
				break;
			case DOTS236:
				{
				setState(256);
				match(DOTS236);
				}
				break;
			case DOTS2356:
				{
				setState(257);
				match(DOTS2356);
				}
				break;
			case DOTS34:
				{
				setState(258);
				match(DOTS34);
				}
				break;
			case DOTS126:
				{
				setState(259);
				match(DOTS126);
				}
				break;
			case DOTS345:
				{
				setState(260);
				match(DOTS345);
				}
				break;
			case DOTS346:
				{
				setState(261);
				match(DOTS346);
				}
				break;
			case DOT3:
				{
				setState(262);
				match(DOT3);
				}
				break;
			case DOTS12456:
				{
				setState(263);
				match(DOTS12456);
				}
				break;
			case DOTS246:
				{
				setState(264);
				match(DOTS246);
				}
				break;
			case DOTS1246:
				{
				setState(265);
				match(DOTS1246);
				}
				break;
			case AND:
			case FOR:
			case OF:
			case THE:
			case WITH:
				{
				setState(266);
				largeWords();
				}
				break;
			case DOTS16:
				{
				setState(267);
				match(DOTS16);
				}
				break;
			case DOTS1456:
				{
				setState(268);
				match(DOTS1456);
				}
				break;
			case DOTS1256:
				{
				setState(269);
				match(DOTS1256);
				}
				break;
			case DOTS146:
				{
				setState(270);
				match(DOTS146);
				}
				break;
			case DOTS156:
				{
				setState(271);
				match(DOTS156);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LettersContext extends ParserRuleContext {
		public UpdigsContext updigs() {
			return getRuleContext(UpdigsContext.class,0);
		}
		public TerminalNode MOST_LETTERS() { return getToken(simpleParser.MOST_LETTERS, 0); }
		public TerminalNode LETTERK() { return getToken(simpleParser.LETTERK, 0); }
		public LettersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterLetters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitLetters(this);
		}
	}

	public final LettersContext letters() throws RecognitionException {
		LettersContext _localctx = new LettersContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_letters);
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTERA:
			case LETTERB:
			case UPDIGS:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				updigs();
				}
				break;
			case MOST_LETTERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(MOST_LETTERS);
				}
				break;
			case LETTERK:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				match(LETTERK);
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

	public static class SaLettersContext extends ParserRuleContext {
		public List<LettersContext> letters() {
			return getRuleContexts(LettersContext.class);
		}
		public LettersContext letters(int i) {
			return getRuleContext(LettersContext.class,i);
		}
		public SaLettersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saLetters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterSaLetters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitSaLetters(this);
		}
	}

	public final SaLettersContext saLetters() throws RecognitionException {
		SaLettersContext _localctx = new SaLettersContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_saLetters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(279);
			letters();
			}
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTERK) | (1L << MOST_LETTERS) | (1L << LETTERA) | (1L << LETTERB) | (1L << UPDIGS))) != 0)) {
				{
				{
				setState(280);
				letters();
				}
				}
				setState(285);
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

	public static class UcLettersContext extends ParserRuleContext {
		public TerminalNode DOT6() { return getToken(simpleParser.DOT6, 0); }
		public LettersContext letters() {
			return getRuleContext(LettersContext.class,0);
		}
		public UcLettersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ucLetters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterUcLetters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitUcLetters(this);
		}
	}

	public final UcLettersContext ucLetters() throws RecognitionException {
		UcLettersContext _localctx = new UcLettersContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ucLetters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(DOT6);
			{
			setState(287);
			letters();
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

	public static class PrefixContext extends ParserRuleContext {
		public TerminalNode DOT4() { return getToken(simpleParser.DOT4, 0); }
		public TerminalNode DOT5() { return getToken(simpleParser.DOT5, 0); }
		public TerminalNode DOT6() { return getToken(simpleParser.DOT6, 0); }
		public TerminalNode DOTS45() { return getToken(simpleParser.DOTS45, 0); }
		public TerminalNode DOTS56() { return getToken(simpleParser.DOTS56, 0); }
		public TerminalNode DOTS46() { return getToken(simpleParser.DOTS46, 0); }
		public TerminalNode DOTS456() { return getToken(simpleParser.DOTS456, 0); }
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitPrefix(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_prefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT4) | (1L << DOT5) | (1L << DOT6) | (1L << DOTS45) | (1L << DOTS56) | (1L << DOTS46) | (1L << DOTS456))) != 0)) ) {
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

	public static class LargeWordsContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(simpleParser.AND, 0); }
		public TerminalNode FOR() { return getToken(simpleParser.FOR, 0); }
		public TerminalNode OF() { return getToken(simpleParser.OF, 0); }
		public TerminalNode THE() { return getToken(simpleParser.THE, 0); }
		public TerminalNode WITH() { return getToken(simpleParser.WITH, 0); }
		public LargeWordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_largeWords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterLargeWords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitLargeWords(this);
		}
	}

	public final LargeWordsContext largeWords() throws RecognitionException {
		LargeWordsContext _localctx = new LargeWordsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_largeWords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << FOR) | (1L << OF) | (1L << THE) | (1L << WITH))) != 0)) ) {
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

	public static class Strong_wsContext extends ParserRuleContext {
		public TerminalNode DOTS16() { return getToken(simpleParser.DOTS16, 0); }
		public TerminalNode DOTS146() { return getToken(simpleParser.DOTS146, 0); }
		public TerminalNode DOTS1456() { return getToken(simpleParser.DOTS1456, 0); }
		public TerminalNode DOTS156() { return getToken(simpleParser.DOTS156, 0); }
		public TerminalNode DOTS1256() { return getToken(simpleParser.DOTS1256, 0); }
		public TerminalNode DOTS34() { return getToken(simpleParser.DOTS34, 0); }
		public Strong_wsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strong_ws; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterStrong_ws(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitStrong_ws(this);
		}
	}

	public final Strong_wsContext strong_ws() throws RecognitionException {
		Strong_wsContext _localctx = new Strong_wsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_strong_ws);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOTS34) | (1L << DOTS146) | (1L << DOTS156) | (1L << DOTS16) | (1L << DOTS1456) | (1L << DOTS1256))) != 0)) ) {
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

	public static class ShortFormsContext extends ParserRuleContext {
		public TerminalNode BESF() { return getToken(simpleParser.BESF, 0); }
		public TerminalNode CHSF() { return getToken(simpleParser.CHSF, 0); }
		public TerminalNode SHSF() { return getToken(simpleParser.SHSF, 0); }
		public TerminalNode STSF() { return getToken(simpleParser.STSF, 0); }
		public TerminalNode OURSELVES() { return getToken(simpleParser.OURSELVES, 0); }
		public TerminalNode THSF() { return getToken(simpleParser.THSF, 0); }
		public TerminalNode ERSF() { return getToken(simpleParser.ERSF, 0); }
		public TerminalNode ONESELF() { return getToken(simpleParser.ONESELF, 0); }
		public TerminalNode THMSLVS() { return getToken(simpleParser.THMSLVS, 0); }
		public TerminalNode CONCV() { return getToken(simpleParser.CONCV, 0); }
		public ShortFormsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortForms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterShortForms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitShortForms(this);
		}
	}

	public final ShortFormsContext shortForms() throws RecognitionException {
		ShortFormsContext _localctx = new ShortFormsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_shortForms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BESF) | (1L << CHSF) | (1L << SHSF) | (1L << STSF) | (1L << OURSELVES) | (1L << THSF) | (1L << ERSF) | (1L << ONESELF) | (1L << THMSLVS) | (1L << CONCV))) != 0)) ) {
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

	public static class InitLetConsContext extends ParserRuleContext {
		public TerminalNode ILC5() { return getToken(simpleParser.ILC5, 0); }
		public TerminalNode ILC45() { return getToken(simpleParser.ILC45, 0); }
		public TerminalNode ILC456() { return getToken(simpleParser.ILC456, 0); }
		public InitLetConsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initLetCons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterInitLetCons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitInitLetCons(this);
		}
	}

	public final InitLetConsContext initLetCons() throws RecognitionException {
		InitLetConsContext _localctx = new InitLetConsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_initLetCons);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ILC5) | (1L << ILC45) | (1L << ILC456))) != 0)) ) {
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

	public static class FinalLetConsContext extends ParserRuleContext {
		public TerminalNode FLC46() { return getToken(simpleParser.FLC46, 0); }
		public TerminalNode FLC56() { return getToken(simpleParser.FLC56, 0); }
		public FinalLetConsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalLetCons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterFinalLetCons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitFinalLetCons(this);
		}
	}

	public final FinalLetConsContext finalLetCons() throws RecognitionException {
		FinalLetConsContext _localctx = new FinalLetConsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_finalLetCons);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_la = _input.LA(1);
			if ( !(_la==FLC46 || _la==FLC56) ) {
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

	public static class Strong_gsContext extends ParserRuleContext {
		public TerminalNode DOTS16() { return getToken(simpleParser.DOTS16, 0); }
		public TerminalNode DOTS126() { return getToken(simpleParser.DOTS126, 0); }
		public TerminalNode DOTS146() { return getToken(simpleParser.DOTS146, 0); }
		public TerminalNode DOTS1456() { return getToken(simpleParser.DOTS1456, 0); }
		public TerminalNode DOTS156() { return getToken(simpleParser.DOTS156, 0); }
		public TerminalNode DOTS1246() { return getToken(simpleParser.DOTS1246, 0); }
		public TerminalNode DOTS12456() { return getToken(simpleParser.DOTS12456, 0); }
		public TerminalNode DOTS1256() { return getToken(simpleParser.DOTS1256, 0); }
		public TerminalNode DOTS246() { return getToken(simpleParser.DOTS246, 0); }
		public TerminalNode DOTS34() { return getToken(simpleParser.DOTS34, 0); }
		public TerminalNode DOTS346() { return getToken(simpleParser.DOTS346, 0); }
		public TerminalNode DOTS345() { return getToken(simpleParser.DOTS345, 0); }
		public Strong_gsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strong_gs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterStrong_gs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitStrong_gs(this);
		}
	}

	public final Strong_gsContext strong_gs() throws RecognitionException {
		Strong_gsContext _localctx = new Strong_gsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_strong_gs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOTS34) | (1L << DOTS126) | (1L << DOTS345) | (1L << DOTS346) | (1L << DOTS146) | (1L << DOTS156) | (1L << DOTS16) | (1L << DOTS1456) | (1L << DOTS1256) | (1L << DOTS12456) | (1L << DOTS246) | (1L << DOTS1246))) != 0)) ) {
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

	public static class StandingAloneContext extends ParserRuleContext {
		public List<PreAloneContext> preAlone() {
			return getRuleContexts(PreAloneContext.class);
		}
		public PreAloneContext preAlone(int i) {
			return getRuleContext(PreAloneContext.class,i);
		}
		public List<PostAloneContext> postAlone() {
			return getRuleContexts(PostAloneContext.class);
		}
		public PostAloneContext postAlone(int i) {
			return getRuleContext(PostAloneContext.class,i);
		}
		public Strong_wsContext strong_ws() {
			return getRuleContext(Strong_wsContext.class,0);
		}
		public SaLettersContext saLetters() {
			return getRuleContext(SaLettersContext.class,0);
		}
		public ShortFormsContext shortForms() {
			return getRuleContext(ShortFormsContext.class,0);
		}
		public CapsPassageIndContext capsPassageInd() {
			return getRuleContext(CapsPassageIndContext.class,0);
		}
		public CapsWordIndContext capsWordInd() {
			return getRuleContext(CapsWordIndContext.class,0);
		}
		public TerminalNode DOT6() { return getToken(simpleParser.DOT6, 0); }
		public StandingAloneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standingAlone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterStandingAlone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitStandingAlone(this);
		}
	}

	public final StandingAloneContext standingAlone() throws RecognitionException {
		StandingAloneContext _localctx = new StandingAloneContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_standingAlone);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(303);
					preAlone();
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			{
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(309);
				capsPassageInd();
				}
				break;
			case 2:
				{
				setState(310);
				capsWordInd();
				}
				break;
			case 3:
				{
				setState(311);
				match(DOT6);
				}
				break;
			}
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOTS34:
			case DOTS146:
			case DOTS156:
			case DOTS16:
			case DOTS1456:
			case DOTS1256:
				{
				setState(314);
				strong_ws();
				}
				break;
			case LETTERK:
			case MOST_LETTERS:
			case LETTERA:
			case LETTERB:
			case UPDIGS:
				{
				setState(315);
				saLetters();
				}
				break;
			case BESF:
			case CHSF:
			case SHSF:
			case STSF:
			case OURSELVES:
			case THSF:
			case ERSF:
			case ONESELF:
			case THMSLVS:
			case CONCV:
				{
				setState(316);
				shortForms();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(319);
					postAlone();
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class Pr_tokenContext extends ParserRuleContext {
		public LargeWordsContext largeWords() {
			return getRuleContext(LargeWordsContext.class,0);
		}
		public InitLetConsContext initLetCons() {
			return getRuleContext(InitLetConsContext.class,0);
		}
		public FinalLetConsContext finalLetCons() {
			return getRuleContext(FinalLetConsContext.class,0);
		}
		public Strong_gsContext strong_gs() {
			return getRuleContext(Strong_gsContext.class,0);
		}
		public RootsContext roots() {
			return getRuleContext(RootsContext.class,0);
		}
		public LettersContext letters() {
			return getRuleContext(LettersContext.class,0);
		}
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public Pr_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterPr_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitPr_token(this);
		}
	}

	public final Pr_tokenContext pr_token() throws RecognitionException {
		Pr_tokenContext _localctx = new Pr_tokenContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_pr_token);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(325);
				largeWords();
				}
				break;
			case 2:
				{
				setState(326);
				initLetCons();
				}
				break;
			case 3:
				{
				setState(327);
				finalLetCons();
				}
				break;
			case 4:
				{
				setState(328);
				strong_gs();
				}
				break;
			case 5:
				{
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT4) | (1L << DOT5) | (1L << DOT6) | (1L << DOTS45) | (1L << DOTS56) | (1L << DOTS46) | (1L << DOTS456))) != 0)) {
					{
					setState(329);
					prefix();
					}
				}

				setState(334);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT2:
				case DOTS23:
				case DOTS25:
				case DOTS256:
				case DOTS235:
				case DOTS2356:
				case DOTS236:
				case DOTS356:
				case DOTS26:
				case DOTS35:
				case DOTS34:
				case DOTS36:
				case DOTS126:
				case DOTS345:
				case DOTS346:
				case DOT3:
				case DOTS146:
				case DOTS156:
				case AND:
				case FOR:
				case OF:
				case THE:
				case WITH:
				case DOTS16:
				case DOTS1456:
				case DOTS1256:
				case DOTS12456:
				case DOTS246:
				case DOTS1246:
					{
					setState(332);
					roots();
					}
					break;
				case LETTERK:
				case MOST_LETTERS:
				case LETTERA:
				case LETTERB:
				case UPDIGS:
					{
					setState(333);
					letters();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class UpdigsContext extends ParserRuleContext {
		public TerminalNode LETTERA() { return getToken(simpleParser.LETTERA, 0); }
		public TerminalNode LETTERB() { return getToken(simpleParser.LETTERB, 0); }
		public TerminalNode UPDIGS() { return getToken(simpleParser.UPDIGS, 0); }
		public UpdigsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updigs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterUpdigs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitUpdigs(this);
		}
	}

	public final UpdigsContext updigs() throws RecognitionException {
		UpdigsContext _localctx = new UpdigsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_updigs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTERA) | (1L << LETTERB) | (1L << UPDIGS))) != 0)) ) {
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

	public static class NumspacedigContext extends ParserRuleContext {
		public TerminalNode DOT5() { return getToken(simpleParser.DOT5, 0); }
		public UpdigsContext updigs() {
			return getRuleContext(UpdigsContext.class,0);
		}
		public NumspacedigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numspacedig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterNumspacedig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitNumspacedig(this);
		}
	}

	public final NumspacedigContext numspacedig() throws RecognitionException {
		NumspacedigContext _localctx = new NumspacedigContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_numspacedig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(340);
			match(DOT5);
			setState(341);
			updigs();
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

	public static class NumindContext extends ParserRuleContext {
		public TerminalNode DOTS3456() { return getToken(simpleParser.DOTS3456, 0); }
		public UpdigsContext updigs() {
			return getRuleContext(UpdigsContext.class,0);
		}
		public TerminalNode DOT2() { return getToken(simpleParser.DOT2, 0); }
		public TerminalNode DOTS256() { return getToken(simpleParser.DOTS256, 0); }
		public NumindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterNumind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitNumind(this);
		}
	}

	public final NumindContext numind() throws RecognitionException {
		NumindContext _localctx = new NumindContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_numind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(343);
			match(DOTS3456);
			}
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTERA:
			case LETTERB:
			case UPDIGS:
				{
				setState(344);
				updigs();
				}
				break;
			case DOT2:
				{
				setState(345);
				match(DOT2);
				}
				break;
			case DOTS256:
				{
				setState(346);
				match(DOTS256);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NumfragContext extends ParserRuleContext {
		public NumindContext numind() {
			return getRuleContext(NumindContext.class,0);
		}
		public List<UpdigsContext> updigs() {
			return getRuleContexts(UpdigsContext.class);
		}
		public UpdigsContext updigs(int i) {
			return getRuleContext(UpdigsContext.class,i);
		}
		public List<TerminalNode> DOT2() { return getTokens(simpleParser.DOT2); }
		public TerminalNode DOT2(int i) {
			return getToken(simpleParser.DOT2, i);
		}
		public List<TerminalNode> DOTS256() { return getTokens(simpleParser.DOTS256); }
		public TerminalNode DOTS256(int i) {
			return getToken(simpleParser.DOTS256, i);
		}
		public List<TerminalNode> DOTS34() { return getTokens(simpleParser.DOTS34); }
		public TerminalNode DOTS34(int i) {
			return getToken(simpleParser.DOTS34, i);
		}
		public List<NumspacedigContext> numspacedig() {
			return getRuleContexts(NumspacedigContext.class);
		}
		public NumspacedigContext numspacedig(int i) {
			return getRuleContext(NumspacedigContext.class,i);
		}
		public NumfragContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numfrag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterNumfrag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitNumfrag(this);
		}
	}

	public final NumfragContext numfrag() throws RecognitionException {
		NumfragContext _localctx = new NumfragContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_numfrag);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			numind();
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(355);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LETTERA:
					case LETTERB:
					case UPDIGS:
						{
						setState(350);
						updigs();
						}
						break;
					case DOT2:
						{
						setState(351);
						match(DOT2);
						}
						break;
					case DOTS256:
						{
						setState(352);
						match(DOTS256);
						}
						break;
					case DOTS34:
						{
						setState(353);
						match(DOTS34);
						}
						break;
					case DOT5:
						{
						setState(354);
						numspacedig();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class NemIntegerContext extends ParserRuleContext {
		public List<TerminalNode> NEM0() { return getTokens(simpleParser.NEM0); }
		public TerminalNode NEM0(int i) {
			return getToken(simpleParser.NEM0, i);
		}
		public List<TerminalNode> NEM1() { return getTokens(simpleParser.NEM1); }
		public TerminalNode NEM1(int i) {
			return getToken(simpleParser.NEM1, i);
		}
		public List<TerminalNode> NEM2() { return getTokens(simpleParser.NEM2); }
		public TerminalNode NEM2(int i) {
			return getToken(simpleParser.NEM2, i);
		}
		public List<TerminalNode> NEM3() { return getTokens(simpleParser.NEM3); }
		public TerminalNode NEM3(int i) {
			return getToken(simpleParser.NEM3, i);
		}
		public List<TerminalNode> NEM4() { return getTokens(simpleParser.NEM4); }
		public TerminalNode NEM4(int i) {
			return getToken(simpleParser.NEM4, i);
		}
		public List<TerminalNode> NEM5() { return getTokens(simpleParser.NEM5); }
		public TerminalNode NEM5(int i) {
			return getToken(simpleParser.NEM5, i);
		}
		public NemIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterNemInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitNemInteger(this);
		}
	}

	public final NemIntegerContext nemInteger() throws RecognitionException {
		NemIntegerContext _localctx = new NemIntegerContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_nemInteger);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(360);
					_la = _input.LA(1);
					if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEM0 - 66)) | (1L << (NEM1 - 66)) | (1L << (NEM2 - 66)) | (1L << (NEM3 - 66)) | (1L << (NEM4 - 66)) | (1L << (NEM5 - 66)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(363); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class NemRealContext extends ParserRuleContext {
		public List<NemIntegerContext> nemInteger() {
			return getRuleContexts(NemIntegerContext.class);
		}
		public NemIntegerContext nemInteger(int i) {
			return getRuleContext(NemIntegerContext.class,i);
		}
		public TerminalNode NEM_DECPT() { return getToken(simpleParser.NEM_DECPT, 0); }
		public NemRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemReal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterNemReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitNemReal(this);
		}
	}

	public final NemRealContext nemReal() throws RecognitionException {
		NemRealContext _localctx = new NemRealContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_nemReal);
		try {
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEM0:
			case NEM1:
			case NEM2:
			case NEM3:
			case NEM4:
			case NEM5:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(365);
				nemInteger();
				setState(366);
				match(NEM_DECPT);
				setState(368);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(367);
					nemInteger();
					}
					break;
				}
				}
				}
				break;
			case NEM_DECPT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(370);
				match(NEM_DECPT);
				setState(371);
				nemInteger();
				}
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

	public static class NemOpContext extends ParserRuleContext {
		public TerminalNode NEM_PLUS() { return getToken(simpleParser.NEM_PLUS, 0); }
		public TerminalNode NEM_MINUS() { return getToken(simpleParser.NEM_MINUS, 0); }
		public TerminalNode NEM_FACTORIAL() { return getToken(simpleParser.NEM_FACTORIAL, 0); }
		public NemOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterNemOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitNemOp(this);
		}
	}

	public final NemOpContext nemOp() throws RecognitionException {
		NemOpContext _localctx = new NemOpContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_nemOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (NEM_FACTORIAL - 75)) | (1L << (NEM_MINUS - 75)) | (1L << (NEM_PLUS - 75)))) != 0)) ) {
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

	public static class NemCompContext extends ParserRuleContext {
		public TerminalNode NEM_EQUALS() { return getToken(simpleParser.NEM_EQUALS, 0); }
		public NemCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemComp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterNemComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitNemComp(this);
		}
	}

	public final NemCompContext nemComp() throws RecognitionException {
		NemCompContext _localctx = new NemCompContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_nemComp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(NEM_EQUALS);
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

	public static class NemIdContext extends ParserRuleContext {
		public TerminalNode LATIN_LETTER() { return getToken(simpleParser.LATIN_LETTER, 0); }
		public TerminalNode LC_ID() { return getToken(simpleParser.LC_ID, 0); }
		public NemIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterNemId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitNemId(this);
		}
	}

	public final NemIdContext nemId() throws RecognitionException {
		NemIdContext _localctx = new NemIdContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_nemId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_la = _input.LA(1);
			if ( !(_la==LC_ID || _la==LATIN_LETTER) ) {
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

	public static class NemOGroupContext extends ParserRuleContext {
		public TerminalNode NEM_OFENCE() { return getToken(simpleParser.NEM_OFENCE, 0); }
		public TerminalNode NEM_VBAR() { return getToken(simpleParser.NEM_VBAR, 0); }
		public NemOGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemOGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterNemOGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitNemOGroup(this);
		}
	}

	public final NemOGroupContext nemOGroup() throws RecognitionException {
		NemOGroupContext _localctx = new NemOGroupContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_nemOGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_la = _input.LA(1);
			if ( !(_la==NEM_OFENCE || _la==NEM_VBAR) ) {
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

	public static class NemCGroupContext extends ParserRuleContext {
		public TerminalNode NEM_CFENCE() { return getToken(simpleParser.NEM_CFENCE, 0); }
		public NemCGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemCGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterNemCGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitNemCGroup(this);
		}
	}

	public final NemCGroupContext nemCGroup() throws RecognitionException {
		NemCGroupContext _localctx = new NemCGroupContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_nemCGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(NEM_CFENCE);
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

	public static class NemSymsContext extends ParserRuleContext {
		public List<NemIntegerContext> nemInteger() {
			return getRuleContexts(NemIntegerContext.class);
		}
		public NemIntegerContext nemInteger(int i) {
			return getRuleContext(NemIntegerContext.class,i);
		}
		public List<NemRealContext> nemReal() {
			return getRuleContexts(NemRealContext.class);
		}
		public NemRealContext nemReal(int i) {
			return getRuleContext(NemRealContext.class,i);
		}
		public List<NemOpContext> nemOp() {
			return getRuleContexts(NemOpContext.class);
		}
		public NemOpContext nemOp(int i) {
			return getRuleContext(NemOpContext.class,i);
		}
		public List<NemCompContext> nemComp() {
			return getRuleContexts(NemCompContext.class);
		}
		public NemCompContext nemComp(int i) {
			return getRuleContext(NemCompContext.class,i);
		}
		public List<NemOGroupContext> nemOGroup() {
			return getRuleContexts(NemOGroupContext.class);
		}
		public NemOGroupContext nemOGroup(int i) {
			return getRuleContext(NemOGroupContext.class,i);
		}
		public List<NemCGroupContext> nemCGroup() {
			return getRuleContexts(NemCGroupContext.class);
		}
		public NemCGroupContext nemCGroup(int i) {
			return getRuleContext(NemCGroupContext.class,i);
		}
		public List<NemIdContext> nemId() {
			return getRuleContexts(NemIdContext.class);
		}
		public NemIdContext nemId(int i) {
			return getRuleContext(NemIdContext.class,i);
		}
		public List<TerminalNode> NEM_SPACE() { return getTokens(simpleParser.NEM_SPACE); }
		public TerminalNode NEM_SPACE(int i) {
			return getToken(simpleParser.NEM_SPACE, i);
		}
		public NemSymsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemSyms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterNemSyms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitNemSyms(this);
		}
	}

	public final NemSymsContext nemSyms() throws RecognitionException {
		NemSymsContext _localctx = new NemSymsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_nemSyms);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(392); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(392);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(384);
						nemInteger();
						}
						break;
					case 2:
						{
						setState(385);
						nemReal();
						}
						break;
					case 3:
						{
						setState(386);
						nemOp();
						}
						break;
					case 4:
						{
						setState(387);
						nemComp();
						}
						break;
					case 5:
						{
						setState(388);
						nemOGroup();
						}
						break;
					case 6:
						{
						setState(389);
						nemCGroup();
						}
						break;
					case 7:
						{
						setState(390);
						nemId();
						}
						break;
					case 8:
						{
						setState(391);
						match(NEM_SPACE);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(394); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class D4_hashContext extends ParserRuleContext {
		public TerminalNode DOT4() { return getToken(simpleParser.DOT4, 0); }
		public TerminalNode DOTS3456() { return getToken(simpleParser.DOTS3456, 0); }
		public D4_hashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d4_hash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterD4_hash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitD4_hash(this);
		}
	}

	public final D4_hashContext d4_hash() throws RecognitionException {
		D4_hashContext _localctx = new D4_hashContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_d4_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(DOT4);
			setState(397);
			match(DOTS3456);
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

	public static class D45_hashContext extends ParserRuleContext {
		public TerminalNode DOTS45() { return getToken(simpleParser.DOTS45, 0); }
		public TerminalNode DOTS3456() { return getToken(simpleParser.DOTS3456, 0); }
		public D45_hashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d45_hash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterD45_hash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitD45_hash(this);
		}
	}

	public final D45_hashContext d45_hash() throws RecognitionException {
		D45_hashContext _localctx = new D45_hashContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_d45_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(DOTS45);
			setState(400);
			match(DOTS3456);
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

	public static class D456_hashContext extends ParserRuleContext {
		public TerminalNode DOTS456() { return getToken(simpleParser.DOTS456, 0); }
		public TerminalNode DOTS3456() { return getToken(simpleParser.DOTS3456, 0); }
		public D456_hashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d456_hash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterD456_hash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitD456_hash(this);
		}
	}

	public final D456_hashContext d456_hash() throws RecognitionException {
		D456_hashContext _localctx = new D456_hashContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_d456_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(DOTS456);
			setState(403);
			match(DOTS3456);
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

	public static class D5_hashContext extends ParserRuleContext {
		public TerminalNode DOT5() { return getToken(simpleParser.DOT5, 0); }
		public TerminalNode DOTS3456() { return getToken(simpleParser.DOTS3456, 0); }
		public D5_hashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d5_hash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterD5_hash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitD5_hash(this);
		}
	}

	public final D5_hashContext d5_hash() throws RecognitionException {
		D5_hashContext _localctx = new D5_hashContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_d5_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(DOT5);
			setState(406);
			match(DOTS3456);
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

	public static class D46_hashContext extends ParserRuleContext {
		public TerminalNode DOTS46() { return getToken(simpleParser.DOTS46, 0); }
		public TerminalNode DOTS3456() { return getToken(simpleParser.DOTS3456, 0); }
		public D46_hashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d46_hash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterD46_hash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitD46_hash(this);
		}
	}

	public final D46_hashContext d46_hash() throws RecognitionException {
		D46_hashContext _localctx = new D46_hashContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_d46_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(DOTS46);
			setState(409);
			match(DOTS3456);
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

	public static class TfPrefixContext extends ParserRuleContext {
		public TerminalNode DOTS46() { return getToken(simpleParser.DOTS46, 0); }
		public TerminalNode DOTS45() { return getToken(simpleParser.DOTS45, 0); }
		public TerminalNode DOTS456() { return getToken(simpleParser.DOTS456, 0); }
		public TerminalNode DOT4() { return getToken(simpleParser.DOT4, 0); }
		public D4_hashContext d4_hash() {
			return getRuleContext(D4_hashContext.class,0);
		}
		public D45_hashContext d45_hash() {
			return getRuleContext(D45_hashContext.class,0);
		}
		public D456_hashContext d456_hash() {
			return getRuleContext(D456_hashContext.class,0);
		}
		public D5_hashContext d5_hash() {
			return getRuleContext(D5_hashContext.class,0);
		}
		public D46_hashContext d46_hash() {
			return getRuleContext(D46_hashContext.class,0);
		}
		public TfPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tfPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterTfPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitTfPrefix(this);
		}
	}

	public final TfPrefixContext tfPrefix() throws RecognitionException {
		TfPrefixContext _localctx = new TfPrefixContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_tfPrefix);
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(DOTS46);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(DOTS45);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				match(DOTS456);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(414);
				match(DOT4);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(415);
				d4_hash();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(416);
				d45_hash();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(417);
				d456_hash();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(418);
				d5_hash();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(419);
				d46_hash();
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

	public static class TfStartRootContext extends ParserRuleContext {
		public TerminalNode DOTS23() { return getToken(simpleParser.DOTS23, 0); }
		public TerminalNode DOT2() { return getToken(simpleParser.DOT2, 0); }
		public TerminalNode DOTS2356() { return getToken(simpleParser.DOTS2356, 0); }
		public TfStartRootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tfStartRoot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterTfStartRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitTfStartRoot(this);
		}
	}

	public final TfStartRootContext tfStartRoot() throws RecognitionException {
		TfStartRootContext _localctx = new TfStartRootContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_tfStartRoot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT2) | (1L << DOTS23) | (1L << DOTS2356))) != 0)) ) {
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

	public static class TfTermRootContext extends ParserRuleContext {
		public TerminalNode DOT3() { return getToken(simpleParser.DOT3, 0); }
		public TfTermRootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tfTermRoot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterTfTermRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitTfTermRoot(this);
		}
	}

	public final TfTermRootContext tfTermRoot() throws RecognitionException {
		TfTermRootContext _localctx = new TfTermRootContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_tfTermRoot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(DOT3);
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

	public static class TfStartIndicatorContext extends ParserRuleContext {
		public TfPrefixContext tfPrefix() {
			return getRuleContext(TfPrefixContext.class,0);
		}
		public TfStartRootContext tfStartRoot() {
			return getRuleContext(TfStartRootContext.class,0);
		}
		public TfStartIndicatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tfStartIndicator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterTfStartIndicator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitTfStartIndicator(this);
		}
	}

	public final TfStartIndicatorContext tfStartIndicator() throws RecognitionException {
		TfStartIndicatorContext _localctx = new TfStartIndicatorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_tfStartIndicator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(426);
			tfPrefix();
			}
			{
			setState(427);
			tfStartRoot();
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

	public static class TfTermIndicatorContext extends ParserRuleContext {
		public TfPrefixContext tfPrefix() {
			return getRuleContext(TfPrefixContext.class,0);
		}
		public TfTermRootContext tfTermRoot() {
			return getRuleContext(TfTermRootContext.class,0);
		}
		public TfTermIndicatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tfTermIndicator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterTfTermIndicator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitTfTermIndicator(this);
		}
	}

	public final TfTermIndicatorContext tfTermIndicator() throws RecognitionException {
		TfTermIndicatorContext _localctx = new TfTermIndicatorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_tfTermIndicator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(429);
			tfPrefix();
			}
			{
			setState(430);
			tfTermRoot();
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

	public static class TfSymbolIndContext extends ParserRuleContext {
		public TfPrefixContext tfPrefix() {
			return getRuleContext(TfPrefixContext.class,0);
		}
		public TerminalNode DOTS23() { return getToken(simpleParser.DOTS23, 0); }
		public TfSymbolIndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tfSymbolInd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterTfSymbolInd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitTfSymbolInd(this);
		}
	}

	public final TfSymbolIndContext tfSymbolInd() throws RecognitionException {
		TfSymbolIndContext _localctx = new TfSymbolIndContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_tfSymbolInd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(432);
			tfPrefix();
			setState(433);
			match(DOTS23);
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

	public static class TfWordIndContext extends ParserRuleContext {
		public TfPrefixContext tfPrefix() {
			return getRuleContext(TfPrefixContext.class,0);
		}
		public TerminalNode DOT2() { return getToken(simpleParser.DOT2, 0); }
		public TfWordIndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tfWordInd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterTfWordInd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitTfWordInd(this);
		}
	}

	public final TfWordIndContext tfWordInd() throws RecognitionException {
		TfWordIndContext _localctx = new TfWordIndContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_tfWordInd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(435);
			tfPrefix();
			setState(436);
			match(DOT2);
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

	public static class SubsupContext extends ParserRuleContext {
		public TerminalNode DOTS26() { return getToken(simpleParser.DOTS26, 0); }
		public TerminalNode DOTS35() { return getToken(simpleParser.DOTS35, 0); }
		public TerminalNode DOTS56() { return getToken(simpleParser.DOTS56, 0); }
		public SubsupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subsup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterSubsup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitSubsup(this);
		}
	}

	public final SubsupContext subsup() throws RecognitionException {
		SubsupContext _localctx = new SubsupContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_subsup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(438);
			match(DOTS56);
			}
			setState(439);
			_la = _input.LA(1);
			if ( !(_la==DOTS26 || _la==DOTS35) ) {
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

	public static class Encl1Context extends ParserRuleContext {
		public List<TerminalNode> DOT5() { return getTokens(simpleParser.DOT5); }
		public TerminalNode DOT5(int i) {
			return getToken(simpleParser.DOT5, i);
		}
		public TerminalNode DOTS126() { return getToken(simpleParser.DOTS126, 0); }
		public TerminalNode DOTS345() { return getToken(simpleParser.DOTS345, 0); }
		public List<Pr_tokenContext> pr_token() {
			return getRuleContexts(Pr_tokenContext.class);
		}
		public Pr_tokenContext pr_token(int i) {
			return getRuleContext(Pr_tokenContext.class,i);
		}
		public Encl1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encl1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterEncl1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitEncl1(this);
		}
	}

	public final Encl1Context encl1() throws RecognitionException {
		Encl1Context _localctx = new Encl1Context(_ctx, getState());
		enterRule(_localctx, 110, RULE_encl1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(441);
			match(DOT5);
			setState(442);
			match(DOTS126);
			}
			setState(445); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(444);
					pr_token();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(447); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			{
			setState(449);
			match(DOT5);
			setState(450);
			match(DOTS345);
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

	public static class Encl2Context extends ParserRuleContext {
		public List<TerminalNode> DOTS46() { return getTokens(simpleParser.DOTS46); }
		public TerminalNode DOTS46(int i) {
			return getToken(simpleParser.DOTS46, i);
		}
		public TerminalNode DOTS126() { return getToken(simpleParser.DOTS126, 0); }
		public TerminalNode DOTS345() { return getToken(simpleParser.DOTS345, 0); }
		public List<Pr_tokenContext> pr_token() {
			return getRuleContexts(Pr_tokenContext.class);
		}
		public Pr_tokenContext pr_token(int i) {
			return getRuleContext(Pr_tokenContext.class,i);
		}
		public Encl2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encl2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterEncl2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitEncl2(this);
		}
	}

	public final Encl2Context encl2() throws RecognitionException {
		Encl2Context _localctx = new Encl2Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_encl2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(452);
			match(DOTS46);
			setState(453);
			match(DOTS126);
			}
			setState(456); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(455);
					pr_token();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(458); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			{
			setState(460);
			match(DOTS46);
			setState(461);
			match(DOTS345);
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

	public static class Encl3Context extends ParserRuleContext {
		public List<TerminalNode> DOTS456() { return getTokens(simpleParser.DOTS456); }
		public TerminalNode DOTS456(int i) {
			return getToken(simpleParser.DOTS456, i);
		}
		public TerminalNode DOTS126() { return getToken(simpleParser.DOTS126, 0); }
		public TerminalNode DOTS345() { return getToken(simpleParser.DOTS345, 0); }
		public List<Pr_tokenContext> pr_token() {
			return getRuleContexts(Pr_tokenContext.class);
		}
		public Pr_tokenContext pr_token(int i) {
			return getRuleContext(Pr_tokenContext.class,i);
		}
		public Encl3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encl3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterEncl3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitEncl3(this);
		}
	}

	public final Encl3Context encl3() throws RecognitionException {
		Encl3Context _localctx = new Encl3Context(_ctx, getState());
		enterRule(_localctx, 114, RULE_encl3);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(463);
			match(DOTS456);
			setState(464);
			match(DOTS126);
			}
			setState(467); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(466);
					pr_token();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(469); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			{
			setState(471);
			match(DOTS456);
			setState(472);
			match(DOTS345);
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

	public static class ScripContext extends ParserRuleContext {
		public SubsupContext subsup() {
			return getRuleContext(SubsupContext.class,0);
		}
		public Encl1Context encl1() {
			return getRuleContext(Encl1Context.class,0);
		}
		public Encl2Context encl2() {
			return getRuleContext(Encl2Context.class,0);
		}
		public Encl3Context encl3() {
			return getRuleContext(Encl3Context.class,0);
		}
		public ScripContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scrip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterScrip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitScrip(this);
		}
	}

	public final ScripContext scrip() throws RecognitionException {
		ScripContext _localctx = new ScripContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_scrip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			subsup();
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT5:
				{
				setState(475);
				encl1();
				}
				break;
			case DOTS46:
				{
				setState(476);
				encl2();
				}
				break;
			case DOTS456:
				{
				setState(477);
				encl3();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PreAloneContext extends ParserRuleContext {
		public CapsPassageIndContext capsPassageInd() {
			return getRuleContext(CapsPassageIndContext.class,0);
		}
		public TfStartIndicatorContext tfStartIndicator() {
			return getRuleContext(TfStartIndicatorContext.class,0);
		}
		public TerminalNode DOTS126() { return getToken(simpleParser.DOTS126, 0); }
		public TerminalNode DOTS236() { return getToken(simpleParser.DOTS236, 0); }
		public TerminalNode DOT5() { return getToken(simpleParser.DOT5, 0); }
		public TerminalNode DOTS2356() { return getToken(simpleParser.DOTS2356, 0); }
		public TerminalNode DOT3() { return getToken(simpleParser.DOT3, 0); }
		public TerminalNode DOTS46() { return getToken(simpleParser.DOTS46, 0); }
		public TerminalNode DOTS456() { return getToken(simpleParser.DOTS456, 0); }
		public TerminalNode DOTS45() { return getToken(simpleParser.DOTS45, 0); }
		public TerminalNode DOT6() { return getToken(simpleParser.DOT6, 0); }
		public PreAloneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preAlone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterPreAlone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitPreAlone(this);
		}
	}

	public final PreAloneContext preAlone() throws RecognitionException {
		PreAloneContext _localctx = new PreAloneContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_preAlone);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				{
				setState(480);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT5) | (1L << DOTS46) | (1L << DOTS456))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(481);
				match(DOTS126);
				}
				}
				break;
			case 2:
				{
				{
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT6) | (1L << DOTS45) | (1L << DOTS456))) != 0)) {
					{
					setState(482);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT6) | (1L << DOTS45) | (1L << DOTS456))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(485);
				match(DOTS236);
				}
				}
				break;
			case 3:
				{
				setState(489);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT5:
					{
					setState(486);
					match(DOT5);
					setState(487);
					match(DOTS2356);
					}
					break;
				case DOT3:
					{
					setState(488);
					match(DOT3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				{
				setState(491);
				capsPassageInd();
				}
				break;
			case 5:
				{
				setState(492);
				tfStartIndicator();
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

	public static class PostAloneContext extends ParserRuleContext {
		public TfTermIndicatorContext tfTermIndicator() {
			return getRuleContext(TfTermIndicatorContext.class,0);
		}
		public TerminalNode DOT2() { return getToken(simpleParser.DOT2, 0); }
		public TerminalNode DOTS23() { return getToken(simpleParser.DOTS23, 0); }
		public TerminalNode DOTS25() { return getToken(simpleParser.DOTS25, 0); }
		public List<TerminalNode> DOTS256() { return getTokens(simpleParser.DOTS256); }
		public TerminalNode DOTS256(int i) {
			return getToken(simpleParser.DOTS256, i);
		}
		public TerminalNode DOTS235() { return getToken(simpleParser.DOTS235, 0); }
		public TerminalNode DOTS236() { return getToken(simpleParser.DOTS236, 0); }
		public TerminalNode DOTS345() { return getToken(simpleParser.DOTS345, 0); }
		public TerminalNode DOTS356() { return getToken(simpleParser.DOTS356, 0); }
		public TerminalNode DOT5() { return getToken(simpleParser.DOT5, 0); }
		public TerminalNode DOTS2356() { return getToken(simpleParser.DOTS2356, 0); }
		public TerminalNode DOT3() { return getToken(simpleParser.DOT3, 0); }
		public TerminalNode DOTS46() { return getToken(simpleParser.DOTS46, 0); }
		public TerminalNode DOTS456() { return getToken(simpleParser.DOTS456, 0); }
		public TerminalNode DOTS45() { return getToken(simpleParser.DOTS45, 0); }
		public TerminalNode DOT6() { return getToken(simpleParser.DOT6, 0); }
		public PostAloneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postAlone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).enterPostAlone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleParserListener ) ((simpleParserListener)listener).exitPostAlone(this);
		}
	}

	public final PostAloneContext postAlone() throws RecognitionException {
		PostAloneContext _localctx = new PostAloneContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_postAlone);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(505);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT2:
					{
					setState(495);
					match(DOT2);
					}
					break;
				case DOTS23:
					{
					setState(496);
					match(DOTS23);
					}
					break;
				case DOTS25:
					{
					setState(497);
					match(DOTS25);
					}
					break;
				case DOTS256:
					{
					setState(498);
					match(DOTS256);
					setState(501);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						setState(499);
						match(DOTS256);
						setState(500);
						match(DOTS256);
						}
						break;
					}
					}
					break;
				case DOTS235:
					{
					setState(503);
					match(DOTS235);
					}
					break;
				case DOTS236:
					{
					setState(504);
					match(DOTS236);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				{
				setState(507);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT5) | (1L << DOTS46) | (1L << DOTS456))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(508);
				match(DOTS345);
				}
				}
				break;
			case 3:
				{
				{
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT6) | (1L << DOTS45) | (1L << DOTS456))) != 0)) {
					{
					setState(509);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT6) | (1L << DOTS45) | (1L << DOTS456))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(512);
				match(DOTS356);
				}
				}
				break;
			case 4:
				{
				setState(516);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT5:
					{
					setState(513);
					match(DOT5);
					setState(514);
					match(DOTS2356);
					}
					break;
				case DOT3:
					{
					setState(515);
					match(DOT3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				{
				setState(518);
				tfTermIndicator();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\\\u020c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\6\2~\n\2\r\2\16\2\177\3\3\3\3\5\3\u0084\n\3\3\3\3\3\3\3\3\3"+
		"\5\3\u008a\n\3\3\3\6\3\u008d\n\3\r\3\16\3\u008e\3\3\3\3\3\3\7\3\u0094"+
		"\n\3\f\3\16\3\u0097\13\3\3\3\3\3\5\3\u009b\n\3\3\3\6\3\u009e\n\3\r\3\16"+
		"\3\u009f\3\3\3\3\6\3\u00a4\n\3\r\3\16\3\u00a5\3\3\6\3\u00a9\n\3\r\3\16"+
		"\3\u00aa\6\3\u00ad\n\3\r\3\16\3\u00ae\5\3\u00b1\n\3\7\3\u00b3\n\3\f\3"+
		"\16\3\u00b6\13\3\3\3\7\3\u00b9\n\3\f\3\16\3\u00bc\13\3\3\3\3\3\3\3\7\3"+
		"\u00c1\n\3\f\3\16\3\u00c4\13\3\3\3\5\3\u00c7\n\3\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00df\n\13\3\f\3\f\6\f\u00e3\n\f\r\f\16\f\u00e4\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00f6\n\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0113\n\23\3\24\3\24\3\24\5\24\u0118\n\24\3\25\3\25\7\25\u011c\n\25\f"+
		"\25\16\25\u011f\13\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\7\36\u0133\n\36\f\36\16\36\u0136"+
		"\13\36\3\36\3\36\3\36\5\36\u013b\n\36\3\36\3\36\3\36\5\36\u0140\n\36\3"+
		"\36\7\36\u0143\n\36\f\36\16\36\u0146\13\36\3\37\3\37\3\37\3\37\3\37\5"+
		"\37\u014d\n\37\3\37\3\37\5\37\u0151\n\37\5\37\u0153\n\37\3 \3 \3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\5\"\u015e\n\"\3#\3#\3#\3#\3#\3#\7#\u0166\n#\f#\16#\u0169"+
		"\13#\3$\6$\u016c\n$\r$\16$\u016d\3%\3%\3%\5%\u0173\n%\3%\3%\5%\u0177\n"+
		"%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\6+\u018b\n+"+
		"\r+\16+\u018c\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u01a7\n\61\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\3"+
		"8\38\39\39\39\39\69\u01c0\n9\r9\169\u01c1\39\39\39\3:\3:\3:\3:\6:\u01cb"+
		"\n:\r:\16:\u01cc\3:\3:\3:\3;\3;\3;\3;\6;\u01d6\n;\r;\16;\u01d7\3;\3;\3"+
		";\3<\3<\3<\3<\5<\u01e1\n<\3=\3=\3=\5=\u01e6\n=\3=\3=\3=\3=\5=\u01ec\n"+
		"=\3=\3=\5=\u01f0\n=\3>\3>\3>\3>\3>\3>\5>\u01f8\n>\3>\3>\5>\u01fc\n>\3"+
		">\3>\3>\5>\u0201\n>\3>\3>\3>\3>\5>\u0207\n>\3>\5>\u020a\n>\3>\2\2?\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz\2\23\4\2==OO\3\2\4\n\3\2\61\65\5\2))/\60\668\3"+
		"\2\23\34\3\2\20\22\3\2\13\f\6\2))+-/\60\66;\3\2?A\3\2DI\4\2MNPP\4\2XX"+
		"[[\4\2UUWW\4\2\37 $$\3\2\'(\4\2\5\5\t\n\4\2\6\7\n\n\2\u0242\2}\3\2\2\2"+
		"\4\u00c6\3\2\2\2\6\u00c8\3\2\2\2\b\u00cb\3\2\2\2\n\u00cf\3\2\2\2\f\u00d1"+
		"\3\2\2\2\16\u00d3\3\2\2\2\20\u00d5\3\2\2\2\22\u00d7\3\2\2\2\24\u00de\3"+
		"\2\2\2\26\u00e2\3\2\2\2\30\u00e6\3\2\2\2\32\u00e8\3\2\2\2\34\u00ea\3\2"+
		"\2\2\36\u00ed\3\2\2\2 \u00f5\3\2\2\2\"\u00f7\3\2\2\2$\u0112\3\2\2\2&\u0117"+
		"\3\2\2\2(\u0119\3\2\2\2*\u0120\3\2\2\2,\u0123\3\2\2\2.\u0125\3\2\2\2\60"+
		"\u0127\3\2\2\2\62\u0129\3\2\2\2\64\u012b\3\2\2\2\66\u012d\3\2\2\28\u012f"+
		"\3\2\2\2:\u0134\3\2\2\2<\u0152\3\2\2\2>\u0154\3\2\2\2@\u0156\3\2\2\2B"+
		"\u0159\3\2\2\2D\u015f\3\2\2\2F\u016b\3\2\2\2H\u0176\3\2\2\2J\u0178\3\2"+
		"\2\2L\u017a\3\2\2\2N\u017c\3\2\2\2P\u017e\3\2\2\2R\u0180\3\2\2\2T\u018a"+
		"\3\2\2\2V\u018e\3\2\2\2X\u0191\3\2\2\2Z\u0194\3\2\2\2\\\u0197\3\2\2\2"+
		"^\u019a\3\2\2\2`\u01a6\3\2\2\2b\u01a8\3\2\2\2d\u01aa\3\2\2\2f\u01ac\3"+
		"\2\2\2h\u01af\3\2\2\2j\u01b2\3\2\2\2l\u01b5\3\2\2\2n\u01b8\3\2\2\2p\u01bb"+
		"\3\2\2\2r\u01c6\3\2\2\2t\u01d1\3\2\2\2v\u01dc\3\2\2\2x\u01ef\3\2\2\2z"+
		"\u0209\3\2\2\2|~\5\4\3\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\3\3\2\2\2\u0081\u0084\5\f\7\2\u0082\u0084\5\16\b\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\t\2"+
		"\2\2\u0086\u00c7\3\2\2\2\u0087\u008a\5\20\t\2\u0088\u008a\5\22\n\2\u0089"+
		"\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u008d\5T"+
		"+\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\t\2\2\2\u0091\u00c7\3\2"+
		"\2\2\u0092\u0094\5\30\r\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u009a\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0098\u009b\5:\36\2\u0099\u009b\5\26\f\2\u009a\u0098\3\2\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\u00b4\3\2\2\2\u009c\u009e\5 \21\2\u009d\u009c\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00b0\3\2\2\2\u00a1\u00b1\5:\36\2\u00a2\u00a4\5D#\2\u00a3\u00a2\3\2\2"+
		"\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00ad"+
		"\3\2\2\2\u00a7\u00a9\5\24\13\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2"+
		"\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a3"+
		"\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00a1\3\2\2\2\u00b0\u00ac\3\2"+
		"\2\2\u00b1\u00b3\3\2\2\2\u00b2\u009d\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00ba\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b7\u00b9\5\"\22\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bd\u00be\7=\2\2\u00be\u00c7\3\2\2\2\u00bf\u00c1\5\30\r\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\7=\2\2\u00c6"+
		"\u0083\3\2\2\2\u00c6\u0089\3\2\2\2\u00c6\u0095\3\2\2\2\u00c6\u00c2\3\2"+
		"\2\2\u00c7\5\3\2\2\2\u00c8\u00c9\7\6\2\2\u00c9\u00ca\7\6\2\2\u00ca\7\3"+
		"\2\2\2\u00cb\u00cc\7\6\2\2\u00cc\u00cd\7\6\2\2\u00cd\u00ce\7\6\2\2\u00ce"+
		"\t\3\2\2\2\u00cf\u00d0\7\b\2\2\u00d0\13\3\2\2\2\u00d1\u00d2\7B\2\2\u00d2"+
		"\r\3\2\2\2\u00d3\u00d4\7C\2\2\u00d4\17\3\2\2\2\u00d5\u00d6\7B\2\2\u00d6"+
		"\21\3\2\2\2\u00d7\u00d8\7C\2\2\u00d8\23\3\2\2\2\u00d9\u00df\5\b\5\2\u00da"+
		"\u00df\5\6\4\2\u00db\u00df\5\n\6\2\u00dc\u00df\5<\37\2\u00dd\u00df\5v"+
		"<\2\u00de\u00d9\3\2\2\2\u00de\u00da\3\2\2\2\u00de\u00db\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\25\3\2\2\2\u00e0\u00e3\5D#\2"+
		"\u00e1\u00e3\5\24\13\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\27\3\2\2\2\u00e6"+
		"\u00e7\7<\2\2\u00e7\31\3\2\2\2\u00e8\u00e9\7*\2\2\u00e9\33\3\2\2\2\u00ea"+
		"\u00eb\7\6\2\2\u00eb\u00ec\7*\2\2\u00ec\35\3\2\2\2\u00ed\u00ee\7\5\2\2"+
		"\u00ee\u00ef\7\6\2\2\u00ef\u00f0\7*\2\2\u00f0\37\3\2\2\2\u00f1\u00f6\5"+
		"\30\r\2\u00f2\u00f6\5\32\16\2\u00f3\u00f6\5\34\17\2\u00f4\u00f6\5\36\20"+
		"\2\u00f5\u00f1\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4"+
		"\3\2\2\2\u00f6!\3\2\2\2\u00f7\u00f8\5 \21\2\u00f8#\3\2\2\2\u00f9\u0113"+
		"\7&\2\2\u00fa\u0113\7*\2\2\u00fb\u0113\7\'\2\2\u00fc\u0113\7(\2\2\u00fd"+
		"\u0113\7\37\2\2\u00fe\u0113\7 \2\2\u00ff\u0113\7!\2\2\u0100\u0113\7\""+
		"\2\2\u0101\u0113\7#\2\2\u0102\u0113\7%\2\2\u0103\u0113\7$\2\2\u0104\u0113"+
		"\7)\2\2\u0105\u0113\7+\2\2\u0106\u0113\7,\2\2\u0107\u0113\7-\2\2\u0108"+
		"\u0113\7.\2\2\u0109\u0113\79\2\2\u010a\u0113\7:\2\2\u010b\u0113\7;\2\2"+
		"\u010c\u0113\5.\30\2\u010d\u0113\7\66\2\2\u010e\u0113\7\67\2\2\u010f\u0113"+
		"\78\2\2\u0110\u0113\7/\2\2\u0111\u0113\7\60\2\2\u0112\u00f9\3\2\2\2\u0112"+
		"\u00fa\3\2\2\2\u0112\u00fb\3\2\2\2\u0112\u00fc\3\2\2\2\u0112\u00fd\3\2"+
		"\2\2\u0112\u00fe\3\2\2\2\u0112\u00ff\3\2\2\2\u0112\u0100\3\2\2\2\u0112"+
		"\u0101\3\2\2\2\u0112\u0102\3\2\2\2\u0112\u0103\3\2\2\2\u0112\u0104\3\2"+
		"\2\2\u0112\u0105\3\2\2\2\u0112\u0106\3\2\2\2\u0112\u0107\3\2\2\2\u0112"+
		"\u0108\3\2\2\2\u0112\u0109\3\2\2\2\u0112\u010a\3\2\2\2\u0112\u010b\3\2"+
		"\2\2\u0112\u010c\3\2\2\2\u0112\u010d\3\2\2\2\u0112\u010e\3\2\2\2\u0112"+
		"\u010f\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113%\3\2\2\2"+
		"\u0114\u0118\5> \2\u0115\u0118\7\36\2\2\u0116\u0118\7\35\2\2\u0117\u0114"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\'\3\2\2\2\u0119"+
		"\u011d\5&\24\2\u011a\u011c\5&\24\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2"+
		"\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e)\3\2\2\2\u011f\u011d"+
		"\3\2\2\2\u0120\u0121\7\6\2\2\u0121\u0122\5&\24\2\u0122+\3\2\2\2\u0123"+
		"\u0124\t\3\2\2\u0124-\3\2\2\2\u0125\u0126\t\4\2\2\u0126/\3\2\2\2\u0127"+
		"\u0128\t\5\2\2\u0128\61\3\2\2\2\u0129\u012a\t\6\2\2\u012a\63\3\2\2\2\u012b"+
		"\u012c\t\7\2\2\u012c\65\3\2\2\2\u012d\u012e\t\b\2\2\u012e\67\3\2\2\2\u012f"+
		"\u0130\t\t\2\2\u01309\3\2\2\2\u0131\u0133\5x=\2\u0132\u0131\3\2\2\2\u0133"+
		"\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u013a\3\2"+
		"\2\2\u0136\u0134\3\2\2\2\u0137\u013b\5\b\5\2\u0138\u013b\5\6\4\2\u0139"+
		"\u013b\7\6\2\2\u013a\u0137\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013b\u013f\3\2\2\2\u013c\u0140\5\60\31\2\u013d"+
		"\u0140\5(\25\2\u013e\u0140\5\62\32\2\u013f\u013c\3\2\2\2\u013f\u013d\3"+
		"\2\2\2\u013f\u013e\3\2\2\2\u0140\u0144\3\2\2\2\u0141\u0143\5z>\2\u0142"+
		"\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145;\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0153\5.\30\2\u0148\u0153"+
		"\5\64\33\2\u0149\u0153\5\66\34\2\u014a\u0153\58\35\2\u014b\u014d\5,\27"+
		"\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u0151"+
		"\5$\23\2\u014f\u0151\5&\24\2\u0150\u014e\3\2\2\2\u0150\u014f\3\2\2\2\u0151"+
		"\u0153\3\2\2\2\u0152\u0147\3\2\2\2\u0152\u0148\3\2\2\2\u0152\u0149\3\2"+
		"\2\2\u0152\u014a\3\2\2\2\u0152\u014c\3\2\2\2\u0153=\3\2\2\2\u0154\u0155"+
		"\t\n\2\2\u0155?\3\2\2\2\u0156\u0157\7\5\2\2\u0157\u0158\5> \2\u0158A\3"+
		"\2\2\2\u0159\u015d\7\3\2\2\u015a\u015e\5> \2\u015b\u015e\7\37\2\2\u015c"+
		"\u015e\7\"\2\2\u015d\u015a\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015c\3\2"+
		"\2\2\u015eC\3\2\2\2\u015f\u0167\5B\"\2\u0160\u0166\5> \2\u0161\u0166\7"+
		"\37\2\2\u0162\u0166\7\"\2\2\u0163\u0166\7)\2\2\u0164\u0166\5@!\2\u0165"+
		"\u0160\3\2\2\2\u0165\u0161\3\2\2\2\u0165\u0162\3\2\2\2\u0165\u0163\3\2"+
		"\2\2\u0165\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168E\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016c\t\13\2\2"+
		"\u016b\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e"+
		"\3\2\2\2\u016eG\3\2\2\2\u016f\u0170\5F$\2\u0170\u0172\7K\2\2\u0171\u0173"+
		"\5F$\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0177\3\2\2\2\u0174"+
		"\u0175\7K\2\2\u0175\u0177\5F$\2\u0176\u016f\3\2\2\2\u0176\u0174\3\2\2"+
		"\2\u0177I\3\2\2\2\u0178\u0179\t\f\2\2\u0179K\3\2\2\2\u017a\u017b\7L\2"+
		"\2\u017bM\3\2\2\2\u017c\u017d\t\r\2\2\u017dO\3\2\2\2\u017e\u017f\t\16"+
		"\2\2\u017fQ\3\2\2\2\u0180\u0181\7V\2\2\u0181S\3\2\2\2\u0182\u018b\5F$"+
		"\2\u0183\u018b\5H%\2\u0184\u018b\5J&\2\u0185\u018b\5L\'\2\u0186\u018b"+
		"\5P)\2\u0187\u018b\5R*\2\u0188\u018b\5N(\2\u0189\u018b\7Q\2\2\u018a\u0182"+
		"\3\2\2\2\u018a\u0183\3\2\2\2\u018a\u0184\3\2\2\2\u018a\u0185\3\2\2\2\u018a"+
		"\u0186\3\2\2\2\u018a\u0187\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u0189\3\2"+
		"\2\2\u018b\u018c\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"U\3\2\2\2\u018e\u018f\7\4\2\2\u018f\u0190\7\3\2\2\u0190W\3\2\2\2\u0191"+
		"\u0192\7\7\2\2\u0192\u0193\7\3\2\2\u0193Y\3\2\2\2\u0194\u0195\7\n\2\2"+
		"\u0195\u0196\7\3\2\2\u0196[\3\2\2\2\u0197\u0198\7\5\2\2\u0198\u0199\7"+
		"\3\2\2\u0199]\3\2\2\2\u019a\u019b\7\t\2\2\u019b\u019c\7\3\2\2\u019c_\3"+
		"\2\2\2\u019d\u01a7\7\t\2\2\u019e\u01a7\7\7\2\2\u019f\u01a7\7\n\2\2\u01a0"+
		"\u01a7\7\4\2\2\u01a1\u01a7\5V,\2\u01a2\u01a7\5X-\2\u01a3\u01a7\5Z.\2\u01a4"+
		"\u01a7\5\\/\2\u01a5\u01a7\5^\60\2\u01a6\u019d\3\2\2\2\u01a6\u019e\3\2"+
		"\2\2\u01a6\u019f\3\2\2\2\u01a6\u01a0\3\2\2\2\u01a6\u01a1\3\2\2\2\u01a6"+
		"\u01a2\3\2\2\2\u01a6\u01a3\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2"+
		"\2\2\u01a7a\3\2\2\2\u01a8\u01a9\t\17\2\2\u01a9c\3\2\2\2\u01aa\u01ab\7"+
		".\2\2\u01abe\3\2\2\2\u01ac\u01ad\5`\61\2\u01ad\u01ae\5b\62\2\u01aeg\3"+
		"\2\2\2\u01af\u01b0\5`\61\2\u01b0\u01b1\5d\63\2\u01b1i\3\2\2\2\u01b2\u01b3"+
		"\5`\61\2\u01b3\u01b4\7 \2\2\u01b4k\3\2\2\2\u01b5\u01b6\5`\61\2\u01b6\u01b7"+
		"\7\37\2\2\u01b7m\3\2\2\2\u01b8\u01b9\7\b\2\2\u01b9\u01ba\t\20\2\2\u01ba"+
		"o\3\2\2\2\u01bb\u01bc\7\5\2\2\u01bc\u01bd\7+\2\2\u01bd\u01bf\3\2\2\2\u01be"+
		"\u01c0\5<\37\2\u01bf\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01bf\3\2"+
		"\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\7\5\2\2\u01c4"+
		"\u01c5\7,\2\2\u01c5q\3\2\2\2\u01c6\u01c7\7\t\2\2\u01c7\u01c8\7+\2\2\u01c8"+
		"\u01ca\3\2\2\2\u01c9\u01cb\5<\37\2\u01ca\u01c9\3\2\2\2\u01cb\u01cc\3\2"+
		"\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01cf\7\t\2\2\u01cf\u01d0\7,\2\2\u01d0s\3\2\2\2\u01d1\u01d2\7\n\2\2\u01d2"+
		"\u01d3\7+\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01d6\5<\37\2\u01d5\u01d4\3\2"+
		"\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01da\7\n\2\2\u01da\u01db\7,\2\2\u01dbu\3\2\2\2\u01dc"+
		"\u01e0\5n8\2\u01dd\u01e1\5p9\2\u01de\u01e1\5r:\2\u01df\u01e1\5t;\2\u01e0"+
		"\u01dd\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01df\3\2\2\2\u01e1w\3\2\2\2"+
		"\u01e2\u01e3\t\21\2\2\u01e3\u01f0\7+\2\2\u01e4\u01e6\t\22\2\2\u01e5\u01e4"+
		"\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01f0\7%\2\2\u01e8"+
		"\u01e9\7\5\2\2\u01e9\u01ec\7$\2\2\u01ea\u01ec\7.\2\2\u01eb\u01e8\3\2\2"+
		"\2\u01eb\u01ea\3\2\2\2\u01ec\u01f0\3\2\2\2\u01ed\u01f0\5\b\5\2\u01ee\u01f0"+
		"\5f\64\2\u01ef\u01e2\3\2\2\2\u01ef\u01e5\3\2\2\2\u01ef\u01eb\3\2\2\2\u01ef"+
		"\u01ed\3\2\2\2\u01ef\u01ee\3\2\2\2\u01f0y\3\2\2\2\u01f1\u01fc\7\37\2\2"+
		"\u01f2\u01fc\7 \2\2\u01f3\u01fc\7!\2\2\u01f4\u01f7\7\"\2\2\u01f5\u01f6"+
		"\7\"\2\2\u01f6\u01f8\7\"\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\u01fc\3\2\2\2\u01f9\u01fc\7#\2\2\u01fa\u01fc\7%\2\2\u01fb\u01f1\3\2\2"+
		"\2\u01fb\u01f2\3\2\2\2\u01fb\u01f3\3\2\2\2\u01fb\u01f4\3\2\2\2\u01fb\u01f9"+
		"\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fc\u020a\3\2\2\2\u01fd\u01fe\t\21\2\2"+
		"\u01fe\u020a\7,\2\2\u01ff\u0201\t\22\2\2\u0200\u01ff\3\2\2\2\u0200\u0201"+
		"\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u020a\7&\2\2\u0203\u0204\7\5\2\2\u0204"+
		"\u0207\7$\2\2\u0205\u0207\7.\2\2\u0206\u0203\3\2\2\2\u0206\u0205\3\2\2"+
		"\2\u0207\u020a\3\2\2\2\u0208\u020a\5h\65\2\u0209\u01fb\3\2\2\2\u0209\u01fd"+
		"\3\2\2\2\u0209\u0200\3\2\2\2\u0209\u0206\3\2\2\2\u0209\u0208\3\2\2\2\u020a"+
		"{\3\2\2\2\65\177\u0083\u0089\u008e\u0095\u009a\u009f\u00a5\u00aa\u00ac"+
		"\u00ae\u00b0\u00b4\u00ba\u00c2\u00c6\u00de\u00e2\u00e4\u00f5\u0112\u0117"+
		"\u011d\u0134\u013a\u013f\u0144\u014c\u0150\u0152\u015d\u0165\u0167\u016d"+
		"\u0172\u0176\u018a\u018c\u01a6\u01c1\u01cc\u01d7\u01e0\u01e5\u01eb\u01ef"+
		"\u01f7\u01fb\u0200\u0206\u0209";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}