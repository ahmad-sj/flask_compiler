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
   JIN_STMNT_IF: 'if';
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

// logical operators
JIN_LOG_AND: 'and';
JIN_LOG_OR: 'or';
JIN_LOG_NOT: 'not';

// comparison operators
JIN_COMP_EQ: '==';
JIN_COMP_NEQ: '!=';
JIN_COMP_GT: '>';
JIN_COMP_GE: '>=';
JIN_COMP_LT: '<';
JIN_COMP_LE: '<=';
JIN_COMP_IN: 'in';
JIN_COMP_NIN: 'not in';

// testing values used with operators
JIN_TEST_IS: 'is' -> pushMode(JIN_TEST_MODE);

mode JIN_TEST_MODE;
   JIN_TEST_DEFINED: 'defined' -> popMode;
   JIN_TEST_UNDEFINED: 'undefined' -> popMode;
   JIN_TEST_NONE: 'none' -> popMode;
   JIN_TEST_NUMBER: 'number' -> popMode;
   JIN_TEST_FILE: 'file' -> popMode;
   JIN_TEST_SAMEAS: 'sameas' -> popMode;
   JIN_TEST_SEQUENCE: 'sequence' -> popMode;
   JIN_TEST_MAPPING: 'mapping' -> popMode;
   JIN_TEST_EVEN: 'even' -> popMode;
   JIN_TEST_ODD: 'odd' -> popMode;
   JIN_TEST_LOWER: 'lower' -> popMode;
   JIN_TEST_UPPER: 'upper' -> popMode;
   JIN_TEST_WS: [ \t\r\n] -> skip;

CONDTITION_VALUE: [_a-zA-Z0-9.[\]'"]+;
