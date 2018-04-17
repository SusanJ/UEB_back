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
		DOTLOC=9, PERCENT=10, SEVENTH_TDS=11, MOST_LETTERS=12, DOT2=13, DOTS23=14, 
		DOTS25=15, DOTS256=16, DOTS235=17, DOTS236=18, DOTS2356=19, DOTS356=20, 
		LOWER_ROOT=21, DOTS34=22, DOTS36=23, DOTS126=24, DOTS345=25, DOTS346=26, 
		DOT3=27, ROOT=28, SPACE=29, NEWLINE=30, INK_INFO=31, LETTERA=32, LETTERB=33, 
		UPDIGS=34, NUM_FRAG=35, CAP_ZED=36;
	public static final int
		RULE_text = 0, RULE_line = 1, RULE_capsWordInd = 2, RULE_capsPassageInd = 3, 
		RULE_rootlessToken = 4, RULE_item = 5, RULE_space = 6, RULE_hyphen = 7, 
		RULE_dash = 8, RULE_long_dash = 9, RULE_separator = 10, RULE_trailingSep = 11, 
		RULE_roots = 12, RULE_letters = 13, RULE_saLetters = 14, RULE_ucLetters = 15, 
		RULE_prefix = 16, RULE_pr_token = 17, RULE_standingAlone = 18, RULE_updigs = 19, 
		RULE_numspacedig = 20, RULE_numind = 21, RULE_numfrag = 22, RULE_d4_hash = 23, 
		RULE_d45_hash = 24, RULE_d456_hash = 25, RULE_d5_hash = 26, RULE_d46_hash = 27, 
		RULE_tfPrefix = 28, RULE_tfStartRoot = 29, RULE_tfTermRoot = 30, RULE_tfStartIndicator = 31, 
		RULE_tfTermIndicator = 32, RULE_tfSymbolInd = 33, RULE_tfWordInd = 34, 
		RULE_subsup = 35, RULE_encl1 = 36, RULE_encl2 = 37, RULE_encl3 = 38, RULE_scrip = 39, 
		RULE_preAlone = 40, RULE_postAlone = 41;
	public static final String[] ruleNames = {
		"text", "line", "capsWordInd", "capsPassageInd", "rootlessToken", "item", 
		"space", "hyphen", "dash", "long_dash", "separator", "trailingSep", "roots", 
		"letters", "saLetters", "ucLetters", "prefix", "pr_token", "standingAlone", 
		"updigs", "numspacedig", "numind", "numfrag", "d4_hash", "d45_hash", "d456_hash", 
		"d5_hash", "d46_hash", "tfPrefix", "tfStartRoot", "tfTermRoot", "tfStartIndicator", 
		"tfTermIndicator", "tfSymbolInd", "tfWordInd", "subsup", "encl1", "encl2", 
		"encl3", "scrip", "preAlone", "postAlone"
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
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				line();
				}
				}
				setState(87); 
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
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(89);
					space();
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					{
					setState(95);
					standingAlone();
					}
					}
					break;
				case 2:
					{
					{
					setState(102); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(102);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case DOTS3456:
								{
								{
								setState(96);
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
								setState(98); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(97);
										item();
										}
										}
										break;
									default:
										throw new NoViableAltException(this);
									}
									setState(100); 
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
						setState(104); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(109); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(108);
								separator();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(111); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(124);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
						case 1:
							{
							{
							setState(113);
							standingAlone();
							}
							}
							break;
						case 2:
							{
							{
							setState(120); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									setState(120);
									_errHandler.sync(this);
									switch (_input.LA(1)) {
									case DOTS3456:
										{
										{
										setState(114);
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
										setState(116); 
										_errHandler.sync(this);
										_alt = 1;
										do {
											switch (_alt) {
											case 1:
												{
												{
												setState(115);
												item();
												}
												}
												break;
											default:
												throw new NoViableAltException(this);
											}
											setState(118); 
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
								setState(122); 
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
					setState(130);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT5) | (1L << DOT6) | (1L << DOTS36) | (1L << SPACE))) != 0)) {
					{
					{
					setState(131);
					trailingSep();
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(139);
					space();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(145);
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
			setState(148);
			match(DOT6);
			}
			{
			setState(149);
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
			setState(151);
			match(DOT6);
			}
			{
			setState(152);
			match(DOT6);
			}
			{
			setState(153);
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
			setState(155);
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
		enterRule(_localctx, 10, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(157);
				capsPassageInd();
				}
				break;
			case 2:
				{
				setState(158);
				capsWordInd();
				}
				break;
			case 3:
				{
				setState(159);
				rootlessToken();
				}
				break;
			case 4:
				{
				setState(160);
				pr_token();
				}
				break;
			case 5:
				{
				setState(161);
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
		enterRule(_localctx, 12, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
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
		enterRule(_localctx, 14, RULE_hyphen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
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
		enterRule(_localctx, 16, RULE_dash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(DOT6);
			setState(169);
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
		enterRule(_localctx, 18, RULE_long_dash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(DOT5);
			setState(172);
			match(DOT6);
			setState(173);
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
		enterRule(_localctx, 20, RULE_separator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPACE:
				{
				setState(175);
				space();
				}
				break;
			case DOTS36:
				{
				setState(176);
				hyphen();
				}
				break;
			case DOT6:
				{
				setState(177);
				dash();
				}
				break;
			case DOT5:
				{
				setState(178);
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
		enterRule(_localctx, 22, RULE_trailingSep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
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
		enterRule(_localctx, 24, RULE_roots);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
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
		enterRule(_localctx, 26, RULE_letters);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTERA:
			case LETTERB:
			case UPDIGS:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				updigs();
				}
				break;
			case MOST_LETTERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
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
		enterRule(_localctx, 28, RULE_saLetters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT6) {
				{
				setState(189);
				match(DOT6);
				}
			}

			setState(192);
			letters();
			}
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MOST_LETTERS) | (1L << LETTERA) | (1L << LETTERB) | (1L << UPDIGS))) != 0)) {
				{
				{
				setState(194);
				letters();
				}
				}
				setState(199);
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
		enterRule(_localctx, 30, RULE_ucLetters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(DOT6);
			{
			setState(201);
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
		enterRule(_localctx, 32, RULE_prefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
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
		enterRule(_localctx, 34, RULE_pr_token);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT4) | (1L << DOT5) | (1L << DOT6) | (1L << DOTS45) | (1L << DOTS56) | (1L << DOTS46) | (1L << DOTS456))) != 0)) {
				{
				setState(205);
				prefix();
				}
			}

			setState(210);
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
				setState(208);
				roots();
				}
				break;
			case MOST_LETTERS:
			case LETTERA:
			case LETTERB:
			case UPDIGS:
				{
				setState(209);
				letters();
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
		enterRule(_localctx, 36, RULE_standingAlone);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212);
					preAlone();
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			{
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(218);
				capsPassageInd();
				}
				break;
			case 2:
				{
				setState(219);
				capsWordInd();
				}
				break;
			}
			{
			setState(222);
			saLetters();
			}
			}
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(224);
					postAlone();
					}
					} 
				}
				setState(229);
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
		enterRule(_localctx, 38, RULE_updigs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
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
		enterRule(_localctx, 40, RULE_numspacedig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(232);
			match(DOT5);
			setState(233);
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
		enterRule(_localctx, 42, RULE_numind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(235);
			match(DOTS3456);
			}
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTERA:
			case LETTERB:
			case UPDIGS:
				{
				setState(236);
				updigs();
				}
				break;
			case DOT2:
				{
				setState(237);
				match(DOT2);
				}
				break;
			case DOTS256:
				{
				setState(238);
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
		enterRule(_localctx, 44, RULE_numfrag);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			numind();
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(247);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LETTERA:
					case LETTERB:
					case UPDIGS:
						{
						setState(242);
						updigs();
						}
						break;
					case DOT2:
						{
						setState(243);
						match(DOT2);
						}
						break;
					case DOTS256:
						{
						setState(244);
						match(DOTS256);
						}
						break;
					case DOTS34:
						{
						setState(245);
						match(DOTS34);
						}
						break;
					case DOT5:
						{
						setState(246);
						numspacedig();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(251);
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
		enterRule(_localctx, 46, RULE_d4_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(DOT4);
			setState(253);
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
		enterRule(_localctx, 48, RULE_d45_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(DOTS45);
			setState(256);
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
		enterRule(_localctx, 50, RULE_d456_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(DOTS456);
			setState(259);
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
		enterRule(_localctx, 52, RULE_d5_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(DOT5);
			setState(262);
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
		enterRule(_localctx, 54, RULE_d46_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(DOTS46);
			setState(265);
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
		enterRule(_localctx, 56, RULE_tfPrefix);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(DOTS46);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(DOTS45);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				match(DOTS456);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				match(DOT4);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(271);
				d4_hash();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(272);
				d45_hash();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(273);
				d456_hash();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(274);
				d5_hash();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(275);
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
		enterRule(_localctx, 58, RULE_tfStartRoot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
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
		enterRule(_localctx, 60, RULE_tfTermRoot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
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
		enterRule(_localctx, 62, RULE_tfStartIndicator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(282);
			tfPrefix();
			}
			{
			setState(283);
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
		enterRule(_localctx, 64, RULE_tfTermIndicator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(285);
			tfPrefix();
			}
			{
			setState(286);
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
		enterRule(_localctx, 66, RULE_tfSymbolInd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(288);
			tfPrefix();
			setState(289);
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
		enterRule(_localctx, 68, RULE_tfWordInd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(291);
			tfPrefix();
			setState(292);
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
		enterRule(_localctx, 70, RULE_subsup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(294);
			match(DOTS56);
			}
			{
			setState(295);
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
		enterRule(_localctx, 72, RULE_encl1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(297);
			match(DOT5);
			setState(298);
			match(DOTS126);
			}
			setState(301); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(300);
					pr_token();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(303); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			{
			setState(305);
			match(DOT5);
			setState(306);
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
		enterRule(_localctx, 74, RULE_encl2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(308);
			match(DOTS46);
			setState(309);
			match(DOTS126);
			}
			setState(312); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(311);
					pr_token();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(314); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			{
			setState(316);
			match(DOTS46);
			setState(317);
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
		enterRule(_localctx, 76, RULE_encl3);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(319);
			match(DOTS456);
			setState(320);
			match(DOTS126);
			}
			setState(323); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(322);
					pr_token();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(325); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			{
			setState(327);
			match(DOTS456);
			setState(328);
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
		enterRule(_localctx, 78, RULE_scrip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			subsup();
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT5:
				{
				setState(331);
				encl1();
				}
				break;
			case DOTS46:
				{
				setState(332);
				encl2();
				}
				break;
			case DOTS456:
				{
				setState(333);
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
		enterRule(_localctx, 80, RULE_preAlone);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				{
				setState(336);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT5) | (1L << DOTS46) | (1L << DOTS456))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(337);
				match(DOTS126);
				}
				}
				break;
			case 2:
				{
				{
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT6) | (1L << DOTS45) | (1L << DOTS456))) != 0)) {
					{
					setState(338);
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

				setState(341);
				match(DOTS236);
				}
				}
				break;
			case 3:
				{
				setState(345);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT5:
					{
					setState(342);
					match(DOT5);
					setState(343);
					match(DOTS2356);
					}
					break;
				case DOT3:
					{
					setState(344);
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
				setState(347);
				capsPassageInd();
				}
				break;
			case 5:
				{
				setState(348);
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
		enterRule(_localctx, 82, RULE_postAlone);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(361);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT2:
					{
					setState(351);
					match(DOT2);
					}
					break;
				case DOTS23:
					{
					setState(352);
					match(DOTS23);
					}
					break;
				case DOTS25:
					{
					setState(353);
					match(DOTS25);
					}
					break;
				case DOTS256:
					{
					setState(354);
					match(DOTS256);
					setState(357);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(355);
						match(DOTS256);
						setState(356);
						match(DOTS256);
						}
						break;
					}
					}
					break;
				case DOTS235:
					{
					setState(359);
					match(DOTS235);
					}
					break;
				case DOTS236:
					{
					setState(360);
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
				setState(363);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT5) | (1L << DOTS46) | (1L << DOTS456))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(364);
				match(DOTS345);
				}
				}
				break;
			case 3:
				{
				{
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT6) | (1L << DOTS45) | (1L << DOTS456))) != 0)) {
					{
					setState(365);
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

				setState(368);
				match(DOTS356);
				}
				}
				break;
			case 4:
				{
				setState(372);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT5:
					{
					setState(369);
					match(DOT5);
					setState(370);
					match(DOTS2356);
					}
					break;
				case DOT3:
					{
					setState(371);
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
				setState(374);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u017c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\6\2X\n\2\r\2\16\2Y\3\3\7\3]\n\3\f\3\16\3`\13\3\3\3\3\3\3\3\6\3e\n\3"+
		"\r\3\16\3f\6\3i\n\3\r\3\16\3j\5\3m\n\3\3\3\6\3p\n\3\r\3\16\3q\3\3\3\3"+
		"\3\3\6\3w\n\3\r\3\16\3x\6\3{\n\3\r\3\16\3|\5\3\177\n\3\7\3\u0081\n\3\f"+
		"\3\16\3\u0084\13\3\3\3\7\3\u0087\n\3\f\3\16\3\u008a\13\3\3\3\3\3\3\3\7"+
		"\3\u008f\n\3\f\3\16\3\u0092\13\3\3\3\5\3\u0095\n\3\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u00a5\n\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00b6\n\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\5\17\u00be\n\17\3\20\5\20\u00c1\n\20\3\20\3\20\3\20\7"+
		"\20\u00c6\n\20\f\20\16\20\u00c9\13\20\3\21\3\21\3\21\3\22\3\22\3\23\5"+
		"\23\u00d1\n\23\3\23\3\23\5\23\u00d5\n\23\3\24\7\24\u00d8\n\24\f\24\16"+
		"\24\u00db\13\24\3\24\3\24\5\24\u00df\n\24\3\24\3\24\3\24\7\24\u00e4\n"+
		"\24\f\24\16\24\u00e7\13\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\5\27\u00f2\n\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u00fa\n\30\f\30\16"+
		"\30\u00fd\13\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u0117\n\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%"+
		"\3%\3%\3&\3&\3&\3&\6&\u0130\n&\r&\16&\u0131\3&\3&\3&\3\'\3\'\3\'\3\'\6"+
		"\'\u013b\n\'\r\'\16\'\u013c\3\'\3\'\3\'\3(\3(\3(\3(\6(\u0146\n(\r(\16"+
		"(\u0147\3(\3(\3(\3)\3)\3)\3)\5)\u0151\n)\3*\3*\3*\5*\u0156\n*\3*\3*\3"+
		"*\3*\5*\u015c\n*\3*\3*\5*\u0160\n*\3+\3+\3+\3+\3+\3+\5+\u0168\n+\3+\3"+
		"+\5+\u016c\n+\3+\3+\3+\5+\u0171\n+\3+\3+\3+\3+\5+\u0177\n+\3+\5+\u017a"+
		"\n+\3+\2\2,\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRT\2\b\4\2\17\25\27\36\3\2\4\n\3\2\"$\4\2\17\20\25\25\4\2"+
		"\5\5\t\n\4\2\6\7\n\n\2\u0196\2W\3\2\2\2\4\u0094\3\2\2\2\6\u0096\3\2\2"+
		"\2\b\u0099\3\2\2\2\n\u009d\3\2\2\2\f\u00a4\3\2\2\2\16\u00a6\3\2\2\2\20"+
		"\u00a8\3\2\2\2\22\u00aa\3\2\2\2\24\u00ad\3\2\2\2\26\u00b5\3\2\2\2\30\u00b7"+
		"\3\2\2\2\32\u00b9\3\2\2\2\34\u00bd\3\2\2\2\36\u00c0\3\2\2\2 \u00ca\3\2"+
		"\2\2\"\u00cd\3\2\2\2$\u00d0\3\2\2\2&\u00d9\3\2\2\2(\u00e8\3\2\2\2*\u00ea"+
		"\3\2\2\2,\u00ed\3\2\2\2.\u00f3\3\2\2\2\60\u00fe\3\2\2\2\62\u0101\3\2\2"+
		"\2\64\u0104\3\2\2\2\66\u0107\3\2\2\28\u010a\3\2\2\2:\u0116\3\2\2\2<\u0118"+
		"\3\2\2\2>\u011a\3\2\2\2@\u011c\3\2\2\2B\u011f\3\2\2\2D\u0122\3\2\2\2F"+
		"\u0125\3\2\2\2H\u0128\3\2\2\2J\u012b\3\2\2\2L\u0136\3\2\2\2N\u0141\3\2"+
		"\2\2P\u014c\3\2\2\2R\u015f\3\2\2\2T\u0179\3\2\2\2VX\5\4\3\2WV\3\2\2\2"+
		"XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\3\3\2\2\2[]\5\16\b\2\\[\3\2\2\2]`\3\2"+
		"\2\2^\\\3\2\2\2^_\3\2\2\2_l\3\2\2\2`^\3\2\2\2am\5&\24\2bi\5.\30\2ce\5"+
		"\f\7\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hb\3\2\2\2hd\3"+
		"\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2la\3\2\2\2lh\3\2\2\2m\u0082"+
		"\3\2\2\2np\5\26\f\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r~\3\2\2\2"+
		"s\177\5&\24\2t{\5.\30\2uw\5\f\7\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2"+
		"\2\2y{\3\2\2\2zt\3\2\2\2zv\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177"+
		"\3\2\2\2~s\3\2\2\2~z\3\2\2\2\177\u0081\3\2\2\2\u0080o\3\2\2\2\u0081\u0084"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0088\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0087\5\30\r\2\u0086\u0085\3\2\2\2\u0087\u008a\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008c\7 \2\2\u008c\u0095\3\2\2\2\u008d\u008f\5\16"+
		"\b\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0095\7 "+
		"\2\2\u0094^\3\2\2\2\u0094\u0090\3\2\2\2\u0095\5\3\2\2\2\u0096\u0097\7"+
		"\6\2\2\u0097\u0098\7\6\2\2\u0098\7\3\2\2\2\u0099\u009a\7\6\2\2\u009a\u009b"+
		"\7\6\2\2\u009b\u009c\7\6\2\2\u009c\t\3\2\2\2\u009d\u009e\7\b\2\2\u009e"+
		"\13\3\2\2\2\u009f\u00a5\5\b\5\2\u00a0\u00a5\5\6\4\2\u00a1\u00a5\5\n\6"+
		"\2\u00a2\u00a5\5$\23\2\u00a3\u00a5\5P)\2\u00a4\u009f\3\2\2\2\u00a4\u00a0"+
		"\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\r\3\2\2\2\u00a6\u00a7\7\37\2\2\u00a7\17\3\2\2\2\u00a8\u00a9\7\31\2\2"+
		"\u00a9\21\3\2\2\2\u00aa\u00ab\7\6\2\2\u00ab\u00ac\7\31\2\2\u00ac\23\3"+
		"\2\2\2\u00ad\u00ae\7\5\2\2\u00ae\u00af\7\6\2\2\u00af\u00b0\7\31\2\2\u00b0"+
		"\25\3\2\2\2\u00b1\u00b6\5\16\b\2\u00b2\u00b6\5\20\t\2\u00b3\u00b6\5\22"+
		"\n\2\u00b4\u00b6\5\24\13\2\u00b5\u00b1\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\27\3\2\2\2\u00b7\u00b8\5\26\f"+
		"\2\u00b8\31\3\2\2\2\u00b9\u00ba\t\2\2\2\u00ba\33\3\2\2\2\u00bb\u00be\5"+
		"(\25\2\u00bc\u00be\7\16\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\35\3\2\2\2\u00bf\u00c1\7\6\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2"+
		"\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\5\34\17\2\u00c3\u00c7\3\2\2\2\u00c4"+
		"\u00c6\5\34\17\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3"+
		"\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\37\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\u00cb\7\6\2\2\u00cb\u00cc\5\34\17\2\u00cc!\3\2\2\2\u00cd\u00ce\t\3\2"+
		"\2\u00ce#\3\2\2\2\u00cf\u00d1\5\"\22\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d5\5\32\16\2\u00d3\u00d5\5\34\17"+
		"\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5%\3\2\2\2\u00d6\u00d8"+
		"\5R*\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00de\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00df\5\b"+
		"\5\2\u00dd\u00df\5\6\4\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\5\36\20\2\u00e1\u00e5\3"+
		"\2\2\2\u00e2\u00e4\5T+\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\'\3\2\2\2\u00e7\u00e5\3\2\2\2"+
		"\u00e8\u00e9\t\4\2\2\u00e9)\3\2\2\2\u00ea\u00eb\7\5\2\2\u00eb\u00ec\5"+
		"(\25\2\u00ec+\3\2\2\2\u00ed\u00f1\7\3\2\2\u00ee\u00f2\5(\25\2\u00ef\u00f2"+
		"\7\17\2\2\u00f0\u00f2\7\22\2\2\u00f1\u00ee\3\2\2\2\u00f1\u00ef\3\2\2\2"+
		"\u00f1\u00f0\3\2\2\2\u00f2-\3\2\2\2\u00f3\u00fb\5,\27\2\u00f4\u00fa\5"+
		"(\25\2\u00f5\u00fa\7\17\2\2\u00f6\u00fa\7\22\2\2\u00f7\u00fa\7\30\2\2"+
		"\u00f8\u00fa\5*\26\2\u00f9\u00f4\3\2\2\2\u00f9\u00f5\3\2\2\2\u00f9\u00f6"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc/\3\2\2\2\u00fd\u00fb\3\2\2\2"+
		"\u00fe\u00ff\7\4\2\2\u00ff\u0100\7\3\2\2\u0100\61\3\2\2\2\u0101\u0102"+
		"\7\7\2\2\u0102\u0103\7\3\2\2\u0103\63\3\2\2\2\u0104\u0105\7\n\2\2\u0105"+
		"\u0106\7\3\2\2\u0106\65\3\2\2\2\u0107\u0108\7\5\2\2\u0108\u0109\7\3\2"+
		"\2\u0109\67\3\2\2\2\u010a\u010b\7\t\2\2\u010b\u010c\7\3\2\2\u010c9\3\2"+
		"\2\2\u010d\u0117\7\t\2\2\u010e\u0117\7\7\2\2\u010f\u0117\7\n\2\2\u0110"+
		"\u0117\7\4\2\2\u0111\u0117\5\60\31\2\u0112\u0117\5\62\32\2\u0113\u0117"+
		"\5\64\33\2\u0114\u0117\5\66\34\2\u0115\u0117\58\35\2\u0116\u010d\3\2\2"+
		"\2\u0116\u010e\3\2\2\2\u0116\u010f\3\2\2\2\u0116\u0110\3\2\2\2\u0116\u0111"+
		"\3\2\2\2\u0116\u0112\3\2\2\2\u0116\u0113\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0115\3\2\2\2\u0117;\3\2\2\2\u0118\u0119\t\5\2\2\u0119=\3\2\2\2\u011a"+
		"\u011b\7\35\2\2\u011b?\3\2\2\2\u011c\u011d\5:\36\2\u011d\u011e\5<\37\2"+
		"\u011eA\3\2\2\2\u011f\u0120\5:\36\2\u0120\u0121\5> \2\u0121C\3\2\2\2\u0122"+
		"\u0123\5:\36\2\u0123\u0124\7\20\2\2\u0124E\3\2\2\2\u0125\u0126\5:\36\2"+
		"\u0126\u0127\7\17\2\2\u0127G\3\2\2\2\u0128\u0129\7\b\2\2\u0129\u012a\7"+
		"\27\2\2\u012aI\3\2\2\2\u012b\u012c\7\5\2\2\u012c\u012d\7\32\2\2\u012d"+
		"\u012f\3\2\2\2\u012e\u0130\5$\23\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\7\5\2\2\u0134\u0135\7\33\2\2\u0135K\3\2\2\2\u0136\u0137\7\t\2\2"+
		"\u0137\u0138\7\32\2\2\u0138\u013a\3\2\2\2\u0139\u013b\5$\23\2\u013a\u0139"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013f\7\t\2\2\u013f\u0140\7\33\2\2\u0140M\3\2\2\2"+
		"\u0141\u0142\7\n\2\2\u0142\u0143\7\32\2\2\u0143\u0145\3\2\2\2\u0144\u0146"+
		"\5$\23\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\7\n\2\2\u014a\u014b\7\33"+
		"\2\2\u014bO\3\2\2\2\u014c\u0150\5H%\2\u014d\u0151\5J&\2\u014e\u0151\5"+
		"L\'\2\u014f\u0151\5N(\2\u0150\u014d\3\2\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u014f\3\2\2\2\u0151Q\3\2\2\2\u0152\u0153\t\6\2\2\u0153\u0160\7\32\2\2"+
		"\u0154\u0156\t\7\2\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157"+
		"\3\2\2\2\u0157\u0160\7\24\2\2\u0158\u0159\7\5\2\2\u0159\u015c\7\25\2\2"+
		"\u015a\u015c\7\35\2\2\u015b\u0158\3\2\2\2\u015b\u015a\3\2\2\2\u015c\u0160"+
		"\3\2\2\2\u015d\u0160\5\b\5\2\u015e\u0160\5@!\2\u015f\u0152\3\2\2\2\u015f"+
		"\u0155\3\2\2\2\u015f\u015b\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2"+
		"\2\2\u0160S\3\2\2\2\u0161\u016c\7\17\2\2\u0162\u016c\7\20\2\2\u0163\u016c"+
		"\7\21\2\2\u0164\u0167\7\22\2\2\u0165\u0166\7\22\2\2\u0166\u0168\7\22\2"+
		"\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016c\3\2\2\2\u0169\u016c"+
		"\7\23\2\2\u016a\u016c\7\24\2\2\u016b\u0161\3\2\2\2\u016b\u0162\3\2\2\2"+
		"\u016b\u0163\3\2\2\2\u016b\u0164\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016a"+
		"\3\2\2\2\u016c\u017a\3\2\2\2\u016d\u016e\t\6\2\2\u016e\u017a\7\33\2\2"+
		"\u016f\u0171\t\7\2\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172"+
		"\3\2\2\2\u0172\u017a\7\26\2\2\u0173\u0174\7\5\2\2\u0174\u0177\7\25\2\2"+
		"\u0175\u0177\7\35\2\2\u0176\u0173\3\2\2\2\u0176\u0175\3\2\2\2\u0177\u017a"+
		"\3\2\2\2\u0178\u017a\5B\"\2\u0179\u016b\3\2\2\2\u0179\u016d\3\2\2\2\u0179"+
		"\u0170\3\2\2\2\u0179\u0176\3\2\2\2\u0179\u0178\3\2\2\2\u017aU\3\2\2\2"+
		"+Y^fhjlqxz|~\u0082\u0088\u0090\u0094\u00a4\u00b5\u00bd\u00c0\u00c7\u00d0"+
		"\u00d4\u00d9\u00de\u00e5\u00f1\u00f9\u00fb\u0116\u0131\u013c\u0147\u0150"+
		"\u0155\u015b\u015f\u0167\u016b\u0170\u0176\u0179";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}