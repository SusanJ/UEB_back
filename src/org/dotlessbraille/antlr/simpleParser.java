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
		ILC456=16, BESF=17, CHSF=18, SHSF=19, STSF=20, LETTERK=21, MOST_LETTERS=22, 
		DOT2=23, DOTS23=24, DOTS25=25, DOTS256=26, DOTS235=27, DOTS2356=28, DOTS236=29, 
		DOTS356=30, LOWER_ROOT=31, DOTS34=32, DOTS36=33, DOTS126=34, DOTS345=35, 
		DOTS346=36, DOT3=37, DOTS146=38, DOTS156=39, AND=40, FOR=41, OF=42, THE=43, 
		WITH=44, DOTS16=45, DOTS1456=46, DOTS1256=47, ROOT=48, SPACE=49, NEWLINE=50, 
		INK_INFO=51, LETTERA=52, LETTERB=53, UPDIGS=54, START_DIS=55, END_DIS=56, 
		NEM0=57, NEM1=58, NEM2=59, NEM3=60, NEM4=61, NEM5=62, NEM_BASELINE=63, 
		NEM_DECPT=64, NEM_EQUALS=65, NEM_FACTORIAL=66, NEM_MINUS=67, NEM_NEWLINE=68, 
		NEM_PLUS=69, NEM_SPACE=70, NEM_SUPER=71, NEM_SUB=72, NEM_INTEGRAL=73, 
		NEM_OFENCE=74, NEM_CFENCE=75, NEM_VBAR=76, LC_ID=77, ANOTHER_SPACE=78, 
		CAP_ZED=79, LATIN_LETTER=80, FUN_NAME=81;
	public static final int
		RULE_text = 0, RULE_line = 1, RULE_capsWordInd = 2, RULE_capsPassageInd = 3, 
		RULE_rootlessToken = 4, RULE_nemethStartDisplay = 5, RULE_nemethEndDisplay = 6, 
		RULE_nemethStartInline = 7, RULE_nemethEndInline = 8, RULE_item = 9, RULE_space = 10, 
		RULE_hyphen = 11, RULE_dash = 12, RULE_long_dash = 13, RULE_separator = 14, 
		RULE_trailingSep = 15, RULE_roots = 16, RULE_letters = 17, RULE_saLetters = 18, 
		RULE_ucLetters = 19, RULE_prefix = 20, RULE_largeWords = 21, RULE_initLetCons = 22, 
		RULE_strong_ws = 23, RULE_shortForms = 24, RULE_standingAlone = 25, RULE_pr_token = 26, 
		RULE_updigs = 27, RULE_numspacedig = 28, RULE_numind = 29, RULE_numfrag = 30, 
		RULE_nemInteger = 31, RULE_nemReal = 32, RULE_nemOp = 33, RULE_nemComp = 34, 
		RULE_nemId = 35, RULE_nemOGroup = 36, RULE_nemCGroup = 37, RULE_nemSyms = 38, 
		RULE_d4_hash = 39, RULE_d45_hash = 40, RULE_d456_hash = 41, RULE_d5_hash = 42, 
		RULE_d46_hash = 43, RULE_tfPrefix = 44, RULE_tfStartRoot = 45, RULE_tfTermRoot = 46, 
		RULE_tfStartIndicator = 47, RULE_tfTermIndicator = 48, RULE_tfSymbolInd = 49, 
		RULE_tfWordInd = 50, RULE_subsup = 51, RULE_encl1 = 52, RULE_encl2 = 53, 
		RULE_encl3 = 54, RULE_scrip = 55, RULE_preAlone = 56, RULE_postAlone = 57;
	public static final String[] ruleNames = {
		"text", "line", "capsWordInd", "capsPassageInd", "rootlessToken", "nemethStartDisplay", 
		"nemethEndDisplay", "nemethStartInline", "nemethEndInline", "item", "space", 
		"hyphen", "dash", "long_dash", "separator", "trailingSep", "roots", "letters", 
		"saLetters", "ucLetters", "prefix", "largeWords", "initLetCons", "strong_ws", 
		"shortForms", "standingAlone", "pr_token", "updigs", "numspacedig", "numind", 
		"numfrag", "nemInteger", "nemReal", "nemOp", "nemComp", "nemId", "nemOGroup", 
		"nemCGroup", "nemSyms", "d4_hash", "d45_hash", "d456_hash", "d5_hash", 
		"d46_hash", "tfPrefix", "tfStartRoot", "tfTermRoot", "tfStartIndicator", 
		"tfTermIndicator", "tfSymbolInd", "tfWordInd", "subsup", "encl1", "encl2", 
		"encl3", "scrip", "preAlone", "postAlone"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'k'", null, null, 
		null, "'3'", null, "'6'", "'7'", "'8'", null, null, null, null, null, 
		null, null, "'''", null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "'a'", "'b'", null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "'Z'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DOTS3456", "DOT4", "DOT5", "DOT6", "DOTS45", "DOTS56", "DOTS46", 
		"DOTS456", "FLC46", "FLC56", "DOTLOC", "PERCENT", "SEVENTH_TDS", "ILC5", 
		"ILC45", "ILC456", "BESF", "CHSF", "SHSF", "STSF", "LETTERK", "MOST_LETTERS", 
		"DOT2", "DOTS23", "DOTS25", "DOTS256", "DOTS235", "DOTS2356", "DOTS236", 
		"DOTS356", "LOWER_ROOT", "DOTS34", "DOTS36", "DOTS126", "DOTS345", "DOTS346", 
		"DOT3", "DOTS146", "DOTS156", "AND", "FOR", "OF", "THE", "WITH", "DOTS16", 
		"DOTS1456", "DOTS1256", "ROOT", "SPACE", "NEWLINE", "INK_INFO", "LETTERA", 
		"LETTERB", "UPDIGS", "START_DIS", "END_DIS", "NEM0", "NEM1", "NEM2", "NEM3", 
		"NEM4", "NEM5", "NEM_BASELINE", "NEM_DECPT", "NEM_EQUALS", "NEM_FACTORIAL", 
		"NEM_MINUS", "NEM_NEWLINE", "NEM_PLUS", "NEM_SPACE", "NEM_SUPER", "NEM_SUB", 
		"NEM_INTEGRAL", "NEM_OFENCE", "NEM_CFENCE", "NEM_VBAR", "LC_ID", "ANOTHER_SPACE", 
		"CAP_ZED", "LATIN_LETTER", "FUN_NAME"
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
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				line();
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOTS3456) | (1L << DOT4) | (1L << DOT5) | (1L << DOT6) | (1L << DOTS45) | (1L << DOTS56) | (1L << DOTS46) | (1L << DOTS456) | (1L << ILC5) | (1L << ILC45) | (1L << ILC456) | (1L << BESF) | (1L << CHSF) | (1L << SHSF) | (1L << STSF) | (1L << LETTERK) | (1L << MOST_LETTERS) | (1L << DOT2) | (1L << DOTS23) | (1L << DOTS25) | (1L << DOTS256) | (1L << DOTS235) | (1L << DOTS2356) | (1L << DOTS236) | (1L << LOWER_ROOT) | (1L << DOTS34) | (1L << DOTS36) | (1L << DOTS126) | (1L << DOTS345) | (1L << DOTS346) | (1L << DOT3) | (1L << DOTS146) | (1L << DOTS156) | (1L << AND) | (1L << FOR) | (1L << OF) | (1L << THE) | (1L << WITH) | (1L << DOTS16) | (1L << DOTS1456) | (1L << DOTS1256) | (1L << ROOT) | (1L << SPACE) | (1L << NEWLINE) | (1L << LETTERA) | (1L << LETTERB) | (1L << UPDIGS) | (1L << START_DIS) | (1L << END_DIS))) != 0) );
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
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case START_DIS:
					{
					setState(121);
					nemethStartDisplay();
					}
					break;
				case END_DIS:
					{
					setState(122);
					nemethEndDisplay();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(125);
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
				setState(129);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case START_DIS:
					{
					setState(127);
					nemethStartInline();
					}
					break;
				case END_DIS:
					{
					setState(128);
					nemethEndInline();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				{
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(131);
					nemSyms();
					}
					}
					setState(134); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (NEM0 - 57)) | (1L << (NEM1 - 57)) | (1L << (NEM2 - 57)) | (1L << (NEM3 - 57)) | (1L << (NEM4 - 57)) | (1L << (NEM5 - 57)) | (1L << (NEM_DECPT - 57)) | (1L << (NEM_EQUALS - 57)) | (1L << (NEM_FACTORIAL - 57)) | (1L << (NEM_MINUS - 57)) | (1L << (NEM_PLUS - 57)) | (1L << (NEM_SPACE - 57)) | (1L << (NEM_OFENCE - 57)) | (1L << (NEM_CFENCE - 57)) | (1L << (NEM_VBAR - 57)) | (1L << (LC_ID - 57)) | (1L << (LATIN_LETTER - 57)))) != 0) );
				}
				setState(136);
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
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(138);
					space();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					{
					setState(144);
					standingAlone();
					}
					}
					break;
				case 2:
					{
					{
					setState(151); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(151);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
							case 1:
								{
								{
								setState(145);
								numfrag();
								}
								}
								break;
							case 2:
								{
								setState(147); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(146);
										item();
										}
										}
										break;
									default:
										throw new NoViableAltException(this);
									}
									setState(149); 
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
								} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
								}
								break;
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(153); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(158); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(157);
								separator();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(160); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(173);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
						case 1:
							{
							{
							setState(162);
							standingAlone();
							}
							}
							break;
						case 2:
							{
							{
							setState(169); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									setState(169);
									_errHandler.sync(this);
									switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
									case 1:
										{
										{
										setState(163);
										numfrag();
										}
										}
										break;
									case 2:
										{
										setState(165); 
										_errHandler.sync(this);
										_alt = 1;
										do {
											switch (_alt) {
											case 1:
												{
												{
												setState(164);
												item();
												}
												}
												break;
											default:
												throw new NoViableAltException(this);
											}
											setState(167); 
											_errHandler.sync(this);
											_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
										} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
										}
										break;
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(171); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							}
							}
							break;
						}
						}
						} 
					}
					setState(179);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT5) | (1L << DOT6) | (1L << DOTS36) | (1L << SPACE))) != 0)) {
					{
					{
					setState(180);
					trailingSep();
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(186);
				match(NEWLINE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(188);
					space();
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(194);
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
			setState(197);
			match(DOT6);
			}
			{
			setState(198);
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
			setState(200);
			match(DOT6);
			}
			{
			setState(201);
			match(DOT6);
			}
			{
			setState(202);
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
			setState(204);
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
			setState(206);
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
			setState(208);
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
			setState(210);
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
			setState(212);
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
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(214);
				capsPassageInd();
				}
				break;
			case 2:
				{
				setState(215);
				capsWordInd();
				}
				break;
			case 3:
				{
				setState(216);
				rootlessToken();
				}
				break;
			case 4:
				{
				setState(217);
				pr_token();
				}
				break;
			case 5:
				{
				setState(218);
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
		enterRule(_localctx, 20, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
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
		enterRule(_localctx, 22, RULE_hyphen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
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
		enterRule(_localctx, 24, RULE_dash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(DOT6);
			setState(226);
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
		enterRule(_localctx, 26, RULE_long_dash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(DOT5);
			setState(229);
			match(DOT6);
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
		enterRule(_localctx, 28, RULE_separator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPACE:
				{
				setState(232);
				space();
				}
				break;
			case DOTS36:
				{
				setState(233);
				hyphen();
				}
				break;
			case DOT6:
				{
				setState(234);
				dash();
				}
				break;
			case DOT5:
				{
				setState(235);
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
		enterRule(_localctx, 30, RULE_trailingSep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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
		public TerminalNode DOTS36() { return getToken(simpleParser.DOTS36, 0); }
		public TerminalNode LOWER_ROOT() { return getToken(simpleParser.LOWER_ROOT, 0); }
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
		public TerminalNode ROOT() { return getToken(simpleParser.ROOT, 0); }
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
		enterRule(_localctx, 32, RULE_roots);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOTS36:
				{
				setState(240);
				match(DOTS36);
				}
				break;
			case LOWER_ROOT:
				{
				setState(241);
				match(LOWER_ROOT);
				}
				break;
			case DOT2:
				{
				setState(242);
				match(DOT2);
				}
				break;
			case DOTS23:
				{
				setState(243);
				match(DOTS23);
				}
				break;
			case DOTS25:
				{
				setState(244);
				match(DOTS25);
				}
				break;
			case DOTS256:
				{
				setState(245);
				match(DOTS256);
				}
				break;
			case DOTS235:
				{
				setState(246);
				match(DOTS235);
				}
				break;
			case DOTS236:
				{
				setState(247);
				match(DOTS236);
				}
				break;
			case DOTS2356:
				{
				setState(248);
				match(DOTS2356);
				}
				break;
			case DOTS34:
				{
				setState(249);
				match(DOTS34);
				}
				break;
			case DOTS126:
				{
				setState(250);
				match(DOTS126);
				}
				break;
			case DOTS345:
				{
				setState(251);
				match(DOTS345);
				}
				break;
			case DOTS346:
				{
				setState(252);
				match(DOTS346);
				}
				break;
			case DOT3:
				{
				setState(253);
				match(DOT3);
				}
				break;
			case ROOT:
				{
				setState(254);
				match(ROOT);
				}
				break;
			case AND:
			case FOR:
			case OF:
			case THE:
			case WITH:
				{
				setState(255);
				largeWords();
				}
				break;
			case DOTS16:
				{
				setState(256);
				match(DOTS16);
				}
				break;
			case DOTS1456:
				{
				setState(257);
				match(DOTS1456);
				}
				break;
			case DOTS1256:
				{
				setState(258);
				match(DOTS1256);
				}
				break;
			case DOTS146:
				{
				setState(259);
				match(DOTS146);
				}
				break;
			case DOTS156:
				{
				setState(260);
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
		enterRule(_localctx, 34, RULE_letters);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTERA:
			case LETTERB:
			case UPDIGS:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				updigs();
				}
				break;
			case MOST_LETTERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(MOST_LETTERS);
				}
				break;
			case LETTERK:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
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
		enterRule(_localctx, 36, RULE_saLetters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(268);
			letters();
			}
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTERK) | (1L << MOST_LETTERS) | (1L << LETTERA) | (1L << LETTERB) | (1L << UPDIGS))) != 0)) {
				{
				{
				setState(269);
				letters();
				}
				}
				setState(274);
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
		enterRule(_localctx, 38, RULE_ucLetters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(DOT6);
			{
			setState(276);
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
		public TerminalNode DOTS3456() { return getToken(simpleParser.DOTS3456, 0); }
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
		enterRule(_localctx, 40, RULE_prefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOTS3456) | (1L << DOT4) | (1L << DOT5) | (1L << DOT6) | (1L << DOTS45) | (1L << DOTS56) | (1L << DOTS46) | (1L << DOTS456))) != 0)) ) {
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
		enterRule(_localctx, 42, RULE_largeWords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
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
		enterRule(_localctx, 44, RULE_initLetCons);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
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
			setState(284);
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
			setState(286);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BESF) | (1L << CHSF) | (1L << SHSF) | (1L << STSF))) != 0)) ) {
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
		enterRule(_localctx, 50, RULE_standingAlone);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(288);
					preAlone();
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			{
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(294);
				capsPassageInd();
				}
				break;
			case 2:
				{
				setState(295);
				capsWordInd();
				}
				break;
			case 3:
				{
				setState(296);
				match(DOT6);
				}
				break;
			}
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOTS34:
			case DOTS146:
			case DOTS156:
			case DOTS16:
			case DOTS1456:
			case DOTS1256:
				{
				setState(299);
				strong_ws();
				}
				break;
			case LETTERK:
			case MOST_LETTERS:
			case LETTERA:
			case LETTERB:
			case UPDIGS:
				{
				setState(300);
				saLetters();
				}
				break;
			case BESF:
			case CHSF:
			case SHSF:
			case STSF:
				{
				setState(301);
				shortForms();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(304);
					postAlone();
					}
					} 
				}
				setState(309);
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
		enterRule(_localctx, 52, RULE_pr_token);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(310);
				largeWords();
				}
				break;
			case 2:
				{
				setState(311);
				initLetCons();
				}
				break;
			case 3:
				{
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOTS3456) | (1L << DOT4) | (1L << DOT5) | (1L << DOT6) | (1L << DOTS45) | (1L << DOTS56) | (1L << DOTS46) | (1L << DOTS456))) != 0)) {
					{
					setState(312);
					prefix();
					}
				}

				setState(317);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT2:
				case DOTS23:
				case DOTS25:
				case DOTS256:
				case DOTS235:
				case DOTS2356:
				case DOTS236:
				case LOWER_ROOT:
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
				case ROOT:
					{
					setState(315);
					roots();
					}
					break;
				case LETTERK:
				case MOST_LETTERS:
				case LETTERA:
				case LETTERB:
				case UPDIGS:
					{
					setState(316);
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
		enterRule(_localctx, 54, RULE_updigs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
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
		enterRule(_localctx, 56, RULE_numspacedig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(323);
			match(DOT5);
			setState(324);
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
		enterRule(_localctx, 58, RULE_numind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(326);
			match(DOTS3456);
			}
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTERA:
			case LETTERB:
			case UPDIGS:
				{
				setState(327);
				updigs();
				}
				break;
			case DOT2:
				{
				setState(328);
				match(DOT2);
				}
				break;
			case DOTS256:
				{
				setState(329);
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
		enterRule(_localctx, 60, RULE_numfrag);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			numind();
			setState(340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(338);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LETTERA:
					case LETTERB:
					case UPDIGS:
						{
						setState(333);
						updigs();
						}
						break;
					case DOT2:
						{
						setState(334);
						match(DOT2);
						}
						break;
					case DOTS256:
						{
						setState(335);
						match(DOTS256);
						}
						break;
					case DOTS34:
						{
						setState(336);
						match(DOTS34);
						}
						break;
					case DOT5:
						{
						setState(337);
						numspacedig();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(342);
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
		enterRule(_localctx, 62, RULE_nemInteger);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(344); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(343);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEM0) | (1L << NEM1) | (1L << NEM2) | (1L << NEM3) | (1L << NEM4) | (1L << NEM5))) != 0)) ) {
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
				setState(346); 
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
		enterRule(_localctx, 64, RULE_nemReal);
		try {
			setState(355);
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
				setState(348);
				nemInteger();
				setState(349);
				match(NEM_DECPT);
				setState(351);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(350);
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
				setState(353);
				match(NEM_DECPT);
				setState(354);
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
		enterRule(_localctx, 66, RULE_nemOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEM_FACTORIAL - 66)) | (1L << (NEM_MINUS - 66)) | (1L << (NEM_PLUS - 66)))) != 0)) ) {
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
		enterRule(_localctx, 68, RULE_nemComp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
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
		enterRule(_localctx, 70, RULE_nemId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
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
		enterRule(_localctx, 72, RULE_nemOGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
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
		enterRule(_localctx, 74, RULE_nemCGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
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
		enterRule(_localctx, 76, RULE_nemSyms);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(375); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(375);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(367);
						nemInteger();
						}
						break;
					case 2:
						{
						setState(368);
						nemReal();
						}
						break;
					case 3:
						{
						setState(369);
						nemOp();
						}
						break;
					case 4:
						{
						setState(370);
						nemComp();
						}
						break;
					case 5:
						{
						setState(371);
						nemOGroup();
						}
						break;
					case 6:
						{
						setState(372);
						nemCGroup();
						}
						break;
					case 7:
						{
						setState(373);
						nemId();
						}
						break;
					case 8:
						{
						setState(374);
						match(NEM_SPACE);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(377); 
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
		enterRule(_localctx, 78, RULE_d4_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(DOT4);
			setState(380);
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
		enterRule(_localctx, 80, RULE_d45_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(DOTS45);
			setState(383);
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
		enterRule(_localctx, 82, RULE_d456_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(DOTS456);
			setState(386);
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
		enterRule(_localctx, 84, RULE_d5_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(DOT5);
			setState(389);
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
		enterRule(_localctx, 86, RULE_d46_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(DOTS46);
			setState(392);
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
		enterRule(_localctx, 88, RULE_tfPrefix);
		try {
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(DOTS46);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(DOTS45);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				match(DOTS456);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(397);
				match(DOT4);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(398);
				d4_hash();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(399);
				d45_hash();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(400);
				d456_hash();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(401);
				d5_hash();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(402);
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
		enterRule(_localctx, 90, RULE_tfStartRoot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
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
		enterRule(_localctx, 92, RULE_tfTermRoot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
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
		enterRule(_localctx, 94, RULE_tfStartIndicator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(409);
			tfPrefix();
			}
			{
			setState(410);
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
		enterRule(_localctx, 96, RULE_tfTermIndicator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(412);
			tfPrefix();
			}
			{
			setState(413);
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
		enterRule(_localctx, 98, RULE_tfSymbolInd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(415);
			tfPrefix();
			setState(416);
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
		enterRule(_localctx, 100, RULE_tfWordInd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(418);
			tfPrefix();
			setState(419);
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
		public TerminalNode DOTS56() { return getToken(simpleParser.DOTS56, 0); }
		public TerminalNode LOWER_ROOT() { return getToken(simpleParser.LOWER_ROOT, 0); }
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
		enterRule(_localctx, 102, RULE_subsup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(421);
			match(DOTS56);
			}
			{
			setState(422);
			match(LOWER_ROOT);
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
		enterRule(_localctx, 104, RULE_encl1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(424);
			match(DOT5);
			setState(425);
			match(DOTS126);
			}
			setState(428); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(427);
					pr_token();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(430); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			{
			setState(432);
			match(DOT5);
			setState(433);
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
		enterRule(_localctx, 106, RULE_encl2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(435);
			match(DOTS46);
			setState(436);
			match(DOTS126);
			}
			setState(439); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(438);
					pr_token();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(441); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			{
			setState(443);
			match(DOTS46);
			setState(444);
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
		enterRule(_localctx, 108, RULE_encl3);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(446);
			match(DOTS456);
			setState(447);
			match(DOTS126);
			}
			setState(450); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(449);
					pr_token();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(452); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			{
			setState(454);
			match(DOTS456);
			setState(455);
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
		enterRule(_localctx, 110, RULE_scrip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			subsup();
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT5:
				{
				setState(458);
				encl1();
				}
				break;
			case DOTS46:
				{
				setState(459);
				encl2();
				}
				break;
			case DOTS456:
				{
				setState(460);
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
		enterRule(_localctx, 112, RULE_preAlone);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				{
				setState(463);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT5) | (1L << DOTS46) | (1L << DOTS456))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(464);
				match(DOTS126);
				}
				}
				break;
			case 2:
				{
				{
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT6) | (1L << DOTS45) | (1L << DOTS456))) != 0)) {
					{
					setState(465);
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

				setState(468);
				match(DOTS236);
				}
				}
				break;
			case 3:
				{
				setState(472);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT5:
					{
					setState(469);
					match(DOT5);
					setState(470);
					match(DOTS2356);
					}
					break;
				case DOT3:
					{
					setState(471);
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
				setState(474);
				capsPassageInd();
				}
				break;
			case 5:
				{
				setState(475);
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
		enterRule(_localctx, 114, RULE_postAlone);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(488);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT2:
					{
					setState(478);
					match(DOT2);
					}
					break;
				case DOTS23:
					{
					setState(479);
					match(DOTS23);
					}
					break;
				case DOTS25:
					{
					setState(480);
					match(DOTS25);
					}
					break;
				case DOTS256:
					{
					setState(481);
					match(DOTS256);
					setState(484);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						setState(482);
						match(DOTS256);
						setState(483);
						match(DOTS256);
						}
						break;
					}
					}
					break;
				case DOTS235:
					{
					setState(486);
					match(DOTS235);
					}
					break;
				case DOTS236:
					{
					setState(487);
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
				setState(490);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT5) | (1L << DOTS46) | (1L << DOTS456))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(491);
				match(DOTS345);
				}
				}
				break;
			case 3:
				{
				{
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT6) | (1L << DOTS45) | (1L << DOTS456))) != 0)) {
					{
					setState(492);
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

				setState(495);
				match(DOTS356);
				}
				}
				break;
			case 4:
				{
				setState(499);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT5:
					{
					setState(496);
					match(DOT5);
					setState(497);
					match(DOTS2356);
					}
					break;
				case DOT3:
					{
					setState(498);
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
				setState(501);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3S\u01fb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\6\2x\n\2"+
		"\r\2\16\2y\3\3\3\3\5\3~\n\3\3\3\3\3\3\3\3\3\5\3\u0084\n\3\3\3\6\3\u0087"+
		"\n\3\r\3\16\3\u0088\3\3\3\3\3\3\7\3\u008e\n\3\f\3\16\3\u0091\13\3\3\3"+
		"\3\3\3\3\6\3\u0096\n\3\r\3\16\3\u0097\6\3\u009a\n\3\r\3\16\3\u009b\5\3"+
		"\u009e\n\3\3\3\6\3\u00a1\n\3\r\3\16\3\u00a2\3\3\3\3\3\3\6\3\u00a8\n\3"+
		"\r\3\16\3\u00a9\6\3\u00ac\n\3\r\3\16\3\u00ad\5\3\u00b0\n\3\7\3\u00b2\n"+
		"\3\f\3\16\3\u00b5\13\3\3\3\7\3\u00b8\n\3\f\3\16\3\u00bb\13\3\3\3\3\3\3"+
		"\3\7\3\u00c0\n\3\f\3\16\3\u00c3\13\3\3\3\5\3\u00c6\n\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u00de\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\5\20\u00ef\n\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0108\n\22\3\23\3\23\3\23\5\23\u010d\n\23\3\24\3"+
		"\24\7\24\u0111\n\24\f\24\16\24\u0114\13\24\3\25\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\7\33\u0124\n\33\f\33\16\33"+
		"\u0127\13\33\3\33\3\33\3\33\5\33\u012c\n\33\3\33\3\33\3\33\5\33\u0131"+
		"\n\33\3\33\7\33\u0134\n\33\f\33\16\33\u0137\13\33\3\34\3\34\3\34\5\34"+
		"\u013c\n\34\3\34\3\34\5\34\u0140\n\34\5\34\u0142\n\34\3\35\3\35\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\5\37\u014d\n\37\3 \3 \3 \3 \3 \3 \7 \u0155"+
		"\n \f \16 \u0158\13 \3!\6!\u015b\n!\r!\16!\u015c\3\"\3\"\3\"\5\"\u0162"+
		"\n\"\3\"\3\"\5\"\u0166\n\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\6(\u017a\n(\r(\16(\u017b\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3"+
		",\3,\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0196\n.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3"+
		"\65\3\66\3\66\3\66\3\66\6\66\u01af\n\66\r\66\16\66\u01b0\3\66\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\6\67\u01ba\n\67\r\67\16\67\u01bb\3\67\3\67\3\67\3"+
		"8\38\38\38\68\u01c5\n8\r8\168\u01c6\38\38\38\39\39\39\39\59\u01d0\n9\3"+
		":\3:\3:\5:\u01d5\n:\3:\3:\3:\3:\5:\u01db\n:\3:\3:\5:\u01df\n:\3;\3;\3"+
		";\3;\3;\3;\5;\u01e7\n;\3;\3;\5;\u01eb\n;\3;\3;\3;\5;\u01f0\n;\3;\3;\3"+
		";\3;\5;\u01f6\n;\3;\5;\u01f9\n;\3;\2\2<\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt\2\20\4"+
		"\2\64\64FF\3\2\3\n\3\2*.\3\2\20\22\5\2\"\"()/\61\3\2\23\26\3\2\668\3\2"+
		";@\4\2DEGG\4\2OORR\4\2LLNN\4\2\31\32\36\36\4\2\5\5\t\n\4\2\6\7\n\n\2\u022e"+
		"\2w\3\2\2\2\4\u00c5\3\2\2\2\6\u00c7\3\2\2\2\b\u00ca\3\2\2\2\n\u00ce\3"+
		"\2\2\2\f\u00d0\3\2\2\2\16\u00d2\3\2\2\2\20\u00d4\3\2\2\2\22\u00d6\3\2"+
		"\2\2\24\u00dd\3\2\2\2\26\u00df\3\2\2\2\30\u00e1\3\2\2\2\32\u00e3\3\2\2"+
		"\2\34\u00e6\3\2\2\2\36\u00ee\3\2\2\2 \u00f0\3\2\2\2\"\u0107\3\2\2\2$\u010c"+
		"\3\2\2\2&\u010e\3\2\2\2(\u0115\3\2\2\2*\u0118\3\2\2\2,\u011a\3\2\2\2."+
		"\u011c\3\2\2\2\60\u011e\3\2\2\2\62\u0120\3\2\2\2\64\u0125\3\2\2\2\66\u0141"+
		"\3\2\2\28\u0143\3\2\2\2:\u0145\3\2\2\2<\u0148\3\2\2\2>\u014e\3\2\2\2@"+
		"\u015a\3\2\2\2B\u0165\3\2\2\2D\u0167\3\2\2\2F\u0169\3\2\2\2H\u016b\3\2"+
		"\2\2J\u016d\3\2\2\2L\u016f\3\2\2\2N\u0179\3\2\2\2P\u017d\3\2\2\2R\u0180"+
		"\3\2\2\2T\u0183\3\2\2\2V\u0186\3\2\2\2X\u0189\3\2\2\2Z\u0195\3\2\2\2\\"+
		"\u0197\3\2\2\2^\u0199\3\2\2\2`\u019b\3\2\2\2b\u019e\3\2\2\2d\u01a1\3\2"+
		"\2\2f\u01a4\3\2\2\2h\u01a7\3\2\2\2j\u01aa\3\2\2\2l\u01b5\3\2\2\2n\u01c0"+
		"\3\2\2\2p\u01cb\3\2\2\2r\u01de\3\2\2\2t\u01f8\3\2\2\2vx\5\4\3\2wv\3\2"+
		"\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\3\3\2\2\2{~\5\f\7\2|~\5\16\b\2}{\3"+
		"\2\2\2}|\3\2\2\2~\177\3\2\2\2\177\u0080\t\2\2\2\u0080\u00c6\3\2\2\2\u0081"+
		"\u0084\5\20\t\2\u0082\u0084\5\22\n\2\u0083\u0081\3\2\2\2\u0083\u0082\3"+
		"\2\2\2\u0084\u0086\3\2\2\2\u0085\u0087\5N(\2\u0086\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008b\t\2\2\2\u008b\u00c6\3\2\2\2\u008c\u008e\5\26\f\2\u008d"+
		"\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u009d\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u009e\5\64\33\2\u0093"+
		"\u009a\5> \2\u0094\u0096\5\24\13\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099"+
		"\u0093\3\2\2\2\u0099\u0095\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u0092\3\2\2\2\u009d"+
		"\u0099\3\2\2\2\u009e\u00b3\3\2\2\2\u009f\u00a1\5\36\20\2\u00a0\u009f\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00af\3\2\2\2\u00a4\u00b0\5\64\33\2\u00a5\u00ac\5> \2\u00a6\u00a8\5\24"+
		"\13\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a7\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00a4\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0\u00b2\3\2"+
		"\2\2\u00b1\u00a0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b9\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b8\5 "+
		"\21\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\64"+
		"\2\2\u00bd\u00c6\3\2\2\2\u00be\u00c0\5\26\f\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\7\64\2\2\u00c5}\3\2\2\2\u00c5\u0083"+
		"\3\2\2\2\u00c5\u008f\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c6\5\3\2\2\2\u00c7"+
		"\u00c8\7\6\2\2\u00c8\u00c9\7\6\2\2\u00c9\7\3\2\2\2\u00ca\u00cb\7\6\2\2"+
		"\u00cb\u00cc\7\6\2\2\u00cc\u00cd\7\6\2\2\u00cd\t\3\2\2\2\u00ce\u00cf\7"+
		"\b\2\2\u00cf\13\3\2\2\2\u00d0\u00d1\79\2\2\u00d1\r\3\2\2\2\u00d2\u00d3"+
		"\7:\2\2\u00d3\17\3\2\2\2\u00d4\u00d5\79\2\2\u00d5\21\3\2\2\2\u00d6\u00d7"+
		"\7:\2\2\u00d7\23\3\2\2\2\u00d8\u00de\5\b\5\2\u00d9\u00de\5\6\4\2\u00da"+
		"\u00de\5\n\6\2\u00db\u00de\5\66\34\2\u00dc\u00de\5p9\2\u00dd\u00d8\3\2"+
		"\2\2\u00dd\u00d9\3\2\2\2\u00dd\u00da\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00dc\3\2\2\2\u00de\25\3\2\2\2\u00df\u00e0\7\63\2\2\u00e0\27\3\2\2\2"+
		"\u00e1\u00e2\7#\2\2\u00e2\31\3\2\2\2\u00e3\u00e4\7\6\2\2\u00e4\u00e5\7"+
		"#\2\2\u00e5\33\3\2\2\2\u00e6\u00e7\7\5\2\2\u00e7\u00e8\7\6\2\2\u00e8\u00e9"+
		"\7#\2\2\u00e9\35\3\2\2\2\u00ea\u00ef\5\26\f\2\u00eb\u00ef\5\30\r\2\u00ec"+
		"\u00ef\5\32\16\2\u00ed\u00ef\5\34\17\2\u00ee\u00ea\3\2\2\2\u00ee\u00eb"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\37\3\2\2\2\u00f0"+
		"\u00f1\5\36\20\2\u00f1!\3\2\2\2\u00f2\u0108\7#\2\2\u00f3\u0108\7!\2\2"+
		"\u00f4\u0108\7\31\2\2\u00f5\u0108\7\32\2\2\u00f6\u0108\7\33\2\2\u00f7"+
		"\u0108\7\34\2\2\u00f8\u0108\7\35\2\2\u00f9\u0108\7\37\2\2\u00fa\u0108"+
		"\7\36\2\2\u00fb\u0108\7\"\2\2\u00fc\u0108\7$\2\2\u00fd\u0108\7%\2\2\u00fe"+
		"\u0108\7&\2\2\u00ff\u0108\7\'\2\2\u0100\u0108\7\62\2\2\u0101\u0108\5,"+
		"\27\2\u0102\u0108\7/\2\2\u0103\u0108\7\60\2\2\u0104\u0108\7\61\2\2\u0105"+
		"\u0108\7(\2\2\u0106\u0108\7)\2\2\u0107\u00f2\3\2\2\2\u0107\u00f3\3\2\2"+
		"\2\u0107\u00f4\3\2\2\2\u0107\u00f5\3\2\2\2\u0107\u00f6\3\2\2\2\u0107\u00f7"+
		"\3\2\2\2\u0107\u00f8\3\2\2\2\u0107\u00f9\3\2\2\2\u0107\u00fa\3\2\2\2\u0107"+
		"\u00fb\3\2\2\2\u0107\u00fc\3\2\2\2\u0107\u00fd\3\2\2\2\u0107\u00fe\3\2"+
		"\2\2\u0107\u00ff\3\2\2\2\u0107\u0100\3\2\2\2\u0107\u0101\3\2\2\2\u0107"+
		"\u0102\3\2\2\2\u0107\u0103\3\2\2\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0107\u0106\3\2\2\2\u0108#\3\2\2\2\u0109\u010d\58\35\2\u010a\u010d"+
		"\7\30\2\2\u010b\u010d\7\27\2\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2"+
		"\u010c\u010b\3\2\2\2\u010d%\3\2\2\2\u010e\u0112\5$\23\2\u010f\u0111\5"+
		"$\23\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\'\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\7\6\2\2"+
		"\u0116\u0117\5$\23\2\u0117)\3\2\2\2\u0118\u0119\t\3\2\2\u0119+\3\2\2\2"+
		"\u011a\u011b\t\4\2\2\u011b-\3\2\2\2\u011c\u011d\t\5\2\2\u011d/\3\2\2\2"+
		"\u011e\u011f\t\6\2\2\u011f\61\3\2\2\2\u0120\u0121\t\7\2\2\u0121\63\3\2"+
		"\2\2\u0122\u0124\5r:\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123"+
		"\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u012b\3\2\2\2\u0127\u0125\3\2\2\2\u0128"+
		"\u012c\5\b\5\2\u0129\u012c\5\6\4\2\u012a\u012c\7\6\2\2\u012b\u0128\3\2"+
		"\2\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u0130\3\2\2\2\u012d\u0131\5\60\31\2\u012e\u0131\5&\24\2\u012f\u0131\5"+
		"\62\32\2\u0130\u012d\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131"+
		"\u0135\3\2\2\2\u0132\u0134\5t;\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2"+
		"\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\65\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0138\u0142\5,\27\2\u0139\u0142\5.\30\2\u013a\u013c\5*\26\2\u013b"+
		"\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u0140\5\""+
		"\22\2\u013e\u0140\5$\23\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140"+
		"\u0142\3\2\2\2\u0141\u0138\3\2\2\2\u0141\u0139\3\2\2\2\u0141\u013b\3\2"+
		"\2\2\u0142\67\3\2\2\2\u0143\u0144\t\b\2\2\u01449\3\2\2\2\u0145\u0146\7"+
		"\5\2\2\u0146\u0147\58\35\2\u0147;\3\2\2\2\u0148\u014c\7\3\2\2\u0149\u014d"+
		"\58\35\2\u014a\u014d\7\31\2\2\u014b\u014d\7\34\2\2\u014c\u0149\3\2\2\2"+
		"\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d=\3\2\2\2\u014e\u0156\5"+
		"<\37\2\u014f\u0155\58\35\2\u0150\u0155\7\31\2\2\u0151\u0155\7\34\2\2\u0152"+
		"\u0155\7\"\2\2\u0153\u0155\5:\36\2\u0154\u014f\3\2\2\2\u0154\u0150\3\2"+
		"\2\2\u0154\u0151\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155"+
		"\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157?\3\2\2\2"+
		"\u0158\u0156\3\2\2\2\u0159\u015b\t\t\2\2\u015a\u0159\3\2\2\2\u015b\u015c"+
		"\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015dA\3\2\2\2\u015e"+
		"\u015f\5@!\2\u015f\u0161\7B\2\2\u0160\u0162\5@!\2\u0161\u0160\3\2\2\2"+
		"\u0161\u0162\3\2\2\2\u0162\u0166\3\2\2\2\u0163\u0164\7B\2\2\u0164\u0166"+
		"\5@!\2\u0165\u015e\3\2\2\2\u0165\u0163\3\2\2\2\u0166C\3\2\2\2\u0167\u0168"+
		"\t\n\2\2\u0168E\3\2\2\2\u0169\u016a\7C\2\2\u016aG\3\2\2\2\u016b\u016c"+
		"\t\13\2\2\u016cI\3\2\2\2\u016d\u016e\t\f\2\2\u016eK\3\2\2\2\u016f\u0170"+
		"\7M\2\2\u0170M\3\2\2\2\u0171\u017a\5@!\2\u0172\u017a\5B\"\2\u0173\u017a"+
		"\5D#\2\u0174\u017a\5F$\2\u0175\u017a\5J&\2\u0176\u017a\5L\'\2\u0177\u017a"+
		"\5H%\2\u0178\u017a\7H\2\2\u0179\u0171\3\2\2\2\u0179\u0172\3\2\2\2\u0179"+
		"\u0173\3\2\2\2\u0179\u0174\3\2\2\2\u0179\u0175\3\2\2\2\u0179\u0176\3\2"+
		"\2\2\u0179\u0177\3\2\2\2\u0179\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017cO\3\2\2\2\u017d\u017e\7\4\2\2"+
		"\u017e\u017f\7\3\2\2\u017fQ\3\2\2\2\u0180\u0181\7\7\2\2\u0181\u0182\7"+
		"\3\2\2\u0182S\3\2\2\2\u0183\u0184\7\n\2\2\u0184\u0185\7\3\2\2\u0185U\3"+
		"\2\2\2\u0186\u0187\7\5\2\2\u0187\u0188\7\3\2\2\u0188W\3\2\2\2\u0189\u018a"+
		"\7\t\2\2\u018a\u018b\7\3\2\2\u018bY\3\2\2\2\u018c\u0196\7\t\2\2\u018d"+
		"\u0196\7\7\2\2\u018e\u0196\7\n\2\2\u018f\u0196\7\4\2\2\u0190\u0196\5P"+
		")\2\u0191\u0196\5R*\2\u0192\u0196\5T+\2\u0193\u0196\5V,\2\u0194\u0196"+
		"\5X-\2\u0195\u018c\3\2\2\2\u0195\u018d\3\2\2\2\u0195\u018e\3\2\2\2\u0195"+
		"\u018f\3\2\2\2\u0195\u0190\3\2\2\2\u0195\u0191\3\2\2\2\u0195\u0192\3\2"+
		"\2\2\u0195\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196[\3\2\2\2\u0197\u0198"+
		"\t\r\2\2\u0198]\3\2\2\2\u0199\u019a\7\'\2\2\u019a_\3\2\2\2\u019b\u019c"+
		"\5Z.\2\u019c\u019d\5\\/\2\u019da\3\2\2\2\u019e\u019f\5Z.\2\u019f\u01a0"+
		"\5^\60\2\u01a0c\3\2\2\2\u01a1\u01a2\5Z.\2\u01a2\u01a3\7\32\2\2\u01a3e"+
		"\3\2\2\2\u01a4\u01a5\5Z.\2\u01a5\u01a6\7\31\2\2\u01a6g\3\2\2\2\u01a7\u01a8"+
		"\7\b\2\2\u01a8\u01a9\7!\2\2\u01a9i\3\2\2\2\u01aa\u01ab\7\5\2\2\u01ab\u01ac"+
		"\7$\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01af\5\66\34\2\u01ae\u01ad\3\2\2\2"+
		"\u01af\u01b0\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2"+
		"\3\2\2\2\u01b2\u01b3\7\5\2\2\u01b3\u01b4\7%\2\2\u01b4k\3\2\2\2\u01b5\u01b6"+
		"\7\t\2\2\u01b6\u01b7\7$\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01ba\5\66\34\2"+
		"\u01b9\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc"+
		"\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\7\t\2\2\u01be\u01bf\7%\2\2\u01bf"+
		"m\3\2\2\2\u01c0\u01c1\7\n\2\2\u01c1\u01c2\7$\2\2\u01c2\u01c4\3\2\2\2\u01c3"+
		"\u01c5\5\66\34\2\u01c4\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c4\3"+
		"\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\7\n\2\2\u01c9"+
		"\u01ca\7%\2\2\u01cao\3\2\2\2\u01cb\u01cf\5h\65\2\u01cc\u01d0\5j\66\2\u01cd"+
		"\u01d0\5l\67\2\u01ce\u01d0\5n8\2\u01cf\u01cc\3\2\2\2\u01cf\u01cd\3\2\2"+
		"\2\u01cf\u01ce\3\2\2\2\u01d0q\3\2\2\2\u01d1\u01d2\t\16\2\2\u01d2\u01df"+
		"\7$\2\2\u01d3\u01d5\t\17\2\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6\u01df\7\37\2\2\u01d7\u01d8\7\5\2\2\u01d8\u01db\7"+
		"\36\2\2\u01d9\u01db\7\'\2\2\u01da\u01d7\3\2\2\2\u01da\u01d9\3\2\2\2\u01db"+
		"\u01df\3\2\2\2\u01dc\u01df\5\b\5\2\u01dd\u01df\5`\61\2\u01de\u01d1\3\2"+
		"\2\2\u01de\u01d4\3\2\2\2\u01de\u01da\3\2\2\2\u01de\u01dc\3\2\2\2\u01de"+
		"\u01dd\3\2\2\2\u01dfs\3\2\2\2\u01e0\u01eb\7\31\2\2\u01e1\u01eb\7\32\2"+
		"\2\u01e2\u01eb\7\33\2\2\u01e3\u01e6\7\34\2\2\u01e4\u01e5\7\34\2\2\u01e5"+
		"\u01e7\7\34\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01eb\3"+
		"\2\2\2\u01e8\u01eb\7\35\2\2\u01e9\u01eb\7\37\2\2\u01ea\u01e0\3\2\2\2\u01ea"+
		"\u01e1\3\2\2\2\u01ea\u01e2\3\2\2\2\u01ea\u01e3\3\2\2\2\u01ea\u01e8\3\2"+
		"\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01f9\3\2\2\2\u01ec\u01ed\t\16\2\2\u01ed"+
		"\u01f9\7%\2\2\u01ee\u01f0\t\17\2\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0\3\2"+
		"\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f9\7 \2\2\u01f2\u01f3\7\5\2\2\u01f3"+
		"\u01f6\7\36\2\2\u01f4\u01f6\7\'\2\2\u01f5\u01f2\3\2\2\2\u01f5\u01f4\3"+
		"\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f9\5b\62\2\u01f8\u01ea\3\2\2\2\u01f8"+
		"\u01ec\3\2\2\2\u01f8\u01ef\3\2\2\2\u01f8\u01f5\3\2\2\2\u01f8\u01f7\3\2"+
		"\2\2\u01f9u\3\2\2\2\65y}\u0083\u0088\u008f\u0097\u0099\u009b\u009d\u00a2"+
		"\u00a9\u00ab\u00ad\u00af\u00b3\u00b9\u00c1\u00c5\u00dd\u00ee\u0107\u010c"+
		"\u0112\u0125\u012b\u0130\u0135\u013b\u013f\u0141\u014c\u0154\u0156\u015c"+
		"\u0161\u0165\u0179\u017b\u0195\u01b0\u01bb\u01c6\u01cf\u01d4\u01da\u01de"+
		"\u01e6\u01ea\u01ef\u01f5\u01f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}