import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class IndicatorSets{

 static Map<IndicatorClass, Set<Indicator>> indsByClass =
   new EnumMap<IndicatorClass,
       Set<Indicator>> (IndicatorClass.class);

  public static ArrayList<Indicator> allInds =
     new ArrayList<Indicator>();

  //Create map from Enums to HashSet
static void makeEnum2Set() {
 for (IndicatorClass ic : IndicatorClass.values())
 indsByClass.put( ic, new HashSet<Indicator>() );
}
static void getAll( ){
  allInds = Indicator.allInds;
  System.out.println( "Total no. of indicators: "+
      allInds.size() );
}
  //Put each indicator in appropriate HashSet
static void sortThem(){
 for (Indicator ind : allInds ){
  IndicatorClass myEnum =
   ind.myIndData.getMyClassEnum();
  //System.out.println( "myEnum: "+myEnum );
  indsByClass.get(myEnum).add( ind );
 }
 displaySets();
}
static void displaySets() {
 for (IndicatorClass ic : IndicatorClass.values()){
  Set hs = indsByClass.get( ic );
  System.out.println( ic+" size: "+hs.size() );
  System.out.println( hs );
 }
}
public static void main( String [] args ){
 System.out.println( "All indicators by class." );
 KeepTrack.makeTables( true, false );
 makeEnum2Set();
 getAll();
 sortThem();
}
}//End Class IndicatorSets.