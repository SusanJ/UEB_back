package org.dotlessbraille.indicators;
import java.util.ArrayList;
import java.util.HashMap;

//Manages braille symbols that do not change the scope of an active indicator
class Persist{

public static HashMap<String,ArrayList<String>> persistData =
       new HashMap<String,ArrayList<String>> ();

String name;
ArrayList<String> perSym = new ArrayList<String>() ;

Persist( String name ){
 this.name = name;
 persistData.put( name, perSym );
}
void addSym( String toAdd ){
 perSym.add( toAdd );
}
void addSym( ArrayList<String> toAdd ){
 for (String s : toAdd){
  addSym( s );
 }
}
void display(){
 for (String s : perSym){
  System.out.println( "Persistent sign: "+s);
 }

}
 
} //End Class Persist
