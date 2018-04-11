import java.util.Stack;

//Should be implementing Status??
//Working on single point of inter-token communication

class KeepTrack{ 
 
 // Tree walker uses these enums to request appropriate
 //backtranslation            
 enum Trans { SA_PREFIX, SA_SEQ, SA_POSTFIX, INDICATOR, 
              NUMERIC_SEQ, NUMERIC_SYM, LAST_NUMERIC_SYM,
              IF_AFTER, EOL_AFTER, GENERIC_TOKEN, SEPARATOR }

 //static String brlOpenGroup = "<";
 //static String brlCloseGroup = ">";

  //Uncontracted braille uses no contractions
  //Grade 1 is a mode in contracted braille
 public static boolean uncontracted = true;

 public static String g1SpecBrl = ";;;;";
 public static String g1SymInd = ";";
 //boolean trace = true;
 boolean showUseDLinInk = true;
 boolean showMenDLinInk = true;


 
 
 LetterBT letterBT;
 SALetterBT saLetterBT;
 PendingCapInds capInfo;
 CapsHandler capsHandler;

 boolean nummode = false;
 boolean defaultUEB = true;
 boolean trace = true;
 boolean wwContractions = true;
 boolean dlMention = false;
 boolean showDL = true;
 boolean lastWasSubSup = false;

 private boolean isOpenEncl( String brl ){
  return false;
 }
 private boolean isCloseEncl( String brl ){
  return false;
 }

 //Last numeric character, backtrans and check
 //if it terminates a script
String numfragDone( String brl ){
 String ink = UpperNumber.getInk( brl );
 if (ink == null) return null;
 String tag = SubSupIndicator.afterNumfrag();
 if (tag == null) return ink;
 StringBuilder buf = new StringBuilder( ink );
 return buf.append( tag).toString();
  //Imaginary token used to ensure g1 flags set
 //processIndicators( g1SpecBrl );

}

 
 KeepTrack( PendingCapInds capInfo,
            boolean isUncontracted ){
  this.capInfo = capInfo;
  this.letterBT = new LetterBT( capInfo );
  this.saLetterBT = new SALetterBT( capInfo );
  capsHandler = new CapsHandler( capInfo );
  setUncon( isUncontracted );
 }

           //**Communication**//

static void setUncon( boolean isUncon ){
  uncontracted = isUncon;
}
static boolean getUncon(){
 return uncontracted;
}
static boolean isContracted(){
 return !uncontracted;
}
private void separatorEncountered( boolean isSep){
 capInfo.separatorEncountered( isSep );
}
private String spaceEncountered( String brl ){
 String endTag = SubSupIndicator.spaceEncountered();
 if (endTag == null) return brl;
 return endTag+brl;
}
private void spaceEncountered(){
 System.out.println( "Space encountered...." );
 capInfo.separatorEncountered( true );
}
 

private String afterSymbol(){
 String ink = TypeformsHandler.afterSymbol();
 //return TypeformsHandler.afterSymbol();
 return ink;

}

 //   A subscript or superscript indicator
 // can be terminated by the close enclosure symbol
 // that matches any open one immediately
 // following the indicator.  It is also
 // terminated by the end of a numeric item.
 // There are other possibilites for technical
 // material not addressed here.
private void updateSubSup( String brl ){
 System.out.println( "KT update lastWasSubsup: "+ lastWasSubSup );
 if (!lastWasSubSup) return;
 System.out.println( "KT: updateSS brl: "+brl );
 String close = Punctuation.ifPreGetPost( brl );
 if (close != null){
  System.out.println( "close: "+close );
  SubSupIndicator.setWaitingFor( close );
 }
 lastWasSubSup = false;
}
 //Checks with the just-translated input is
 //the matching close indicator for a
 //pending script
private String finishSubSup( String brl ){
 return SubSupIndicator.getAfterTag( brl );
}
private void finishSubSup( ){
 if (!SubSupIndicator.subSupIsPending()) return;
}


//**********************************************
   //Main entry point for all backtranslation
   //Uses information supplied parse tree walker
   //Items that might possibly be indicators
   //handled by the item methods
//**********************************************
String backTrans( String brl, Trans btMethod ){
  //IF_AFTER should go somewhere else
 if (btMethod != Trans.IF_AFTER ){
  updateSubSup( brl );
 }
 switch (btMethod){
  case SA_PREFIX:
   return addAfter( handleSAPrefix( brl ), brl );
  case SA_SEQ:
   return addAfter( backTransSAseq( brl ), brl );
  case SA_POSTFIX:
   return addAfter( handleSAPostfix( brl ), brl );
  case INDICATOR:
   return processIndicators( brl );
  case NUMERIC_SEQ:  // Check for "vulgar fraction"
   return numfragDone( brl );
  case NUMERIC_SYM:
   return numericMode( brl );
  case IF_AFTER:
   return afterSymbol( );
  case EOL_AFTER:
   return SubSupIndicator.afterAtEOL();
  case GENERIC_TOKEN:
   String ink =  processIndicators( brl );
   //System.out.println( "KeepTrack bt token: |"+ink+"|");
   if (ink != null) return ink;
   return addAfter( backTransToken( brl ), brl );
  case SEPARATOR:
   return backTransSeparator( brl );
 }
  return "";
}
  

    //IMPROVE THIS
String brlDots( String brl ){
 return "[sim]"+brl+"[sim]";
}

private String addAfter( String ink, String brl ){
 String after = finishSubSup( brl );
 System.out.println( "KT--addAfter: |"+after+"| brl:"+brl );
 StringBuilder buf = new StringBuilder();
 if (after != null){
  buf.append( ink );
  buf.append( after );
  after = afterSymbol();
  if (after != null){
   return buf.append( after ).toString();
  } else {
   return buf.toString();
  }
 }
 after = afterSymbol();
 if (after == null) return ink;
 buf.append( ink );
 return buf.append( after ).toString();
}

            //**Numeric mode**//

  //  The parser grammar recognizes as numeric mode
  //numind: ((DOTS3456) (updigs| DOT2 | DOTS256 )); 
  //numfrag: numind (updigs | DOT2 | DOTS256 | DOTS34 | numspacedig )*;
  // There seems to be more than one numeric mode....
  //Numeric passage/terminator Rulebook Sec. 6.9
     //Mainly used for worked examples
     //Sets grade 1 (no contractions) and letters a-j 
     //must each[?] a leading dots-56
  // The spaced numeric indicator
  //TODO set special g1 mode
private String numericMode( String brl ){
 if (dlMention) return handleMention( brl );
 Indicator ind = check4Ind( brl );
 //Not all numeric symbols are indicators but the
 //12 basic numeric (start) indicators are also symbols
 if (ind != null){
    return handleNumericIndicator( brl, ind );
 }
 //Just a numeric symbol, not an indicator
 return UpperNumber.getInk( brl );
}
private String handleNumericIndicator( String brl, Indicator ind ){
 IndicatorClass ic = ind.myIndData.getMyClassEnum();
 if (ic != IndicatorClass.NUMERIC_INDICATOR) {
   System.out.println( "Error in numeric mode for braille: "+brl);
   System.exit( 2 );
 }
 IndicatorType iType = ind.getIndType();
 if (iType == IndicatorType.NUMERIC_START){
  processIndicators( g1SpecBrl );
  return UpperNumber.getInk( brl );
 }
 if (iType == IndicatorType.NUMERIC_TERMINATOR){
   //Do something
   return "";
 }
 if (iType == IndicatorType.NUMERIC_CONTINUE){
   //Do something
   return "";
 }
 //The spaced numeric indicators and the numeric passage
 //indicator have special behavior  FIX THIS

 return "";
} 


          //***Standing Alone***//
  //Parser recognizes standing alone constructs
  // (Not essential for uncontracted braille but
  //  simpler to support both with same grammar.)

  //  Symbols allowed before letter(s) that
  //are considered to be "standing alone"
 private String handleSAPrefix( String brl ){
  Indicator ind = check4Ind( brl );
  if (ind != null) return handleIndicator( ind );
  if (dlMention) return handleMention( brl );
  return StandingAlone.backPre( brl );
 }

  //A Latin letter or sequence of Latin letters
  //that are "standing alone"
  //G1--Affected by a pending g1 start indicator
  // FIX CON/UNCON flag???
 private String backTransSAseq( String brl ){
  if (dlMention) return handleMention( brl );
  String ink = saLetterBT.backTransLetter( brl, wwContractions );
  // Per the parser grammar this is the entire sequence and thus  
  // the last of any letters before the separator. Any 
  // non-alphabetic symbols re part of the postfix.
  capInfo.clearCapWordInd();
  return ink;
  }
  
  //  Symbols allowed after letter(s) that
  //are considered to be "standing alone"
private String handleSAPostfix( String brl ){
  Indicator ind = check4Ind( brl );
  if (ind != null) return handleIndicator( ind );
  if (dlMention) return handleMention( brl );
  return StandingAlone.backPost( brl );
 }

//**********************************************
   // ***Explicit (implemented) indicators***//
//**********************************************

private String processIndicators( String brl ){
   if (trace) System.out.println( "Checkif ind: "+ brl );
   boolean isInd = false;
   Indicator indy = check4Ind( brl );
   if (indy == null) {
    System.out.println( "Not an indicator." );
    return (String) null;
   }
   return handleIndicator( indy );
}
Indicator check4Ind( String brl ){
 Indicator indy = Indicator.getInd( brl );
 return indy;
}

private String handleIndicator( Indicator indy ){
   IndicatorClass ic = indy.myIndData.getMyClassEnum();
   System.out.println( "IC: "+ic );
     //Symbol mentioned as example, not actually used
   if (dlMention){
    System.out.println( "Indicator was mentioned; not active." );
    dlMention = false;  //ASSUMED SCOPE
    return brlDots( indy.getBrl() );
   }
   switch( ic ){
    case DOT_LOCATOR:
      DotLocatorIndicator dl = (DotLocatorIndicator)indy;
      if (DotLocatorIndicator.isMention( dl )){
        dlMention = true;
      }
      if (showDL) return brlDots( indy.getBrl() );
      return "";
    case CAPITALIZATION_INDICATOR:
     System.out.println( "Input is cap ind." );
     capsHandler.handleCapIndicator( (CapsIndicator) indy );
     System.out.println( "capInfo capwordind: "+
            capInfo.getCapWordInd() );
     System.out.println( "capInfo cappassind: "+
          capInfo.getCapPassInd() );
     return "";
    case TYPEFORM_INDICATOR:
     System.out.println( "Input is tf ind." );
     TypeformIndicator tfIndy = (TypeformIndicator) indy;
     Scope scope = tfIndy.getScope();
     if (scope == Scope.TERMINATOR){
       return TypeformsHandler.endTag( tfIndy );
     } else {
          //1. Makes indicator active if valid
       boolean ok = tfIndy.setMe();
        //Oops, an indicator in this set was already active
       if (!ok) return "";

        //2. Adds indicator to correct stack for
        //  getting its end tag when required later
       TypeformsHandler.addToStack( tfIndy );

        //3. and now supplies start tag to backtranslator
       return tfIndy.getStartTag();
     }
   case TRANSCRIBER_INDICATOR:
    System.out.println( "Input is tf ind." );
    return ((TranscriberIndicator) indy).getInk();
   case GRADE1_INDICATOR:
    System.out.println( "Input is g1 indicator." );
    Grade1Indicator g1Indy = (Grade1Indicator) indy;
    scope = g1Indy.getScope();
    if (scope == Scope.TERMINATOR){
      //do something
    } else {
      //do something else
    }
    return "";
   case SUBSUP_INDICATOR:
    //need to return start tag and also
    //keep checking scope
    SubSupIndicator ssIndy = (SubSupIndicator) indy;
     //Set as pending when identified as an indicator ???
    SubSupIndicator.setPending( ssIndy );
    lastWasSubSup = true;
    return SubSupIndicator.getPendingStartTag();
   }
   return "";
}

        // ***Generic token per parser grammar*** //
 //Possibility of indicator handled by caller 
 private String backTransToken( String brl ) {
  //String ink =  processIndicators( brl );
  //System.out.println( "KeepTrack bt token: |"+ink+"|");
  //if (ink != null) return ink;

  //What if "" for some indicators?
  String ink;
  if (trace){
    System.out.println( "KeepTrack, will try input: "+
                         brl+" as letter." );
  }

  if (dlMention) return handleMention( brl );
  //G1--Affected by a pending g1 start indicator
  ink = backTransLetter( brl );
  if (ink != null) return ink;
  if (trace){
    System.out.println( "KeepTrack, not letter trying as AnyPunc." );
  }
  ink = anyPunc( brl );
  if (ink == null){
   System.out.println( "KeepTrack--WARNING: cannot backtrans "+
     "braille token: "+brl );
   }
  return ink;
}

//Letter translator gets latest cap ind info
//G1--Affected by a pending g1 start indicator
 private String backTransLetter( String brl ){
   String ink = letterBT.backTransLetter( brl );
   boolean ok = true;
   if (ink == null){
    ok = false;
   }
   capInfo.handleLetterTransInfo( ok );
   return ink;
}

private String handleMention( String brl ){
  dlMention = false;  //ASSUMED SCOPE
  return brlDots( brl );
}

private String anyPunc( String brl ){
 return Punctuation.getAnyPunc( brl );
}

// if we try upper numbers and it fails then what
//  could be a g1 prefix to a-j in letters or
//pretty much anything else



private String backTransSeparator( String brl ){
 if (dlMention) return handleMention( brl );
 String ink = Separator.backTrans( brl );
 if (ink == null) return ink;
 if (ink.equals( " ")){
  //Informs before inserting space
  return spaceEncountered( ink );
 } else {
   separatorEncountered( true );
 }
 return ink;
}
  
//            ==================================
public static void makeTables( boolean report, boolean display ){
  if (report)
    System.out.println( "\n  TRANSLATION TABLES "+
      "FOR ORDINARY SYMBOLS" );
  Separator.makeSeparatorTable( report, false );
  Letter.makeNAAbrlToPrint( report, false );
  UpperNumber.makeUpperNumBtTable( report, false );
  Punctuation.makePrePuncBTTable( report, false );
  Punctuation.makePostPuncBTTable( report, false );
  Punctuation.makePrePostPairs( );
  SpecialSymbols.makeSpecial( report, false );
  StandingAlone.makePreStandingTable( report, false );
  StandingAlone.makePostStandingTable( report, false );
  Word.makeWholeWordTable( report, false );
  

  if (report)
   System.out.println( "\n     TABLES FOR INDICATORS" );
  CapsIndicator.setUEBCapsInds( report, false );
  DotLocatorIndicator.makeTranslationTable( report, false );
  Grade1Indicator.makeG1Inds();
  NumericIndicator.mayne();
  //TypeformIndicator.makeSetParams();
  //TypeformIndicator.makeDefs();
  SubSupIndicator.makeSubSupInds( true, true,
              g1SymInd );
  TranscriberIndicator.makeTI_Table( report, true );
  TypeformIndicator.makeTfInds( report, false );


  System.out.println( "\n     All backtranslation tables completed." );
}
//            ==================================
         //Test Rig
 public static void main (String [] args ){

   PendingCapInds capInfo = new PendingCapInds();
   boolean uncontracted = true;
   KeepTrack kt = new KeepTrack( capInfo, uncontracted );
   System.out.println( "Made a KeepTrack object." );
   kt.makeTables( true, false );
   
   System.out.println( "\n   Testing...." );
   
   String brl = ",,,";
   String inky = kt.processIndicators( brl );
   System.out.println( "\n inky: " + inky );
 
   brl = "@1";
   inky = kt.processIndicators( brl );
   System.out.println( "\n inky: " + inky );

   brl = ",8";
   inky = kt.handleSAPrefix ( brl );
   System.out.println("\n SAPre--brl: "+brl+ " inky: " + inky );

   inky = kt.handleSAPrefix ( brl );
   System.out.println("\n SAPre--brl: "+brl+ " inky: " + inky );
   brl = "@'";

   inky = kt.handleSAPostfix ( brl );
   System.out.println("\n SAPost--brl: "+brl+ " inky: " + inky );
   
   brl = ".="; //Mention
   inky = kt.backTransToken( brl );
   System.out.println("\n Mention--brl: "+brl+ " inky: " + inky );

   brl = "\"\"="; //Use
   inky = kt.backTransToken( brl );
   System.out.println("\n USE--brl: "+brl+ " inky: " + inky );
   brl = "a" ;
   inky = kt.backTransSAseq ( brl );
   System.out.println("\n brl: "+brl+ " inky: " + inky );
   brl = ",a" ;
   inky = kt.backTransSAseq ( brl );
   System.out.println("\n brl: "+brl+ " inky: " + inky );

}
}//End Class.

