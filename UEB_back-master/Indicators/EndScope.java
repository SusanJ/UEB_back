import java.util.ArrayList;
import java.util.HashMap;

//Manages braille symbols that do change the scope
//of an active indicator
class EndScope{

public static HashMap<String,ArrayList<String>> endSymData =
          new HashMap<String,ArrayList<String>> ();

 String name;
 ArrayList<String> endSym = new ArrayList<String>() ;

EndScope( String name ){
 this.name = name;
 endSymData.put( name, endSym );
}
void addSym( String toAdd ){
 endSym.add( toAdd );
}
void addSym( ArrayList<String> toAdd ){
 for (String s : toAdd){
  addSym( s );
 }
}
boolean done( String s ){
 return endSym.contains( s );
}

void display(){
 for (String s : endSym){
  System.out.println( "Terminating sign: "+s);
 }
}
static ArrayList<String> getTermSigns( String forName ){
 return endSymData.get( forName );
}
 
} //End Class EndScope.
