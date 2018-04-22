parser grammar simpleParser;
options { tokenVocab = simpleLexer; }
tokens {LATIN_LETTER, FUN_NAME}
@parser::header{ package org.dotlessbraille.antlr; }
@parser::members{ boolean line_cont = false; }


 //Grammar to back-translate UEB based mostly on its prefix-root
 //structure.  Numeric mode included here. Also should do caps?
 //makes more work in tree annotator....

 //two adjacent numfrags? Seems yes in a mixed number?
 //they can intersperse with other items in general alphanumeric

text: (line)+;
line:  (nemethStartDisplay|nemethEndDisplay)(NEM_NEWLINE|NEWLINE)
       |(nemethStartInline|nemethEndInline)((nemSyms)+)(NEM_NEWLINE|NEWLINE)

      |( space)* ( (standingAlone) |
                   (((numfrag)|(item)+)+)
                 )                            
                 ( (separator)+ 
                   ( (standingAlone) |
                     (((numfrag)|(item)+)+)
                   ) 
                 )*                            
        (trailingSep)*NEWLINE
      | (space)*NEWLINE
      ;

capsWordInd:    (DOT6)(DOT6);
capsPassageInd: (DOT6)(DOT6)(DOT6);
rootlessToken:   DOTS56;

nemethStartDisplay: START_DIS;
nemethEndDisplay:   END_DIS;
nemethStartInline: START_DIS;
nemethEndInline:   END_DIS;

item: (capsPassageInd|capsWordInd|
       rootlessToken|pr_token|scrip);

space:  SPACE;
hyphen: DOTS36;
dash:   DOT6 DOTS36;
long_dash: DOT5 DOT6 DOTS36;

separator:  (space|hyphen|dash|long_dash);
trailingSep: separator;

roots: (  //LETTER|     //26 represents by "letters"
          DOTS36|       //1
        LOWER_ROOT|     //2
        DOT2|DOTS23|DOTS25| //3
        DOTS256|DOTS235|DOTS236|DOTS2356|  //4
        DOTS34|DOTS126|DOTS345|DOTS346|DOT3| //5
        ROOT|
        largeWords|DOTS16|DOTS1456|DOTS1256| //8
        DOTS146|DOTS156);  //2  
  

letters: updigs|MOST_LETTERS|LETTERK;
  //Title-case only, embedded cap would violate "standing alone" criteria
saLetters: (letters)(letters)*;

// could be (ucLetters)|(ucLetters)?letters+  single uc or uc? lc+

//letters: 'a'|'b'|'c'|'d'|'e'|'f'|'g'|'h'|'i'|'j'|'k'|'l'|'m'|
//         'n'|'o'|'p'|'q'|'r'|'s'|'t'|'u'|'v'|'w'|'x'|'y'|'z';

ucLetters: DOT6(letters);
prefix:   (DOT4|DOT5|DOT6|DOTS45|DOTS56|
           DOTS46|DOTS456|DOTS3456);
largeWords: AND|FOR|OF|THE|WITH;  
initLetCons: ILC5|ILC45|ILC456;
 //The only shortform that uses a two-cell symbol

//Strong wordsigns: child shall this which out still 
strong_ws: (DOTS16|DOTS146|DOTS1456|DOTS156|DOTS1256|DOTS34);
       
shortForms: BESF|CHSF|SHSF|STSF;

  //should the capsPass ind be in preAlone?
standingAlone: 
  (preAlone)*
  ( (capsPassageInd|capsWordInd|DOT6)? (strong_ws|saLetters|shortForms) )
  (postAlone)*;

pr_token: (largeWords|initLetCons|(prefix)?(roots|letters));
updigs: (LETTERA|LETTERB|UPDIGS);
numspacedig: (DOT5 updigs);
//numind: {!line_cont}? ((DOTS3456) (UPDIGS| DOT2 | DOTS256 )) |
        //(UPDIGS| DOT2 | DOTS256 );


numind: ((DOTS3456) (updigs| DOT2 | DOTS256 )); 
numfrag: numind (updigs | DOT2 | DOTS256 | DOTS34 | numspacedig )*;

nemInteger: (NEM0|NEM1|NEM2|NEM3|NEM4|NEM5)+;
nemReal: (nemInteger NEM_DECPT (nemInteger)? )|
         (NEM_DECPT nemInteger);
nemOp: NEM_PLUS|NEM_MINUS|NEM_FACTORIAL;
nemComp: NEM_EQUALS;
nemId: LATIN_LETTER|LC_ID;
nemOGroup: NEM_OFENCE|NEM_VBAR;
nemCGroup: NEM_CFENCE;
nemSyms: (nemInteger|nemReal|nemOp|nemComp
         |nemOGroup|nemCGroup|nemId|NEM_SPACE
         )+;

//vulg1_half: (DOTS3456 LETTERA DOTS34 LETTERB);
//vulg3_8:  (DOTS3456 'c' DOTS34 'h' );
//vfrac: (vulg1_half);

//All 36 typeform indicators!

  d4_hash:   DOT4 DOTS3456;
  d45_hash:  DOTS45 DOTS3456;
  d456_hash: DOTS456 DOTS3456;
  d5_hash:   DOT5 DOTS3456;
  d46_hash:  DOTS46 DOTS3456;

  tfPrefix: DOTS46|DOTS45|DOTS456|DOT4|
            d4_hash|d45_hash|d456_hash|
            d5_hash|d46_hash;
  tfStartRoot: DOTS23|DOT2|DOTS2356;  //symbol, word, passage
  tfTermRoot:  DOT3;
  tfStartIndicator: ((tfPrefix)(tfStartRoot));
  tfTermIndicator:  ((tfPrefix)(tfTermRoot));

  tfSymbolInd: (tfPrefix DOTS23);
  tfWordInd:   (tfPrefix DOT2);


//LATER == more than one letter?

  
//capLetter: DOT6 (LETTER);
//allLetters: (LETTER|capLetter); 

//allLetters: (LETTER);
//g1: ( allLetters)+;
//g1: capLetter;
//letters: (POSS_DIGIT|LETTER|capLetter);

subsup:(DOTS56)(LOWER_ROOT);

encl1: (DOT5 DOTS126)(pr_token)+(DOT5 DOTS345);
encl2: (DOTS46 DOTS126)(pr_token)+(DOTS46 DOTS345);
encl3: (DOTS456 DOTS126)(pr_token)+(DOTS456 DOTS345);

 scrip: subsup(encl1|encl2|encl3);
          
  preAlone: ( ((DOT5|DOTS46|DOTS456)DOTS126)|  // (  [  {
              ((DOTS456|DOTS45|DOT6)?DOTS236)| // opening quotes
              (DOT5 DOTS2356|DOT3)|            // non-dir quotes or apos 
              capsPassageInd|
              tfStartIndicator
            );            

postAlone: ( (DOT2|DOTS23|DOTS25|DOTS256(DOTS256 DOTS256)?|
              DOTS235|DOTS236)|                 // , ; : . ... ! ?
             ((DOT5|DOTS46|DOTS456)DOTS345)|    // ) ] ]
             ((DOTS456|DOTS45|DOT6)? DOTS356)|  // closing quotes
              (DOT5 DOTS2356|DOT3) |            //non-dir quotes or apos 
               tfTermIndicator
           );             
            

/**
word:   single    # StandingAlone
      | ( (any|beg|num_item) (any|mid_end)  
        | (any|mid_end) (any|beg|num_item)                            
        )                        # TwoSigns
      | (any|beg) ((any|mid_end|mid) (any|mid_end|mid)*) 
        (any|mid_end|num_item) # Huge
      ;
*/



// ( [ { <
//open_fence: ( (DOT5|DOTS46|DOTS456|DOT4)DOTS126 );
    //TO-DO  Add remaining quote marks --see next comment

//(opening (It.|double|single)?non-spec)) | non-dir double | non-dir single);
//open_quote: ( ((DOTS456|DOTS45|DOT6)?DOTS236) | ( DOT6 DOTS2356) | DOT3 );

//start_punc: ((open_fence)+(open_quote)*)
            //|((open_quote)+(open_fence)*)
            //|((open_fence)+(open_quote)(open_fence)+)
            //;

//One instance is one or more fences or one or more quotes
//start_punc: ((open_fence)+|(open_quote)+);

//Get numitem now to save work in tree walker?
/**
//comma:           DOT2;
//full_stop:       DOTS256;
//simple_fracline: DOTS34;
//num_space_ind:   DOT5;
//num_space_digit: num_space_ind poss_digit;
//num_line_cont: DOT5;
//num_line_cont_space: (DOT5)(DOT5); 


  //Numeric indicator is #(root)
//ni: DOTS3456 (poss_digit);  //digits, comma, period
 //All the symbols that don't end NI scope in UEB (except for line cont. guys)
 //TO-DO line cont.?? Add March 2018
 // comma is dot2, full_stop is dots256, simple fracline is dots34
 //Line Cont. inds only at end but check later?

//num_mode_symbols: (poss_digit|comma|full_stop|simple_fracline|num_space_digit|
          //num_line_cont|num_line_cont_space);
//num_item: ni(num_mode_symbols)*;
*/
  
/* The UEB stand-alone rule 2.6 suggests what can be considered as
   leading characters besides a space.  They are a hyphen, dash
   any opening fence or opening quote, an apostrophe, any
   opening typeform or capitals indicator (or an opening
   transcriber's note);
*/
