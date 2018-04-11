import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
//import java.util.HashMap;
//import java.util.Stack;
//import java.util.Set;
//import java.lang.Character;
//import java.lang.Class;

class BackPR{

 static String[] ruleNames;
 static boolean printTree = true;

 static boolean debugComments = false;
 static boolean trace = true;
 static boolean numDebug = false;
 static boolean printText = true;
 static boolean skipItem = true;
 static boolean ignoreComments = false;
 static boolean debug = false;
 
 static boolean numLineCont = false;  //FIX THIS!!!
 static boolean hideSep = false;
 
     
 static class Translator extends simpleParserBaseListener{

   KeepTrack statusManager;

   BufferedTokenStream allTokens; //Support comment channel
   TokenStreamRewriter rewriter;
   int lineNumber = 0;
   Translator( KeepTrack statusManager, 
               BufferedTokenStream allTokens) {
    this.statusManager = statusManager;
    this.allTokens = allTokens;
    rewriter = new TokenStreamRewriter( allTokens );
    lineNumber = 0;
   }

//  ===========BACKTRANSLATION ANNOTATIONS SAVED HERE============
/**   See v4 Ref. p. 123   ParserTreeProperty is an 
    ANTLR helper class that uses an
    IdentityHashMap to store the annotation 
    results for **specific** nodes, i.e.
    not just nodes with the same context.
*/
      // "ink" is back-translation
    ParseTreeProperty<String> ink = new ParseTreeProperty<String>();
    void setInk(ParseTree ctx, String s) {ink.put(ctx, s);}
    String getInk(ParseTree ctx) {return ink.get(ctx);}

      //"info" is any optional additional information
    ParseTreeProperty<String> info = new ParseTreeProperty<String>();
    void setInfo(ParseTree ctx, String s) {info.put(ctx, s);}
    String getInfo(ParseTree ctx) {return ink.get(ctx);}

//  ========PARSE TREE NODES BACKTRANSLATION STARTS HERE=========
     //  -->0. 'text' is name of grammar's root node<--
@Override 
 public void enterText( simpleParser.TextContext ctx)  {
   System.out.println();
   System.out.println( "        Starting Text..." );
   System.out.println( "Text contains: "+ctx.getChildCount()+" lines." );
  }

@Override
 public void exitText( simpleParser.TextContext ctx)  {
   System.out.println( "\n       Finishing Text..." );
   if (printText) System.out.println( "brl: "+ctx.getText() );
   int cnt = ctx.getChildCount();
   //System.out.println( "Text children count: "+ cnt );
  
     //Concatenate lines
   String ink;
   StringBuilder buf = new StringBuilder();
   for (int i=0; i<cnt; i++){
    ink = getInk( ctx.getChild(i) );
    if (ink != null) {
      buf.append( ink );
    } else {
     buf.append( "" );
    }
   } 
   setInk( ctx, buf.toString() );
 }//End exitText.

  // 01. -->'line' is name grammar gives to root nodes children<--
@Override
 public void enterLine( simpleParser.LineContext ctx ){
   //Need to tell grammar about continued number
   lineNumber = lineNumber + 1;
   System.out.println( "\n         Starting "
    +"line no. "+lineNumber );
   System.out.println( "ASCII Braille input: "+ctx.getText() );
   System.out.println( " numLineCont: "+numLineCont );
   boolean contNum = false;
   //  Check whether previous line was a continued numeric item
   // such as a long number
   if (numLineCont){
    contNum = true;
    numLineCont = false;
   } else {
    contNum = false;
   }
}

  

     //NEED TO HAVE ITEM THAT IS A COMPLETE "WORD" FIX THIS!!!
@Override
 public void exitLine( simpleParser.LineContext ctx ) {

   System.out.println( "\n        Finishing current line..." );
   System.out.println( "brl: "+ctx.getText() );
   int cnt = ctx.getChildCount();
   System.out.println( "No. of child nodes "+
   "including any separator(s) and EOL: "+ cnt );
   String cmtInfo = null;
   if (!ignoreComments){
    cmtInfo = lineComment( ctx, 2 );
   }

   //Concatenate various items in this line; all (except EOF)
   //should have been backtranslated at lower levels
   String ink;
   StringBuilder buf = new StringBuilder();
   for (int i=0; i<cnt-1; i++){
    ink = getInk( ctx.getChild(i) );
    if (ink != null) {
     buf.append( ink );
    } else {
     System.out.println( "Line child item no. "+i+
        " Braille was not backtranslated: "+
        "|"+ctx.getChild(i).getText()+"|" );
     buf.append( "" );  //Hmmm.....
    }
   } 

    String after =
      statusManager.backTrans( "", KeepTrack.Trans.EOL_AFTER ); 
     if (after != null) {
      buf.append( after );
     }
   
   //System.out.println( "Line concat: "+buf.toString() );
   if (cmtInfo != null) {
     buf.append( "      ");
     buf.append( cmtInfo );
    }
   buf.append("\n");  //New line at end of line
   setInk( ctx, buf.toString() );
 }//End exitLine.


  // -->2.0 'numfrag' is one of several types of  
  //        symbols-sequences that can comprise a line-->
  // (Parser grammar knows valid numeric symbols !)
  // This is a complete item.
@Override
 public void exitNumfrag(simpleParser.NumfragContext ctx) {
  System.out.println( "\n     ***Numfrag***" );
  
  int cnt = ctx.getChildCount();
  String brl = ctx.getText();

    //Check entire sequence first in case it represents
    //an available Unicode character for vulgar fraction 
    //If not backtranslator returns null
  String ink = //statusManager.numericMode( brl );
    statusManager.backTrans( brl, KeepTrack.Trans.NUMERIC_SEQ );
  if (ink != null){
   setInk( ctx, ink );
   //statusManager.numfragDone( true ); //ALWAYS TRUE?
   return;
  }

    //Back translate individual symbols
  StringBuilder buf = new StringBuilder();
  //String ink;
  for (int i=0; i<cnt-1; i++){
   brl = ctx.getChild(i).getText();
   //ink = statusManager.numericMode( brl );
   ink =  statusManager.backTrans( brl, KeepTrack.Trans.NUMERIC_SYM);
   if (ink == null){
        System.out.println( "Numfrag logic error--cannot "+
                            "translate braille: "+ brl );
        ink="|"+brl+"|";
   } else {
       System.out.println( "brl: "+brl+" ink: "+ink );
   }
   setInk( ctx.getChild(i), ink );
   buf.append( ink );
  }
  brl = ctx.getChild( cnt-1 ).getText();   
  ink = statusManager.numfragDone( brl );
  buf.append( ink );
  setInk( ctx, buf.toString() );
 }

  // -->2.1 'standingAlone' is one of several types of 
  //        symbols-sequencrd that can comprise a line-->
  //  Its different types of children are back-translated
  //  at their nodes
@Override
 public void exitStandingAlone(simpleParser.StandingAloneContext ctx){

   System.out.println( "\n     exit ***StandingAlone***" );
 
    //Concatenate
   StringBuilder buf = new StringBuilder();
   int cnt = ctx.getChildCount();
   for (int i=0; i<cnt; i++){
    String ink = getInk( ctx.getChild(i));
    buf.append( ink );
   }
   System.out.println( "StandAlone trans: "+buf.toString() );
   setInk( ctx, buf.toString() );
}

// -->3.0 'preAlone' are optional symbols and indicators whick
//        can precede a standalone letter or letter sequence 
@Override 
 public void exitCapsWordInd(simpleParser.CapsWordIndContext ctx) {
  System.out.println( "\n    ***exitCapsWordInd***" );
  String brl = ctx.getText();
  String ink =   //statusManager.processIndicators( brl );
   statusManager.backTrans( brl, KeepTrack.Trans.INDICATOR );
  setInk( ctx, ink );
 }
@Override
 public void exitPreAlone(simpleParser.PreAloneContext ctx) { 
     System.out.println(
      "\n    ***finish any StandingAlone prefix ***" );
    //Grammar defines each prefix symbol as a
    //separate node, single token
    String brl = ctx.getText();
    String ink =
     statusManager.backTrans( brl, KeepTrack.Trans.SA_PREFIX );
    //String ink = statusManager.handleSAPrefix( brl );
    System.out.println( "PreAlone brl: "+ctx.getText()+" ink: "+ink);
    setInk( ctx, ink );
}

// -->3.0 'saLetters' is either a single Latin letter (not preceded with a
//        any Grade 1 indicator) that in contracted braille
//        would be backtranslated as a single-letter
//        whole-word contraction or a sequence of such letters that
//        would be backtranslated as a shortform word.<--
@Override 
 public void exitSaLetters(simpleParser.SaLettersContext ctx) {
  System.out.println( "\n    ***exitSaLetters***" );            
  String brl = ctx.getText();
  String ink =
   statusManager.backTrans( brl, KeepTrack.Trans.SA_SEQ );
  //String ink = statusManager.backTransSAseq( brl );
  System.out.println( "  brl: "+brl+" ink: "+ink );
  setInk( ctx, ink );
 }

// -->3.2 'postAlone' are optional symbols and indicators which
//        can follow a standalone letter or letter sequence 
@Override 
 public void exitPostAlone(simpleParser.PostAloneContext ctx) { 
 System.out.println( "\n    ***exitPostAlone***" );
 String brl = ctx.getText();
    String ink =
     statusManager.backTrans( brl, KeepTrack.Trans.SA_POSTFIX );
 //String ink = statusManager.handleSAPostfix( brl );
 System.out.println( "PostAlone brl: "+brl+
                      " ink: "+ink);
 setInk( ctx, ink );
}

           //      ****EVERYTHING ELSE**** 
// --> An 'item' is an arbitrary prefix-root or root-only symbol
//     that the parser doesn't treat specifically.  It may or
//     not be an actual UEB symbol and/or in a grammatically
//     valid context.
//
@Override 
 public void exitItem( simpleParser.ItemContext ctx ) {
  System.out.println( "\n***exitItem***" );

  //No need to check as max scope is item (NOT CONTINUED)
  //capWordInd = false;

//Children all back-translated at lower level  
  int cnt = ctx.getChildCount();
  System.out.println( "Item count: "+cnt+
    " text: "+ctx.getText() );
  StringBuilder itemTrans = new StringBuilder();
  String ink;
  for (int i=0; i<cnt; i++){
    ink = getInk( ctx.getChild(i) );
    itemTrans.append( ink );
  }

//This only appropriate if item has no pre or post???
     // Add LIFO stack of any remaining end tags 
     // for TF Word indicators
     String after =
      statusManager.backTrans( "", KeepTrack.Trans.IF_AFTER ); 
     if (after != null) {
      itemTrans.append( after );
     }
     System.out.println( "itemTrans: "+itemTrans.toString() );
     setInk( ctx, itemTrans.toString() );
  return;
}

@Override 
 public void exitPr_token(simpleParser.Pr_tokenContext ctx) { 
  System.out.println( "\n    ***starting exitPr***" );
  int cnt = ctx.getChildCount();
  String brl = ctx.getText();
  System.out.println( "Item count: "+cnt+" text: "+brl );
  String ink = //statusManager.backTransToken( brl );
       statusManager.backTrans( brl, KeepTrack.Trans.GENERIC_TOKEN );
  System.out.println( "pr_token Translated as: "+ink );
  setInk( ctx, ink);
}//End exitPr

//Trailing separator is parent of separator used to distinguish
// separators at end of line -- lower levels do actual 
// backtranslation
 @Override
 public void exitTrailingSep(simpleParser.TrailingSepContext ctx) {
	 
 System.out.println( "\n   ***TrailingSep***" );
  int cnt = ctx.getChildCount();
  //if (!hideSep)
   //System.out.println( "Separator count: "+cnt+
                       //" text: "+ctx.getText() );
  String ink;
  StringBuilder buf = new StringBuilder();
  
  for (int i=0; i<cnt; i++){
   buf.append( getInk( ctx ) );
  }
  setInk( ctx, buf.toString() );
}
@Override
 public void exitSeparator(simpleParser.SeparatorContext ctx) { 
 if (!hideSep) System.out.println( "\n***exitSeparator***" );
  int cnt = ctx.getChildCount();
  if (!hideSep)
   System.out.println( "Separator count: "+cnt+
                       " brl: |"+ctx.getText()+"|" );
  String ink;
  StringBuilder buf = new StringBuilder();
   //Process each token in this item
  for (int i=0; i<cnt; i++){
   String brl = ctx.getChild(i).getText();
   if (!hideSep)
    System.out.println( "\n  Item no. "+i+" brl: |"+brl+"|" );
   ink = statusManager.backTrans( brl, KeepTrack.Trans.SEPARATOR );
  //backTransSeparator( brl );
   setInk( ctx.getChild(i), ink );
   buf.append( ink );
  }
  setInk( ctx, buf.toString() );
}
/**
//Insert print spaces for braille spaces
@Override
 public void exitSpace( simpleParser.SpaceContext ctx) {
   //System.out.println( " Inserting a print space. ");
   //setInk( ctx, " " );
*/
//Concantenates in input order previously determined translations
//(saved as annotations) of all the child nodes of the input node.
public void concat( ParserRuleContext ctx ){
 StringBuilder buf = new StringBuilder();
 int cnt = ctx.getChildCount();
  for (int i=0; i<cnt; i++){
    String ink = getInk( ctx.getChild(i) );
    buf.append( ink );
  }
  setInk( ctx, buf.toString() );
}
  String lineComment( simpleParser.LineContext ctx,
     int channelIndex ) {

    Token startOfBrl = ctx.getStart();
    Token endOfBrl = ctx.getStop();
    int bComment = startOfBrl.getTokenIndex();
    int eComment = endOfBrl.getTokenIndex();

   if (debugComments) System.out.println( "bComment: "+bComment+
                        " eComment: "+eComment );
    List<Token> manual;
    Token cmt;
    String cmtInfo = null;

    // There could be separator(s) after a comment and 
    // before the newline at the end of the line.
    // Current logic requires the newline to be sent to the 
    // default token channel, not to the comment channel 
    // so comment is must be enclosed. Thus locating comment 
    // requires searching backwards from the EOL.

  for ( int j = eComment; j> bComment; j--){
    if (debugComments) System.out.println( "Token index: "+j );
    manual =
      allTokens.getHiddenTokensToLeft( j , channelIndex  );

    if (manual == null){
     if (debugComments)
     System.out.println( "Nothing hidden immediately to left." );
    } else {
      cmt = manual.get( 0 );
      if (cmt != null){
       cmtInfo = cmt.getText();
       if (debugComments)
       System.out.println( "cmt: "+cmt.getText() );
       break;
      }
    }
  }
    return cmtInfo;
}

}//End Inner Class Translator.

//=========================================================
public static void main( String[] args ) throws Exception {
//=========================================================

 System.out.println( "\n    Welcome to Basic UEB backtranslator!" );
 System.out.println( "      Uncontracted braille w/o code switching options." );
 System.out.println( "      Uses ANTLR 4.7.1 for parsing." );

        String inputFile = null;
        CharStream input = null;
        if ( args.length > 0 ) inputFile = args[0];
        if (inputFile == null){
System.out.println( "\n    -->Enter North Am. ASCII Braille." );
System.out.println( "    -->End input with CTRL-z "+
                 "as only symbol on last line." );
          //input = CharStreams.fromStream( System.in );

    Reader myReader = new InputStreamReader( System.in, "UTF-8");
    CodePointCharStream cpcs = CharStreams.fromReader( myReader );
        input = cpcs;
        
           //System.out.println ( "Please specify an input file!" );
           //System.exit( 0 );
        } else {
         File f = new File( inputFile );
         if(f.exists() && !f.isDirectory())  {
          input = CharStreams.fromFileName( inputFile );
         } else {
          System.out.println( "\n OOPS! Cannot find input file: "
          +inputFile );
          System.exit( 0 );
         }
        }

/**  I. Connect lexer and parser and instruct parser to
        build a parse tree.  
*/
        simpleLexer lexer = new simpleLexer( input );
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        simpleParser parser = new simpleParser( tokens );
        String[] ruleNames = parser.getRuleNames();
        //System.out.println("No. of ruleNames from parser: "+ruleNames.length );
        //for (int r = 0; r< ruleNames.length; r++){
         //System.out.println( "Rule index: "+r+" name: "+ruleNames[r] );
        //}
        parser.setBuildParseTree( true );
		
/**  II. Start tree with the topmost rule in the Parser 
         grammar.  (Rule #0 if grammar starts with that one.)
*/
     ParseTree tree = parser.text();
     if (printTree){
      System.out.println( "     PARSE TREE: ");
      System.out.println( "      "+
	                 tree.toStringTree( parser ));
     }

    //System.out.println( "(text\n "+" (line\n "+"  (item\n " );
    // Optionally print tree in text form
    //if (printTree) System.out.println( "      "+
	               //tree.toStringTree(parser).substring(17));
    //prettyPrint( tree.toStringTree( parser ));

/**  III. Insert logic to walk and annotate tree here....*/
     ParseTreeWalker walker = new ParseTreeWalker();
     PendingCapInds capInfo = new PendingCapInds();
    boolean uncontracted = true;
   KeepTrack kt = new KeepTrack( capInfo, uncontracted );
     //KeepTrack kt = new KeepTrack( capInfo );
     kt.makeTables( false, false );
       //Translator, i.e. annotator, must extend baseListener 
     Translator bt = new Translator( kt, tokens );
       //bt.setRuleNames( ruleNames );
     //System.out.println( );
     walker.walk(bt, tree);

/**  IV. Display backtranslation  */
     System.out.println();
     System.out.println( "      ***Backtranslation***" );
     System.out.println(" Back-translated print from tree: ");
     System.out.println( bt.getInk( tree ) );

 }//End Main.
}//End Outer Class BackPR.