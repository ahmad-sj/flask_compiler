lexer grammar templateLexer;

@header{
  package antlr;
}

import templateFragments;

// Default mode (Currently HTML mode, may be changed later)

// Jinja Expressions/Variables: Used to output the value of a variable or the result of an expression to the template.
J_EXPR_START: '{{' -> pushMode(J_EXPR_MODE);

// Jinja Statements: Used for control flow (like if, for) or to set variables without directly outputting content.
J_STMNT_START: '{%' -> pushMode(J_STMNT_MODE);

J_COMMENT: '{#' (~[#])* '#}' -> skip;


CLOSE_TAG_START: '</' -> pushMode(CLOSE_TAG);
HTML_COMMENT: '<!--' .*? '-->' -> skip;
DOCTYPE: '<!DOCTYPE html>' -> skip;
OPEN_TAG_START: '<' -> pushMode(OPEN_TAG);


//NORMAL_TEXT: [a-zA-Z0-9"'.()/!,-]+;
WS: [ \t\r\n]+ -> skip;
NORMAL_TEXT: ~[<>{}\t\r\n]+;

// ==========================================================================================


mode J_STMNT_MODE;
   J_STMNT_IF: 'if' -> pushMode(J_CONDITION_MODE);
   J_STMNT_ELIF: 'elif' -> pushMode(J_CONDITION_MODE);
   J_STMNT_ELSE: 'else' -> pushMode(J_CONDITION_ELSE);
   J_STMNT_ENDIF: 'endif';
   J_STMNT_FOR: 'for' -> pushMode(J_LOOP_VARIABLES);
   J_STMNT_ENDFOR: 'endfor';
   J_STMNT_EXTENDS: 'extends' -> pushMode(J_EXTENDS_MODE);
   J_STMNT_BLOCK: 'block' -> pushMode(J_INHERIT_BLOCK_MODE);
   J_STMNT_ENDBLOCK: 'endblock';
   J_STMNT_END: '%}' -> popMode;
   J_STMNT_WS: [ \t\r\n] -> skip;

mode J_CONDITION_MODE;
   J_CONDITION_NOT: 'not';
   J_CONDITION_VAR_NAME: ID -> pushMode(J_ID_MODE);
   J_CONDITION_PRIMITIVE: STRING | NUMBER;
   J_COND_PRIM_AND: 'and' -> popMode;
   J_COND_PRIM_OR: 'or' -> popMode;
   J_COND_PRIM_COMP_OPTOR
       : (J_COMP_EQ
       | J_COMP_NEQ
       | J_COMP_GT
       | J_COMP_GE
       | J_COMP_LT
       | J_COMP_LE
       | J_COMP_IN
       | J_COMP_NIN
       );
   J_CONDITION_SUBSTATEMENT_START: '{%' -> pushMode(J_STMNT_MODE);
   J_CONDITION_END: '%}' -> mode(DEFAULT_MODE);
   J_CONDITION_MODE_WS: [ \t\r\n] -> skip;

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
   J_TEST_MODE_WS: [ \t\r\n] -> skip;

mode J_LOOP_MODE;
    J_LOOP_END: '%}' -> mode(DEFAULT_MODE);
    J_LOOP_ITERABLE: ID -> pushMode(J_ID_MODE);
    J_LOOP_MODE_WS: [ \t\r\n] -> skip;

mode J_LOOP_VARIABLES;
    J_LOOP_KEYWORD: 'in' -> mode(J_LOOP_MODE);
    J_VARIABLES_COMMA: ',';
    J_LOOP_VARIABLE: ID;
    J_LOOP_VARIABLES_WS: [ \t\r\n] -> skip;

mode J_EXTENDS_MODE;
    J_EXTENDS_STRING: '"' [a-zA-Z0-9()._-]+ '"';
    J_EXTENDS_END: '%}' -> mode(DEFAULT_MODE);
    J_EXTENDS_MODE_WS: [ \t\r\n] -> skip;

mode J_INHERIT_BLOCK_MODE;
    J_INHERIT_BLOCK_NAME: [a-zA-Z0-9._-]+ -> popMode;
    J_BLOCK_MODE_WS: [ \t\r\n] -> skip;

mode J_EXPR_MODE;
    J_EXPR_END: '}}' -> popMode;
    J_FORMAT_STRING: '"%' [a-zA-Z0-9.%#+\-]+ '"';
    J_EXPR_PIPELINE: PIPELINE;
    J_EXPR_ID: ID -> pushMode(J_ID_MODE);
    J_EXPR_MODE_WS: [ \t\r\n] -> skip;

mode J_ID_MODE;
    J_ID_DOT: '.' -> pushMode(J_OBJ_VAR_MODE);
    J_ID_LSB: '[' -> pushMode(J_DICT_VAR_MODE);
    J_FUNC_LPAREN: '(' -> pushMode(J_FUNC_MODE);
    J_FUNC_RPAREN: ')';
    J_ID_COMMA: ',' -> pushMode(J_FUNC_MODE);
    J_COND_ID_IS: 'is' -> pushMode(J_TEST_MODE);
    J_COND_ID_AND: 'and' -> popMode;
    J_COND_ID_OR: 'or' -> popMode;
    J_COND_ID_COMP_OPTOR
        : (J_COMP_EQ
        | J_COMP_NEQ
        | J_COMP_GT
        | J_COMP_GE
        | J_COMP_LT
        | J_COMP_LE
        | J_COMP_IN
        | J_COMP_NIN
        ) -> popMode;
    J_ID_EXPR_END: '}}' -> popMode, popMode;
    J_ID_END: '%}' -> mode(DEFAULT_MODE);
    J_ID_MODE_WS: [ \t\r\n] -> skip;

mode J_DICT_VAR_MODE;
    J_DICT_VAR_RSB: ']' -> popMode;
    J_DICT_KEY: [a-zA-Z0-9 _'"-]+;
    J_DICT_VAR_MODE_WS: [ \t\r\n] -> skip;

mode J_OBJ_VAR_MODE;
    J_VAR_ATTR: ID -> popMode;
    J_OBJ_VAR_MODE_WS: [ \t\r\n] -> skip;

mode J_FUNC_MODE;
    J_FUNC_PARAMLESS_RPAREN: ')' -> popMode;
    J_FUNC_PARAM_ALIAS: [a-zA-Z0-9_-]+ '=';
    J_FUNC_PARAM_ID: ID -> popMode;
    J_FUNC_PARAM_STRING: STRING -> popMode;
    J_FUNC_MODE_WS: [ \t\r\n] -> skip;


// ==========================================================================================


//HTML Modes
mode OPEN_TAG;
   OPEN_STYLE: 'style' -> pushMode(OPEN_STYLE_TAG);
   OPEN_TAG_NAME: HTML_TAG_NAME -> pushMode(INSIDE_TAG);
   OPEN_TAG_WS: [ \t\r\n]+ -> skip;

mode CLOSE_TAG;
   CLOSE_TAG_NAME: HTML_TAG_NAME;
   CLOSE_TAG_END: RAB -> popMode;
   CLOSE_TAG_WS: [ \t\r\n]+ -> skip;

mode OPEN_STYLE_TAG;
   OPEN_STYLE_END: RAB -> pushMode(CSS_BLK);
   OPEN_STYLE_TAG_WS: [ \t\r\n]+ -> skip;

mode CLOSE_STYLE_TAG;
   CLOSE_STYLE: 'style';
   CLOSE_STYLE_END: RAB -> mode(DEFAULT_MODE);
   CLOSE_STYLE_TAG_WS: [ \t\r\n]+ -> skip;

mode INSIDE_TAG;
    STYLE_ATTR: 'style' -> pushMode(CSS_INLINE);
    ATTR_NAME: [a-zA-Z][a-zA-Z-]* -> pushMode(ATTR);
    INSIDE_TAG_J_EXPR_START: '{{' -> pushMode(J_EXPR_MODE);
    INSIDE_TAG_CLOSE: '>' -> popMode, popMode; // also add self closing tag end
    SELF_CLOSING_TAG_END: '/>' -> popMode, popMode; // also add self closing tag end
    INSIDE_TAG_WS: [ \t\r\n]+ -> skip;

mode ATTR;
   ATTR_EQ: EQ -> pushMode(ATTR_VAL);
   BOOL_ATTR_TAG_END: RAB -> popMode, popMode, popMode;
   BOOL_ATTR_SELF_CLOSING_TAG_END: '/>' -> popMode, popMode, popMode;
   ATTR_WS: [ \t\r\n]+ -> skip;

mode ATTR_VAL;
    ATTR_DQUOTE_START: '"' -> pushMode(ATTR_VAL_QOUTED);
    ATTR_VALUE_UNQUOTED: ~[ \t\r\n>{}"'=/]+ -> popMode, popMode;
    ATTR_VAL_WS: [ \t\r\n]+ -> skip;

mode ATTR_VAL_QOUTED;
    ATTR_VAL_J_EXPR_START: '{{' -> pushMode(J_EXPR_MODE);
    ATTR_VAL_TEXT: [a-zA-Z0-9-=., ]+;
    ATTR_DQUOTE_END: '"' -> popMode, popMode, popMode;
    ATTR_VAL_QOUTED_WS: [ \t\r\n]+ -> skip;


// ==========================================================================================

//CSS Modes
mode CSS_BLK;
   CLOSE_STYLE_START: '</' -> mode(CLOSE_STYLE_TAG);
   CSS_SEL_ID: HASH CSS_ID;
   CSS_SEL_CLASS: DOT [a-zA-Z\-_] [a-zA-Z0-9\-_]*;
   CSS_SEL_ELEM: HTML_TAG_NAME;
   CSS_SEL_STATE: COLON CSS_STATE;
   CSS_SEL_COMMA: COMMA;
   CSS_LBRACE: LBRACE -> pushMode(CSS_BLK_PROP);
   STYLE_EXIT_RAB: RAB -> popMode;
   CSS_WS: [ \t\r\n]+ -> skip;

mode CSS_INLINE;
   CSS_INLINE_EQ: EQ;
   CSS_INLINE_DQUOT_START: DQUOT -> pushMode(CSS_INLINE_PROP);
   CSS_INLINE_WS: [ \t\r\n]+ -> skip;

mode CSS_BLK_PROP;
   BLK_PROP_NAME: CSS_PROP_NAME;
   BLK_COLON: COLON -> pushMode(CSS_PROP_VALUES);
   BLK_RBRACE: RBRACE -> popMode;
   BLK_WS: [ \t\r\n]+ -> skip;

mode CSS_INLINE_PROP;
   CSS_INLINE_PROP_NAME: CSS_PROP_NAME;
   CSS_INLINE_PROP_COLON: COLON -> pushMode(CSS_PROP_VALUES);
   CSS_INLINE_PROP_DQUOT_END: DQUOT -> popMode, popMode;
   CSS_INLINE_PROP_WS: [ \t\r\n]+ -> skip;

mode CSS_PROP_VALUES;
   CSS_PROP_VAL: [a-zA-Z0-9#%(),.-]+;
   CSS_PROP_SEMICOLON: SEMICOLON -> popMode;
   CSS_PROP_VALUES_WS: [ \t\r\n]+ -> skip;
