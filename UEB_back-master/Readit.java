import java.io.File;
import java.util.ArrayList;
// Inputs a text file 
class Readit{

 static ArrayList<UsesSF> sf =
    new ArrayList<UsesSF>();
 static int maxLines = 1000;
 String inFile;
 Tape5 text;
 StringBuffer sb = new StringBuffer(); 
 int count;
 int sfCount;

Readit( String inFile ){
 this.inFile = inFile;
 text = new Tape5( inFile );
}
String getInput(){
 return sb.toString();
}
int getCount(){
 return count;
}
int getSFCount(){
 return sfCount;
}
public void readText(  boolean echo ){
 count = 0;
 sfCount = 0;
 UsesSF u = null;
 String next = nextLine( text );
 
 while (next != null && count < maxLines ){

   if (next.length()> 1){
     if (!next.substring(0,1).equals( " ")){
        if (echo) System.out.println( next );
        sfCount = sfCount+1;
        u = new UsesSF( next );
        sf.add( u );
      } else {
        u.saveWords( next );
      }
    }
  
  sb.append( next );
  count = count+1;
  next = nextLine( text);
 }
}
public String nextLine( Tape5 text ){
  return text.in();
}
public void display(){
 for (UsesSF s : sf ){
  System.out.println( s.header+" "+s.getWordCount());
 }
}
public static void main( String [] args ){
 String inputFile = null;
 if ( args.length > 0 ) inputFile = args[0];
 if (inputFile == null){
  System.out.println( "No input file!" );
  System.exit(0);
 }
File f = new File( inputFile );
   if(f.exists() && !f.isDirectory())  {
    System.out.println( "Will input: "+inputFile );
   } else {
    System.out.println( "\n OOPS! Cannot find input file: "
          +inputFile );
    System.exit( 0 );
   }
 Readit file1 = new Readit( inputFile );
 file1.readText( true );
 String text1 = file1.getInput();
 System.out.println( "Count: "+file1.getCount() );
 System.out.println( "SFCount: "+file1.getSFCount() );
 file1.display();
 Tape6 myout1 = new Tape6( "echo1.txt" );
}
}//End Class Readot.