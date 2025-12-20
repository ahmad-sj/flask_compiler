lexer grammar pythonLexer;



// Condition
    IF  :    'if';
    ELIF :   'elif'; //اختصار ل else if
    ELSE : 'else';

     // loops

     FOR     : 'for';
     WHILE   : 'while';
    BREAK   : 'break';
    CONTINUE: 'continue';

     //Definition
    DEF     : 'def';


    // OOP
    CLASS   : 'class';
    RETURN  : 'return';
    IMPORT  : 'import';


    EQUAL :'=';
    NOTQUAL:'!=';
    COLON :':';
    COMMA : ',';
    DOT : '.';
    AT : '@';
    ARROW:'->';
    FROM : 'from';
    AS      : 'as';
    PASS    : 'pass';



// print
    PRINT :'print';


 // data type
 NAME :[a-zA-Z_][a-zA-Z0-9_]*;
 INT :[0-9]+;
 STRING :'"' (~[\r\n"])* '"' | '\'' (~[\r\n'])* '\'';
FLOAT  : DIGIT+ '.' DIGIT* ;
DIGIT : [0-9] ;


 //Comment
 COMMENT : '#' ~[\r\n]* -> skip;

