// Generated from C:/Users/Admin/Desktop/flask_compiler/grammars/jinjaParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link jinjaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface jinjaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link jinjaParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(jinjaParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#jinjaCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaCode(jinjaParser.JinjaCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(jinjaParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#ifStatmentStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatmentStart(jinjaParser.IfStatmentStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#ifBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBody(jinjaParser.IfBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#ifStatmentEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatmentEnd(jinjaParser.IfStatmentEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#elifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifBlock(jinjaParser.ElifBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(jinjaParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#subconitionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubconitionBody(jinjaParser.SubconitionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(jinjaParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#singleClauseCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleClauseCondition(jinjaParser.SingleClauseConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#multiClauseCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiClauseCondition(jinjaParser.MultiClauseConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#conditionOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionOperand(jinjaParser.ConditionOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#conditionOperandTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionOperandTest(jinjaParser.ConditionOperandTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#binaryLogicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLogicalOperator(jinjaParser.BinaryLogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#conditionComparisionOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionComparisionOperator(jinjaParser.ConditionComparisionOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(jinjaParser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#forStatementStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementStart(jinjaParser.ForStatementStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(jinjaParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#loopVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopVariables(jinjaParser.LoopVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#iterable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterable(jinjaParser.IterableContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#forStatementEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementEnd(jinjaParser.ForStatementEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#forBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBody(jinjaParser.ForBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#extendsBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsBlock(jinjaParser.ExtendsBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#inheritanceBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritanceBlock(jinjaParser.InheritanceBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#inheritanceBlockStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritanceBlockStart(jinjaParser.InheritanceBlockStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#inheritanceBlockEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritanceBlockEnd(jinjaParser.InheritanceBlockEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#inheritanceBlockContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritanceBlockContent(jinjaParser.InheritanceBlockContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#jinjaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpression(jinjaParser.JinjaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#varExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr(jinjaParser.VarExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#varRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarRef(jinjaParser.VarRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#dictKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictKey(jinjaParser.DictKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#objAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjAttr(jinjaParser.ObjAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#funcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpr(jinjaParser.FuncExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#funcRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncRef(jinjaParser.FuncRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#funcRefParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncRefParam(jinjaParser.FuncRefParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#funcRefParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncRefParams(jinjaParser.FuncRefParamsContext ctx);
}