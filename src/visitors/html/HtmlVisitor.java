/*
package visitors.html;

import models.Node;
import models.html.elements.Element;
import models.html.elements.ElementBody;
import models.html.tags.EndTag;
import models.html.tags.StartTag;
import org.antlr.v4.runtime.tree.ParseTree;
import visitors.NodeVisitor;

import java.util.ArrayList;

public class HtmlVisitor extends templateParserBaseVisitor<Node> {
    @Override
    public Node visitHtmlRegularElement(templateParser.HtmlRegularElementContext ctx) {
        TagVisitor tagVisitor = new TagVisitor();

        StartTag startTag = (StartTag) tagVisitor.visit(ctx.htmlStartTag());
        EndTag endTag = (EndTag) tagVisitor.visit(ctx.htmlEndTag());
        ElementBody elementBody = null;

        if (ctx.htmlElementBody() != null) {
            elementBody = (ElementBody) visit(ctx.htmlElementBody());
        }
        return new Element(startTag, elementBody, endTag);
    }

    @Override
    public Node visitHtmlSelfClosingElement(templateParser.HtmlSelfClosingElementContext ctx) {
        return new TagVisitor().visit(ctx.htmlSelfClosingTag());
    }

    @Override
    public Node visitHtmlElementBody(templateParser.HtmlElementBodyContext ctx) {
        ArrayList<Node> nodes = new ArrayList<>();
        NodeVisitor nodeVisitor = new NodeVisitor();

        for (ParseTree child : ctx.children) {
            nodes.add(nodeVisitor.visit(child));
        }

        return new ElementBody(nodes);
    }
}
*/
