lexer grammar jinjaLexer;

// Expressions/Variables: Used to output the value of a variable or the result of an expression to the template.
J_EXPR_START: '{{';

// Statements: Used for control flow (like if, for) or to set variables without directly outputting content.
J_STMNT_START: '{%' -> pushMode(J_STMNT);

J_COMMENT: '{#' (~[#])* '#}' -> skip;
J_TEXT: [a-zA-Z0-9<>{}"'.()/!,]+;
J_WS: [ \t\r\n] -> skip;

mode J_STMNT;
   J_STMNT_IF: 'if' -> pushMode(J_CONDITION_MODE);
   J_STMNT_ELIF: 'elif' -> pushMode(J_CONDITION_MODE);
   J_STMNT_ELSE: 'else' -> pushMode(J_CONDITION_ELSE);
   J_STMNT_ENDIF: 'endif';
   J_STMNT_FOR: 'for' -> pushMode(J_LOOP_VARIABLES);
   J_STMNT_ENDFOR: 'endfor';
   J_STMNT_END: '%}' -> popMode;
   J_STMNT_WS: [ \t\r\n] -> skip;

mode J_CONDITION_MODE;
   J_CONDITION_AND: 'and';
   J_CONDITION_OR: 'or';
   J_CONDITION_NOT: 'not';
   J_CONDITION_IS: 'is' -> pushMode(J_TEST_MODE);
   J_CONDITION_COMPARISION_OPERATOR: (J_COMP_EQ
                                     | J_COMP_NEQ
                                     | J_COMP_GT
                                     | J_COMP_GE
                                     | J_COMP_LT
                                     | J_COMP_LE
                                     | J_COMP_IN
                                     | J_COMP_NIN
                                     );
    J_CONDITION_SUBSTATEMENT_START: '{%' -> pushMode(J_STMNT);
   J_CONDITION_DECL_END: '%}' -> mode(DEFAULT_MODE);
   J_CONDITION_VALUE: [_a-zA-Z0-9.[\]'"]+;
   J_CONDITION_WS: [ \t\r\n] -> skip;

mode J_CONDITION_ELSE;
    J_CONDITION_ELSE_END: '%}' ->  mode(DEFAULT_MODE);
    J_CONDITION_ELSE_WS: [ \t\r\n] -> skip;

mode J_TEST_MODE;
   J_TEST_VALUE: (J_TEST_DEFINED
                 | J_TEST_UNDEFINED
                 | J_TEST_NONE
                 | J_TEST_NUMBER
                 | J_TEST_FILE
                 | J_TEST_SAMEAS
                 | J_TEST_SEQUENCE
                 | J_TEST_MAPPING
                 | J_TEST_EVEN
                 | J_TEST_ODD
                 | J_TEST_LOWER
                 | J_TEST_UPPER
                 )-> popMode;
   J_TEST_WS: [ \t\r\n] -> skip;

mode J_LOOP_MODE;
    J_LOOP_END: '%}' -> mode(DEFAULT_MODE);
    J_LOOP_ITERABLE: [_a-zA-Z0-9.[\]()]+;
    J_FOR_WS: [ \t\r\n] -> skip;

mode J_LOOP_VARIABLES;
    J_LOOP_KEYWORD: 'in' -> mode(J_LOOP_MODE);
    J_VARIABLES_COMMA: ',';
    J_LOOP_VARIABLE: [a-zA-Z0-9]+;
    J_LOOP_VARIABLES_WS: [ \t\r\n] -> skip;

   // comparison operators
   fragment J_COMP_EQ: '==';
   fragment J_COMP_NEQ: '!=';
   fragment J_COMP_GT: '>';
   fragment J_COMP_GE: '>=';
   fragment J_COMP_LT: '<';
   fragment J_COMP_LE: '<=';
   fragment J_COMP_IN: 'in';
   fragment J_COMP_NIN: 'not in';

   // test values
   fragment J_TEST_DEFINED: 'defined';
   fragment J_TEST_UNDEFINED: 'undefined';
   fragment J_TEST_NONE: 'none';
   fragment J_TEST_NUMBER: 'number';
   fragment J_TEST_FILE: 'file';
   fragment J_TEST_SAMEAS: 'sameas';
   fragment J_TEST_SEQUENCE: 'sequence';
   fragment J_TEST_MAPPING: 'mapping';
   fragment J_TEST_EVEN: 'even';
   fragment J_TEST_ODD: 'odd';
   fragment J_TEST_LOWER: 'lower';
   fragment J_TEST_UPPER: 'upper';

