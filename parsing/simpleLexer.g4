lexer grammar simpleLexer; 
channels{ INK_PRINT }   

//Lexer based on UEB prefix-root structure


// All of the lexer tokens are simply the ASCII characters
//used in an ASCII Braille transliteration
// TO-DO Allow UC ASCII???


// 8 braille cells are prefix cells,only dots 5,6 and dot 6 can
// be used to form signs without roots
fragment HASH: '#';
DOTS3456: HASH;  
DOT4:     '@';
fragment NDQUO: '"';
DOT5:     NDQUO;
fragment CAPS_IND: ',';
DOT6:     CAPS_IND;
DOTS45:   '^';
DOTS56:   ';';
DOTS46:   '.';
DOTS456:  '_';
//PREFIX: (HASH|DOT4|NDQUO|CAPS_IND|DOTS45|
         //DOTS56|DOTS46|DOTS456);


//FLC46: '.'('d'|'e'|'n'|'s'|'t');
//FLC56: ';'('e'|'g'|'l'|'n'|'s'|'t'|'y');
DOTLOC: '.''=';
PERCENT: '.''0';
SEVENTH_TDS: '.''#''?';


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
MOST_LETTERS: [k-z];


//LETTER: ('a'|'b'|'c'|'d');
 //(',a'|',b'|',c'|',d'|',e'|',f'|',g'|',h'|',i'|',j'|',k'|',l'|',m'|
           // ',n'|',o'|',p'|',q'|',r'|',s'|',t'|',u'|',v'|',w'|',x'|',y'|',z');

//Lower cells
fragment LOW_ONE: '1';
DOT2:     LOW_ONE;
DOTS23:   '2';
DOTS25:   '3';
fragment FULL_STOP: '4';
DOTS256:  FULL_STOP;
DOTS235:  '6'; 
DOTS236:  '8';
DOTS2356: '7';
DOTS356:  '0';
LOWER_ROOT: '5'|'9'; //26+10=36; 36+8=44


//Remaining 20 cells (including space)
//Apparently input needs to escape a backslash?

fragment FRAC_LINE: '/';
DOTS34: FRAC_LINE;
DOTS36: '-'; 
DOTS126: '<';
DOTS345: '>';
DOTS346: '+';
DOT3:    '\''; 
// Works!  {System.out.println( "apos? :|"+getText()+"|");})
//ROOT is 13 cells
ROOT:  ('?'|':'|'['|']'|'!'       
       |'$'|'%'|'&'|'*'|'('|')'
       |'='      
       |('\\\\' {System.out.println( "backslash? :|"+getText()+"|");})
       )
       ;  

//64-8 = 56 cells counting space
//ROOTS: (LETTER|     //26
        //LOWER_ROOT|DOT2|DOTS23|DOTS25|
       // DOTS256|DOTS235|DOTS236|DOTS2356|  //26+10 = 36
        //DOTS34|DOTS36|DOTS126|DOTS345|DOTS346|DOT3| //36+6=42
       // ROOT);    //42+13=55 :  

 fragment        
  ASPACE: ' ';
SPACE: ASPACE;
NEWLINE: [\r\n]+;
INK_INFO: '//' .*? '//'-> channel( INK_PRINT );

LETTERA: 'a';
LETTERB: 'b';

UPDIGS: [c-j];
//UPDIGS: 'a'|'b'|'c'|'d'|'e'|'f'|'g'|'h'|'i'|'j';
//UPDIGS: [a-j];  

//fragment
 //NUM_GUYS: (UPDIGS|LOW_ONE|FULL_STOP);

//NUM_IND: (HASH (UPDIGS|LOW_ONE|FULL_STOP));
//NUM_IND: (HASH (NUM_GUYS));

NUM_FRAG:
( (UPDIGS)
   {System.out.println( "NUM_FRAG: "+getText() );}
);

 //(FRAC_LINE|NDQUO|NUM_GUYS);

//
 //(UPDIGS|LOW_ONE|FULL_STOP|FRAC_LINE|NDQUO);
 //(UPDIGS|'1'|'4'|'/'|'"' UPDIGS|('"')('"')?);


// if line cont not at end of line it is ignored?

//mode NUMMODE;
// NUMSYM:  (LETTERA|LETTERB|LETTERC|'1'|'4'|'/'|'"' LETTERA|LETTERB|LETTERC|('"')('"')?)+ -> //popMode;
 //LINE_CONT
 //NOT_NUM: ~('a'|'b'|'c'|'d'|'e'|'f'|'g'|'h'|'i'|'j'|'1'|'4'|'/') -> popMode;
 //NUM_SEPS: (' '|'-') -> popMode; 
 //G1_NUM_TERM:  DOTS56 -> popMode
 //HYPHEN: '-' -> popMode;


mode ANOTHER;
 //SPACE: ' '->popMode;
 CAP_ZED: 'Z'; 
  