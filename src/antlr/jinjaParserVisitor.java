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
	 * Visit a parse tree produced by {@link jinjaParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlock(jinjaParser.JinjaBlockContext ctx);
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
}