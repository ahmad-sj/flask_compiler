parser grammar rulesHtml;

options {tokenVocab=flaskLexer;}

document: ( HTML_TEXT | COMMENT | element)* EOF;

element: openTag content* closeTag
       | selfClosingTag
       ;

content: element | HTML_TEXT | COMMENT ;

openTag: OPEN_TAG_START OPEN_TAG_NAME atrribute* OPEN_TAG_END;

closeTag: CLOSE_TAG_START CLOSE_TAG_NAME CLOSE_TAG_END;

selfClosingTag: OPEN_TAG_START OPEN_TAG_NAME atrribute* (SELF_CLOSING_TAG_END);

atrribute: ATTR_NAME
         | ATTR_NAME ATTR_EQ attrValue;

attrValue: STRING_DQUOTE
         | STRING_SQUOTE
         | ATTR_VALUE_UNQUOTED
         ;

