package org.dotlessbraille.manifold;
import org.dotlessbraille.indicators.Persist;
import org.dotlessbraille.indicators.EndScope;


 //  Handles communication between BackInd
 // and KeepTrack which latter does the 
 // backtranslation for non-indicators and
 // for symbols which function as both indicators
 // and symbols, i.e. numeric mode
 // start indicators

public class KeepTrack2{

 public static String g1SpecBrl = ";;;;";

  //  Flag indicating that previous symbol was
  // a subscript or superscript indicator
  // part of logic to determine end of script
 static boolean lastWasSubSup = false;

 static boolean dlMention = false;

 static boolean inNumericMode = false;
 static boolean inSpecialG1Mode = false;
 static Persist numModeSyms;
 static Endscope g1ModeSyms;
 

 //  If currently in numeric mode checks whether
 // input symbol allows numeric mode to continue
 static boolean checkNumMode( String brl ) {
  if (!inNumericMode ) return false;
  inNumericMode = numModeSyms.allowed( brl );
   //There are some symbols that can turn both modes off
  if (!inNumericMode) checkSpecialG1Mode( brl );
  return inNumericMode;
 }

 //   If currently in SpecialG1Mode but no longer
 // in numeric mode checks whether
 // input symbol allows special g1 mode to continue
 static boolean checkSpecialG1Mode( String brl ) {
  if (inNumericMode) return true;
  if (!inSpecialG1Mode ) return false;
  inSpecialG1Mode = g1ModeSyms.allowed( brl );
  return inSpecialG1Mode;
 }
 
 static void setPersistForNumMode( Persist numModePersist ){
   numModeSyms = numModePersist;
 }

 static void setNumericMode( boolean inNumMode ){
  inNumericMode = inNumMode;
  if( inNumericMode) inSpecialG1Mode = true;
 }

 static boolean getNumericMode( ){
  return inNumericMode;
 }

 public static void setDlMention( boolean toSet ){
  dlMention = toSet;
 }

 public static boolean getDlMention(){
  return dlMention;
 }

 public static boolean isContracted(){
  return false;
 }

 //Set true by BackInd
 //Reset by KeepTrack after observation
 public static void setLastWasSubSup( boolean toSet ){
  lastWasSubSup = toSet;
 }

 //Observed by KeepTrack
 public static boolean getLastWasSubSup(){
  return lastWasSubSup;
 }

}//End Class KeepTrack2.