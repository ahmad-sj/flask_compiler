lexer grammar jinjaLexer;

// for Expressions/Variables: Used to output the value of a variable or the result of an expression to the template.
JIN_EXPR_START: '{{';
JIN_EXPR_END: '}}';

// for Statements: Used for control flow (like if, for) or to set variables without directly outputting content.
JIN_STMNT_START: '{%' -> pushMode(JIN_STMNT);

JIN_COMMENT_START: '{#';
JIN_COMMENT_END: '#}';

JIN_TEXT: [a-zA-Z0-9]+;

JIN_COMMENT: JIN_COMMENT_START (~[#])* JIN_COMMENT_END -> skip;
JIN_WS: [ \t\r\n] -> skip;

mode JIN_STMNT;
   JIN_STMNT_IF: 'if' -> pushMode(JIN_CONDITION_MODE);
   JIN_STMNT_ELIF: 'elif';
   JIN_STMNT_ELSE: 'else';
   JIN_STMNT_ENDIF: 'endif';
   JIN_STMNT_FOR: 'for';
   JIN_STMNT_ENDFOR: 'endfor';
   JIN_STMNT_END: '%}' -> popMode;
//   JIN_STMNT_TEXT: [a-zA-Z0-9{}%]+;
   JIN_STMNT_WS: [ \t\r\n] -> skip;

// condition example:
// {% if settings.theme is defined and settings.theme is not none %}

mode JIN_CONDITION_MODE;
   JIN_CONDITION_AND: 'and';
   JIN_CONDITION_OR: 'or';
   JIN_CONDITION_NOT: 'not';
   JIN_CONDITION_IS: 'is' -> pushMode(JIN_TEST_MODE);
   JIN_CONDITION_COMPARISION_OPERATOR: (JIN_COMP_EQ
                                     | JIN_COMP_NEQ
                                     | JIN_COMP_GT
                                     | JIN_COMP_GE
                                     | JIN_COMP_LT
                                     | JIN_COMP_LE
                                     | JIN_COMP_IN
                                     | JIN_COMP_NIN
                                     );
   JIN_CONDITION_END: '%}' -> mode(DEFAULT_MODE);
   JIN_CONDITION_VALUE: [_a-zA-Z0-9.[\]'"]+;
   JIN_CONDITION_WS: [ \t\r\n] -> skip;

mode JIN_TEST_MODE;
   JIN_TEST_VALUE: (JIN_TEST_DEFINED
                 | JIN_TEST_UNDEFINED
                 | JIN_TEST_NONE
                 | JIN_TEST_NUMBER
                 | JIN_TEST_FILE
                 | JIN_TEST_SAMEAS
                 | JIN_TEST_SEQUENCE
                 | JIN_TEST_MAPPING
                 | JIN_TEST_EVEN
                 | JIN_TEST_ODD
                 | JIN_TEST_LOWER
                 | JIN_TEST_UPPER
                 )-> popMode;
   JIN_TEST_WS: [ \t\r\n] -> skip;


   CONDTITION_VALUE: [_a-zA-Z0-9.[\]'"]+;

   // comparison operators
   fragment JIN_COMP_EQ: '==';
   fragment JIN_COMP_NEQ: '!=';
   fragment JIN_COMP_GT: '>';
   fragment JIN_COMP_GE: '>=';
   fragment JIN_COMP_LT: '<';
   fragment JIN_COMP_LE: '<=';
   fragment JIN_COMP_IN: 'in';
   fragment JIN_COMP_NIN: 'not in';

   // test values
   fragment JIN_TEST_DEFINED: 'defined';
   fragment JIN_TEST_UNDEFINED: 'undefined';
   fragment JIN_TEST_NONE: 'none';
   fragment JIN_TEST_NUMBER: 'number';
   fragment JIN_TEST_FILE: 'file';
   fragment JIN_TEST_SAMEAS: 'sameas';
   fragment JIN_TEST_SEQUENCE: 'sequence';
   fragment JIN_TEST_MAPPING: 'mapping';
   fragment JIN_TEST_EVEN: 'even';
   fragment JIN_TEST_ODD: 'odd';
   fragment JIN_TEST_LOWER: 'lower';
   fragment JIN_TEST_UPPER: 'upper';

