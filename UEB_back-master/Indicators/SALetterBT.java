class SALetterBT{
   
  //Backtranslator for a single Latin letter or a sequence
  //of Latin letters "standing alone" such that they
  //represent whole word contractions in contracted
  //braille but will be translated correctly in 
  //either uncontracted  or contracted braille

 PendingCapInds capInfo;  //Provides information about capitalization
 //Status status;        //Accepts information about translation

 static final String DOT6 = ",";
 boolean trace = false;

 SALetterBT( PendingCapInds capInfo ){
  this.capInfo = capInfo;
  //this.status = status;
 }
 SALetterBT( PendingCapInds capInfo,  boolean trace ){
  this.capInfo = capInfo;
  //this.status = status;
  setTrace( trace );
 }
 void setTrace( boolean trace ){
  this.trace = trace;
 }

//Don't need both cap cases if handled by status guy
 String backTransLetter( String aBrl, boolean grade2 ){
 if ( grade2 ){
   if (aBrl.length() !=1){
     System.out.println( "SALetterBT grade2 not available." );
   } else {
     //Need to use cap info here!
     //Word.init();
     String ww = Word.backLC( aBrl );
     return ww;
     //Need to implement backWW and backSF
   }
 }
 if (aBrl.length() > 1) return btSeq( aBrl, grade2);

 //Individual letters uncontracted
 String ink;
     if (capInfo.getCapWordInd()){
       ink = Letter.backTrans2UC( aBrl );
       if (trace) System.out.println( "bT2UC: "+ink ); 
      } else if (capInfo.getCapPassInd()) {
       // OK if (ink == null ) since non-letters permitted; see below
       ink = Letter.backTrans2UC( aBrl ); 
      } else {
       ink = Letter.backTrans( aBrl );  //lc letter or single caps letter
      } 
 return ink; 
}
  //TOO MUCH HARD-WIRED???
  //Sequences of more than one letter
String btSeq( String brl, boolean grade2 ){
 //grade 2 not yet available, is alphabetic shortform words
 //Need to deal with TC possibility?
 StringBuilder buf = new StringBuilder();
 String ink;
 
 boolean tc = false;
 int is = 0;

 //Handling special case of TC contraction
 // for backtrans at entire sequence level
 if ( DOT6.equals( brl.substring(0,1) ) ){
  tc = true;
  is = 1;
 }
 System.out.println( "SALetterBT brl btSeq() tc, is: "
   +brl+" "+tc+" "+is );

 for (int i=is; i<brl.length(); i++){
  String tmp = brl.substring(i, i+1);
  System.out.println( "SALetterBT brl letter: "+tmp );
  ink = Letter.backTrans( tmp );
  if (tc && i==is){
   ink = ink.toUpperCase() ;
  }
  buf.append( ink );
 }
 if (capInfo.getCapPassInd() ||
     capInfo.getCapWordInd()   ){ 
   return buf.toString().toUpperCase();
 }
 System.out.println( "SALetterBT ink: "+buf.toString() );
 return buf.toString();
}
   
String backWW( String brl ){
  //Check for single letter
  //return wwCon2Ink.get( brl.toLowerCase() ).getInk();
 return "";
}
}//End Class.

