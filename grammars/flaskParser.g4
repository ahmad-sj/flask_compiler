parser grammar flaskParser;

options {tokenVocab=flaskLexer;}

@header{ package antlr; }

import rulesHtml, rulesCss;

document: ( HTML_TEXT | COMMENT | element)* EOF;

element: styleElement
       | openTag content* closeTag
       | selfClosingTag
       ;

atrribute: htmlStyleAttr
         | ATTR_NAME
         | ATTR_NAME ATTR_EQ attrValue
         ;

htmlStyleAttr: STYLE_ATTR CSS_INLINE_EQ CSS_INLINE_DQUOT_START inlineStyleProp* CSS_INLINE_PROP_DQUOT_END;
inlineStyleProp: CSS_INLINE_PROP_NAME CSS_INLINE_PROP_COLON inlineStylePropValues+ ;
inlineStylePropValues: CSS_PROP_VAL+ CSS_PROP_SEMICOLON;

styleElement: openStyleTag cssBlockDecl* closeStyleTag;
openStyleTag: OPEN_TAG_START OPEN_STYLE OPEN_STYLE_END;
closeStyleTag: CLOSE_STYLE_START CLOSE_STYLE CLOSE_STYLE_END;


