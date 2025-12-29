parser grammar pythonParser;

options { tokenVocab=pythonLexer; }

prog
    : stmtList EOF
    ;


stmtList
    : (stmt (NEWLINE | WS)*)+
    ;

stmt
    : simpleStmt
    | blockStmt
    ;

simpleStmt
    : importLine
    | assignLine
    | returnLine
    | exprLine
    | PASS
    ;

importLine
    : IMPORT name (AS NAME)?
    | FROM name IMPORT importList
    ;

importList
    : NAME (COMMA NAME)* (COMMA)? // يسمح بفاصلة أخيرة
    ;

name
    : NAME (DOT NAME)*
    ;

assignLine
    : target EQUAL expr
    ;

target
    : NAME
    | value
    ;

value
    : baseValue (DOT NAME | OPEND_SQUAR_BRAKET expr CLOSED_SQUAR_BRAKET | callArgs)*
    ;

baseValue
    : NAME
    | literal
    | tupleExpr
    | OPEND_NORMAL_BRAKET expr CLOSED_NORMAL_BRAKET
    | OPEND_NORMAL_BRAKET genExpr CLOSED_NORMAL_BRAKET
    ;

tupleExpr
    : OPEND_NORMAL_BRAKET expr COMMA expr (COMMA expr)* COMMA? CLOSED_NORMAL_BRAKET
    ;

genExpr
    : expr FOR NAME IN expr (IF expr)?
    ;

callArgs
    : OPEND_NORMAL_BRAKET callList CLOSED_NORMAL_BRAKET
    ;

callList
    : callArg (COMMA callArg)* COMMA?
    ;

callArg
    : NAME EQUAL expr   // keyword argument
    | expr              // positional
    ;

returnLine
    : RETURN expr?
    ;

exprLine
    : expr
    ;

expr
    : orExpr (IF orExpr ELSE expr)?
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
listVal
    : OPEND_SQUAR_BRAKET
      (NEWLINE | WS)*
      listItem? (listItemSeparator listItem)* listItemSeparator?
      (NEWLINE | WS)*
      CLOSED_SQUAR_BRAKET
    ;

listItem
    : expr (NEWLINE | WS)*
    ;

listItemSeparator
    : COMMA (NEWLINE | WS)*
    ;

// Dictionaries
dictVal
    : OPEN_CURLY_BRAKET
      (NEWLINE | WS)*
      dictItem? (dictItemSeparator dictItem)* dictItemSeparator?
      (NEWLINE | WS)*
      CLOSED_CURLY_BRAKET
    ;

dictItem
    : literal COLON expr (NEWLINE | WS)*
    ;

dictItemSeparator
    : COMMA (NEWLINE | WS)*
    ;

literal
    : INT
    | FLOAT
    | STRING
    | TRUE
    | FALSE
    | NONE
    | listVal
    | dictVal
    ;
