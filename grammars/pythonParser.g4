parser grammar pythonParser;

options { tokenVocab=pythonLexer; }

 prog
    : stmt* EOF
    ;

stmt
    : simpleStmt
    blockStmt
    ;
    simpleStmt:
             importLine
            | assignLine
            | returnLine
            |exprLine
            | PASS;



    importLine : IMPORT name (AS NAME)?
    | FROM name IMPORT importList ;

importList : NAME (COMMA NAME)*;

    name
        : NAME (DOT NAME)*
        ;

 assignLine : differentForm EQUAL expr ;

differentForm : NAME
| indexAccess
| dotAccess ;

indexAccess : value OPEND_SQUAR_BRAKET expr CLOSED_SQUAR_BRAKET;

dotAccess : value DOT NAME ;

value : baseValue extra*;

baseValue :NAME |literal |  OPEND_NORMAL_BRAKET expr CLOSED_NORMAL_BRAKET;

extra : callArgs
| DOT NAME | OPEND_SQUAR_BRAKET expr CLOSED_SQUAR_BRAKET;


callArgs : OPEND_NORMAL_BRAKET callList CLOSED_NORMAL_BRAKET;

callList : expr (COMMA expr)*;

literal :INT |NONE |FALSE |TRUE|STRING_SINGLE|STRING_DOUBLE;




returnLine :RETURN expr?;

exprLine :expr;


expr
    : orExpr
    ;

orExpr
    : andExpr (OR andExpr)*
    ;

andExpr
    : equalExpr (AND equalExpr)*
    ;

equalExpr
    : compareExpr ((EQUALEQUAL | NOTEQUAL) compareExpr)*
    ;

compareExpr
    : addExpr ((LESSTHAN | GREATERTHAN | LESSOREQUAL | GREATEROREQUAL) addExpr)*
    ;

addExpr
    : mulExpr ((PLUS | MINUS) mulExpr)*
    ;

mulExpr
    : singleExpr ((STAR | SLASH | PERCENT) singleExpr)*
    ;

singleExpr
    : NOT singleExpr
    | value
    ;



blockStmt : func | ifBlock |forBlock |whileBlock ;


func :dec * DEF NAME funcArgs COLON block;


 dec :AT name callArgs? ;

 funcArgs : OPEND_NORMAL_BRAKET argsNames ? CLOSED_NORMAL_BRAKET ;

 argsNames : NAME ( COMMA NAME)*;


 block :NEWLINE INDENT stmt+ DEDENT
 | simpleStmt;


 ifBlock
 : IF expr COLON block
    (ELIF expr COLON block)*
    (ELSE COLON block)?;



forBlock : FOR NAME IN expr COLON block;

whileBlock : WHILE expr COLON block;
