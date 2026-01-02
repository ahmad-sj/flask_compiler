parser grammar pythonParser;


options { tokenVocab=pythonLexer; }

@header{ package antlr; }

prog
    : stmtList EOF              // done
    ;

stmtList
    : (stmt (NEWLINE | WS)*)+   // done
    ;

stmt
    : simpleStmt    // done
    | blockStmt
    ;

simpleStmt       // not necessary if all children visit methods are implemented
    : importLine // done
    | assignLine // done
    | returnLine // done
    | exprLine   // done
    | pass       // done
    ;

pass: PASS;     // done

importLine
    : IMPORT name (AS NAME)?                             #singleImport  // done
    | FROM name IMPORT NAME (COMMA NAME)* (COMMA)?       #multiImport   // done
    ;

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
    : expr FOR NAME IN expr (IF expr)?
    ;

callArgs                // done
    : OPEND_NORMAL_BRAKET callList CLOSED_NORMAL_BRAKET
    ;

callList                // done
    : callArg (COMMA callArg)* COMMA?
    ;

callArg                 // done
    : NAME EQUAL expr   // keyword argument
    | expr              // positional
    ;

returnLine              // done
    : RETURN expr?
    ;

exprLine                // done
    : expr
    ;

expr
    : orExpr (IF orExpr ELSE expr)?
    ;

orExpr                  // done
    : andExpr (OR andExpr)*
    ;

andExpr                 // done
    : equalExpr (AND equalExpr)*
    ;

equalExpr
    : compareExpr ((EQUALEQUAL | NOTEQUAL) compareExpr)*
    ;

compareExpr
    : addExpr ((LESSTHAN | GREATERTHAN | LESSOREQUAL | GREATEROREQUAL) addExpr)*
    ;

addExpr                                 // done
    : mulExpr (addExprOptor mulExpr)*
    ;

addExprOptor
    : PLUS          #plusOperator       // done
    | MINUS         #minusOperator      // done
    ;

mulExpr
    : singleExpr ((STAR | SLASH | PERCENT) singleExpr)*
    ;

singleExpr
    : NOT singleExpr
    | value
    ;

// Block statements
blockStmt
    : func
    | ifBlock
    | forBlock
    | whileBlock
    ;

func
    : dec* DEF NAME funcArgs COLON block
    ;

dec
    : AT name callArgs?
    ;

funcArgs
    : OPEND_NORMAL_BRAKET argsNames? CLOSED_NORMAL_BRAKET
    ;

argsNames
    : NAME (COMMA NAME)*
    ;
block
    : INDENT stmtList DEDENT
    ;


ifBlock
    : IF expr COLON NEWLINE block
      (ELIF expr COLON NEWLINE block)*
      (ELSE COLON NEWLINE block)?
    ;

forBlock
    : FOR NAME IN expr COLON NEWLINE block
    ;

whileBlock
    : WHILE expr COLON NEWLINE block
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