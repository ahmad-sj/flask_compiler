// Generated from C:/Users/Admin/Desktop/New folder (2)/flask_compiler/grammars/flaskParser.g4 by ANTLR 4.13.2
 package antlr; 
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link flaskParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface flaskParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link flaskParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(flaskParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(flaskParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#atrribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrribute(flaskParser.AtrributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#htmlStyleAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlStyleAttr(flaskParser.HtmlStyleAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#inlineStyleProp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineStyleProp(flaskParser.InlineStylePropContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#inlineStylePropValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineStylePropValues(flaskParser.InlineStylePropValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#styleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElement(flaskParser.StyleElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#openStyleTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenStyleTag(flaskParser.OpenStyleTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#closeStyleTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseStyleTag(flaskParser.CloseStyleTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(flaskParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#openTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenTag(flaskParser.OpenTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#closeTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseTag(flaskParser.CloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(flaskParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrValue(flaskParser.AttrValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#cssBlockDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBlockDecl(flaskParser.CssBlockDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CSS_SELECTOR_ID}
	 * labeled alternative in {@link flaskParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCSS_SELECTOR_ID(flaskParser.CSS_SELECTOR_IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CSS_SELECTOR_CLASS}
	 * labeled alternative in {@link flaskParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCSS_SELECTOR_CLASS(flaskParser.CSS_SELECTOR_CLASSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CSS_SELECTOR_ELEMENT}
	 * labeled alternative in {@link flaskParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCSS_SELECTOR_ELEMENT(flaskParser.CSS_SELECTOR_ELEMENTContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#cssBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBlock(flaskParser.CssBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(flaskParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link flaskParser#blkPropVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlkPropVal(flaskParser.BlkPropValContext ctx);
}