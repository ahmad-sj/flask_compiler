parser grammar pythonParser;

options { tokenVocab=pythonLexer; }

 prog
    : stmt* EOF
    ;

stmt
    : simpleStmt
    ;
    simpleStmt:
             importLine
            | assignLine
            | PASS;



    importLine : IMPORT name (AS NAME)?
    | FROM name IMPORT importList ;

importList : Name (COMMA NAME)*;

    name
        : NAME (DOT NAME)*
        ;

 assignLine : differentForm EQUAL expr ;

differentForm : NAME
| indexAccess
| dotAccess ;

indexAccess : value OPENED_SQUAR_BRAKET expr CLOSED_SQUAR_BRAKET;

dotAccess : value DOT NAME ;

value : baseValue extra*;

baseValue :NAME |literal |  OPEND_NORMAL_BRAKET expr CLOSED_NORMAL_BRAKET;

extra : callArgs
| DOT NAME | OPEND_SQUAR_BRAKET expr CLOSED_SQUAR_BRAKET;


callArgs : OPEND_NORMAL_BRAKET callList CLOSED_NORMAL_BRAKET;

callList : expr (COMMA expr)*;

literal :INT |NONE |FALSE |TRUE|STRING_SINGLE|STRING_DOUBLE;



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
