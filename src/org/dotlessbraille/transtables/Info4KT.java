package org.dotlessbraille.transtables;
import org.dotlessbraille.indicators.SubSupIndicator;
//import org.dotlessbraille.indicators.Grade1Indicator;
import org.dotlessbraille.indicatoruse.TypeformsHandler;
import org.dotlessbraille.manifold.KeepTrack2;

//First cut at minimizing direct coupling from KeepTrack
//String tfEndStack = TypeformsHandler.tfEndTagsAfterWord();

public class Info4KT{
 public Info4KT(){}

 //Pass info

 static boolean lastWasVulgarFraction = false;
 static int conseqNumindCount = 0;
 //static boolean inNumericMode = false;
 static int inputLinesDone;
 static boolean traceSubSup = false;

 public static void setLinesDone( int linesDone ){
  inputLinesDone = linesDone;
 }
 public static void incLinesDone( ){
  inputLinesDone = inputLinesDone + 1; 
 }

 public static int getLinesDone(){
  return inputLinesDone;
 }
  
 public void setLastWasVulgarFraction(){
  lastWasVulgarFraction = true;
 }



  //  There are can be more than one numeric indicator
  // in a numeric sequence
 public static void incrementNumindCount(){
  conseqNumindCount = conseqNumindCount+1;
 }
 public static void clearNumindCount(){
  conseqNumindCount =0;
 }
 //public void spaceEncountered4G1(){
  //Grade1Indicator.spaceEncountered();
 //}

  //CONFUSING TOO MANY G1 INDS and CHECKS in diff. locs.
// public boolean useGrade1(){
  //if (KeepTrack2.getGrade1Mode( )) return true;
  //return Grade1Indicator.useGrade1();
 //}

 public String afterNumfrag(){
  return SubSupIndicator.afterNumfrag();
 }
 public String spaceEncountered4SS(){
  return SubSupIndicator.spaceEncountered();
 }
 public void setWaitingFor( String close ){
  SubSupIndicator.setWaitingFor( close );
 }
 public String getAfterTagSS( String brl ){
  return SubSupIndicator.getAfterTag( brl, traceSubSup );
 }
 public boolean subSupIsPending(){
  return SubSupIndicator.subSupIsPending();
 }
 public String afterAtEOL(){
  return SubSupIndicator.afterAtEOL();
 }
 public String tfEndTagsAfterWord(){
  return TypeformsHandler.tfEndTagsAfterWord();
 }
 public String tfAfterSymbol(){
  return TypeformsHandler.afterSymbol();
 }
 public String tfAfterAtEOL( String ssEnd ){
  return TypeformsHandler.afterAtEOL( ssEnd );
 }
}//End Class.



