// Generated from C:/Users/Admin/Desktop/New folder (2)/flask_compiler/grammars/flaskParser.g4 by ANTLR 4.13.2
 package antlr; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link flaskParser}.
 */
public interface flaskParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link flaskParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(flaskParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(flaskParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(flaskParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(flaskParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#atrribute}.
	 * @param ctx the parse tree
	 */
	void enterAtrribute(flaskParser.AtrributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#atrribute}.
	 * @param ctx the parse tree
	 */
	void exitAtrribute(flaskParser.AtrributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#htmlStyleAttr}.
	 * @param ctx the parse tree
	 */
	void enterHtmlStyleAttr(flaskParser.HtmlStyleAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#htmlStyleAttr}.
	 * @param ctx the parse tree
	 */
	void exitHtmlStyleAttr(flaskParser.HtmlStyleAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#inlineStyleProp}.
	 * @param ctx the parse tree
	 */
	void enterInlineStyleProp(flaskParser.InlineStylePropContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#inlineStyleProp}.
	 * @param ctx the parse tree
	 */
	void exitInlineStyleProp(flaskParser.InlineStylePropContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#inlineStylePropValues}.
	 * @param ctx the parse tree
	 */
	void enterInlineStylePropValues(flaskParser.InlineStylePropValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#inlineStylePropValues}.
	 * @param ctx the parse tree
	 */
	void exitInlineStylePropValues(flaskParser.InlineStylePropValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void enterStyleElement(flaskParser.StyleElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void exitStyleElement(flaskParser.StyleElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#openStyleTag}.
	 * @param ctx the parse tree
	 */
	void enterOpenStyleTag(flaskParser.OpenStyleTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#openStyleTag}.
	 * @param ctx the parse tree
	 */
	void exitOpenStyleTag(flaskParser.OpenStyleTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#closeStyleTag}.
	 * @param ctx the parse tree
	 */
	void enterCloseStyleTag(flaskParser.CloseStyleTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#closeStyleTag}.
	 * @param ctx the parse tree
	 */
	void exitCloseStyleTag(flaskParser.CloseStyleTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(flaskParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(flaskParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#openTag}.
	 * @param ctx the parse tree
	 */
	void enterOpenTag(flaskParser.OpenTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#openTag}.
	 * @param ctx the parse tree
	 */
	void exitOpenTag(flaskParser.OpenTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void enterCloseTag(flaskParser.CloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void exitCloseTag(flaskParser.CloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(flaskParser.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(flaskParser.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterAttrValue(flaskParser.AttrValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitAttrValue(flaskParser.AttrValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#cssBlockDecl}.
	 * @param ctx the parse tree
	 */
	void enterCssBlockDecl(flaskParser.CssBlockDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#cssBlockDecl}.
	 * @param ctx the parse tree
	 */
	void exitCssBlockDecl(flaskParser.CssBlockDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSS_SELECTOR_ID}
	 * labeled alternative in {@link flaskParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterCSS_SELECTOR_ID(flaskParser.CSS_SELECTOR_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSS_SELECTOR_ID}
	 * labeled alternative in {@link flaskParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitCSS_SELECTOR_ID(flaskParser.CSS_SELECTOR_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSS_SELECTOR_CLASS}
	 * labeled alternative in {@link flaskParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterCSS_SELECTOR_CLASS(flaskParser.CSS_SELECTOR_CLASSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSS_SELECTOR_CLASS}
	 * labeled alternative in {@link flaskParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitCSS_SELECTOR_CLASS(flaskParser.CSS_SELECTOR_CLASSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSS_SELECTOR_ELEMENT}
	 * labeled alternative in {@link flaskParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterCSS_SELECTOR_ELEMENT(flaskParser.CSS_SELECTOR_ELEMENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSS_SELECTOR_ELEMENT}
	 * labeled alternative in {@link flaskParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitCSS_SELECTOR_ELEMENT(flaskParser.CSS_SELECTOR_ELEMENTContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#cssBlock}.
	 * @param ctx the parse tree
	 */
	void enterCssBlock(flaskParser.CssBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#cssBlock}.
	 * @param ctx the parse tree
	 */
	void exitCssBlock(flaskParser.CssBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(flaskParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(flaskParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link flaskParser#blkPropVal}.
	 * @param ctx the parse tree
	 */
	void enterBlkPropVal(flaskParser.BlkPropValContext ctx);
	/**
	 * Exit a parse tree produced by {@link flaskParser#blkPropVal}.
	 * @param ctx the parse tree
	 */
	void exitBlkPropVal(flaskParser.BlkPropValContext ctx);
}