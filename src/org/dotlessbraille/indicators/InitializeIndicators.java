package org.dotlessbraille.indicators;

public class InitializeIndicators{

public static void makeIndicators( boolean report,
              boolean details, String g1SymInd ){
  if (report)
   System.out.println( "\n          TABLES FOR INDICATORS" );

  CapsIndicator.setUEBCapsInds( report, details );
  DotLocatorIndicator.makeTranslationTable( report, details );
  Grade1Indicator.makeG1Inds( report, details );
  NumericIndicator.mayne( report, details );
  SubSupIndicator.makeSubSupInds( true, details,
                                  g1SymInd );
  TranscriberIndicator.makeTI_Table( report, details );
  TypeformIndicator.makeTfInds( report, details );

  if (report) Indicator.indicatorReport();
}
public static void main( String [] args ){
  String g1SymInd = ";";
  makeIndicators( true, false, g1SymInd );
}
}//End Class.