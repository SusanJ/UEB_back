lexer grammar simpleLexer; 
@lexer::header {package org.dotlessbraille.antlr; }
channels{ INK_PRINT }   

//Lexer based on UEB prefix-root structure

// All of the lexer tokens are simply the ASCII characters
//used in the North American ASCII Braille transliteration
// TO-DO Allow UC ASCII???

// 8 braille cells are prefix cells, only dots 56 and dot 6 can
// be used to form signs without roots
 fragment HASH: '#';
DOTS3456: HASH;
 fragment ATSIGN: '@';  
DOT4:     ATSIGN;
 fragment NDQUO: '"';
DOT5:     NDQUO;
 fragment CAPS_IND: ',';
DOT6:     CAPS_IND;
 fragment CARET: '^';
DOTS45:   CARET;
 fragment SEMICOLON: ';';
DOTS56:   SEMICOLON;
 fragment ABPERIOD: '.';
DOTS46:   ABPERIOD;
 fragment USCORE: '_';
DOTS456:  USCORE;

 //Final letter contractions
FLC46: ABPERIOD('d'|'e'|'n'|'s'|'t');
FLC56: SEMICOLON('e'|'g'|'l'|'n'|'s'|'t'|'y');
DOTLOC: '.''=';
PERCENT: '.''0';
SEVENTH_TDS: '.''#''?';

  //Dot 5 initial letter contractions
ILC5: NDQUO('d'|'e'|'f'|'h'|'k'|'l'|'m'
           |'n'|'o'|'p'|'q'|'r'|'s'|'t'|'u'|'w'|'y'
           |ASTER|QMARK|COLON|BSLASH|EXCLAM
           )
           ;
ILC45: CARET('u'|'w'|ASTER|QMARK|COLON|EXCLAM);
ILC456: USCORE('c'|'h'|'m'|'s'|'w'|EXCLAM);

//Strong groupsigns: ch gh sh th wh  ed er ou ow  st ing ar
//STRONG_GS:  (DOTS16|DOTS126|DOTS146|DOTS1456|DOTS156
            //|DOTS1245|DOTS12456|DOTS1256|DOTS246s
           // |DOTS34|DOTS346|DOTS345
            //); 

//Strong wordsigns: child shall this which out still 
//STRONG_WS: (ASTER|PCENT|QMARK|COLON|BSLASH|FRAC_LINE);       

        //  Parser puts these non-alphabetic shortforms  
        // explicitly in standing-alone context
        // which simpifies backtranslation logic
        //  The ~50 all-letter ones don't need to be explicit
        // since alphabetic sequences that aren't 
        // shortforms are easily backtranslated
 //Shortforms that start with the "be" contraction
BESF: LOW_TWO('c'|'f'|'h'|'l'|'n'|'s'|'t'|'y');
 // children, much, such
CHSF: (ASTER 'n') |(('m'|'s')ASTER);
 // should
SHSF: PCENT 'd';
 // against, first, must
STSF: ('a''g'BSLASH)|('f'|'m')BSLASH;
 //ourselves
OURSELVES: BSLASH 'r''v''s';
 // although thyself
THSF: 'a''l'QMARK|QMARK 'y''f';
 // perhaps herself perceiving
ERSF: (('p' CBRAK)('h'|'c''v''g'))|('h' CBRAK 'f');
 // oneself
ONESELF: DOT5 'o' 'f';
 // themselves
THMSLVS: EXCLAM 'm' 'v' 's';
 // conceive, conceiving
CONCV: '3''c''v'('g')?;

//Alphabetic cells
//CAP_LETTER: (',''f');

//POSS_DIGIT: ('a' .. 'j');
//
//LETTERB: 'b';
//LETTERS:     [a-z];
//LETTERS: ('a'|'b'|'c'|'d'|'e'|'f'|'g'|'h'|'i'|'j'|'k'|'l'|'m'|
         //'n'|'o'|'p'|'q'|'r'|'s'|'t'|'u'|'v'|'w'|'x'|'y'|'z');

//LETTERA: 'a';
//LETTERB: 'b';
//LETTERC: 'c';
//LETTERD: 'd';
//LETTERE: 'e';
//LETTERF: 'f';
//LETTERG: 'g';
//LETTERH: 'h';

//
//LETTERX: 'x';
//LETTERY: 'y';
//LETTERZ: 'z';
//LETTERQ: 'q';

//MOST_LETTERS: UPDIGS|[k-z];
LETTERK: 'k';
MOST_LETTERS: [l-z];


//LETTER: ('a'|'b'|'c'|'d');
 //(',a'|',b'|',c'|',d'|',e'|',f'|',g'|',h'|',i'|',j'|',k'|',l'|',m'|
           // ',n'|',o'|',p'|',q'|',r'|',s'|',t'|',u'|',v'|',w'|',x'|',y'|',z');

  //Lower cells
 fragment LOW_ONE:   '1';
DOT2:     LOW_ONE;
 fragment LOW_TWO:   '2';
DOTS23:   LOW_TWO;
 fragment LOW_THREE: '3';
DOTS25:   '3';
 fragment FULL_STOP: '4';
DOTS256:  FULL_STOP;

DOTS235:  '6'; 
DOTS2356: '7';
DOTS236:  '8';

 fragment LOW_ZERO: '0';
DOTS356:  LOW_ZERO;
 fragment LOW_FIVE: '5';
DOTS26:   LOW_FIVE;
 fragment LOW_NINE: '9';
DOTS35:   LOW_NINE;

//LOWER_ROOT: LOW_FIVE|LOW_NINE; //26+10=36; 36+8=44


//Remaining 20 cells (including space)
//Apparently input needs to escape a backslash?

 fragment FRAC_LINE: '/';
DOTS34: FRAC_LINE;
 fragment HYPorMINUS: '-';
DOTS36: HYPorMINUS; 
 fragment LESSTHAN: '<';
DOTS126: LESSTHAN;
 fragment GREATERTHAN: '>';
DOTS345: GREATERTHAN;
 fragment PLUS_SIGN: '+';
DOTS346: PLUS_SIGN;
DOT3:    '\''; 
// Works!  {System.out.println( "apos? :|"+getText()+"|");})
//ROOT is 13 cells

 fragment PCENT: '%';
DOTS146: PCENT;
 fragment COLON: ':';
DOTS156: COLON;

 fragment AMPER: '&';
 fragment EQSIGN: '=';
 fragment OPAREN: '(';
 fragment EXCLAM: '!';
 fragment CPAREN: ')';

 fragment OBRAK: '[';
 fragment CBRAK: ']';
 fragment DOLLAR: '$';

 fragment ASTER:  '*';
 fragment QMARK:  '?'; 
 //fragment BSLASH: '\\\\';  //What I had found worked a while back?
 fragment BSLASH: '\\';  //April 2018 This works in new Antlr!
 

AND:  AMPER;  //dots12346
FOR:  EQSIGN; //dots123456
OF:   OPAREN; //dots12356
THE:  EXCLAM; //dots2346
WITH: CPAREN; //dots23456

DOTS16: ASTER;
DOTS1456: QMARK;
DOTS1256: BSLASH;

DOTS12456: CBRAK;
DOTS246: OBRAK;
DOTS1246: DOLLAR;


//ROOT:  (OBRAK|CBRAK
       //|DOLLAR
       //)
       //;  

//64-8 = 56 cells counting space
//ROOTS: (LETTER|     //26
        //LOWER_ROOT|DOT2|DOTS23|DOTS25|
       // DOTS256|DOTS235|DOTS236|DOTS2356|  //26+10 = 36
        //DOTS34|DOTS36|DOTS126|DOTS345|DOTS346|DOT3| //36+6=42
       // ROOT);    //42+13=55 :  

 fragment        
  ASPACE: ' ';
SPACE: ASPACE;
 fragment
  WINNL: [\r\n]+;
NEWLINE: WINNL;
INK_INFO: '//' .*? '//'-> channel( INK_PRINT );

LETTERA: 'a';
LETTERB: 'b';
UPDIGS: [c-j];

//NUM_FRAG:
//( (UPDIGS)
   //{System.out.println( "NUM_FRAG: "+getText() );}
//);

 
START_DIS: USCORE PCENT ASPACE -> pushMode( NEMETH );

mode NEMETH;
  END_DIS: USCORE COLON ASPACE -> popMode;
  NEM0: LOW_ZERO;
  NEM1: LOW_ONE;
  NEM2: LOW_TWO;
  NEM3: LOW_THREE;
  NEM4: FULL_STOP;
  NEM5: LOW_FIVE;

  NEM_BASELINE:  NDQUO;
  NEM_DECPT:     ABPERIOD;
  NEM_EQUALS:    ASPACE ABPERIOD LETTERK ASPACE;
  NEM_FACTORIAL: AMPER;
  NEM_MINUS:     HYPorMINUS;
  NEM_NEWLINE:   WINNL;
  NEM_PLUS:      PLUS_SIGN;
  NEM_SPACE:     ASPACE;
  NEM_SUPER:     CARET;
  NEM_SUB:       SEMICOLON;
  NEM_INTEGRAL:  EXCLAM;
  NEM_OFENCE:    (ABPERIOD|ATSIGN)? OPAREN; // { [ (
  NEM_CFENCE:    (ABPERIOD|ATSIGN)? CPAREN; // } ] )
  NEM_VBAR:      BSLASH;
  LC_ID	: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z')* 
          { if (getText().length() == 1) {     //MI or MN (Roman numeral)
               setType( simpleParser.LATIN_LETTER );
          }}         
	; 

 //Sample for ending one mode by another
mode ANOTHER;
 ANOTHER_SPACE: ASPACE -> popMode;
 CAP_ZED: 'Z'; 
  