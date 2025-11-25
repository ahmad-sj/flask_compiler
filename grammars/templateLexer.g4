lexer grammar templateLexer;

@header{
  package antlr;
}

import templateFragments;

// Default mode (Currently HTML mode, may be changed later)
HTML_TEXT: ~[<]+;
CLOSE_TAG_START: '</' -> pushMode(CLOSE_TAG);
COMMENT: '<!--' .*? '-->' -> skip;
OPEN_TAG_START: LAB -> pushMode(OPEN_TAG);
WS: [ \t\r\n]+ -> skip;

//HTML Modes
mode OPEN_TAG;
   OPEN_STYLE: 'style' -> pushMode(OPEN_STYLE_TAG);
   OPEN_TAG_NAME: HTML_TAG_NAME -> pushMode(ATTR);
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

mode ATTR;
   STYLE_ATTR: 'style' -> pushMode(CSS_INLINE);
   ATTR_NAME: [a-zA-Z][a-zA-Z-]*;
   ATTR_EQ: EQ -> pushMode(ATTR_VAL);
   SELF_CLOSING_TAG_END: '/>' -> mode(DEFAULT_MODE);
   OPEN_TAG_END: RAB -> mode(DEFAULT_MODE);
   ATTR_WS: [ \t\r\n]+ -> skip;

mode ATTR_VAL;
   STRING_DQUOTE: '"' (~["])* '"' -> popMode;  // Allows escaped quotes if needed
   STRING_SQUOTE: '\'' (~['] | '\'\'')* '\'' -> popMode;
   ATTR_VALUE_UNQUOTED: ~[ \t\r\n>"'=/]+ -> popMode;
   ATTR_VAL_WS: [ \t\r\n]+ -> skip;

// ==========================================================================================

//CSS Modes
mode CSS_BLK;
   CLOSE_STYLE_START: '</' -> mode(CLOSE_STYLE_TAG);
   CSS_SELECTOR_ID: HASH ID;
   CSS_SELECTOR_CLASS: DOT [a-zA-Z\-_] [a-zA-Z0-9\-_]*;
   CSS_SELECTOR_ELEMENT: HTML_TAG_NAME;
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
   CSS_INLINE_PROP_DQUOT_END: DQUOT -> mode(ATTR);
   CSS_INLINE_PROP_WS: [ \t\r\n]+ -> skip;

mode CSS_PROP_VALUES;
   CSS_PROP_VAL: CSS_PROP_VAL_FRAG;
   CSS_PROP_SEMICOLON: SEMICOLON -> popMode;
   CSS_PROP_VALUES_WS: [ \t\r\n]+ -> skip;



