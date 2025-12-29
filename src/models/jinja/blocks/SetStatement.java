package models.jinja.blocks;

import models.Node;
import org.antlr.v4.runtime.Token;

public class SetStatement extends JinjaBlock {

    Node id;
    Node expr;

    public SetStatement(Node id, Node expr) {
        this.id = id;
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "{% " + id.toString() + " = " + expr.toString() + " %}";
    }

    @Override
    public String print(int level) {
        String indent = getIndent(level);

        return "set statement\n"
                + indent + "├─ id: " + id.print(level + 2) + "\n"
                + indent + "└─ value: " + expr.print(level + 2)
                ;
    }
}
