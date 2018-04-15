package org.dotlessbraille.transtables;
public class InitTranstables{

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
}
public static void main( String [] args ){
  makeTables( true, false );
}
}//End Class.