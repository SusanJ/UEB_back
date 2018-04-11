import java.util.HashMap;
import java.util.ArrayList;

/** The objects of this class are the UEB grade 1 indicators
    per Section 5 of the Rulebook.
    Its static data and methods are used to initialize
    the indicators and also to manage the status of the
    indicators during backtranslation.  If there is
    a need for more than one set of these indicators
    this logic would need to be generalized as is done
    for the TypeformIndicator class.

    The Grade 1 symbol indicator prevents a symbol from
    being misread as a contraction.  For example,
    dots-26 would normally be read as "en" but if it is
    meant as a superscript indicator -- such as indicating
    a raised footnote number at the end of a word --
    it needs to be preceded by a Grade 1 symbol indicator.

    "3.24.1 Indicate the subscript or superscript
     position when used in print. In grade 2 braille,
     use grade 1 mode for the subscript and the
     superscript indicators."
    
    The special G1 indicator is set automatically when numeric
    mode starts although it doesn't have any effect
    until numeric mode ends.  If a symbol that could
    be mistakenly read as a numeric symbol follows a numeric
    fragment in an alphanumeric item, e.g. one of
    the letters a-j, that symbol needs to be preceded
    by the standard G1 symbol indicator.  In that
    case both G1 indicators are active for that symbol.
*/

class Grade1Indicator extends Indicator{

 
  
 static HashMap<String, Grade1Indicator> grade1Table = 
    new HashMap<String, Grade1Indicator>();
 static ArrayList<Grade1Indicator>g1Inds = 
    new ArrayList<Grade1Indicator>();

 static Grade1Indicator pending = null;
 static boolean specialG1pending = false;

 EndScope myScope;

Grade1Indicator( String brl, String name, Scope scope){
 super( brl, name, scope );
}
Grade1Indicator( boolean mode, String key, 
    IndicatorClass master ){
 super( mode, key, master);
}

//====================
public static boolean setPending( Grade1Indicator g1Ind ){
 if (pending == null ){
  pending = g1Ind;
  return true;
 } else {
  return false;
 }
}
public static boolean clearPending ( Grade1Indicator g1Ind ){
 if (pending == null ) return false;
 pending = null;
return true;
}
/**5.6.2 When grade 1 mode is set by the numeric indicator
it is terminated by a space, hyphen, dash or grade 1 terminator.
*/
public static boolean handleTerminator(){
 if (specialG1pending) clearSpecialG1();
 if (pending == null) return false;
 if (pending.scope == Scope.WORD_OR_SEQUENCE){
  pending = null;
  return true;
 }
 if (pending.scope == Scope.PASSAGE){
  pending = null;
  return true;
 }
 return false;
}
public static void setSpecialG1(){
 specialG1pending = true;
}
public static void clearSpecialG1(){
 specialG1pending = false;
}
public static boolean useGrade1(){
 if ( specialG1pending ) return true;
 if (pending != null) return true;
 return false;
}
public static void spaceEncountered(){
 clearSpecialG1();
 if (pending != null){
  if (pending.scope == Scope.WORD_OR_SEQUENCE){
   pending = null;
  };
 }
}
 //FIX == USE ENDSCOPE 
public static boolean symbolDone( String brl ){
 if (specialG1pending){
   if (brl == "-") {
    clearSpecialG1();
   } else {
     //Check other symbols....
   }
 }
  //if symbol is hyphen or dash clear

 if (pending.scope == Scope.NEXT_SIGN ){
   pending = null;
   return true;
 }
 return false;
}



void setEndScope( EndScope myScope ){
 this.myScope = myScope;
}
boolean scopeDone( String symbol ){
 return myScope.done( symbol );
}

            //   Make indicators.
static void makeSpecialG1Ind( IndicatorClass numInd ){
//Special g1 mode set by N.I. 

  Grade1Indicator specG1Ind =
   new Grade1Indicator( true, KeepTrack.g1SpecBrl, 
    IndicatorClass.GRADE1_INDICATOR );
  specG1Ind.setIndicatorType( IndicatorType.SPECIAL_GRADE_1 );
  g1Inds.add( specG1Ind );
  //specG1Ind.setBrl( ";;;;" );

//THIS NEEDS TO BE FIXED?
    //EndSCOPE for special g1 mode
    EndScope myEnd = new EndScope( "specialG1" );
    myEnd.addSym( "\"._" );
    specG1Ind.setEndScope( myEnd );
}
static void makeG1Inds(){

 Grade1Indicator g1SymInd = 
   new Grade1Indicator( ";", "Grade 1 Symbol", Scope.NEXT_SIGN );
   g1SymInd.setIndicatorType( IndicatorType.G1_SYMBOL );
   g1Inds.add( g1SymInd );

 Grade1Indicator g1WrdInd = 
   new Grade1Indicator( ";;", "Grade 1 Word", Scope.WORD_OR_SEQUENCE );
   g1WrdInd.setIndicatorType( IndicatorType.G1_WORD );
   g1Inds.add( g1WrdInd );

 Grade1Indicator g1PassInd = 
  new Grade1Indicator( ";;;", "Grade 1 Passage", Scope.PASSAGE );
  g1PassInd.setIndicatorType( IndicatorType.G1_PASSAGE );
  g1Inds.add( g1PassInd );

 Grade1Indicator g1TermInd = 
  new Grade1Indicator( ";'", "Grade 1 Termination", Scope.TERMINATOR );
  g1TermInd.setIndicatorType( IndicatorType.G1_TERMINATOR );
  g1Inds.add( g1TermInd );

}
}//End Class Grade1Indicator.