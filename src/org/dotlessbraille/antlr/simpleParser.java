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
		RULE_item = 4, RULE_space = 5, RULE_hyphen = 6, RULE_dash = 7, RULE_long_dash = 8, 
		RULE_separator = 9, RULE_trailingSep = 10, RULE_roots = 11, RULE_letters = 12, 
		RULE_saLetters = 13, RULE_ucLetters = 14, RULE_rootlessToken = 15, RULE_prefix = 16, 
		RULE_pr_token = 17, RULE_standingAlone = 18, RULE_updigs = 19, RULE_numspacedig = 20, 
		RULE_numind = 21, RULE_numfrag = 22, RULE_d4_hash = 23, RULE_d45_hash = 24, 
		RULE_d456_hash = 25, RULE_d5_hash = 26, RULE_d46_hash = 27, RULE_tfPrefix = 28, 
		RULE_tfStartRoot = 29, RULE_tfTermRoot = 30, RULE_tfStartIndicator = 31, 
		RULE_tfTermIndicator = 32, RULE_preAlone = 33, RULE_postAlone = 34;
	public static final String[] ruleNames = {
		"text", "line", "capsWordInd", "capsPassageInd", "item", "space", "hyphen", 
		"dash", "long_dash", "separator", "trailingSep", "roots", "letters", "saLetters", 
		"ucLetters", "rootlessToken", "prefix", "pr_token", "standingAlone", "updigs", 
		"numspacedig", "numind", "numfrag", "d4_hash", "d45_hash", "d456_hash", 
		"d5_hash", "d46_hash", "tfPrefix", "tfStartRoot", "tfTermRoot", "tfStartIndicator", 
		"tfTermIndicator", "preAlone", "postAlone"
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
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				line();
				}
				}
				setState(73); 
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
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(75);
					space();
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					{
					setState(81);
					standingAlone();
					}
					}
					break;
				case 2:
					{
					{
					setState(88); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(88);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case DOTS3456:
								{
								{
								setState(82);
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
								setState(84); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(83);
										item();
										}
										}
										break;
									default:
										throw new NoViableAltException(this);
									}
									setState(86); 
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
						setState(90); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(95); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(94);
								separator();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(97); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(110);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
						case 1:
							{
							{
							setState(99);
							standingAlone();
							}
							}
							break;
						case 2:
							{
							{
							setState(106); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									setState(106);
									_errHandler.sync(this);
									switch (_input.LA(1)) {
									case DOTS3456:
										{
										{
										setState(100);
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
										setState(102); 
										_errHandler.sync(this);
										_alt = 1;
										do {
											switch (_alt) {
											case 1:
												{
												{
												setState(101);
												item();
												}
												}
												break;
											default:
												throw new NoViableAltException(this);
											}
											setState(104); 
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
								setState(108); 
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
					setState(116);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT5) | (1L << DOT6) | (1L << DOTS36) | (1L << SPACE))) != 0)) {
					{
					{
					setState(117);
					trailingSep();
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(125);
					space();
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(131);
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
			setState(134);
			match(DOT6);
			}
			{
			setState(135);
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
			setState(137);
			match(DOT6);
			}
			{
			setState(138);
			match(DOT6);
			}
			{
			setState(139);
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
		public RootlessTokenContext rootlessToken() {
			return getRuleContext(RootlessTokenContext.class,0);
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
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(141);
				capsPassageInd();
				}
				break;
			case 2:
				{
				setState(142);
				capsWordInd();
				}
				break;
			case 3:
				{
				setState(143);
				rootlessToken();
				}
				break;
			case 4:
				{
				setState(144);
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
			setState(147);
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
			setState(151);
			match(DOT6);
			setState(152);
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
			setState(154);
			match(DOT5);
			setState(155);
			match(DOT6);
			setState(156);
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
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPACE:
				{
				setState(158);
				space();
				}
				break;
			case DOTS36:
				{
				setState(159);
				hyphen();
				}
				break;
			case DOT6:
				{
				setState(160);
				dash();
				}
				break;
			case DOT5:
				{
				setState(161);
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
			setState(164);
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
			setState(166);
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
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTERA:
			case LETTERB:
			case UPDIGS:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				updigs();
				}
				break;
			case MOST_LETTERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
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
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT6) {
				{
				setState(172);
				match(DOT6);
				}
			}

			setState(175);
			letters();
			}
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MOST_LETTERS) | (1L << LETTERA) | (1L << LETTERB) | (1L << UPDIGS))) != 0)) {
				{
				{
				setState(177);
				letters();
				}
				}
				setState(182);
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
			setState(183);
			match(DOT6);
			{
			setState(184);
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
		enterRule(_localctx, 30, RULE_rootlessToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
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
			setState(188);
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
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT4) | (1L << DOT5) | (1L << DOT6) | (1L << DOTS45) | (1L << DOTS56) | (1L << DOTS46) | (1L << DOTS456))) != 0)) {
				{
				setState(190);
				prefix();
				}
			}

			setState(195);
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
				setState(193);
				roots();
				}
				break;
			case MOST_LETTERS:
			case LETTERA:
			case LETTERB:
			case UPDIGS:
				{
				setState(194);
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
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(197);
					preAlone();
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			{
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(203);
				capsPassageInd();
				}
				break;
			case 2:
				{
				setState(204);
				capsWordInd();
				}
				break;
			}
			{
			setState(207);
			saLetters();
			}
			}
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(209);
					postAlone();
					}
					} 
				}
				setState(214);
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
			setState(215);
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
			setState(217);
			match(DOT5);
			setState(218);
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
			setState(220);
			match(DOTS3456);
			}
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTERA:
			case LETTERB:
			case UPDIGS:
				{
				setState(221);
				updigs();
				}
				break;
			case DOT2:
				{
				setState(222);
				match(DOT2);
				}
				break;
			case DOTS256:
				{
				setState(223);
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
			setState(226);
			numind();
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(232);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LETTERA:
					case LETTERB:
					case UPDIGS:
						{
						setState(227);
						updigs();
						}
						break;
					case DOT2:
						{
						setState(228);
						match(DOT2);
						}
						break;
					case DOTS256:
						{
						setState(229);
						match(DOTS256);
						}
						break;
					case DOTS34:
						{
						setState(230);
						match(DOTS34);
						}
						break;
					case DOT5:
						{
						setState(231);
						numspacedig();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(236);
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
			setState(237);
			match(DOT4);
			setState(238);
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
			setState(240);
			match(DOTS45);
			setState(241);
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
			setState(243);
			match(DOTS456);
			setState(244);
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
			setState(246);
			match(DOT5);
			setState(247);
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
			setState(249);
			match(DOTS46);
			setState(250);
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
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(DOTS46);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(DOTS45);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				match(DOTS456);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				match(DOT4);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(256);
				d4_hash();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(257);
				d45_hash();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(258);
				d456_hash();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(259);
				d5_hash();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(260);
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
			setState(263);
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
			setState(265);
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
			setState(267);
			tfPrefix();
			}
			{
			setState(268);
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
			setState(270);
			tfPrefix();
			}
			{
			setState(271);
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
		enterRule(_localctx, 66, RULE_preAlone);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				{
				setState(273);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT5) | (1L << DOTS46) | (1L << DOTS456))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(274);
				match(DOTS126);
				}
				}
				break;
			case 2:
				{
				{
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT6) | (1L << DOTS45) | (1L << DOTS456))) != 0)) {
					{
					setState(275);
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

				setState(278);
				match(DOTS236);
				}
				}
				break;
			case 3:
				{
				setState(282);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT5:
					{
					setState(279);
					match(DOT5);
					setState(280);
					match(DOTS2356);
					}
					break;
				case DOT3:
					{
					setState(281);
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
				setState(284);
				capsPassageInd();
				}
				break;
			case 5:
				{
				setState(285);
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
		enterRule(_localctx, 68, RULE_postAlone);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(298);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT2:
					{
					setState(288);
					match(DOT2);
					}
					break;
				case DOTS23:
					{
					setState(289);
					match(DOTS23);
					}
					break;
				case DOTS25:
					{
					setState(290);
					match(DOTS25);
					}
					break;
				case DOTS256:
					{
					setState(291);
					match(DOTS256);
					setState(294);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(292);
						match(DOTS256);
						setState(293);
						match(DOTS256);
						}
						break;
					}
					}
					break;
				case DOTS235:
					{
					setState(296);
					match(DOTS235);
					}
					break;
				case DOTS236:
					{
					setState(297);
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
				setState(300);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT5) | (1L << DOTS46) | (1L << DOTS456))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(301);
				match(DOTS345);
				}
				}
				break;
			case 3:
				{
				{
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT6) | (1L << DOTS45) | (1L << DOTS456))) != 0)) {
					{
					setState(302);
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

				setState(305);
				match(DOTS356);
				}
				}
				break;
			case 4:
				{
				setState(309);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT5:
					{
					setState(306);
					match(DOT5);
					setState(307);
					match(DOTS2356);
					}
					break;
				case DOT3:
					{
					setState(308);
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
				setState(311);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u013d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\6\2J\n\2\r\2\16\2K\3\3\7\3O\n\3\f\3\16\3R"+
		"\13\3\3\3\3\3\3\3\6\3W\n\3\r\3\16\3X\6\3[\n\3\r\3\16\3\\\5\3_\n\3\3\3"+
		"\6\3b\n\3\r\3\16\3c\3\3\3\3\3\3\6\3i\n\3\r\3\16\3j\6\3m\n\3\r\3\16\3n"+
		"\5\3q\n\3\7\3s\n\3\f\3\16\3v\13\3\3\3\7\3y\n\3\f\3\16\3|\13\3\3\3\3\3"+
		"\3\3\7\3\u0081\n\3\f\3\16\3\u0084\13\3\3\3\5\3\u0087\n\3\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u0094\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00a5\n\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\5\16\u00ad\n\16\3\17\5\17\u00b0\n\17\3\17\3\17\3\17\7\17\u00b5"+
		"\n\17\f\17\16\17\u00b8\13\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\5"+
		"\23\u00c2\n\23\3\23\3\23\5\23\u00c6\n\23\3\24\7\24\u00c9\n\24\f\24\16"+
		"\24\u00cc\13\24\3\24\3\24\5\24\u00d0\n\24\3\24\3\24\3\24\7\24\u00d5\n"+
		"\24\f\24\16\24\u00d8\13\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\5\27\u00e3\n\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u00eb\n\30\f\30\16"+
		"\30\u00ee\13\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u0108\n\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\5#\u0117\n#"+
		"\3#\3#\3#\3#\5#\u011d\n#\3#\3#\5#\u0121\n#\3$\3$\3$\3$\3$\3$\5$\u0129"+
		"\n$\3$\3$\5$\u012d\n$\3$\3$\3$\5$\u0132\n$\3$\3$\3$\3$\5$\u0138\n$\3$"+
		"\5$\u013b\n$\3$\2\2%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDF\2\b\4\2\17\25\27\36\3\2\4\n\3\2\"$\4\2\17\20\25\25\4"+
		"\2\5\5\t\n\4\2\6\7\n\n\2\u0158\2I\3\2\2\2\4\u0086\3\2\2\2\6\u0088\3\2"+
		"\2\2\b\u008b\3\2\2\2\n\u0093\3\2\2\2\f\u0095\3\2\2\2\16\u0097\3\2\2\2"+
		"\20\u0099\3\2\2\2\22\u009c\3\2\2\2\24\u00a4\3\2\2\2\26\u00a6\3\2\2\2\30"+
		"\u00a8\3\2\2\2\32\u00ac\3\2\2\2\34\u00af\3\2\2\2\36\u00b9\3\2\2\2 \u00bc"+
		"\3\2\2\2\"\u00be\3\2\2\2$\u00c1\3\2\2\2&\u00ca\3\2\2\2(\u00d9\3\2\2\2"+
		"*\u00db\3\2\2\2,\u00de\3\2\2\2.\u00e4\3\2\2\2\60\u00ef\3\2\2\2\62\u00f2"+
		"\3\2\2\2\64\u00f5\3\2\2\2\66\u00f8\3\2\2\28\u00fb\3\2\2\2:\u0107\3\2\2"+
		"\2<\u0109\3\2\2\2>\u010b\3\2\2\2@\u010d\3\2\2\2B\u0110\3\2\2\2D\u0120"+
		"\3\2\2\2F\u013a\3\2\2\2HJ\5\4\3\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2"+
		"\2\2L\3\3\2\2\2MO\5\f\7\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q^\3"+
		"\2\2\2RP\3\2\2\2S_\5&\24\2T[\5.\30\2UW\5\n\6\2VU\3\2\2\2WX\3\2\2\2XV\3"+
		"\2\2\2XY\3\2\2\2Y[\3\2\2\2ZT\3\2\2\2ZV\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\"+
		"]\3\2\2\2]_\3\2\2\2^S\3\2\2\2^Z\3\2\2\2_t\3\2\2\2`b\5\24\13\2a`\3\2\2"+
		"\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2dp\3\2\2\2eq\5&\24\2fm\5.\30\2gi\5\n\6"+
		"\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lf\3\2\2\2lh\3\2\2"+
		"\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pe\3\2\2\2pl\3\2\2\2qs\3\2\2"+
		"\2ra\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uz\3\2\2\2vt\3\2\2\2wy\5\26"+
		"\f\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7 "+
		"\2\2~\u0087\3\2\2\2\177\u0081\5\f\7\2\u0080\177\3\2\2\2\u0081\u0084\3"+
		"\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0087\7 \2\2\u0086P\3\2\2\2\u0086\u0082\3\2\2\2\u0087"+
		"\5\3\2\2\2\u0088\u0089\7\6\2\2\u0089\u008a\7\6\2\2\u008a\7\3\2\2\2\u008b"+
		"\u008c\7\6\2\2\u008c\u008d\7\6\2\2\u008d\u008e\7\6\2\2\u008e\t\3\2\2\2"+
		"\u008f\u0094\5\b\5\2\u0090\u0094\5\6\4\2\u0091\u0094\5 \21\2\u0092\u0094"+
		"\5$\23\2\u0093\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\13\3\2\2\2\u0095\u0096\7\37\2\2\u0096\r\3\2\2\2\u0097"+
		"\u0098\7\31\2\2\u0098\17\3\2\2\2\u0099\u009a\7\6\2\2\u009a\u009b\7\31"+
		"\2\2\u009b\21\3\2\2\2\u009c\u009d\7\5\2\2\u009d\u009e\7\6\2\2\u009e\u009f"+
		"\7\31\2\2\u009f\23\3\2\2\2\u00a0\u00a5\5\f\7\2\u00a1\u00a5\5\16\b\2\u00a2"+
		"\u00a5\5\20\t\2\u00a3\u00a5\5\22\n\2\u00a4\u00a0\3\2\2\2\u00a4\u00a1\3"+
		"\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\25\3\2\2\2\u00a6"+
		"\u00a7\5\24\13\2\u00a7\27\3\2\2\2\u00a8\u00a9\t\2\2\2\u00a9\31\3\2\2\2"+
		"\u00aa\u00ad\5(\25\2\u00ab\u00ad\7\16\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab"+
		"\3\2\2\2\u00ad\33\3\2\2\2\u00ae\u00b0\7\6\2\2\u00af\u00ae\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\5\32\16\2\u00b2\u00b6\3"+
		"\2\2\2\u00b3\u00b5\5\32\16\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\35\3\2\2\2\u00b8\u00b6\3\2\2"+
		"\2\u00b9\u00ba\7\6\2\2\u00ba\u00bb\5\32\16\2\u00bb\37\3\2\2\2\u00bc\u00bd"+
		"\7\b\2\2\u00bd!\3\2\2\2\u00be\u00bf\t\3\2\2\u00bf#\3\2\2\2\u00c0\u00c2"+
		"\5\"\22\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c5\3\2\2\2"+
		"\u00c3\u00c6\5\30\r\2\u00c4\u00c6\5\32\16\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c4\3\2\2\2\u00c6%\3\2\2\2\u00c7\u00c9\5D#\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cf\3\2"+
		"\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\5\b\5\2\u00ce\u00d0\5\6\4\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d2\5\34\17\2\u00d2\u00d6\3\2\2\2\u00d3\u00d5\5F$\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\'\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\t\4\2\2\u00da)\3"+
		"\2\2\2\u00db\u00dc\7\5\2\2\u00dc\u00dd\5(\25\2\u00dd+\3\2\2\2\u00de\u00e2"+
		"\7\3\2\2\u00df\u00e3\5(\25\2\u00e0\u00e3\7\17\2\2\u00e1\u00e3\7\22\2\2"+
		"\u00e2\u00df\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3-\3"+
		"\2\2\2\u00e4\u00ec\5,\27\2\u00e5\u00eb\5(\25\2\u00e6\u00eb\7\17\2\2\u00e7"+
		"\u00eb\7\22\2\2\u00e8\u00eb\7\30\2\2\u00e9\u00eb\5*\26\2\u00ea\u00e5\3"+
		"\2\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00e7\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed/\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7\4\2\2\u00f0\u00f1"+
		"\7\3\2\2\u00f1\61\3\2\2\2\u00f2\u00f3\7\7\2\2\u00f3\u00f4\7\3\2\2\u00f4"+
		"\63\3\2\2\2\u00f5\u00f6\7\n\2\2\u00f6\u00f7\7\3\2\2\u00f7\65\3\2\2\2\u00f8"+
		"\u00f9\7\5\2\2\u00f9\u00fa\7\3\2\2\u00fa\67\3\2\2\2\u00fb\u00fc\7\t\2"+
		"\2\u00fc\u00fd\7\3\2\2\u00fd9\3\2\2\2\u00fe\u0108\7\t\2\2\u00ff\u0108"+
		"\7\7\2\2\u0100\u0108\7\n\2\2\u0101\u0108\7\4\2\2\u0102\u0108\5\60\31\2"+
		"\u0103\u0108\5\62\32\2\u0104\u0108\5\64\33\2\u0105\u0108\5\66\34\2\u0106"+
		"\u0108\58\35\2\u0107\u00fe\3\2\2\2\u0107\u00ff\3\2\2\2\u0107\u0100\3\2"+
		"\2\2\u0107\u0101\3\2\2\2\u0107\u0102\3\2\2\2\u0107\u0103\3\2\2\2\u0107"+
		"\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108;\3\2\2\2"+
		"\u0109\u010a\t\5\2\2\u010a=\3\2\2\2\u010b\u010c\7\35\2\2\u010c?\3\2\2"+
		"\2\u010d\u010e\5:\36\2\u010e\u010f\5<\37\2\u010fA\3\2\2\2\u0110\u0111"+
		"\5:\36\2\u0111\u0112\5> \2\u0112C\3\2\2\2\u0113\u0114\t\6\2\2\u0114\u0121"+
		"\7\32\2\2\u0115\u0117\t\7\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2"+
		"\u0117\u0118\3\2\2\2\u0118\u0121\7\24\2\2\u0119\u011a\7\5\2\2\u011a\u011d"+
		"\7\25\2\2\u011b\u011d\7\35\2\2\u011c\u0119\3\2\2\2\u011c\u011b\3\2\2\2"+
		"\u011d\u0121\3\2\2\2\u011e\u0121\5\b\5\2\u011f\u0121\5@!\2\u0120\u0113"+
		"\3\2\2\2\u0120\u0116\3\2\2\2\u0120\u011c\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u011f\3\2\2\2\u0121E\3\2\2\2\u0122\u012d\7\17\2\2\u0123\u012d\7\20\2"+
		"\2\u0124\u012d\7\21\2\2\u0125\u0128\7\22\2\2\u0126\u0127\7\22\2\2\u0127"+
		"\u0129\7\22\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012d\3"+
		"\2\2\2\u012a\u012d\7\23\2\2\u012b\u012d\7\24\2\2\u012c\u0122\3\2\2\2\u012c"+
		"\u0123\3\2\2\2\u012c\u0124\3\2\2\2\u012c\u0125\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012c\u012b\3\2\2\2\u012d\u013b\3\2\2\2\u012e\u012f\t\6\2\2\u012f"+
		"\u013b\7\33\2\2\u0130\u0132\t\7\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3"+
		"\2\2\2\u0132\u0133\3\2\2\2\u0133\u013b\7\26\2\2\u0134\u0135\7\5\2\2\u0135"+
		"\u0138\7\25\2\2\u0136\u0138\7\35\2\2\u0137\u0134\3\2\2\2\u0137\u0136\3"+
		"\2\2\2\u0138\u013b\3\2\2\2\u0139\u013b\5B\"\2\u013a\u012c\3\2\2\2\u013a"+
		"\u012e\3\2\2\2\u013a\u0131\3\2\2\2\u013a\u0137\3\2\2\2\u013a\u0139\3\2"+
		"\2\2\u013bG\3\2\2\2\'KPXZ\\^cjlnptz\u0082\u0086\u0093\u00a4\u00ac\u00af"+
		"\u00b6\u00c1\u00c5\u00ca\u00cf\u00d6\u00e2\u00ea\u00ec\u0107\u0116\u011c"+
		"\u0120\u0128\u012c\u0131\u0137\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}