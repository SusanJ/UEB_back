import java.lang.Character;
import java.util.HashMap;
import java.util.ArrayList;

/** Sub-classed to better handle related sets,
    both construction and special case of NI where multiple
    symbols for ind with same function.
*/
class Indicator{

 static boolean showAdd = false;
 static boolean trace = false;

 public static HashMap<String, Indicator>inds = 
        new HashMap<String, Indicator>();
 public static ArrayList<Indicator> allInds =
        new ArrayList<Indicator>();

 String brl;
 String name;
 String info;
 Scope scope;
 IndicatorType myType; 
 public IndData myIndData = new IndData();

 //Only true mode set by another indicator such as special g1
 boolean indirectMode = false;
 IndicatorClass master;

 boolean explicit_terminator = false;
  //True if maximum implicit scope is a single item
 boolean ws_term = false;
 boolean someSignsTerminate = false;
 boolean nonLettersTerminate = false;
 int minItemsInPassage = 0;
 Indicator expTerm;
 ArrayList <Indicator> bunch = new ArrayList<Indicator>();
 
Indicator( String brl, String name, Scope scope ){
 this.brl = brl;
 this.name = name;
 this.scope = scope;
 add( this );
}
Indicator( String brl, String name, Scope scope, int minItems ){
 this.brl = brl;
 this.name = name;
 this.scope = scope;
 this.minItemsInPassage = minItems;
 add( this );
}

//Special constructor for indicator set by another
Indicator( boolean mode, String key, 
  IndicatorClass master ){
 this.indirectMode = mode;
 this.master = master;
 this.brl = key;
 add( this );
}
         //METHODS

//This method is subclassed for indicators 
//with tags
String getEndTag(){
 return "";
}
public void setExpTerm( Indicator term){
 explicit_terminator = true;
 this.expTerm = term;
}
void setIndicatorType( IndicatorType my ){
 this.myType = my;
 if (trace) System.out.println( "setting type for: "+
  brl+" type: "+myType );
}
 
String getStartTag(){
 return "";
}
public String getName(){
 return name;
}
IndicatorType getIndType(){
  return myType;
}
public void setNonLetTerm( boolean nonLetTerm){
 nonLettersTerminate = nonLetTerm;
 if (nonLettersTerminate) someSignsTerminate = true;
}
//Returns character position of first non-letter
public int checkForNonLetter( String test ){
 int pos = -1;
 for (int c=0; c<test.length(); c++){
  if (!Character.isLetter( test.charAt( c ))){
    pos = c;
    return pos;
  }
 }
 return test.length();
}
public Scope getScope(){
 return scope;
}
public String getBrl(){
 return brl;
}
//public void putMyIndData( IndData myData ){
 //this.myIndData = myData;
//}
static Indicator getInd( String brl ){
 //System.out.println( "No. of indicators in hash table: "+inds.size() );
 return inds.get( brl );
}
  //Add each new indicator to hash table and
  //updates myIndData object
static private void add( Indicator ind ){
 //System.out.println( "in method Indicator.add...." );
 inds.put( ind.getBrl(), ind );
 IndicatorClass myEnum = IndicatorClass.indName( ind );
 if (showAdd) System.out.println( "Indicator.add  myEnum: "+myEnum );
 ind.myIndData.putMyClassEnum( myEnum );
 allInds.add( ind );
}

static boolean isIndicator( String brl ){
  //The symbols for these  indicators depend on whether 
  //braille uses contratcions
 if (SubSupIndicator.isSSInd( brl )) return true;
 if (inds.get( brl ) != null) return true;
 return false;
}
static IndicatorType getType( Indicator ind ){
 if( TypeformIndicator.isTFind (ind) ) return 
   IndicatorType.TYPEFORM;
 return IndicatorType.UNKNOWN;
}
@Override public String toString(){
 return name+" "+brl;
}


}//End Class Indicator