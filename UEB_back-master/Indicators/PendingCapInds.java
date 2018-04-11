import java.util.Stack;

class PendingCapInds implements ManageCapIndicators, Status { 

  //Keeps track of which caps indicator is active and
  //provides caps status to translators
 
 //Sends info to and from caps indicator handler
 boolean capWordInd = false;
 boolean capPassInd = false;

 public PendingCapInds(){}

 public void warn( String text ){}
 public void capHandlerReply( boolean ok ){}

 public void setCapWordInd( boolean wordInd ){
  //And tell everyone
  capWordInd = wordInd;
 }
 public boolean getCapWordInd(){
  return capWordInd; 
 }
 public void clearCapWordInd(){
  capWordInd = false;
 }

 public void setCapPassInd( boolean passageInd ){
  //And tell everyone
  capPassInd = passageInd;
 }
 public boolean getCapPassInd(){
  return capPassInd;
 }
 public void clearCapPassInd(){
  capPassInd = false;
 }

 //Checking if current token is a letter or non-letter--a
 //non-letter ends scope of caps word indicator
 public void handleLetterTransInfo( boolean isLetter ){
   if (getCapWordInd()){
    if (!isLetter) clearCapWordInd();
   }
 }
 //UEB Rulebook says space ends scope of cap word
 //  must be any separator since it is any non-letterS
 public void separatorEncountered( boolean isSep){
    if (isSep && getCapWordInd()) clearCapWordInd();
 }
}//End Class. 