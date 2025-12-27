package models.jinja.blocks;

import models.Node;

public class IfBlock extends JinjaBlock {
    Node condition;
    Node ifBody; // an object of type SubBlocks

    public IfBlock(Node condition, Node ifBody) {
        this.condition = condition;
        this.ifBody = ifBody;
    }

    @Override
    public String toString() {
        return "{% if " + this.condition.toString() + " %}\n"
                + (ifBody == null? "" : ifBody.toString() + "\n")
                + "{% endif %}";
    }
}
