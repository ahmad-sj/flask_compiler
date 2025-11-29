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
	 * Enter a parse tree produced by {@link jinjaParser#jinjaCode}.
	 * @param ctx the parse tree
	 */
	void enterJinjaCode(jinjaParser.JinjaCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#jinjaCode}.
	 * @param ctx the parse tree
	 */
	void exitJinjaCode(jinjaParser.JinjaCodeContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link jinjaParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(jinjaParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(jinjaParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#forStatementStart}.
	 * @param ctx the parse tree
	 */
	void enterForStatementStart(jinjaParser.ForStatementStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#forStatementStart}.
	 * @param ctx the parse tree
	 */
	void exitForStatementStart(jinjaParser.ForStatementStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(jinjaParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(jinjaParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#loopVariables}.
	 * @param ctx the parse tree
	 */
	void enterLoopVariables(jinjaParser.LoopVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#loopVariables}.
	 * @param ctx the parse tree
	 */
	void exitLoopVariables(jinjaParser.LoopVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void enterIterable(jinjaParser.IterableContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#iterable}.
	 * @param ctx the parse tree
	 */
	void exitIterable(jinjaParser.IterableContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#forStatementEnd}.
	 * @param ctx the parse tree
	 */
	void enterForStatementEnd(jinjaParser.ForStatementEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#forStatementEnd}.
	 * @param ctx the parse tree
	 */
	void exitForStatementEnd(jinjaParser.ForStatementEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#forBody}.
	 * @param ctx the parse tree
	 */
	void enterForBody(jinjaParser.ForBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#forBody}.
	 * @param ctx the parse tree
	 */
	void exitForBody(jinjaParser.ForBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#extendsBlock}.
	 * @param ctx the parse tree
	 */
	void enterExtendsBlock(jinjaParser.ExtendsBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#extendsBlock}.
	 * @param ctx the parse tree
	 */
	void exitExtendsBlock(jinjaParser.ExtendsBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#inheritanceBlock}.
	 * @param ctx the parse tree
	 */
	void enterInheritanceBlock(jinjaParser.InheritanceBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#inheritanceBlock}.
	 * @param ctx the parse tree
	 */
	void exitInheritanceBlock(jinjaParser.InheritanceBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#inheritanceBlockStart}.
	 * @param ctx the parse tree
	 */
	void enterInheritanceBlockStart(jinjaParser.InheritanceBlockStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#inheritanceBlockStart}.
	 * @param ctx the parse tree
	 */
	void exitInheritanceBlockStart(jinjaParser.InheritanceBlockStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#inheritanceBlockEnd}.
	 * @param ctx the parse tree
	 */
	void enterInheritanceBlockEnd(jinjaParser.InheritanceBlockEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#inheritanceBlockEnd}.
	 * @param ctx the parse tree
	 */
	void exitInheritanceBlockEnd(jinjaParser.InheritanceBlockEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#inheritanceBlockContent}.
	 * @param ctx the parse tree
	 */
	void enterInheritanceBlockContent(jinjaParser.InheritanceBlockContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#inheritanceBlockContent}.
	 * @param ctx the parse tree
	 */
	void exitInheritanceBlockContent(jinjaParser.InheritanceBlockContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpression(jinjaParser.JinjaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpression(jinjaParser.JinjaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#varExpr}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(jinjaParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#varExpr}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(jinjaParser.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#varRef}.
	 * @param ctx the parse tree
	 */
	void enterVarRef(jinjaParser.VarRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#varRef}.
	 * @param ctx the parse tree
	 */
	void exitVarRef(jinjaParser.VarRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#dictKey}.
	 * @param ctx the parse tree
	 */
	void enterDictKey(jinjaParser.DictKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#dictKey}.
	 * @param ctx the parse tree
	 */
	void exitDictKey(jinjaParser.DictKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#objAttr}.
	 * @param ctx the parse tree
	 */
	void enterObjAttr(jinjaParser.ObjAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#objAttr}.
	 * @param ctx the parse tree
	 */
	void exitObjAttr(jinjaParser.ObjAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#funcExpr}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpr(jinjaParser.FuncExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#funcExpr}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpr(jinjaParser.FuncExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#funcRef}.
	 * @param ctx the parse tree
	 */
	void enterFuncRef(jinjaParser.FuncRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#funcRef}.
	 * @param ctx the parse tree
	 */
	void exitFuncRef(jinjaParser.FuncRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#funcRefParam}.
	 * @param ctx the parse tree
	 */
	void enterFuncRefParam(jinjaParser.FuncRefParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#funcRefParam}.
	 * @param ctx the parse tree
	 */
	void exitFuncRefParam(jinjaParser.FuncRefParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#funcRefParams}.
	 * @param ctx the parse tree
	 */
	void enterFuncRefParams(jinjaParser.FuncRefParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#funcRefParams}.
	 * @param ctx the parse tree
	 */
	void exitFuncRefParams(jinjaParser.FuncRefParamsContext ctx);
}