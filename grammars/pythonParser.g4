
parser grammar pythonParser;


options { tokenVocab=pythonLexer; }

@header{ package antlr; }

//prog
//    : ((NEWLINE*  INDENT?)   stmt  | NEWLINE | commentLine)* (NEWLINE)* EOF
//    ;


prog :  progSimple EOF
    |  progTrivial EOF

    ;


progSimple :(NEWLINE* INDENT? stmt  DEDENT?   NEWLINE*  )* NEWLINE* ;  //done

progTrivial : commentLine NEWLINE* ;        //done


stmtList
    : (nl* stmt)+ nl* ;                 //done


commentLine
    : COMMENT        //done
    ;

nl
    : (NEWLINE)+        //done
    ;







stmt
    : simpleStmt        //done
    | blockStmt
    | commentLine       //done
    ;




simpleStmt       // not necessary if all children visit methods are implemented
    : importLine   // done
    | assignLine  // done
    | returnLine // done
    | exprLine   // done
    | pass       // done
    ;

importLine
    : IMPORT name (AS NAME)?                             #singleImport  // done
    | FROM name IMPORT NAME (COMMA NAME)*        #multiImport   // done
    ;



pass: PASS;     // done


id: NAME;                  // done

name                       // done
    : id dotTrailer*
    ;

assignLine                 // done
    : target EQUAL expr
    ;

target                  // not necessary if all children visit methods are implemented
    : id                // done
    | value             // done
    ;

value                   // done
    : baseValue valueTrailer*
    ;

valueTrailer                // not necessary if all children visit methods are implemented
    : dotTrailer            // done
    | squareTrailer         // done
    | callArgs              // done
    ;

dotTrailer: DOT NAME;       // done

squareTrailer: OPEND_SQUAR_BRAKET expr CLOSED_SQUAR_BRAKET;     // done

baseValue                   // not necessary if all children visit methods are implemented
    : id                    // done
    | literal
    | tupleExpr
    | parenthedExpr
    | parenthedGenExpr
    ;

parenthedGenExpr: OPEND_NORMAL_BRAKET genExpr CLOSED_NORMAL_BRAKET;

parenthedExpr: OPEND_NORMAL_BRAKET expr CLOSED_NORMAL_BRAKET;

tupleExpr
    : OPEND_NORMAL_BRAKET expr COMMA expr (COMMA expr)* COMMA? CLOSED_NORMAL_BRAKET
    ;

genExpr
    : value FOR NAME IN expr (IF expr)?
    ;


callArgs                // done
    : OPEND_NORMAL_BRAKET callList CLOSED_NORMAL_BRAKET
    ;

callList                // done
    : callArg (COMMA callArg)* COMMA?
    ;

//callArg                   // done
//    : NAME EQUAL expr     // keyword argument
//    | expr               // positional
//    ;


callArg                     //done
    : NAME EQUAL expr
    | expr
    ;

// callExpr: دعم function calls مع generator expressions
singleExpr
    : NOT singleExpr
    | value
    | id OPEND_NORMAL_BRAKET (callArg (COMMA callArg)*)? CLOSED_NORMAL_BRAKET
    ;


//returnLine              // done
//    : RETURN expr?
//    ;
returnLine
    :     RETURN  returnExpr?   ;           //done


returnExpr
    : expr (COMMA expr)+    # tupleReturnWithoutParens      //done
    | expr                  # singleReturn                  //done
    ;



exprLine                // done
    : expr
    ;

expr
    : orExpr (IF orExpr ELSE expr)?         //done
    ;

orExpr                  // done
    : andExpr (OR andExpr)*
    ;

andExpr                 // done
    : equalExpr (AND equalExpr)*
    ;

equalExpr
    : compareExpr ((EQUALEQUAL | NOTEQUAL) compareExpr)*            //done
    ;

compareExpr
    : addExpr ((LESSTHAN | GREATERTHAN | LESSOREQUAL | GREATEROREQUAL) addExpr)*        //done
    ;



addExpr                                 // done
    : mulExpr (addExprOptor mulExpr)*
    ;

addExprOptor
    : PLUS          #plusOperator       // done
    | MINUS         #minusOperator      // done
    ;



mulExpr
    : singleExpr (muiltoperator singleExpr)* //done
    ;

muiltoperator:
(STAR | SLASH | PERCENT);               //done




// Block statements
blockStmt
    : func          //done
    | ifBlock       //done
    | forBlock      //done
    | whileBlock    //done
    ;


decorator
    : AT name callArgs?             //done
    ;


funcArgs
    : OPEND_NORMAL_BRAKET argsNames? CLOSED_NORMAL_BRAKET           //done
    ;

argsNames
    : NAME (COMMA NAME)*                        //done
    ;

func
    : (decorator  nl)? DEF NAME funcArgs COLON nl block?        //done
;


//func
//    : decorator? nl DEF NAME funcArgs COLON nl block?
//    | DEF NAME funcArgs COLON nl block?
//    ;


block
    :    stmtList               //done
    ;


ifBlock                             //done
    : IF expr COLON nl* block
      (ELIF expr COLON nl* block)*
      (ELSE COLON nl* block)?
    ;



forBlock
    : FOR NAME IN expr COLON nl block       //done
    ;

whileBlock
    : WHILE expr COLON nl block                 //done
    ;


// Lists
listVal                 // done
    : OPEND_SQUAR_BRAKET
      (NEWLINE | WS)*
      listItem? (listItemSeparator listItem)* listItemSeparator?
      (NEWLINE | WS)*
      CLOSED_SQUAR_BRAKET
    ;

listItem                // not necessary
    : expr (NEWLINE | WS)*
    ;

listItemSeparator       // not necessary
    : COMMA (NEWLINE | WS)*
    ;

// Dictionaries
dictVal                 // done
    : OPEN_CURLY_BRAKET
      (NEWLINE | WS)*
      dictItem? (dictItemSeparator dictItem)* dictItemSeparator?
      (NEWLINE | WS)*
      CLOSED_CURLY_BRAKET
    ;

dictItem                // done
    : literal COLON expr (NEWLINE | WS)*
    ;

dictItemSeparator       // not necessary
    : COMMA (NEWLINE | WS)*
    ;

literal
    : int           // done
    | float         // done
    | string        // done
    | true          // done
    | false         // done
    | none          // done
    | listVal       // done
    | dictVal       // done
    ;

int: INT;
float: FLOAT;
string: STRING;
true: TRUE;
false: FALSE;
none: NONE;
