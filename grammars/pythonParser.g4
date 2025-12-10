parser grammar pythonParser;

options { tokenVocab = untitledLexer; }

program : statement* EOF ;

statement
    : simple_stmt NEWLINE
    | compound_stmt
    ;

simple_stmt : small_stmt (SEMI_COLON small_stmt)* SEMI_COLON? ;

small_stmt
    : expr_stmt
    | flow_stmt
    | import_stmt
    | GLOBAL NAME (COMMA NAME)*
    | NONLOCAL NAME (COMMA NAME)*
    | ASSERT test (COMMA test)?
    ;

expr_stmt
    : call_or_name (ASSIGN test)+
    | call_or_name (WALRUS test)
    | call_or_name
    ;

call_or_name : atom trailer* ;

flow_stmt
    : BREAK
    | CONTINUE
    | PASS
    | RETURN test?
    | RAISE test?
    ;

import_stmt
    : FROM dotted_name IMPORT (STAR | NAME (COMMA NAME)*)
    | IMPORT dotted_name (COMMA dotted_name)*
    ;

compound_stmt
    : if_stmt
    | while_stmt
    | for_stmt
    | funcdef
    | classdef
    ;

if_stmt : IF test COLON suite (ELIF test COLON suite)* (ELSE COLON suite)? ;
while_stmt : WHILE test COLON suite (ELSE COLON suite)? ;
for_stmt : FOR target_list IN test COLON suite (ELSE COLON suite)? ;
funcdef : DEF NAME parameters (ARROW test)? COLON suite ;
classdef : CLASS NAME (OPEN_PAREN arglist? CLOSE_PAREN)? COLON suite ;

parameters : OPEN_PAREN paramlist? CLOSE_PAREN ;
paramlist : param (COMMA param)* COMMA? ;
param : NAME (ASSIGN test)? ;

arglist : argument (COMMA argument)* COMMA? ;
argument : test ;

target_list : target (COMMA target)* ;
target : NAME | atom ;

suite
    : NEWLINE INDENT statement+ DEDENT
    | simple_stmt NEWLINE
    ;

test : or_test ;
or_test : and_test (OR and_test)* ;
and_test : not_test (AND not_test)* ;
not_test : NOT not_test | comparison ;
comparison : arith_expr (comp_op arith_expr)* ;
comp_op : LESS_THAN | GREATER_THAN | EQUALS | NOT_EQUALS | LESS_EQUALS | GREATER_EQUALS | IS | IN ;
arith_expr : term ((ADD | MINUS) term)* ;
term : factor ((STAR | DIV | FLOOR_DIV | MOD) factor)* ;
factor : (ADD | MINUS | NOT) factor | power ;
power : atom (POWER factor)? ;

atom
    : NAME | NUMBER | strings | TRUE | FALSE | NONE
    | OPEN_PAREN test CLOSE_PAREN
    | OPEN_BRACK (test (COMMA test)*)? CLOSE_BRACK
    | OPEN_BRACE (key_value (COMMA key_value)*)? CLOSE_BRACE
    ;

strings : (STRING_SINGLE | STRING_DOUBLE | TRIPLE_SINGLE | TRIPLE_DOUBLE
         | FSTRING_SINGLE | FSTRING_DOUBLE | FTRIPLE_SINGLE | FTRIPLE_DOUBLE)+ ;

key_value : test COLON test ;

trailer
    : OPEN_PAREN arglist? CLOSE_PAREN
    | OPEN_BRACK subscriptlist? CLOSE_BRACK
    | DOT NAME
    ;

subscriptlist : subscript (COMMA subscript)* COMMA? ;
subscript : test | (test)? COLON (test)? (COLON (test)?)? ;

dotted_name : NAME (DOT NAME)* ;
