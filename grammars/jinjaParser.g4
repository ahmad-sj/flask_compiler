parser grammar jinjaParser;

options {tokenVocab=jinjaLexer;}

start: jinjaCode+ EOF;

jinjaCode: jinjaStmnt
         ;

jinjaExpr: JIN_EXPR_START jinjaContent* JIN_EXPR_END;

jinjaContent: JIN_TEXT;

jinjaStmnt: ifStatment;

ifStatment: JIN_STMNT_START JIN_STMNT_IF condition JIN_CONDITION_END
          ;

condition: multiValueCondition
         | singleValueCondition
         ;

singleValueCondition: conditionDeclaration;
multiValueCondition: conditionDeclaration (conditionLogicalOperator conditionDeclaration)+;

conditionDeclaration: JIN_CONDITION_NOT? JIN_CONDITION_VALUE conditionOperator?;

conditionOperator: (conditionComparisionOperator JIN_CONDITION_VALUE ) | (JIN_CONDITION_IS JIN_TEST_VALUE);

conditionLogicalOperator: JIN_CONDITION_AND | JIN_CONDITION_OR;
conditionComparisionOperator: JIN_CONDITION_COMPARISION_OPERATOR;