// Generated from C:/Users/Admin/Desktop/flask_compiler/grammars/jinjaParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link jinjaParser}.
 */
public interface jinjaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link jinjaParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(jinjaParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(jinjaParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlock(jinjaParser.JinjaBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlock(jinjaParser.JinjaBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(jinjaParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(jinjaParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#ifStatmentStart}.
	 * @param ctx the parse tree
	 */
	void enterIfStatmentStart(jinjaParser.IfStatmentStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#ifStatmentStart}.
	 * @param ctx the parse tree
	 */
	void exitIfStatmentStart(jinjaParser.IfStatmentStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void enterIfBody(jinjaParser.IfBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void exitIfBody(jinjaParser.IfBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#ifStatmentEnd}.
	 * @param ctx the parse tree
	 */
	void enterIfStatmentEnd(jinjaParser.IfStatmentEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#ifStatmentEnd}.
	 * @param ctx the parse tree
	 */
	void exitIfStatmentEnd(jinjaParser.IfStatmentEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#elifBlock}.
	 * @param ctx the parse tree
	 */
	void enterElifBlock(jinjaParser.ElifBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#elifBlock}.
	 * @param ctx the parse tree
	 */
	void exitElifBlock(jinjaParser.ElifBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(jinjaParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(jinjaParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#subconitionBody}.
	 * @param ctx the parse tree
	 */
	void enterSubconitionBody(jinjaParser.SubconitionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#subconitionBody}.
	 * @param ctx the parse tree
	 */
	void exitSubconitionBody(jinjaParser.SubconitionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(jinjaParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(jinjaParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#singleClauseCondition}.
	 * @param ctx the parse tree
	 */
	void enterSingleClauseCondition(jinjaParser.SingleClauseConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#singleClauseCondition}.
	 * @param ctx the parse tree
	 */
	void exitSingleClauseCondition(jinjaParser.SingleClauseConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#multiClauseCondition}.
	 * @param ctx the parse tree
	 */
	void enterMultiClauseCondition(jinjaParser.MultiClauseConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#multiClauseCondition}.
	 * @param ctx the parse tree
	 */
	void exitMultiClauseCondition(jinjaParser.MultiClauseConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#conditionOperand}.
	 * @param ctx the parse tree
	 */
	void enterConditionOperand(jinjaParser.ConditionOperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#conditionOperand}.
	 * @param ctx the parse tree
	 */
	void exitConditionOperand(jinjaParser.ConditionOperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#conditionOperandTest}.
	 * @param ctx the parse tree
	 */
	void enterConditionOperandTest(jinjaParser.ConditionOperandTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#conditionOperandTest}.
	 * @param ctx the parse tree
	 */
	void exitConditionOperandTest(jinjaParser.ConditionOperandTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#binaryLogicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLogicalOperator(jinjaParser.BinaryLogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#binaryLogicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLogicalOperator(jinjaParser.BinaryLogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#conditionComparisionOperator}.
	 * @param ctx the parse tree
	 */
	void enterConditionComparisionOperator(jinjaParser.ConditionComparisionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#conditionComparisionOperator}.
	 * @param ctx the parse tree
	 */
	void exitConditionComparisionOperator(jinjaParser.ConditionComparisionOperatorContext ctx);
}