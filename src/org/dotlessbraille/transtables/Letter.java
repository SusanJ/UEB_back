package org.dotlessbraille.transtables;

import java.util.HashMap;
import java.lang.Character;

public class Letter{

 //Supports capitalization if requested.  Does not know why
 //request is made.  

//North American ASCII Braille for letters
//ASCII Braille can use either small or capital
//letters. Class assumes that ASCII Braille letters
//transliterate corresponding small print letters.

  public static final Letter [] letters = {
  new Letter( "a", "A" ),
  new Letter( "b", "B" ),
  new Letter( "c", "C" ),
  new Letter( "d", "D" ),
  new Letter( "e", "E" ),
  new Letter( "f", "F" ),
  new Letter( "g", "G" ),
  new Letter( "h", "H" ),
  new Letter( "i", "I" ),
  new Letter( "j", "J" ),
  new Letter( "k", "K" ),
  new Letter( "l", "L" ),
  new Letter( "m", "M" ),
  new Letter( "n", "N" ),
  new Letter( "o", "O" ),
  new Letter( "p", "P" ),
  new Letter( "q", "Q" ),
  new Letter( "r", "R" ),
  new Letter( "s", "S" ),
  new Letter( "t", "T" ),
  new Letter( "u", "U" ),
  new Letter( "v", "V" ),
  new Letter( "w", "W" ),
  new Letter( "x", "X" ),
  new Letter( "y", "Y" ),
  new Letter( "z", "Z" )
 };

   //Hard-wired!!!!
 public static String singleCaps = ",";

   // PROBLEM: cell dots-56 is a prefix-only grade1 indicator
   // but also a prefix in some prefix-root tokens
   // Treating g1Ind before a letter than would otherwise be a 
   // digit as a symbol for that letter is easier than 
   // special parser logic
   // Cf. Sec. 6.1  #a, for example, is a digit and also a numeric indicator
   // In contracted UEB the dots-56 grade 1 indicator is used to prevent
   // an item's being misread as a contraction.  For example, g1 before a
   // a letter that stands alone means it is read as a letter
   // However, the final letter contractions use dots-56 as a prefix.
   //
 public static String g1Ind = ";";
 public static String upperNumbers = "abcdefghij";


 //Sample modified letters translation table
 public static final Letter [] modLetters = {
   new Letter( "^]n", "^]N", "&#x00F1;" ) //n with tilde above
};

public static HashMap<String,String> backLet =
     new HashMap<String,String> ();

 String lc;
 String uc;
 String lcInk;
 
Letter( String lc, String uc){
 this.lc = lc;
 this.uc = uc;
}
Letter( String lcABrl, String ucABrl, 
        String lcInk ){
  this.lc = lcABrl;
  this.uc = ucABrl;
  this.lcInk = lcInk;
}

//Table for Latin letters 
// lc and uc ASCII braille trans to lc print
// ,lc or ,uc ascII braille trans to uc print.
static void makeNAAbrlToPrint(boolean report, boolean display ){

  String brluc;
  String brllc;
  String ink;
  
  for (int l=0; l<letters.length; l++){
   brluc = letters[l].uc;
   brllc = letters[l].lc;
   ink = letters[l].lc;  //Assumed true for this ASCII braille
   String capBrl = singleCaps +brllc;
   String capInk = ink.toUpperCase();
   backLet.put( brluc, ink );
   backLet.put( brllc, ink );
   backLet.put( capBrl, capInk );
   capBrl = singleCaps+brluc;
   backLet.put( capBrl, capInk );
  }
  //g1 indicator terminating numeric mode
  
//FIX???  also UC ASCII Braille and whole-word cons with "letter sign"?
  for (int d=0; d<upperNumbers.length(); d++){
   brllc = g1Ind + upperNumbers.substring(d,d+1);
   ink = upperNumbers.substring(d,d+1);
   backLet.put( brllc, ink );
  }

  makeModMap();
  if (report)
   System.out.println( "   Letters backtranslation table complete." ); 
}

//NOT COMPLETE
static void makeModMap(){
 for (int l=0; l<modLetters.length; l++){
   backLet.put( modLetters[l].lc,  modLetters[l].lcInk);
   backLet.put( modLetters[l].uc,  modLetters[l].lcInk);
 }
}

//
public static boolean isLetter( String brl ){
 backTrans( brl );
 String ink = backTrans( brl );
 if (ink == null) return false;
 char test = ink.charAt( 0 );
 return Character.isLetter( test );
} 
boolean isUCLetter( String brl ){
  backTrans( brl );
  String ink = backTrans( brl );
  if (ink == null) return false;
  char test = ink.charAt( 0 );
  return Character.isUpperCase( test );
}
boolean isLCLetter( String brl ){
  backTrans( brl );
  String ink = backTrans( brl );
  if (ink == null) return false;
  char test = ink.charAt( 0 );
  return Character.isLowerCase( test );
}

//Return backtranslated letter as lc or uc per symbol
// Is this correct?
public static String backTrans( String brl ){
 return backLet.get( brl );
}
//Return Return backtranslated letter as lower case
//(Caller specifies case.)
public static String backTrans2lc( String brl ){
 return backLet.get( brl ).toLowerCase();
}
//Return Return backtranslated letter as upper case
//(Caller specifies case.)
public static String backTrans2UC( String brl ){
 return backLet.get( brl ).toUpperCase();
}
public static void main( String [] args ){
 makeNAAbrlToPrint( true, false );
}

}//End Class Letter.