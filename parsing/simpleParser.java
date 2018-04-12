// Generated from simpleParser.g4 by ANTLR 4.7.1
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
		DOTLOC=9, PERCENT=10, SEVENTH_TDS=11, MOST_LETTERS=12, DOT2=13, DOTS23=14, 
		DOTS25=15, DOTS256=16, DOTS235=17, DOTS236=18, DOTS2356=19, DOTS356=20, 
		LOWER_ROOT=21, DOTS34=22, DOTS36=23, DOTS126=24, DOTS345=25, DOTS346=26, 
		DOT3=27, ROOT=28, SPACE=29, NEWLINE=30, INK_INFO=31, LETTERA=32, LETTERB=33, 
		UPDIGS=34, NUM_FRAG=35, CAP_ZED=36;
	public static final int
		RULE_text = 0, RULE_line = 1, RULE_capsWordInd = 2, RULE_capsPassageInd = 3, 
		RULE_item = 4, RULE_space = 5, RULE_hyphen = 6, RULE_dash = 7, RULE_long_dash = 8, 
		RULE_separator = 9, RULE_trailingSep = 10, RULE_roots = 11, RULE_letters = 12, 
		RULE_saLetters = 13, RULE_ucLetters = 14, RULE_prefix = 15, RULE_pr_token = 16, 
		RULE_standingAlone = 17, RULE_updigs = 18, RULE_numspacedig = 19, RULE_numind = 20, 
		RULE_numfrag = 21, RULE_d4_hash = 22, RULE_d45_hash = 23, RULE_d456_hash = 24, 
		RULE_d5_hash = 25, RULE_d46_hash = 26, RULE_tfPrefix = 27, RULE_tfStartRoot = 28, 
		RULE_tfTermRoot = 29, RULE_tfStartIndicator = 30, RULE_tfTermIndicator = 31, 
		RULE_preAlone = 32, RULE_postAlone = 33;
	public static final String[] ruleNames = {
		"text", "line", "capsWordInd", "capsPassageInd", "item", "space", "hyphen", 
		"dash", "long_dash", "separator", "trailingSep", "roots", "letters", "saLetters", 
		"ucLetters", "prefix", "pr_token", "standingAlone", "updigs", "numspacedig", 
		"numind", "numfrag", "d4_hash", "d45_hash", "d456_hash", "d5_hash", "d46_hash", 
		"tfPrefix", "tfStartRoot", "tfTermRoot", "tfStartIndicator", "tfTermIndicator", 
		"preAlone", "postAlone"
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
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				line();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOTS3456) | (1L << DOT4) | (1L << DOT5) | (1L << DOT6) | (1L << DOTS45) | (1L << DOTS56) | (1L << DOTS46) | (1L << DOTS456) | (1L << MOST_LETTERS) | (1L << DOT2) | (1L << DOTS23) | (1L << DOTS25) | (1L << DOTS256) | (1L << DOTS235) | (1L << DOTS236) | (1L << DOTS2356) | (1L << LOWER_ROOT) | (1L << DOTS34) | (1L << DOTS36) | (1L << DOTS126) | (1L << DOTS345) | (1L << DOTS346) | (1L << DOT3) | (1L << ROOT) | (1L << SPACE) | (1L << NEWLINE) | (1L << LETTERA) | (1L << LETTERB) | (1L << UPDIGS))) != 0) );
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
		public TerminalNode NEWLINE() { return getToken(simpleParser.NEWLINE, 0); }
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
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(73);
					space();
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(90);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					{
					setState(79);
					standingAlone();
					}
					}
					break;
				case 2:
					{
					{
					setState(86); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(86);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case DOTS3456:
								{
								{
								setState(80);
								numfrag();
								}
								}
								break;
							case DOT4:
							case DOT5:
							case DOT6:
							case DOTS45:
							case DOTS56:
							case DOTS46:
							case DOTS456:
							case MOST_LETTERS:
							case DOT2:
							case DOTS23:
							case DOTS25:
							case DOTS256:
							case DOTS235:
							case DOTS236:
							case DOTS2356:
							case LOWER_ROOT:
							case DOTS34:
							case DOTS36:
							case DOTS126:
							case DOTS345:
							case DOTS346:
							case DOT3:
							case ROOT:
							case LETTERA:
							case LETTERB:
							case UPDIGS:
								{
								setState(82); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(81);
										item();
										}
										}
										break;
									default:
										throw new NoViableAltException(this);
									}
									setState(84); 
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
						setState(88); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(93); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(92);
								separator();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(95); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(108);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
						case 1:
							{
							{
							setState(97);
							standingAlone();
							}
							}
							break;
						case 2:
							{
							{
							setState(104); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									setState(104);
									_errHandler.sync(this);
									switch (_input.LA(1)) {
									case DOTS3456:
										{
										{
										setState(98);
										numfrag();
										}
										}
										break;
									case DOT4:
									case DOT5:
									case DOT6:
									case DOTS45:
									case DOTS56:
									case DOTS46:
									case DOTS456:
									case MOST_LETTERS:
									case DOT2:
									case DOTS23:
									case DOTS25:
									case DOTS256:
									case DOTS235:
									case DOTS236:
									case DOTS2356:
									case LOWER_ROOT:
									case DOTS34:
									case DOTS36:
									case DOTS126:
									case DOTS345:
									case DOTS346:
									case DOT3:
									case ROOT:
									case LETTERA:
									case LETTERB:
									case UPDIGS:
										{
										setState(100); 
										_errHandler.sync(this);
										_alt = 1;
										do {
											switch (_alt) {
											case 1:
												{
												{
												setState(99);
												item();
												}
												}
												break;
											default:
												throw new NoViableAltException(this);
											}
											setState(102); 
											_errHandler.sync(this);
											_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
								setState(106); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							}
							}
							break;
						}
						}
						} 
					}
					setState(114);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT5) | (1L << DOT6) | (1L << DOTS36) | (1L << SPACE))) != 0)) {
					{
					{
					setState(115);
					trailingSep();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(123);
					space();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(129);
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
			setState(132);
			match(DOT6);
			}
			{
			setState(133);
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
			setState(135);
			match(DOT6);
			}
			{
			setState(136);
			match(DOT6);
			}
			{
			setState(137);
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

	public static class ItemContext extends ParserRuleContext {
		public CapsPassageIndContext capsPassageInd() {
			return getRuleContext(CapsPassageIndContext.class,0);
		}
		public CapsWordIndContext capsWordInd() {
			return getRuleContext(CapsWordIndContext.class,0);
		}
		public Pr_tokenContext pr_token() {
			return getRuleContext(Pr_tokenContext.class,0);
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
		enterRule(_localctx, 8, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(139);
				capsPassageInd();
				}
				break;
			case 2:
				{
				setState(140);
				capsWordInd();
				}
				break;
			case 3:
				{
				setState(141);
				pr_token();
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
		enterRule(_localctx, 10, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
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
		enterRule(_localctx, 12, RULE_hyphen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
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
		enterRule(_localctx, 14, RULE_dash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(DOT6);
			setState(149);
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
		enterRule(_localctx, 16, RULE_long_dash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(DOT5);
			setState(152);
			match(DOT6);
			setState(153);
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
		enterRule(_localctx, 18, RULE_separator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPACE:
				{
				setState(155);
				space();
				}
				break;
			case DOTS36:
				{
				setState(156);
				hyphen();
				}
				break;
			case DOT6:
				{
				setState(157);
				dash();
				}
				break;
			case DOT5:
				{
				setState(158);
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
		enterRule(_localctx, 20, RULE_trailingSep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
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
		enterRule(_localctx, 22, RULE_roots);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT2) | (1L << DOTS23) | (1L << DOTS25) | (1L << DOTS256) | (1L << DOTS235) | (1L << DOTS236) | (1L << DOTS2356) | (1L << LOWER_ROOT) | (1L << DOTS34) | (1L << DOTS36) | (1L << DOTS126) | (1L << DOTS345) | (1L << DOTS346) | (1L << DOT3) | (1L << ROOT))) != 0)) ) {
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

	public static class LettersContext extends ParserRuleContext {
		public UpdigsContext updigs() {
			return getRuleContext(UpdigsContext.class,0);
		}
		public TerminalNode MOST_LETTERS() { return getToken(simpleParser.MOST_LETTERS, 0); }
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
		enterRule(_localctx, 24, RULE_letters);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTERA:
			case LETTERB:
			case UPDIGS:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				updigs();
				}
				break;
			case MOST_LETTERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(MOST_LETTERS);
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
		public TerminalNode DOT6() { return getToken(simpleParser.DOT6, 0); }
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
		enterRule(_localctx, 26, RULE_saLetters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT6) {
				{
				setState(169);
				match(DOT6);
				}
			}

			setState(172);
			letters();
			}
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MOST_LETTERS) | (1L << LETTERA) | (1L << LETTERB) | (1L << UPDIGS))) != 0)) {
				{
				{
				setState(174);
				letters();
				}
				}
				setState(179);
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
		enterRule(_localctx, 28, RULE_ucLetters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(DOT6);
			{
			setState(181);
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
		enterRule(_localctx, 30, RULE_prefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
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

	public static class Pr_tokenContext extends ParserRuleContext {
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
		enterRule(_localctx, 32, RULE_pr_token);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT4) | (1L << DOT5) | (1L << DOT6) | (1L << DOTS45) | (1L << DOTS56) | (1L << DOTS46) | (1L << DOTS456))) != 0)) {
				{
				setState(185);
				prefix();
				}
			}

			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT2:
			case DOTS23:
			case DOTS25:
			case DOTS256:
			case DOTS235:
			case DOTS236:
			case DOTS2356:
			case LOWER_ROOT:
			case DOTS34:
			case DOTS36:
			case DOTS126:
			case DOTS345:
			case DOTS346:
			case DOT3:
			case ROOT:
				{
				setState(188);
				roots();
				}
				break;
			case MOST_LETTERS:
			case LETTERA:
			case LETTERB:
			case UPDIGS:
				{
				setState(189);
				letters();
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
		public SaLettersContext saLetters() {
			return getRuleContext(SaLettersContext.class,0);
		}
		public CapsPassageIndContext capsPassageInd() {
			return getRuleContext(CapsPassageIndContext.class,0);
		}
		public CapsWordIndContext capsWordInd() {
			return getRuleContext(CapsWordIndContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_standingAlone);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(192);
					preAlone();
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			{
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(198);
				capsPassageInd();
				}
				break;
			case 2:
				{
				setState(199);
				capsWordInd();
				}
				break;
			}
			{
			setState(202);
			saLetters();
			}
			}
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(204);
					postAlone();
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 36, RULE_updigs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
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
		enterRule(_localctx, 38, RULE_numspacedig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(212);
			match(DOT5);
			setState(213);
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
		enterRule(_localctx, 40, RULE_numind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(215);
			match(DOTS3456);
			}
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTERA:
			case LETTERB:
			case UPDIGS:
				{
				setState(216);
				updigs();
				}
				break;
			case DOT2:
				{
				setState(217);
				match(DOT2);
				}
				break;
			case DOTS256:
				{
				setState(218);
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
		enterRule(_localctx, 42, RULE_numfrag);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			numind();
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(227);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LETTERA:
					case LETTERB:
					case UPDIGS:
						{
						setState(222);
						updigs();
						}
						break;
					case DOT2:
						{
						setState(223);
						match(DOT2);
						}
						break;
					case DOTS256:
						{
						setState(224);
						match(DOTS256);
						}
						break;
					case DOTS34:
						{
						setState(225);
						match(DOTS34);
						}
						break;
					case DOT5:
						{
						setState(226);
						numspacedig();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		enterRule(_localctx, 44, RULE_d4_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(DOT4);
			setState(233);
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
		enterRule(_localctx, 46, RULE_d45_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(DOTS45);
			setState(236);
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
		enterRule(_localctx, 48, RULE_d456_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(DOTS456);
			setState(239);
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
		enterRule(_localctx, 50, RULE_d5_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(DOT5);
			setState(242);
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
		enterRule(_localctx, 52, RULE_d46_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(DOTS46);
			setState(245);
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
		enterRule(_localctx, 54, RULE_tfPrefix);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(DOTS46);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(DOTS45);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(DOTS456);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				match(DOT4);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				d4_hash();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(252);
				d45_hash();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(253);
				d456_hash();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(254);
				d5_hash();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(255);
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
		enterRule(_localctx, 56, RULE_tfStartRoot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
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
		enterRule(_localctx, 58, RULE_tfTermRoot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
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
		enterRule(_localctx, 60, RULE_tfStartIndicator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(262);
			tfPrefix();
			}
			{
			setState(263);
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
		enterRule(_localctx, 62, RULE_tfTermIndicator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(265);
			tfPrefix();
			}
			{
			setState(266);
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
		enterRule(_localctx, 64, RULE_preAlone);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				{
				setState(268);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT5) | (1L << DOTS46) | (1L << DOTS456))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(269);
				match(DOTS126);
				}
				}
				break;
			case 2:
				{
				{
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT6) | (1L << DOTS45) | (1L << DOTS456))) != 0)) {
					{
					setState(270);
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

				setState(273);
				match(DOTS236);
				}
				}
				break;
			case 3:
				{
				setState(277);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT5:
					{
					setState(274);
					match(DOT5);
					setState(275);
					match(DOTS2356);
					}
					break;
				case DOT3:
					{
					setState(276);
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
				setState(279);
				capsPassageInd();
				}
				break;
			case 5:
				{
				setState(280);
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
		enterRule(_localctx, 66, RULE_postAlone);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(293);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT2:
					{
					setState(283);
					match(DOT2);
					}
					break;
				case DOTS23:
					{
					setState(284);
					match(DOTS23);
					}
					break;
				case DOTS25:
					{
					setState(285);
					match(DOTS25);
					}
					break;
				case DOTS256:
					{
					setState(286);
					match(DOTS256);
					setState(289);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(287);
						match(DOTS256);
						setState(288);
						match(DOTS256);
						}
						break;
					}
					}
					break;
				case DOTS235:
					{
					setState(291);
					match(DOTS235);
					}
					break;
				case DOTS236:
					{
					setState(292);
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
				setState(295);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT5) | (1L << DOTS46) | (1L << DOTS456))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(296);
				match(DOTS345);
				}
				}
				break;
			case 3:
				{
				{
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT6) | (1L << DOTS45) | (1L << DOTS456))) != 0)) {
					{
					setState(297);
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

				setState(300);
				match(DOTS356);
				}
				}
				break;
			case 4:
				{
				setState(304);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT5:
					{
					setState(301);
					match(DOT5);
					setState(302);
					match(DOTS2356);
					}
					break;
				case DOT3:
					{
					setState(303);
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
				setState(306);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u0138\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\6\2H\n\2\r\2\16\2I\3\3\7\3M\n\3\f\3\16\3P\13\3\3"+
		"\3\3\3\3\3\6\3U\n\3\r\3\16\3V\6\3Y\n\3\r\3\16\3Z\5\3]\n\3\3\3\6\3`\n\3"+
		"\r\3\16\3a\3\3\3\3\3\3\6\3g\n\3\r\3\16\3h\6\3k\n\3\r\3\16\3l\5\3o\n\3"+
		"\7\3q\n\3\f\3\16\3t\13\3\3\3\7\3w\n\3\f\3\16\3z\13\3\3\3\3\3\3\3\7\3\177"+
		"\n\3\f\3\16\3\u0082\13\3\3\3\5\3\u0085\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\5\6\u0091\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\5\13\u00a2\n\13\3\f\3\f\3\r\3\r\3\16\3\16\5\16\u00aa"+
		"\n\16\3\17\5\17\u00ad\n\17\3\17\3\17\3\17\7\17\u00b2\n\17\f\17\16\17\u00b5"+
		"\13\17\3\20\3\20\3\20\3\21\3\21\3\22\5\22\u00bd\n\22\3\22\3\22\5\22\u00c1"+
		"\n\22\3\23\7\23\u00c4\n\23\f\23\16\23\u00c7\13\23\3\23\3\23\5\23\u00cb"+
		"\n\23\3\23\3\23\3\23\7\23\u00d0\n\23\f\23\16\23\u00d3\13\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u00de\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\7\27\u00e6\n\27\f\27\16\27\u00e9\13\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0103\n\35\3\36\3\36\3\37\3\37\3 "+
		"\3 \3 \3!\3!\3!\3\"\3\"\3\"\5\"\u0112\n\"\3\"\3\"\3\"\3\"\5\"\u0118\n"+
		"\"\3\"\3\"\5\"\u011c\n\"\3#\3#\3#\3#\3#\3#\5#\u0124\n#\3#\3#\5#\u0128"+
		"\n#\3#\3#\3#\5#\u012d\n#\3#\3#\3#\3#\5#\u0133\n#\3#\5#\u0136\n#\3#\2\2"+
		"$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2"+
		"\b\4\2\17\25\27\36\3\2\4\n\3\2\"$\4\2\17\20\25\25\4\2\5\5\t\n\4\2\6\7"+
		"\n\n\2\u0153\2G\3\2\2\2\4\u0084\3\2\2\2\6\u0086\3\2\2\2\b\u0089\3\2\2"+
		"\2\n\u0090\3\2\2\2\f\u0092\3\2\2\2\16\u0094\3\2\2\2\20\u0096\3\2\2\2\22"+
		"\u0099\3\2\2\2\24\u00a1\3\2\2\2\26\u00a3\3\2\2\2\30\u00a5\3\2\2\2\32\u00a9"+
		"\3\2\2\2\34\u00ac\3\2\2\2\36\u00b6\3\2\2\2 \u00b9\3\2\2\2\"\u00bc\3\2"+
		"\2\2$\u00c5\3\2\2\2&\u00d4\3\2\2\2(\u00d6\3\2\2\2*\u00d9\3\2\2\2,\u00df"+
		"\3\2\2\2.\u00ea\3\2\2\2\60\u00ed\3\2\2\2\62\u00f0\3\2\2\2\64\u00f3\3\2"+
		"\2\2\66\u00f6\3\2\2\28\u0102\3\2\2\2:\u0104\3\2\2\2<\u0106\3\2\2\2>\u0108"+
		"\3\2\2\2@\u010b\3\2\2\2B\u011b\3\2\2\2D\u0135\3\2\2\2FH\5\4\3\2GF\3\2"+
		"\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\3\3\2\2\2KM\5\f\7\2LK\3\2\2\2MP\3"+
		"\2\2\2NL\3\2\2\2NO\3\2\2\2O\\\3\2\2\2PN\3\2\2\2Q]\5$\23\2RY\5,\27\2SU"+
		"\5\n\6\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XR\3\2\2\2X"+
		"T\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Q\3\2\2\2\\X\3\2\2"+
		"\2]r\3\2\2\2^`\5\24\13\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bn\3\2"+
		"\2\2co\5$\23\2dk\5,\27\2eg\5\n\6\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2"+
		"\2\2ik\3\2\2\2jd\3\2\2\2jf\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2"+
		"\2\2nc\3\2\2\2nj\3\2\2\2oq\3\2\2\2p_\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2"+
		"\2\2sx\3\2\2\2tr\3\2\2\2uw\5\26\f\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3"+
		"\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7 \2\2|\u0085\3\2\2\2}\177\5\f\7\2~}\3\2"+
		"\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0085\7 \2\2\u0084N\3\2\2\2\u0084\u0080"+
		"\3\2\2\2\u0085\5\3\2\2\2\u0086\u0087\7\6\2\2\u0087\u0088\7\6\2\2\u0088"+
		"\7\3\2\2\2\u0089\u008a\7\6\2\2\u008a\u008b\7\6\2\2\u008b\u008c\7\6\2\2"+
		"\u008c\t\3\2\2\2\u008d\u0091\5\b\5\2\u008e\u0091\5\6\4\2\u008f\u0091\5"+
		"\"\22\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\13\3\2\2\2\u0092\u0093\7\37\2\2\u0093\r\3\2\2\2\u0094\u0095\7\31\2\2"+
		"\u0095\17\3\2\2\2\u0096\u0097\7\6\2\2\u0097\u0098\7\31\2\2\u0098\21\3"+
		"\2\2\2\u0099\u009a\7\5\2\2\u009a\u009b\7\6\2\2\u009b\u009c\7\31\2\2\u009c"+
		"\23\3\2\2\2\u009d\u00a2\5\f\7\2\u009e\u00a2\5\16\b\2\u009f\u00a2\5\20"+
		"\t\2\u00a0\u00a2\5\22\n\2\u00a1\u009d\3\2\2\2\u00a1\u009e\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\25\3\2\2\2\u00a3\u00a4\5\24\13"+
		"\2\u00a4\27\3\2\2\2\u00a5\u00a6\t\2\2\2\u00a6\31\3\2\2\2\u00a7\u00aa\5"+
		"&\24\2\u00a8\u00aa\7\16\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\33\3\2\2\2\u00ab\u00ad\7\6\2\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2"+
		"\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\5\32\16\2\u00af\u00b3\3\2\2\2\u00b0"+
		"\u00b2\5\32\16\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3"+
		"\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\35\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"\u00b7\7\6\2\2\u00b7\u00b8\5\32\16\2\u00b8\37\3\2\2\2\u00b9\u00ba\t\3"+
		"\2\2\u00ba!\3\2\2\2\u00bb\u00bd\5 \21\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00c1\5\30\r\2\u00bf\u00c1\5\32\16"+
		"\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1#\3\2\2\2\u00c2\u00c4"+
		"\5B\"\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00ca\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\5\b"+
		"\5\2\u00c9\u00cb\5\6\4\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\5\34\17\2\u00cd\u00d1\3"+
		"\2\2\2\u00ce\u00d0\5D#\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2%\3\2\2\2\u00d3\u00d1\3\2\2\2"+
		"\u00d4\u00d5\t\4\2\2\u00d5\'\3\2\2\2\u00d6\u00d7\7\5\2\2\u00d7\u00d8\5"+
		"&\24\2\u00d8)\3\2\2\2\u00d9\u00dd\7\3\2\2\u00da\u00de\5&\24\2\u00db\u00de"+
		"\7\17\2\2\u00dc\u00de\7\22\2\2\u00dd\u00da\3\2\2\2\u00dd\u00db\3\2\2\2"+
		"\u00dd\u00dc\3\2\2\2\u00de+\3\2\2\2\u00df\u00e7\5*\26\2\u00e0\u00e6\5"+
		"&\24\2\u00e1\u00e6\7\17\2\2\u00e2\u00e6\7\22\2\2\u00e3\u00e6\7\30\2\2"+
		"\u00e4\u00e6\5(\25\2\u00e5\u00e0\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e2"+
		"\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8-\3\2\2\2\u00e9\u00e7\3\2\2\2"+
		"\u00ea\u00eb\7\4\2\2\u00eb\u00ec\7\3\2\2\u00ec/\3\2\2\2\u00ed\u00ee\7"+
		"\7\2\2\u00ee\u00ef\7\3\2\2\u00ef\61\3\2\2\2\u00f0\u00f1\7\n\2\2\u00f1"+
		"\u00f2\7\3\2\2\u00f2\63\3\2\2\2\u00f3\u00f4\7\5\2\2\u00f4\u00f5\7\3\2"+
		"\2\u00f5\65\3\2\2\2\u00f6\u00f7\7\t\2\2\u00f7\u00f8\7\3\2\2\u00f8\67\3"+
		"\2\2\2\u00f9\u0103\7\t\2\2\u00fa\u0103\7\7\2\2\u00fb\u0103\7\n\2\2\u00fc"+
		"\u0103\7\4\2\2\u00fd\u0103\5.\30\2\u00fe\u0103\5\60\31\2\u00ff\u0103\5"+
		"\62\32\2\u0100\u0103\5\64\33\2\u0101\u0103\5\66\34\2\u0102\u00f9\3\2\2"+
		"\2\u0102\u00fa\3\2\2\2\u0102\u00fb\3\2\2\2\u0102\u00fc\3\2\2\2\u0102\u00fd"+
		"\3\2\2\2\u0102\u00fe\3\2\2\2\u0102\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0101\3\2\2\2\u01039\3\2\2\2\u0104\u0105\t\5\2\2\u0105;\3\2\2\2\u0106"+
		"\u0107\7\35\2\2\u0107=\3\2\2\2\u0108\u0109\58\35\2\u0109\u010a\5:\36\2"+
		"\u010a?\3\2\2\2\u010b\u010c\58\35\2\u010c\u010d\5<\37\2\u010dA\3\2\2\2"+
		"\u010e\u010f\t\6\2\2\u010f\u011c\7\32\2\2\u0110\u0112\t\7\2\2\u0111\u0110"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u011c\7\24\2\2"+
		"\u0114\u0115\7\5\2\2\u0115\u0118\7\25\2\2\u0116\u0118\7\35\2\2\u0117\u0114"+
		"\3\2\2\2\u0117\u0116\3\2\2\2\u0118\u011c\3\2\2\2\u0119\u011c\5\b\5\2\u011a"+
		"\u011c\5> \2\u011b\u010e\3\2\2\2\u011b\u0111\3\2\2\2\u011b\u0117\3\2\2"+
		"\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011cC\3\2\2\2\u011d\u0128"+
		"\7\17\2\2\u011e\u0128\7\20\2\2\u011f\u0128\7\21\2\2\u0120\u0123\7\22\2"+
		"\2\u0121\u0122\7\22\2\2\u0122\u0124\7\22\2\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0128\3\2\2\2\u0125\u0128\7\23\2\2\u0126\u0128\7"+
		"\24\2\2\u0127\u011d\3\2\2\2\u0127\u011e\3\2\2\2\u0127\u011f\3\2\2\2\u0127"+
		"\u0120\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128\u0136\3\2"+
		"\2\2\u0129\u012a\t\6\2\2\u012a\u0136\7\33\2\2\u012b\u012d\t\7\2\2\u012c"+
		"\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0136\7\26"+
		"\2\2\u012f\u0130\7\5\2\2\u0130\u0133\7\25\2\2\u0131\u0133\7\35\2\2\u0132"+
		"\u012f\3\2\2\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0136\5@"+
		"!\2\u0135\u0127\3\2\2\2\u0135\u0129\3\2\2\2\u0135\u012c\3\2\2\2\u0135"+
		"\u0132\3\2\2\2\u0135\u0134\3\2\2\2\u0136E\3\2\2\2\'INVXZ\\ahjlnrx\u0080"+
		"\u0084\u0090\u00a1\u00a9\u00ac\u00b3\u00bc\u00c0\u00c5\u00ca\u00d1\u00dd"+
		"\u00e5\u00e7\u0102\u0111\u0117\u011b\u0123\u0127\u012c\u0132\u0135";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}