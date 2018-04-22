// Generated from simpleParser.g4 by ANTLR 4.7.1
 package org.dotlessbraille.antlr; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpleParser}.
 */
public interface simpleParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpleParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(simpleParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(simpleParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(simpleParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(simpleParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#capsWordInd}.
	 * @param ctx the parse tree
	 */
	void enterCapsWordInd(simpleParser.CapsWordIndContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#capsWordInd}.
	 * @param ctx the parse tree
	 */
	void exitCapsWordInd(simpleParser.CapsWordIndContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#capsPassageInd}.
	 * @param ctx the parse tree
	 */
	void enterCapsPassageInd(simpleParser.CapsPassageIndContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#capsPassageInd}.
	 * @param ctx the parse tree
	 */
	void exitCapsPassageInd(simpleParser.CapsPassageIndContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#rootlessToken}.
	 * @param ctx the parse tree
	 */
	void enterRootlessToken(simpleParser.RootlessTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#rootlessToken}.
	 * @param ctx the parse tree
	 */
	void exitRootlessToken(simpleParser.RootlessTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#nemethStartDisplay}.
	 * @param ctx the parse tree
	 */
	void enterNemethStartDisplay(simpleParser.NemethStartDisplayContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#nemethStartDisplay}.
	 * @param ctx the parse tree
	 */
	void exitNemethStartDisplay(simpleParser.NemethStartDisplayContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#nemethEndDisplay}.
	 * @param ctx the parse tree
	 */
	void enterNemethEndDisplay(simpleParser.NemethEndDisplayContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#nemethEndDisplay}.
	 * @param ctx the parse tree
	 */
	void exitNemethEndDisplay(simpleParser.NemethEndDisplayContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#nemethStartInline}.
	 * @param ctx the parse tree
	 */
	void enterNemethStartInline(simpleParser.NemethStartInlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#nemethStartInline}.
	 * @param ctx the parse tree
	 */
	void exitNemethStartInline(simpleParser.NemethStartInlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#nemethEndInline}.
	 * @param ctx the parse tree
	 */
	void enterNemethEndInline(simpleParser.NemethEndInlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#nemethEndInline}.
	 * @param ctx the parse tree
	 */
	void exitNemethEndInline(simpleParser.NemethEndInlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(simpleParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(simpleParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#space}.
	 * @param ctx the parse tree
	 */
	void enterSpace(simpleParser.SpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#space}.
	 * @param ctx the parse tree
	 */
	void exitSpace(simpleParser.SpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#hyphen}.
	 * @param ctx the parse tree
	 */
	void enterHyphen(simpleParser.HyphenContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#hyphen}.
	 * @param ctx the parse tree
	 */
	void exitHyphen(simpleParser.HyphenContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#dash}.
	 * @param ctx the parse tree
	 */
	void enterDash(simpleParser.DashContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#dash}.
	 * @param ctx the parse tree
	 */
	void exitDash(simpleParser.DashContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#long_dash}.
	 * @param ctx the parse tree
	 */
	void enterLong_dash(simpleParser.Long_dashContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#long_dash}.
	 * @param ctx the parse tree
	 */
	void exitLong_dash(simpleParser.Long_dashContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#separator}.
	 * @param ctx the parse tree
	 */
	void enterSeparator(simpleParser.SeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#separator}.
	 * @param ctx the parse tree
	 */
	void exitSeparator(simpleParser.SeparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#trailingSep}.
	 * @param ctx the parse tree
	 */
	void enterTrailingSep(simpleParser.TrailingSepContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#trailingSep}.
	 * @param ctx the parse tree
	 */
	void exitTrailingSep(simpleParser.TrailingSepContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#roots}.
	 * @param ctx the parse tree
	 */
	void enterRoots(simpleParser.RootsContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#roots}.
	 * @param ctx the parse tree
	 */
	void exitRoots(simpleParser.RootsContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#letters}.
	 * @param ctx the parse tree
	 */
	void enterLetters(simpleParser.LettersContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#letters}.
	 * @param ctx the parse tree
	 */
	void exitLetters(simpleParser.LettersContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#saLetters}.
	 * @param ctx the parse tree
	 */
	void enterSaLetters(simpleParser.SaLettersContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#saLetters}.
	 * @param ctx the parse tree
	 */
	void exitSaLetters(simpleParser.SaLettersContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#ucLetters}.
	 * @param ctx the parse tree
	 */
	void enterUcLetters(simpleParser.UcLettersContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#ucLetters}.
	 * @param ctx the parse tree
	 */
	void exitUcLetters(simpleParser.UcLettersContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(simpleParser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(simpleParser.PrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#largeWords}.
	 * @param ctx the parse tree
	 */
	void enterLargeWords(simpleParser.LargeWordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#largeWords}.
	 * @param ctx the parse tree
	 */
	void exitLargeWords(simpleParser.LargeWordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#initLetCons}.
	 * @param ctx the parse tree
	 */
	void enterInitLetCons(simpleParser.InitLetConsContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#initLetCons}.
	 * @param ctx the parse tree
	 */
	void exitInitLetCons(simpleParser.InitLetConsContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#strong_ws}.
	 * @param ctx the parse tree
	 */
	void enterStrong_ws(simpleParser.Strong_wsContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#strong_ws}.
	 * @param ctx the parse tree
	 */
	void exitStrong_ws(simpleParser.Strong_wsContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#shortForms}.
	 * @param ctx the parse tree
	 */
	void enterShortForms(simpleParser.ShortFormsContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#shortForms}.
	 * @param ctx the parse tree
	 */
	void exitShortForms(simpleParser.ShortFormsContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#standingAlone}.
	 * @param ctx the parse tree
	 */
	void enterStandingAlone(simpleParser.StandingAloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#standingAlone}.
	 * @param ctx the parse tree
	 */
	void exitStandingAlone(simpleParser.StandingAloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#pr_token}.
	 * @param ctx the parse tree
	 */
	void enterPr_token(simpleParser.Pr_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#pr_token}.
	 * @param ctx the parse tree
	 */
	void exitPr_token(simpleParser.Pr_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#updigs}.
	 * @param ctx the parse tree
	 */
	void enterUpdigs(simpleParser.UpdigsContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#updigs}.
	 * @param ctx the parse tree
	 */
	void exitUpdigs(simpleParser.UpdigsContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#numspacedig}.
	 * @param ctx the parse tree
	 */
	void enterNumspacedig(simpleParser.NumspacedigContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#numspacedig}.
	 * @param ctx the parse tree
	 */
	void exitNumspacedig(simpleParser.NumspacedigContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#numind}.
	 * @param ctx the parse tree
	 */
	void enterNumind(simpleParser.NumindContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#numind}.
	 * @param ctx the parse tree
	 */
	void exitNumind(simpleParser.NumindContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#numfrag}.
	 * @param ctx the parse tree
	 */
	void enterNumfrag(simpleParser.NumfragContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#numfrag}.
	 * @param ctx the parse tree
	 */
	void exitNumfrag(simpleParser.NumfragContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#nemInteger}.
	 * @param ctx the parse tree
	 */
	void enterNemInteger(simpleParser.NemIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#nemInteger}.
	 * @param ctx the parse tree
	 */
	void exitNemInteger(simpleParser.NemIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#nemReal}.
	 * @param ctx the parse tree
	 */
	void enterNemReal(simpleParser.NemRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#nemReal}.
	 * @param ctx the parse tree
	 */
	void exitNemReal(simpleParser.NemRealContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#nemOp}.
	 * @param ctx the parse tree
	 */
	void enterNemOp(simpleParser.NemOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#nemOp}.
	 * @param ctx the parse tree
	 */
	void exitNemOp(simpleParser.NemOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#nemComp}.
	 * @param ctx the parse tree
	 */
	void enterNemComp(simpleParser.NemCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#nemComp}.
	 * @param ctx the parse tree
	 */
	void exitNemComp(simpleParser.NemCompContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#nemId}.
	 * @param ctx the parse tree
	 */
	void enterNemId(simpleParser.NemIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#nemId}.
	 * @param ctx the parse tree
	 */
	void exitNemId(simpleParser.NemIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#nemOGroup}.
	 * @param ctx the parse tree
	 */
	void enterNemOGroup(simpleParser.NemOGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#nemOGroup}.
	 * @param ctx the parse tree
	 */
	void exitNemOGroup(simpleParser.NemOGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#nemCGroup}.
	 * @param ctx the parse tree
	 */
	void enterNemCGroup(simpleParser.NemCGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#nemCGroup}.
	 * @param ctx the parse tree
	 */
	void exitNemCGroup(simpleParser.NemCGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#nemSyms}.
	 * @param ctx the parse tree
	 */
	void enterNemSyms(simpleParser.NemSymsContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#nemSyms}.
	 * @param ctx the parse tree
	 */
	void exitNemSyms(simpleParser.NemSymsContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#d4_hash}.
	 * @param ctx the parse tree
	 */
	void enterD4_hash(simpleParser.D4_hashContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#d4_hash}.
	 * @param ctx the parse tree
	 */
	void exitD4_hash(simpleParser.D4_hashContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#d45_hash}.
	 * @param ctx the parse tree
	 */
	void enterD45_hash(simpleParser.D45_hashContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#d45_hash}.
	 * @param ctx the parse tree
	 */
	void exitD45_hash(simpleParser.D45_hashContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#d456_hash}.
	 * @param ctx the parse tree
	 */
	void enterD456_hash(simpleParser.D456_hashContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#d456_hash}.
	 * @param ctx the parse tree
	 */
	void exitD456_hash(simpleParser.D456_hashContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#d5_hash}.
	 * @param ctx the parse tree
	 */
	void enterD5_hash(simpleParser.D5_hashContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#d5_hash}.
	 * @param ctx the parse tree
	 */
	void exitD5_hash(simpleParser.D5_hashContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#d46_hash}.
	 * @param ctx the parse tree
	 */
	void enterD46_hash(simpleParser.D46_hashContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#d46_hash}.
	 * @param ctx the parse tree
	 */
	void exitD46_hash(simpleParser.D46_hashContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#tfPrefix}.
	 * @param ctx the parse tree
	 */
	void enterTfPrefix(simpleParser.TfPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#tfPrefix}.
	 * @param ctx the parse tree
	 */
	void exitTfPrefix(simpleParser.TfPrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#tfStartRoot}.
	 * @param ctx the parse tree
	 */
	void enterTfStartRoot(simpleParser.TfStartRootContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#tfStartRoot}.
	 * @param ctx the parse tree
	 */
	void exitTfStartRoot(simpleParser.TfStartRootContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#tfTermRoot}.
	 * @param ctx the parse tree
	 */
	void enterTfTermRoot(simpleParser.TfTermRootContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#tfTermRoot}.
	 * @param ctx the parse tree
	 */
	void exitTfTermRoot(simpleParser.TfTermRootContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#tfStartIndicator}.
	 * @param ctx the parse tree
	 */
	void enterTfStartIndicator(simpleParser.TfStartIndicatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#tfStartIndicator}.
	 * @param ctx the parse tree
	 */
	void exitTfStartIndicator(simpleParser.TfStartIndicatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#tfTermIndicator}.
	 * @param ctx the parse tree
	 */
	void enterTfTermIndicator(simpleParser.TfTermIndicatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#tfTermIndicator}.
	 * @param ctx the parse tree
	 */
	void exitTfTermIndicator(simpleParser.TfTermIndicatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#tfSymbolInd}.
	 * @param ctx the parse tree
	 */
	void enterTfSymbolInd(simpleParser.TfSymbolIndContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#tfSymbolInd}.
	 * @param ctx the parse tree
	 */
	void exitTfSymbolInd(simpleParser.TfSymbolIndContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#tfWordInd}.
	 * @param ctx the parse tree
	 */
	void enterTfWordInd(simpleParser.TfWordIndContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#tfWordInd}.
	 * @param ctx the parse tree
	 */
	void exitTfWordInd(simpleParser.TfWordIndContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#subsup}.
	 * @param ctx the parse tree
	 */
	void enterSubsup(simpleParser.SubsupContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#subsup}.
	 * @param ctx the parse tree
	 */
	void exitSubsup(simpleParser.SubsupContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#encl1}.
	 * @param ctx the parse tree
	 */
	void enterEncl1(simpleParser.Encl1Context ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#encl1}.
	 * @param ctx the parse tree
	 */
	void exitEncl1(simpleParser.Encl1Context ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#encl2}.
	 * @param ctx the parse tree
	 */
	void enterEncl2(simpleParser.Encl2Context ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#encl2}.
	 * @param ctx the parse tree
	 */
	void exitEncl2(simpleParser.Encl2Context ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#encl3}.
	 * @param ctx the parse tree
	 */
	void enterEncl3(simpleParser.Encl3Context ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#encl3}.
	 * @param ctx the parse tree
	 */
	void exitEncl3(simpleParser.Encl3Context ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#scrip}.
	 * @param ctx the parse tree
	 */
	void enterScrip(simpleParser.ScripContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#scrip}.
	 * @param ctx the parse tree
	 */
	void exitScrip(simpleParser.ScripContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#preAlone}.
	 * @param ctx the parse tree
	 */
	void enterPreAlone(simpleParser.PreAloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#preAlone}.
	 * @param ctx the parse tree
	 */
	void exitPreAlone(simpleParser.PreAloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#postAlone}.
	 * @param ctx the parse tree
	 */
	void enterPostAlone(simpleParser.PostAloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#postAlone}.
	 * @param ctx the parse tree
	 */
	void exitPostAlone(simpleParser.PostAloneContext ctx);
}