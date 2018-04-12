parser grammar simpleParser;
options { tokenVocab = simpleLexer; }
@parser::members{ boolean line_cont = false; }


 //Grammar to back-translate UEB based mostly on its prefix-root
 //structure.  Numeric mode included here. Also should do caps?
 //makes more work in tree annotator....

//not correct to have two numfrags together but
//they can intersperse with other items in general alphanumeric

text: (line)+;
line:  ( space)* ( (standingAlone) |
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

item: (capsPassageInd|capsWordInd|pr_token);

space: SPACE;
hyphen: DOTS36;
dash: DOT6 DOTS36;
long_dash: DOT5 DOT6 DOTS36;

separator: (space|hyphen|dash|long_dash);
trailingSep: separator;

//HACKED 
//Assuming that DOTS36 only a root in separators
roots: (  //LETTER|     //26
          DOTS36|
        LOWER_ROOT|DOT2|DOTS23|
        DOTS25|
        DOTS256|DOTS235|DOTS236|DOTS2356|  //26+10 = 36
        DOTS34|DOTS126|DOTS345|DOTS346|DOT3| //36+6=42
        ROOT);    

//letters: (//LETTERM|LETTERX|LETTERY|LETTERZ|
          //LETTERA|LETTERB|LETTERC|LETTERD|LETTERE|
         // LETTERQ);

letters: updigs|MOST_LETTERS;
//saLetters: letters+;
  //Title-case only, embedded cap would violate "standing alone" criteria
saLetters: ((DOT6)?letters)(letters)*;

// could be (ucLetters)|(ucLetters)?letters+  single uc or uc? lc+

//letters: 'a'|'b'|'c'|'d'|'e'|'f'|'g'|'h'|'i'|'j'|'k'|'l'|'m'|
//         'n'|'o'|'p'|'q'|'r'|'s'|'t'|'u'|'v'|'w'|'x'|'y'|'z';

ucLetters: DOT6(letters);
prefix: (     //DOTS3456|
         DOT4|DOT5|DOT6|DOTS45|
         DOTS56|DOTS46|DOTS456);

pr_token: (prefix)?(roots|letters);
//standingAlone: (preAlone)*((capsPassageInd|capsWordInd)?(saLetters)+)(postAlone)*;

standingAlone: 
(preAlone)*((capsPassageInd|capsWordInd)?(saLetters))(postAlone)*;

//numeric_ind: DOTS3456;  // (DOT2|DOTS256|NUM_FRAG);
//numeric_chars: DOT2|DOTS256|NUM_FRAG;
  //numfrag: (numeric_ind (numeric_chars)*);

//Line cont at end?  (DOT5(DOT5)?)?
//What about (lost thought) ....


updigs: (LETTERA|LETTERB|UPDIGS);
numspacedig: (DOT5 updigs);
//numind: {!line_cont}? ((DOTS3456) (UPDIGS| DOT2 | DOTS256 )) |
        //(UPDIGS| DOT2 | DOTS256 );

numind: ((DOTS3456) (updigs| DOT2 | DOTS256 )); 
numfrag: numind (updigs | DOT2 | DOTS256 | DOTS34 | numspacedig )*;

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


//LATER == more than one letter?

  
//capLetter: DOT6 (LETTER);
//allLetters: (LETTER|capLetter); 

//allLetters: (LETTER);
//g1: ( allLetters)+;
//g1: capLetter;
//letters: (POSS_DIGIT|LETTER|capLetter);

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
//leading: ((tfWordInd|tfPassageInd)?start_punc)|(start_punc)*(capsPassageInd|capsWordInd);

//INCOMPLETE
//leading: start_punc;

// Keep start_separate from caps indicators -- just use one trans table!
//leading:  (start_punc)+(capsPassageInd|capsWordInd)?  //one or more punc + opt caps ind
         // |(capsPassageInd|capsWordInd);








