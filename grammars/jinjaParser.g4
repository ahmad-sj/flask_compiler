parser grammar jinjaParser;

options {tokenVocab=jinjaLexer;}

start: jinjaBlock+ EOF;

jinjaBlock: ifBlock
          | J_TEXT+
          ;

// conditional rules
ifBlock: ifStatmentStart ifBody? ifStatmentEnd;

ifStatmentStart: J_STMNT_START J_STMNT_IF condition J_CONDITION_DECL_END;

ifBody: J_TEXT* ifBlock
      | J_TEXT+ elifBlock+ elseBlock?
      | J_TEXT+ elseBlock
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
