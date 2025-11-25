// Generated from C:/Users/Admin/Desktop/New folder (2)/flask_compiler/grammars/templateParser.g4 by ANTLR 4.13.2
 package antlr; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link templateParser}.
 */
public interface templateParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link templateParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(templateParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(templateParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(templateParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(templateParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(templateParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(templateParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#openTag}.
	 * @param ctx the parse tree
	 */
	void enterOpenTag(templateParser.OpenTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#openTag}.
	 * @param ctx the parse tree
	 */
	void exitOpenTag(templateParser.OpenTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void enterCloseTag(templateParser.CloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void exitCloseTag(templateParser.CloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(templateParser.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(templateParser.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#atrribute}.
	 * @param ctx the parse tree
	 */
	void enterAtrribute(templateParser.AtrributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#atrribute}.
	 * @param ctx the parse tree
	 */
	void exitAtrribute(templateParser.AtrributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterAttrValue(templateParser.AttrValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitAttrValue(templateParser.AttrValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#htmlStyleAttr}.
	 * @param ctx the parse tree
	 */
	void enterHtmlStyleAttr(templateParser.HtmlStyleAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#htmlStyleAttr}.
	 * @param ctx the parse tree
	 */
	void exitHtmlStyleAttr(templateParser.HtmlStyleAttrContext ctx);
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
	 * Enter a parse tree produced by {@link templateParser#inlineStylePropValues}.
	 * @param ctx the parse tree
	 */
	void enterInlineStylePropValues(templateParser.InlineStylePropValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#inlineStylePropValues}.
	 * @param ctx the parse tree
	 */
	void exitInlineStylePropValues(templateParser.InlineStylePropValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void enterStyleElement(templateParser.StyleElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void exitStyleElement(templateParser.StyleElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#openStyleTag}.
	 * @param ctx the parse tree
	 */
	void enterOpenStyleTag(templateParser.OpenStyleTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#openStyleTag}.
	 * @param ctx the parse tree
	 */
	void exitOpenStyleTag(templateParser.OpenStyleTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#closeStyleTag}.
	 * @param ctx the parse tree
	 */
	void enterCloseStyleTag(templateParser.CloseStyleTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#closeStyleTag}.
	 * @param ctx the parse tree
	 */
	void exitCloseStyleTag(templateParser.CloseStyleTagContext ctx);
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
	 * Enter a parse tree produced by the {@code CSS_SELECTOR_ID}
	 * labeled alternative in {@link templateParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterCSS_SELECTOR_ID(templateParser.CSS_SELECTOR_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSS_SELECTOR_ID}
	 * labeled alternative in {@link templateParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitCSS_SELECTOR_ID(templateParser.CSS_SELECTOR_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSS_SELECTOR_CLASS}
	 * labeled alternative in {@link templateParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterCSS_SELECTOR_CLASS(templateParser.CSS_SELECTOR_CLASSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSS_SELECTOR_CLASS}
	 * labeled alternative in {@link templateParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitCSS_SELECTOR_CLASS(templateParser.CSS_SELECTOR_CLASSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSS_SELECTOR_ELEMENT}
	 * labeled alternative in {@link templateParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterCSS_SELECTOR_ELEMENT(templateParser.CSS_SELECTOR_ELEMENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSS_SELECTOR_ELEMENT}
	 * labeled alternative in {@link templateParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitCSS_SELECTOR_ELEMENT(templateParser.CSS_SELECTOR_ELEMENTContext ctx);
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
	 * Enter a parse tree produced by {@link templateParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(templateParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(templateParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link templateParser#blkPropVal}.
	 * @param ctx the parse tree
	 */
	void enterBlkPropVal(templateParser.BlkPropValContext ctx);
	/**
	 * Exit a parse tree produced by {@link templateParser#blkPropVal}.
	 * @param ctx the parse tree
	 */
	void exitBlkPropVal(templateParser.BlkPropValContext ctx);
}