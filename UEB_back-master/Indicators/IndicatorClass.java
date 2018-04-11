import java.lang.Class;
import java.util.HashMap;
enum IndicatorClass{

 //Items useful for switch statements for
 //indicators created by different Indicator subclasses
 
 ANY_INDICATOR      ( "Indicator" ),
 CAPITALIZATION_INDICATOR ( "CapsIndicator" ),
 DOT_LOCATOR ("DotLocatorIndicator" ),
 GRADE1_INDICATOR   ( "Grade1Indicator" ),
 NUMERIC_INDICATOR  ( "NumericIndicator"),
 SUBSUP_INDICATOR   ( "SubSupIndicator" ),
 TRANSCRIBER_INDICATOR ( "TranscriberIndicator" ),
 TYPEFORM_INDICATOR ( "TypeformIndicator" ),
 UNKNOWN            ( "Not an indicator." );

 private static final HashMap<String, IndicatorClass> str2Enum =
   new HashMap<String, IndicatorClass> ();
 static {
  for ( IndicatorClass ic: values())
   str2Enum.put( ic.className, ic );
}
 String className;  //Must be correct class name!
 IndicatorClass( String className ){
  this.className = className;
 }

// Returns corresponding enum if input represents 
// an indicator known to this Enum or UNKNOWN if not
static IndicatorClass  indName( String aBrl ){
 Indicator ind = Indicator.getInd( aBrl );
 return indName( ind );
}
static IndicatorClass indName( Indicator ind ){
 if (ind != null) {
    Class aClass = ind.getClass();
    String aName = aClass.getName();
    //System.out.println( "IC method, aName: "+aName );
    IndicatorClass ic = str2Enum.get( aName ); 
    if (ic != null) return ic;
 }
 return UNKNOWN;
}

}//End.