// Generated from C:/Users/Admin/Desktop/New folder (2)/flask_compiler/grammars/templateParser.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by {@link templateParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(templateParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(templateParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(templateParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#openTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenTag(templateParser.OpenTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#closeTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseTag(templateParser.CloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(templateParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#atrribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrribute(templateParser.AtrributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrValue(templateParser.AttrValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#htmlStyleAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlStyleAttr(templateParser.HtmlStyleAttrContext ctx);
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
	 * Visit a parse tree produced by {@link templateParser#styleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElement(templateParser.StyleElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#openStyleTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenStyleTag(templateParser.OpenStyleTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#closeStyleTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseStyleTag(templateParser.CloseStyleTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#cssBlockDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBlockDecl(templateParser.CssBlockDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CSS_SELECTOR_ID}
	 * labeled alternative in {@link templateParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCSS_SELECTOR_ID(templateParser.CSS_SELECTOR_IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CSS_SELECTOR_CLASS}
	 * labeled alternative in {@link templateParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCSS_SELECTOR_CLASS(templateParser.CSS_SELECTOR_CLASSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CSS_SELECTOR_ELEMENT}
	 * labeled alternative in {@link templateParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCSS_SELECTOR_ELEMENT(templateParser.CSS_SELECTOR_ELEMENTContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#cssBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBlock(templateParser.CssBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(templateParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link templateParser#blkPropVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlkPropVal(templateParser.BlkPropValContext ctx);
}