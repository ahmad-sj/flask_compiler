parser grammar jinjaParser;

options {tokenVocab=jinjaLexer;}

start: jinjaCode+ EOF;

jinjaCode: jinjaExpr
         | jinjaStmnt
         ;

jinjaExpr: JIN_EXPR_START jinjaContent* JIN_EXPR_END;

jinjaContent: JIN_TEXT;

jinjaStmnt: JIN_STMNT_START controlStmnt* JIN_STMNT_END;

controlStmnt: ifStatment
            ;

ifStatment: JIN_STMNT_IF condition+
          ;

condition: value
         | logical
         | comparison
         | testing
         ;

value: CONDTITION_VALUE;

logical: value logicalOperator value;
logicalOperator: JIN_LOG_AND | JIN_LOG_OR | JIN_LOG_NOT;

comparison: value comparisonOperator value;

comparisonOperator: JIN_COMP_EQ | JIN_COMP_NEQ | JIN_COMP_GT
                  | JIN_COMP_GE | JIN_COMP_LT | JIN_COMP_LE
                  | JIN_COMP_IN | JIN_COMP_NIN
                  ;
testing: JIN_LOG_NOT? value testingOperator JIN_LOG_NOT? value;

testingOperator: JIN_TEST_IS | JIN_TEST_DEFINED | JIN_TEST_UNDEFINED
               | JIN_TEST_NONE | JIN_TEST_NUMBER | JIN_TEST_FILE
               | JIN_TEST_SAMEAS | JIN_TEST_SEQUENCE | JIN_TEST_MAPPING
               | JIN_TEST_EVEN | JIN_TEST_ODD | JIN_TEST_LOWER
               | JIN_TEST_UPPER
               ;
