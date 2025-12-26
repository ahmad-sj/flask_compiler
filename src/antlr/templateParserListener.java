// Generated from C:/Users/Admin/Desktop/compiler project/flask_compiler/grammars/templateParser.g4 by ANTLR 4.13.2
 package antlr; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link templateParser}.
 */
public interface templateParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link templateParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(templateParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(templateParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlock(templateParser.JinjaBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlock(templateParser.JinjaBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#templateText}.
	 * @param ctx the parse tree
	 */
	void enterTemplateText(templateParser.TemplateTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#templateText}.
	 * @param ctx the parse tree
	 */
	void exitTemplateText(templateParser.TemplateTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(templateParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(templateParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#ifStatmentStart}.
	 * @param ctx the parse tree
	 */
	void enterIfStatmentStart(templateParser.IfStatmentStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#ifStatmentStart}.
	 * @param ctx the parse tree
	 */
	void exitIfStatmentStart(templateParser.IfStatmentStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void enterIfBody(templateParser.IfBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void exitIfBody(templateParser.IfBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#ifStatmentEnd}.
	 * @param ctx the parse tree
	 */
	void enterIfStatmentEnd(templateParser.IfStatmentEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#ifStatmentEnd}.
	 * @param ctx the parse tree
	 */
	void exitIfStatmentEnd(templateParser.IfStatmentEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#elifBlock}.
	 * @param ctx the parse tree
	 */
	void enterElifBlock(templateParser.ElifBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#elifBlock}.
	 * @param ctx the parse tree
	 */
	void exitElifBlock(templateParser.ElifBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(templateParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(templateParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#subconitionBody}.
	 * @param ctx the parse tree
	 */
	void enterSubconitionBody(templateParser.SubconitionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#subconitionBody}.
	 * @param ctx the parse tree
	 */
	void exitSubconitionBody(templateParser.SubconitionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(templateParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(templateParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#forStartStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStartStatement(templateParser.ForStartStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#forStartStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStartStatement(templateParser.ForStartStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(templateParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(templateParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#loopVariables}.
	 * @param ctx the parse tree
	 */
	void enterLoopVariables(templateParser.LoopVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#loopVariables}.
	 * @param ctx the parse tree
	 */
	void exitLoopVariables(templateParser.LoopVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#forEndStatement}.
	 * @param ctx the parse tree
	 */
	void enterForEndStatement(templateParser.ForEndStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#forEndStatement}.
	 * @param ctx the parse tree
	 */
	void exitForEndStatement(templateParser.ForEndStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#forBody}.
	 * @param ctx the parse tree
	 */
	void enterForBody(templateParser.ForBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#forBody}.
	 * @param ctx the parse tree
	 */
	void exitForBody(templateParser.ForBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#extendsBlock}.
	 * @param ctx the parse tree
	 */
	void enterExtendsBlock(templateParser.ExtendsBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#extendsBlock}.
	 * @param ctx the parse tree
	 */
	void exitExtendsBlock(templateParser.ExtendsBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#inheritBlock}.
	 * @param ctx the parse tree
	 */
	void enterInheritBlock(templateParser.InheritBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#inheritBlock}.
	 * @param ctx the parse tree
	 */
	void exitInheritBlock(templateParser.InheritBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#inheritBlockStart}.
	 * @param ctx the parse tree
	 */
	void enterInheritBlockStart(templateParser.InheritBlockStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#inheritBlockStart}.
	 * @param ctx the parse tree
	 */
	void exitInheritBlockStart(templateParser.InheritBlockStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#inheritBlockEnd}.
	 * @param ctx the parse tree
	 */
	void enterInheritBlockEnd(templateParser.InheritBlockEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#inheritBlockEnd}.
	 * @param ctx the parse tree
	 */
	void exitInheritBlockEnd(templateParser.InheritBlockEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#inheritBlockBody}.
	 * @param ctx the parse tree
	 */
	void enterInheritBlockBody(templateParser.InheritBlockBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#inheritBlockBody}.
	 * @param ctx the parse tree
	 */
	void exitInheritBlockBody(templateParser.InheritBlockBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpression(templateParser.JinjaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpression(templateParser.JinjaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#jinjaExprStart}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExprStart(templateParser.JinjaExprStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#jinjaExprStart}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExprStart(templateParser.JinjaExprStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#jinjaExprEnd}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExprEnd(templateParser.JinjaExprEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#jinjaExprEnd}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExprEnd(templateParser.JinjaExprEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(templateParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(templateParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#ternaryExt}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExt(templateParser.TernaryExtContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#ternaryExt}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExt(templateParser.TernaryExtContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#defaultExpr}.
	 * @param ctx the parse tree
	 */
	void enterDefaultExpr(templateParser.DefaultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#defaultExpr}.
	 * @param ctx the parse tree
	 */
	void exitDefaultExpr(templateParser.DefaultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(templateParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(templateParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(templateParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(templateParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(templateParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(templateParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(templateParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(templateParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#compExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr(templateParser.CompExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#compExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr(templateParser.CompExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#inExpr}.
	 * @param ctx the parse tree
	 */
	void enterInExpr(templateParser.InExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#inExpr}.
	 * @param ctx the parse tree
	 */
	void exitInExpr(templateParser.InExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(templateParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(templateParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#pipeExpr}.
	 * @param ctx the parse tree
	 */
	void enterPipeExpr(templateParser.PipeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#pipeExpr}.
	 * @param ctx the parse tree
	 */
	void exitPipeExpr(templateParser.PipeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(templateParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(templateParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(templateParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(templateParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(templateParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(templateParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#concatExpr}.
	 * @param ctx the parse tree
	 */
	void enterConcatExpr(templateParser.ConcatExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#concatExpr}.
	 * @param ctx the parse tree
	 */
	void exitConcatExpr(templateParser.ConcatExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(templateParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(templateParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#addExprOptor}.
	 * @param ctx the parse tree
	 */
	void enterAddExprOptor(templateParser.AddExprOptorContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#addExprOptor}.
	 * @param ctx the parse tree
	 */
	void exitAddExprOptor(templateParser.AddExprOptorContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(templateParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(templateParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#mulExprOptor}.
	 * @param ctx the parse tree
	 */
	void enterMulExprOptor(templateParser.MulExprOptorContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#mulExprOptor}.
	 * @param ctx the parse tree
	 */
	void exitMulExprOptor(templateParser.MulExprOptorContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(templateParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(templateParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#powExpr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(templateParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#powExpr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(templateParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(templateParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(templateParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#parenthedExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenthedExpr(templateParser.ParenthedExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#parenthedExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenthedExpr(templateParser.ParenthedExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(templateParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(templateParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailer(templateParser.TrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailer(templateParser.TrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#memberTrailer}.
	 * @param ctx the parse tree
	 */
	void enterMemberTrailer(templateParser.MemberTrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#memberTrailer}.
	 * @param ctx the parse tree
	 */
	void exitMemberTrailer(templateParser.MemberTrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#subTrailer}.
	 * @param ctx the parse tree
	 */
	void enterSubTrailer(templateParser.SubTrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#subTrailer}.
	 * @param ctx the parse tree
	 */
	void exitSubTrailer(templateParser.SubTrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#callTrailer}.
	 * @param ctx the parse tree
	 */
	void enterCallTrailer(templateParser.CallTrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#callTrailer}.
	 * @param ctx the parse tree
	 */
	void exitCallTrailer(templateParser.CallTrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(templateParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(templateParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#dict}.
	 * @param ctx the parse tree
	 */
	void enterDict(templateParser.DictContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#dict}.
	 * @param ctx the parse tree
	 */
	void exitDict(templateParser.DictContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(templateParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(templateParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(templateParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(templateParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#htmlRegularElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlRegularElement(templateParser.HtmlRegularElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#htmlRegularElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlRegularElement(templateParser.HtmlRegularElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#htmlStartTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlStartTag(templateParser.HtmlStartTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#htmlStartTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlStartTag(templateParser.HtmlStartTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#htmlElementBody}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElementBody(templateParser.HtmlElementBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#htmlElementBody}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElementBody(templateParser.HtmlElementBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#htmlEndTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlEndTag(templateParser.HtmlEndTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#htmlEndTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlEndTag(templateParser.HtmlEndTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#htmlSelfClosingElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlSelfClosingElement(templateParser.HtmlSelfClosingElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#htmlSelfClosingElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlSelfClosingElement(templateParser.HtmlSelfClosingElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#htmlSelfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlSelfClosingTag(templateParser.HtmlSelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#htmlSelfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlSelfClosingTag(templateParser.HtmlSelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#htmlTagAttr}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTagAttr(templateParser.HtmlTagAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#htmlTagAttr}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTagAttr(templateParser.HtmlTagAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#booleanAttr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAttr(templateParser.BooleanAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#booleanAttr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAttr(templateParser.BooleanAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#attrWithUnquotedVal}.
	 * @param ctx the parse tree
	 */
	void enterAttrWithUnquotedVal(templateParser.AttrWithUnquotedValContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#attrWithUnquotedVal}.
	 * @param ctx the parse tree
	 */
	void exitAttrWithUnquotedVal(templateParser.AttrWithUnquotedValContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#attrWithQuotedVal}.
	 * @param ctx the parse tree
	 */
	void enterAttrWithQuotedVal(templateParser.AttrWithQuotedValContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#attrWithQuotedVal}.
	 * @param ctx the parse tree
	 */
	void exitAttrWithQuotedVal(templateParser.AttrWithQuotedValContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#jinjaAttrVal}.
	 * @param ctx the parse tree
	 */
	void enterJinjaAttrVal(templateParser.JinjaAttrValContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#jinjaAttrVal}.
	 * @param ctx the parse tree
	 */
	void exitJinjaAttrVal(templateParser.JinjaAttrValContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#styleAttr}.
	 * @param ctx the parse tree
	 */
	void enterStyleAttr(templateParser.StyleAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#styleAttr}.
	 * @param ctx the parse tree
	 */
	void exitStyleAttr(templateParser.StyleAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#inlineStyleProp}.
	 * @param ctx the parse tree
	 */
	void enterInlineStyleProp(templateParser.InlineStylePropContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#inlineStyleProp}.
	 * @param ctx the parse tree
	 */
	void exitInlineStyleProp(templateParser.InlineStylePropContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#htmlStyleElem}.
	 * @param ctx the parse tree
	 */
	void enterHtmlStyleElem(templateParser.HtmlStyleElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#htmlStyleElem}.
	 * @param ctx the parse tree
	 */
	void exitHtmlStyleElem(templateParser.HtmlStyleElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#htmlStyleElemOpenTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlStyleElemOpenTag(templateParser.HtmlStyleElemOpenTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#htmlStyleElemOpenTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlStyleElemOpenTag(templateParser.HtmlStyleElemOpenTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#htmlStyleElemCloseTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlStyleElemCloseTag(templateParser.HtmlStyleElemCloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#htmlStyleElemCloseTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlStyleElemCloseTag(templateParser.HtmlStyleElemCloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#cssBlockDecl}.
	 * @param ctx the parse tree
	 */
	void enterCssBlockDecl(templateParser.CssBlockDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#cssBlockDecl}.
	 * @param ctx the parse tree
	 */
	void exitCssBlockDecl(templateParser.CssBlockDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSS_SEL_ID}
	 * labeled alternative in {@link templateParser#cssSel}.
	 * @param ctx the parse tree
	 */
	void enterCSS_SEL_ID(templateParser.CSS_SEL_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSS_SEL_ID}
	 * labeled alternative in {@link templateParser#cssSel}.
	 * @param ctx the parse tree
	 */
	void exitCSS_SEL_ID(templateParser.CSS_SEL_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSS_SEL_CLASS}
	 * labeled alternative in {@link templateParser#cssSel}.
	 * @param ctx the parse tree
	 */
	void enterCSS_SEL_CLASS(templateParser.CSS_SEL_CLASSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSS_SEL_CLASS}
	 * labeled alternative in {@link templateParser#cssSel}.
	 * @param ctx the parse tree
	 */
	void exitCSS_SEL_CLASS(templateParser.CSS_SEL_CLASSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSS_SEL_ELEM}
	 * labeled alternative in {@link templateParser#cssSel}.
	 * @param ctx the parse tree
	 */
	void enterCSS_SEL_ELEM(templateParser.CSS_SEL_ELEMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSS_SEL_ELEM}
	 * labeled alternative in {@link templateParser#cssSel}.
	 * @param ctx the parse tree
	 */
	void exitCSS_SEL_ELEM(templateParser.CSS_SEL_ELEMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSS_SEL_PSEUDO_CLASS}
	 * labeled alternative in {@link templateParser#cssSel}.
	 * @param ctx the parse tree
	 */
	void enterCSS_SEL_PSEUDO_CLASS(templateParser.CSS_SEL_PSEUDO_CLASSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSS_SEL_PSEUDO_CLASS}
	 * labeled alternative in {@link templateParser#cssSel}.
	 * @param ctx the parse tree
	 */
	void exitCSS_SEL_PSEUDO_CLASS(templateParser.CSS_SEL_PSEUDO_CLASSContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#cssSelWithState}.
	 * @param ctx the parse tree
	 */
	void enterCssSelWithState(templateParser.CssSelWithStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#cssSelWithState}.
	 * @param ctx the parse tree
	 */
	void exitCssSelWithState(templateParser.CssSelWithStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSS_SEL_SINGLE}
	 * labeled alternative in {@link templateParser#cssSelectors}.
	 * @param ctx the parse tree
	 */
	void enterCSS_SEL_SINGLE(templateParser.CSS_SEL_SINGLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSS_SEL_SINGLE}
	 * labeled alternative in {@link templateParser#cssSelectors}.
	 * @param ctx the parse tree
	 */
	void exitCSS_SEL_SINGLE(templateParser.CSS_SEL_SINGLEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSS_SEL_DESCENDENT}
	 * labeled alternative in {@link templateParser#cssSelectors}.
	 * @param ctx the parse tree
	 */
	void enterCSS_SEL_DESCENDENT(templateParser.CSS_SEL_DESCENDENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSS_SEL_DESCENDENT}
	 * labeled alternative in {@link templateParser#cssSelectors}.
	 * @param ctx the parse tree
	 */
	void exitCSS_SEL_DESCENDENT(templateParser.CSS_SEL_DESCENDENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSS_SEL_GROUP}
	 * labeled alternative in {@link templateParser#cssSelectors}.
	 * @param ctx the parse tree
	 */
	void enterCSS_SEL_GROUP(templateParser.CSS_SEL_GROUPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSS_SEL_GROUP}
	 * labeled alternative in {@link templateParser#cssSelectors}.
	 * @param ctx the parse tree
	 */
	void exitCSS_SEL_GROUP(templateParser.CSS_SEL_GROUPContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#cssBlock}.
	 * @param ctx the parse tree
	 */
	void enterCssBlock(templateParser.CssBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#cssBlock}.
	 * @param ctx the parse tree
	 */
	void exitCssBlock(templateParser.CssBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#cssPropDecl}.
	 * @param ctx the parse tree
	 */
	void enterCssPropDecl(templateParser.CssPropDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#cssPropDecl}.
	 * @param ctx the parse tree
	 */
	void exitCssPropDecl(templateParser.CssPropDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#cssBlockPropVal}.
	 * @param ctx the parse tree
	 */
	void enterCssBlockPropVal(templateParser.CssBlockPropValContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#cssBlockPropVal}.
	 * @param ctx the parse tree
	 */
	void exitCssBlockPropVal(templateParser.CssBlockPropValContext ctx);
}