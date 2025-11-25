parser grammar templateParser;

options {tokenVocab=templateLexer;}

@header{ package antlr; }

document: ( HTML_TEXT | COMMENT | element)* EOF;

element: styleElement
       | openTag content* closeTag
       | selfClosingTag
       ;

content: element | HTML_TEXT | COMMENT;

openTag: OPEN_TAG_START OPEN_TAG_NAME atrribute* OPEN_TAG_END;

closeTag: CLOSE_TAG_START CLOSE_TAG_NAME CLOSE_TAG_END;

selfClosingTag: OPEN_TAG_START OPEN_TAG_NAME atrribute* (SELF_CLOSING_TAG_END);

atrribute: htmlStyleAttr
         | ATTR_NAME
         | ATTR_NAME ATTR_EQ attrValue
         ;

attrValue: STRING_DQUOTE
         | STRING_SQUOTE
         | ATTR_VALUE_UNQUOTED
         ;

htmlStyleAttr: STYLE_ATTR CSS_INLINE_EQ CSS_INLINE_DQUOT_START inlineStyleProp* CSS_INLINE_PROP_DQUOT_END;
inlineStyleProp: CSS_INLINE_PROP_NAME CSS_INLINE_PROP_COLON inlineStylePropValues+ ;
inlineStylePropValues: CSS_PROP_VAL+ CSS_PROP_SEMICOLON;

styleElement: openStyleTag cssBlockDecl* closeStyleTag;
openStyleTag: OPEN_TAG_START OPEN_STYLE OPEN_STYLE_END;
closeStyleTag: CLOSE_STYLE_START CLOSE_STYLE CLOSE_STYLE_END;


// CSS rules
cssBlockDecl: selector cssBlock;

selector: CSS_SELECTOR_ID         #CSS_SELECTOR_ID
        | CSS_SELECTOR_CLASS      #CSS_SELECTOR_CLASS
        | CSS_SELECTOR_ELEMENT    #CSS_SELECTOR_ELEMENT
        ;

cssBlock: CSS_LBRACE declaration* BLK_RBRACE;

declaration: BLK_PROP_NAME BLK_COLON blkPropVal;

blkPropVal: CSS_PROP_VAL+ CSS_PROP_SEMICOLON;