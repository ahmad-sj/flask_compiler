parser grammar rulesCss;

options {tokenVocab=flaskLexer;}

cssBlockDecl: selector cssBlock
        ;

selector: CSS_SELECTOR_ID         #CSS_SELECTOR_ID
        | CSS_SELECTOR_CLASS      #CSS_SELECTOR_CLASS
        | CSS_SELECTOR_ELEMENT    #CSS_SELECTOR_ELEMENT
        ;

cssBlock: CSS_LBRACE declaration* BLK_RBRACE;

declaration: BLK_PROP_NAME BLK_COLON blkPropVal;

blkPropVal: CSS_PROP_VAL+ CSS_PROP_SEMICOLON;

