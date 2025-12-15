parser grammar templateParser;

options {tokenVocab=templateLexer;}

@header{ package antlr; }

template
    : extendsBlock? (htmlElem | jinjaBlock*) EOF
    ;

jinjaBlock
    : inheritBlock
    | ifBlock
    | forBlock
    ;

// conditional rules
ifBlock: ifStatmentStart ifBody? ifStatmentEnd;

ifStatmentStart: J_STMNT_START J_STMNT_IF condition (J_ID_END | J_CONDITION_END);

ifBody
    : (ifBlock | elifBlock | forBlock | jinjaExpression | htmlElem | NORMAL_TEXT)+ elseBlock?
    | elseBlock
    ;

ifStatmentEnd: J_STMNT_START J_STMNT_ENDIF J_STMNT_END;

elifBlock: J_STMNT_START J_STMNT_ELIF condition J_ID_END subconitionBody?;

elseBlock: J_STMNT_START J_STMNT_ELSE J_CONDITION_ELSE_END subconitionBody?;

// body for elif / else block
subconitionBody
    : (ifBlock | forBlock | jinjaExpression | htmlElem | NORMAL_TEXT)+
    ;

condition
    : multiClauseCondition
    | singleClauseCondition
    ;

singleClauseCondition: J_CONDITION_NOT? conditionOperand (conditionComparisionOperator conditionOperand | conditionOperandTest)?;
multiClauseCondition: J_CONDITION_NOT? singleClauseCondition (binaryLogicalOperator singleClauseCondition)+;

conditionOperand
    : J_CONDITION_VAR_NAME (idMember | funcParamList)?
    | J_CONDITION_PRIMITIVE
    ;
conditionOperandTest: J_COND_ID_IS J_TEST_VALUE;

binaryLogicalOperator
    : J_COND_ID_AND
    | J_COND_ID_OR
    | J_COND_PRIM_AND
    | J_COND_PRIM_OR
    ;

conditionComparisionOperator
    : J_COND_ID_COMP_OPTOR
    | J_COND_PRIM_COMP_OPTOR
    ;

// for loop rules
forBlock: forStatementStart forBody? forStatementEnd;

forStatementStart: J_STMNT_START J_STMNT_FOR iterationStatement J_ID_END;

iterationStatement: loopVariables J_LOOP_KEYWORD iterable;

loopVariables: J_LOOP_VARIABLE (J_VARIABLES_COMMA J_LOOP_VARIABLE)*;

iterable: J_LOOP_ITERABLE (idMember | funcParamList)?;

forStatementEnd: J_STMNT_START J_STMNT_ENDFOR J_STMNT_END;

forBody
    : (ifBlock | forBlock | jinjaExpression | htmlElem | NORMAL_TEXT)+ elseBlock?
    ;

extendsBlock: J_STMNT_START J_STMNT_EXTENDS J_EXTENDS_STRING J_EXTENDS_END;

inheritBlock: inheritBlockStart inheritBlockBody? inheritBlockEnd;

inheritBlockStart: J_STMNT_START J_STMNT_BLOCK J_INHERIT_BLOCK_NAME J_STMNT_END;

inheritBlockEnd: J_STMNT_START J_STMNT_ENDBLOCK J_STMNT_END;

inheritBlockBody
    : (ifBlock | forBlock | jinjaExpression | htmlElem | NORMAL_TEXT)+
    ;

jinjaExpression: jinjaExprStart jinjaExprBody jinjaExprEnd;

jinjaExprStart
    : J_EXPR_START
    | INSIDE_TAG_J_EXPR_START
    ;

jinjaExprEnd
    : J_ID_EXPR_END
    ;

jinjaExprBody: jinjaFilter? jinjaId;

jinjaFilter: J_FORMAT_STRING J_EXPR_PIPELINE;

jinjaId: J_EXPR_ID (idMember | funcParamList)?;

idMember
    : dictKey
    | objAttr
    ;

dictKey: J_ID_LSB J_DICT_KEY J_DICT_VAR_RSB (objAttr | dictKey)?;
objAttr: J_ID_DOT J_VAR_ATTR (objAttr | dictKey | funcParamList)?;

funcParamList: J_FUNC_LPAREN (funcParam | (J_ID_COMMA funcParam))* (J_FUNC_RPAREN | J_FUNC_PARAMLESS_RPAREN);
funcParamId: J_FUNC_PARAM_ALIAS? J_FUNC_PARAM_ID (objAttr | dictKey)?;

funcParam
    : funcParamId
    | J_FUNC_PARAM_STRING
    ;

// =====================================================================================

htmlElem
    : htmlOpenTag htmlElemBody? htmlCloseTag
    | htmlSelfClosingTag
    ;

htmlElemBody
    : (htmlElem | htmlStyleElem | jinjaExpression | jinjaBlock | NORMAL_TEXT)+
    ;

htmlOpenTag: OPEN_TAG_START OPEN_TAG_NAME (htmlTagAttr | jinjaExpression)* (BOOL_ATTR_TAG_END | INSIDE_TAG_CLOSE);

htmlCloseTag: CLOSE_TAG_START CLOSE_TAG_NAME CLOSE_TAG_END;

htmlSelfClosingTag: OPEN_TAG_START OPEN_TAG_NAME (htmlTagAttr | jinjaExpression)* (SELF_CLOSING_TAG_END | BOOL_ATTR_SELF_CLOSING_TAG_END);

htmlTagAttr
    : styleAttr
    | booleanAttr
    | attrWithQuotedVal
    | attrWithUnquotedVal
    ;

booleanAttr: ATTR_NAME;

attrWithUnquotedVal: ATTR_VALUE_UNQUOTED;

attrWithQuotedVal: ATTR_NAME ATTR_EQ ATTR_DQUOTE_START (ATTR_VAL_TEXT | jinjaAttrVal)+ ATTR_DQUOTE_END;

jinjaAttrVal: ATTR_VAL_J_EXPR_START jinjaExprBody J_ID_EXPR_END;

styleAttr: STYLE_ATTR CSS_INLINE_EQ CSS_INLINE_DQUOT_START inlineStyleProp* CSS_INLINE_PROP_DQUOT_END;
inlineStyleProp: CSS_INLINE_PROP_NAME CSS_INLINE_PROP_COLON inlineStylePropValues+ ;
inlineStylePropValues: CSS_PROP_VAL+ CSS_PROP_SEMICOLON;

htmlStyleElem: htmlStyleElemOpenTag cssBlockDecl* htmlStyleElemCloseTag;
htmlStyleElemOpenTag: OPEN_TAG_START OPEN_STYLE OPEN_STYLE_END;
htmlStyleElemCloseTag: CLOSE_STYLE_START CLOSE_STYLE CLOSE_STYLE_END;

// =====================================================================================

// CSS rules
cssBlockDecl: cssSelectors cssBlock;

cssSel
    : CSS_SEL_ID         #CSS_SEL_ID
    | CSS_SEL_CLASS      #CSS_SEL_CLASS
    | CSS_SEL_ELEM       #CSS_SEL_ELEM
    | cssSelWithState    #CSS_SEL_PSEUDO_CLASS
    ;

cssSelWithState: (CSS_SEL_ID | CSS_SEL_CLASS | CSS_SEL_ELEM) CSS_SEL_STATE;

cssSelectors
    : cssSel                                #CSS_SEL_SINGLE
    | cssSel+                               #CSS_SEL_DESCENDENT
    | cssSel (CSS_SEL_COMMA cssSel)+        #CSS_SEL_GROUP
    ;

cssBlock: CSS_LBRACE cssPropDecl* BLK_RBRACE;

cssPropDecl: BLK_PROP_NAME BLK_COLON cssBlockPropVal;

cssBlockPropVal: CSS_PROP_VAL+ CSS_PROP_SEMICOLON;

