parser grammar jinjaParser;

options {tokenVocab=jinjaLexer;}

start: extendsBlock? jinjaCode* EOF;

jinjaCode: inheritanceBlock
          | ifBlock
          | forBlock
          | jinjaExpression
          | J_TEXT+
          ;

// conditional rules
ifBlock: ifStatmentStart ifBody? ifStatmentEnd;

ifStatmentStart: J_STMNT_START J_STMNT_IF condition J_CONDITION_DECL_END;

ifBody: J_TEXT* ifBlock
      | J_TEXT+ elifBlock+ elseBlock?
      | J_TEXT+ elseBlock
      | J_TEXT* forBlock
      | J_TEXT+
      ;

ifStatmentEnd: J_STMNT_START J_STMNT_ENDIF J_STMNT_END;

elifBlock: J_STMNT_START J_STMNT_ELIF condition J_CONDITION_DECL_END subconitionBody;

elseBlock: J_STMNT_START J_STMNT_ELSE J_CONDITION_ELSE_END subconitionBody;

// body for elif / else block
subconitionBody: J_TEXT* ifBlock
               | J_TEXT+
               ;

condition: multiClauseCondition
         | singleClauseCondition
         ;

singleClauseCondition: J_CONDITION_NOT? conditionOperand (conditionComparisionOperator conditionOperand)?;
multiClauseCondition: J_CONDITION_NOT? singleClauseCondition binaryLogicalOperator singleClauseCondition;

conditionOperand: J_CONDITION_VALUE conditionOperandTest?;
conditionOperandTest: J_CONDITION_IS J_TEST_VALUE;

binaryLogicalOperator: J_CONDITION_AND | J_CONDITION_OR;
conditionComparisionOperator: J_CONDITION_COMPARISION_OPERATOR;

//{% for product in products %}
// for rules
forBlock: forStatementStart forBody forStatementEnd;

forStatementStart: J_STMNT_START J_STMNT_FOR iterationStatement J_LOOP_END;

iterationStatement: loopVariables J_LOOP_KEYWORD iterable;

loopVariables: J_LOOP_VARIABLE (J_VARIABLES_COMMA J_LOOP_VARIABLE)*;

iterable: J_LOOP_ITERABLE;

forStatementEnd: J_STMNT_START J_STMNT_ENDFOR J_STMNT_END;

forBody: jinjaCode*
       | jinjaCode* elseBlock
       ;

extendsBlock: J_STMNT_START J_STMNT_EXTENDS J_EXTENDS_STRING J_EXTENDS_END;

inheritanceBlock: inheritanceBlockStart inheritanceBlockContent inheritanceBlockEnd;

inheritanceBlockStart: J_STMNT_START J_STMNT_BLOCK J_INHERITANCE_BLOCK_STRING J_INHERITANCE_BLOCK_END;

inheritanceBlockEnd: J_STMNT_START J_STMNT_ENDBLOCK J_STMNT_END;

inheritanceBlockContent: J_TEXT+;


// Expressions rules

jinjaExpression: varExpr
               | funcExpr
               ;

varExpr: J_EXPR_START varRef J_REF_EXPR_END;
varRef: J_EXPR_REF_NAME (objAttr | dictKey)?;
dictKey: J_EXPR_DICT_LSB J_EXPR_DICT_KEY J_EXPR_VAR_RSB (objAttr | dictKey)?;
objAttr: J_EXPR_VAR_DOT J_EXPR_VAR_ATTR (objAttr | dictKey)?;

funcExpr: J_EXPR_START funcRef J_EXPR_END;
funcRef: J_EXPR_REF_NAME J_EXPR_FUNC_LPAREN funcRefParams* (J_EXPR_FUNC_RPAREN | J_EXPR_PARAMLESS_FUNC_RPAREN);
funcRefParam: J_EXPR_FUNC_PARAM (objAttr | dictKey)?;
funcRefParams: funcRefParam
            | J_REF_COMMA funcRefParam
            | J_EXPR_FUNC_PARAM_STRING
            ;