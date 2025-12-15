// Generated from C:/Users/Admin/Desktop/compiler project/flask_compiler/grammars/templateParser.g4 by ANTLR 4.13.2
 package antlr; 
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link templateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface templateParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link templateParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(templateParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlock(templateParser.JinjaBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(templateParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#ifStatmentStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatmentStart(templateParser.IfStatmentStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#ifBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBody(templateParser.IfBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#ifStatmentEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatmentEnd(templateParser.IfStatmentEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#elifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifBlock(templateParser.ElifBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(templateParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#subconitionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubconitionBody(templateParser.SubconitionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(templateParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#singleClauseCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleClauseCondition(templateParser.SingleClauseConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#multiClauseCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiClauseCondition(templateParser.MultiClauseConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#conditionOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionOperand(templateParser.ConditionOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#conditionOperandTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionOperandTest(templateParser.ConditionOperandTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#binaryLogicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLogicalOperator(templateParser.BinaryLogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#conditionComparisionOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionComparisionOperator(templateParser.ConditionComparisionOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(templateParser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#forStatementStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementStart(templateParser.ForStatementStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(templateParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#loopVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopVariables(templateParser.LoopVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#iterable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterable(templateParser.IterableContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#forStatementEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementEnd(templateParser.ForStatementEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#forBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBody(templateParser.ForBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#extendsBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsBlock(templateParser.ExtendsBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#inheritBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritBlock(templateParser.InheritBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#inheritBlockStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritBlockStart(templateParser.InheritBlockStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#inheritBlockEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritBlockEnd(templateParser.InheritBlockEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#inheritBlockBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritBlockBody(templateParser.InheritBlockBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#jinjaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpression(templateParser.JinjaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#jinjaExprStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExprStart(templateParser.JinjaExprStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#jinjaExprEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExprEnd(templateParser.JinjaExprEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#jinjaExprBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExprBody(templateParser.JinjaExprBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#jinjaFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaFilter(templateParser.JinjaFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#jinjaId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaId(templateParser.JinjaIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#idMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdMember(templateParser.IdMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#dictKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictKey(templateParser.DictKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#objAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjAttr(templateParser.ObjAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#funcParamList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParamList(templateParser.FuncParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#funcParamId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParamId(templateParser.FuncParamIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#funcParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParam(templateParser.FuncParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#htmlElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElem(templateParser.HtmlElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#htmlElemBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElemBody(templateParser.HtmlElemBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#htmlOpenTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlOpenTag(templateParser.HtmlOpenTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#htmlCloseTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlCloseTag(templateParser.HtmlCloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#htmlSelfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlSelfClosingTag(templateParser.HtmlSelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#htmlTagAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTagAttr(templateParser.HtmlTagAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#booleanAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAttr(templateParser.BooleanAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#attrWithUnquotedVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrWithUnquotedVal(templateParser.AttrWithUnquotedValContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#attrWithQuotedVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrWithQuotedVal(templateParser.AttrWithQuotedValContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#jinjaAttrVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaAttrVal(templateParser.JinjaAttrValContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#styleAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleAttr(templateParser.StyleAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#inlineStyleProp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineStyleProp(templateParser.InlineStylePropContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#inlineStylePropValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineStylePropValues(templateParser.InlineStylePropValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#htmlStyleElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlStyleElem(templateParser.HtmlStyleElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#htmlStyleElemOpenTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlStyleElemOpenTag(templateParser.HtmlStyleElemOpenTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#htmlStyleElemCloseTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlStyleElemCloseTag(templateParser.HtmlStyleElemCloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#cssBlockDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBlockDecl(templateParser.CssBlockDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CSS_SEL_ID}
	 * labeled alternative in {@link templateParser#cssSel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCSS_SEL_ID(templateParser.CSS_SEL_IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CSS_SEL_CLASS}
	 * labeled alternative in {@link templateParser#cssSel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCSS_SEL_CLASS(templateParser.CSS_SEL_CLASSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CSS_SEL_ELEM}
	 * labeled alternative in {@link templateParser#cssSel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCSS_SEL_ELEM(templateParser.CSS_SEL_ELEMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CSS_SEL_PSEUDO_CLASS}
	 * labeled alternative in {@link templateParser#cssSel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCSS_SEL_PSEUDO_CLASS(templateParser.CSS_SEL_PSEUDO_CLASSContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#cssSelWithState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelWithState(templateParser.CssSelWithStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CSS_SEL_SINGLE}
	 * labeled alternative in {@link templateParser#cssSelectors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCSS_SEL_SINGLE(templateParser.CSS_SEL_SINGLEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CSS_SEL_DESCENDENT}
	 * labeled alternative in {@link templateParser#cssSelectors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCSS_SEL_DESCENDENT(templateParser.CSS_SEL_DESCENDENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CSS_SEL_GROUP}
	 * labeled alternative in {@link templateParser#cssSelectors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCSS_SEL_GROUP(templateParser.CSS_SEL_GROUPContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#cssBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBlock(templateParser.CssBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#cssPropDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssPropDecl(templateParser.CssPropDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#cssBlockPropVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBlockPropVal(templateParser.CssBlockPropValContext ctx);
}