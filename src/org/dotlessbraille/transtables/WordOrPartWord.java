package org.dotlessbraille.transtables;
import java.util.HashMap;
import org.dotlessbraille.utilities.BrailleCell;

            /**Short-form words array. */
public class WordOrPartWord{

public static String CON = "-";
public static String BE = "2";

                          //Short-form word cross-referenced by
                          //'one' initial-letter contraction.
 public static final WordOrPartWord oneself =
  new WordOrPartWord( "&#x01CD;&#x01CE;&#x01CF;", 
                      "\"of", "oneself" );

 //These three shortforms have numerous exceptions as to whether they
 //can be used as a part-word at the start of a word.  The problem
 //word list thus needs to be consistent with the strategy.
 //that use the shortform at the start of a word must be included
 //in an exceptions list

 // Note, if the last item in the declaration is an integer (flag)
 //then the item is not used as a part word. (EBAE, in UEB
 //there is an explicit list.)

 public static final WordOrPartWord BLIND =
  new WordOrPartWord( "&#x015B;&#x015C;", "bl", "blind", 1 );

 public static final WordOrPartWord MUST =
  new WordOrPartWord( "&#x0169;&#x016A;", "m/", "must" );

 public static final WordOrPartWord SHOULD =
  new WordOrPartWord( "&#x0173;&#x0174;", "%d", "should" );

 public static final WordOrPartWord [] shortFormWords = {
  new WordOrPartWord( "&#x0206;&#x0207;&#x0208;&#x0209;&#x020A;", 
      "p]cvg", "perceiving" ),
  new WordOrPartWord( "&#x01E2;&#x01E3;&#x01E4;&#x01E5;",
      "yrvs", "yourselves" ),
  new WordOrPartWord( "&#x01E6;&#x01E7;&#x01E8;&#x01E9;",
      "\\rvs", "ourselves" ),
  new WordOrPartWord( "&#x01EA;&#x01EB;&#x01EC;&#x01ED;",
      "!mvs", "themselves" ),
  new WordOrPartWord( "&#x01EE;&#x01EF;&#x01F0;&#x01F1;",
      "dclg", "declaring" ),
  new WordOrPartWord( "&#x01F2;&#x01F3;&#x01F4;&#x01F5;",
      "rjcg", "rejoicing" ),
  new WordOrPartWord( "&#x01F6;&#x01F7;&#x01F8;&#x01F9;", 
      CON+"cvg", "conceiving", true ),
  new WordOrPartWord( "&#x01FA;&#x01FB;&#x01FC;&#x01FD;",
      "dcvg", "deceiving" ),
  new WordOrPartWord( "&#x01FE;&#x01FF;&#x0200;&#x0201;",
      "p]cv", "perceive" ),
  new WordOrPartWord( "&#x0202;&#x0203;&#x0204;&#x0205;",
      "rcvg", "receiving" ),
 
  new WordOrPartWord( "&#x018B;&#x018C;&#x018D;",
      "abv", "above" ),
  new WordOrPartWord( "&#x018E;&#x018F;&#x0190;",
       "acr", "across", 1 ),
  new WordOrPartWord( "&#x0191;&#x0192;&#x0193;",
       "afn", "afternoon" ),
  new WordOrPartWord( "&#x0194;&#x0195;&#x0196;",
       "afw", "afterward" ),
  new WordOrPartWord( "&#x0197;&#x0198;&#x0199;",
       "ag/", "against", 1 ),
  new WordOrPartWord( "&#x019A;&#x019B;&#x019C;",
       "alm", "almost", 1 ),
  new WordOrPartWord( "&#x019D;&#x019E;&#x019F;",
       "alr", "already" ),
  new WordOrPartWord( "&#x01A0;&#x01A1;&#x01A2;",
       "al?", "although" ),
  new WordOrPartWord( "&#x01A3;&#x01A4;&#x01A5;",
      "alt", "altogether", 1 ),
  new WordOrPartWord( "&#x01A6;&#x01A7;&#x01A8;",
      "alw", "always" ),
  new WordOrPartWord( "&#x01A9;&#x01AA;&#x01AB;",
      "brl", "braille" ),
  new WordOrPartWord( "&#x01AC;&#x01AD;&#x01AE;",
      "grt", "great" ),
  new WordOrPartWord( "&#x01AF;&#x01B0;&#x01B1;",
      "imm", "immediate", 1 ),
  new WordOrPartWord( "&#x01B2;&#x01B3;&#x01B4;",
      "nec", "necessary", 1 ),
  //new WordOrPartWord( "&#x01B5;&#x01B6;&#x01B7;", "o'c", "o'clock" ),
  new WordOrPartWord( "&#x01B8;&#x01B9;&#x01BA;", "p]h",
      "perhaps" ),
  new WordOrPartWord( "&#x01BB;&#x01BC;&#x01BD;", "tgr",
      "together" ),  //Had word flag???
  new WordOrPartWord( "&#x01BE;&#x01BF;&#x01C0;", "nei",
      "neither", 1 ),
  new WordOrPartWord( "&#x01C1;&#x01C2;&#x01C3;", "hmf", 
      "himself" ),
  new WordOrPartWord( "&#x01C4;&#x01C5;&#x01C6;", "yrf", 
     "yourself" ),
  new WordOrPartWord( "&#x01C7;&#x01C8;&#x01C9;", "h]f",
      "herself" ),
  new WordOrPartWord( "&#x01CA;&#x01CB;&#x01CC;", "myf",
      "myself" ),
  new WordOrPartWord( "&#x01CD;&#x01CE;&#x01CF;", "\"of",
     "oneself" ),
  //oneself,
  new WordOrPartWord( "&#x01D0;&#x01D1;&#x01D2;", "?yf",
      "thyself" ),
  new WordOrPartWord( "&#x01D3;&#x01D4;&#x01D5;",
      "dcl", "declare" ),
  new WordOrPartWord( "&#x01D6;&#x01D7;&#x01D8;",
      "rjc", "rejoice" ),
  new WordOrPartWord( "&#x01D9;&#x01DA;&#x01DB;", 
                      CON+"cv", "conceive", true ),
  new WordOrPartWord( "&#x01DC;&#x01DD;&#x01DE;", "dcv", "deceive" ),
  new WordOrPartWord( "&#x01DF;&#x01E0;&#x01E1;", "rcv", "receive" ),
  new WordOrPartWord( "&#x0141;&#x0142;", "ab", "about", 1 ),
  new WordOrPartWord( "&#x0143;&#x0144;", "ac", "according", 1 ),
  new WordOrPartWord( "&#x0145;&#x0146;", "af", "after" ), //Had word flag???
  new WordOrPartWord( "&#x0147;&#x0148;", "ag", "again", 1),
  new WordOrPartWord( "&#x0149;&#x014A;", "al", "also", 1),
  new WordOrPartWord( "&#x014B;&#x014C;", BE+"c",
      "because", 1 ),
  new WordOrPartWord( "&#x014D;&#x014E;", BE+"f", "before",
      true ),
  new WordOrPartWord( "&#x014F;&#x0150;", BE+"h", "behind",
      true ),
  new WordOrPartWord( "&#x0151;&#x0152;", BE+"l", "below", 
      true ),
  new WordOrPartWord( "&#x0153;&#x0154;", BE+"n", "beneath",
      true ),
  new WordOrPartWord( "&#x0155;&#x0156;", BE+"s",
      "beside",  true ),
  new WordOrPartWord( "&#x0157;&#x0158;", BE+"t",
      "between", true ),
  new WordOrPartWord( "&#x0159;&#x015A;", BE+"y",
      "beyond",  true ),
  new WordOrPartWord( "&#x015B;&#x015C;", "bl",
      "blind", 1 ),
  new WordOrPartWord( "&#x015D;&#x015E;", "*n",
      "children"), //Had word flag???
  new WordOrPartWord( "&#x015F;&#x0160;", "f/",
      "first" ),

  new WordOrPartWord( "&#x0161;&#x0162;", "fr",
      "friend", 1 ),
  new WordOrPartWord( "&#x0163;&#x0164;", "gd", "good" ),
  new WordOrPartWord( "&#x0165;&#x0166;", "lr", "letter" ),
  new WordOrPartWord( "&#x0167;&#x0168;", "ll", "little", 1 ),
  new WordOrPartWord( "&#x0169;&#x016A;", "m/", "must" , 1),
  new WordOrPartWord( "&#x016B;&#x016C;", "pd", "paid", 1 ),
  new WordOrPartWord( "&#x016D;&#x016E;", "qk", "quick" ),
  new WordOrPartWord( "&#x016F;&#x0170;", "sd", "said", 1 ),
  new WordOrPartWord( "&#x0171;&#x0172;", "cd", "could" ),
  new WordOrPartWord( "&#x0173;&#x0174;", "%d", "should", 1 ),
  new WordOrPartWord( "&#x0175;&#x0176;", "wd", "would" ),
  new WordOrPartWord( "&#x0177;&#x0178;", "ei", "either", 1 ),
  new WordOrPartWord( "&#x0179;&#x017A;", "m*", "much" ),
  new WordOrPartWord( "&#x017B;&#x017C;",
      "s*", "such" ), //Had word flag??? 
  new WordOrPartWord( "&#x017D;&#x017E;",
      "td", "today" ), //Had word flag???
  new WordOrPartWord( "&#x017F;&#x0180;",
      "tn", "tonight" ),
  new WordOrPartWord( "&#x0181;&#x0182;", "tm", "tomorrow" ),
  new WordOrPartWord( "&#x0183;&#x0184;",
      "hm", "him" ),
  new WordOrPartWord( "&#x0187;&#x0188;",
      "xf", "itself" ),
  new WordOrPartWord( "&#x0185;&#x0186;",
      "xs", "its" ),
  new WordOrPartWord( "&#x0189;&#x018A;",
      "yr", "your")
 };

 public static HashMap<String, WordOrPartWord> sfCon2Ink = 
    new HashMap<String, WordOrPartWord>();
 public static HashMap<String, WordOrPartWord> Ink2sfCon = 
    new HashMap<String, WordOrPartWord>();


        /**Where item can be used as partword. */
PartWordUse used = PartWordUse.ANYWHERE;

 String dbCharRef;
 String aBrl;
 String ink;
 String xBrl;
 String inkUC;
 String inkTC;

//=====================================================
public WordOrPartWord( String dbCharRef, String aBrl, 
                       String ink ){
 this.dbCharRef = dbCharRef;
 //this.aBrl = aBrl.toUpperCase();
 this.aBrl = BrailleCell.normalizeASCIIBraille( aBrl );
 this.ink  = ink;
 inkUC = ink.toUpperCase();
 inkTC = Word.makeTC( ink );
 this.xBrl = BrailleCell.toUni( dbCharRef );
  //This was used to initialize a custom transcription
  //to the default [?]  4/202018
 //unCustom(); implements in Sign abstract superclass
 //putSign( this );
}
//.....................................................
/**Special constructor for the initial-letter 
   contraction that is incorporated 
   in a short-form word.
*/
public WordOrPartWord( String dbCharRef, String aBrl, 
                String ink, WordOrPartWord shortForm ){
 this( dbCharRef, aBrl, ink );
 //myList.setSigns( shortForm );
}
//.....................................................
public WordOrPartWord( String dbCharRef, String aBrl, 
                String ink, boolean startOnly ){
 this( dbCharRef, aBrl, ink );
 if (startOnly) this.used = PartWordUse.BEG_WORD;
}
//.....................................................
public WordOrPartWord( String dbCharRef, String aBrl, 
                String ink, int wordOnly ){
 this( dbCharRef, aBrl, ink );
 this.used = PartWordUse.WORD_ONLY;
 //System.out.println( aBrl +" only for word: "+ink );
}
String getBrl(){ return aBrl; }
String getInk(){ return ink; }
String getInkTC(){ return inkTC; }
String getInkUC(){ return inkUC; }

static void makePartWordTable( boolean report, boolean display){

 for (int sf=0; sf < shortFormWords.length; sf++ ){
  WordOrPartWord pw = shortFormWords[sf];
  //System.out.println("pwtable: "+pw+" brl: "+pw.getBrl());
  sfCon2Ink.put( pw.getBrl(), pw );
  if (pw.getBrl().equals( "AB")){
   System.out.println( "Adding ab!");
  }
  Ink2sfCon.put( pw.getInk(), pw);
 }
 report = true;
 if (report){
  int cnt = sfCon2Ink.size();
  System.out.println( "     Shortforms Table complete. ("+cnt+")" );
 }
}
public static WordOrPartWord getSf4Brl( String brl ){
 return sfCon2Ink.get( brl );
}
public static WordOrPartWord  getWord4Ink( String ink ){
 return Ink2sfCon.get( ink.toLowerCase() );
}
  //Convert brl to LC to support UC ASCII Braille
public static String backLC( String brl ){
 //System.out.println( "wopw backlC brl: "+brl );
 WordOrPartWord pw = sfCon2Ink.get( brl.toUpperCase() );
 //System.out.println( "pw: "+pw );
 if (pw == null ) return (String) null;
 return pw.getInk();
}
public static String backTC( String brl ){
 WordOrPartWord pw = sfCon2Ink.get( brl.toUpperCase() );
 if (pw == null ) return (String) null;
 return pw.getInkTC();
 //return sfCon2Ink.get( brl.toUpperCase() ).getInkTC() ;
}
public static String backUC( String brl ){ 
 WordOrPartWord pw = sfCon2Ink.get( brl.toUpperCase() );
 if (pw == null ) return (String) null;
 return pw.getInkUC();
 //return sfCon2Ink.get( brl.toUpperCase() ).getInkUC();
}
}//End Class.
 