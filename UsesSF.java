import java.util.ArrayList;
class UsesSF{
 ArrayList <String> myWords = new ArrayList <String>();
 String header;
UsesSF( String header ){
 this.header = header;
}
void saveWords( String words ){
 String[] splited = words.trim().split("\\s+");
 for (String s : splited ){
  myWords.add( s );
 }
}
int getWordCount(){
 return myWords.size();
}
}//End Class