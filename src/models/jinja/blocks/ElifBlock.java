package models.jinja.blocks;

import models.Node;

public class ElifBlock extends JinjaBlock {
    Node condition;
    Node elifBody; // an object of type SubBlocks

    public ElifBlock(Node condition, Node elifBody) {
        this.condition = condition;
        this.elifBody = elifBody;
    }

    @Override
    public String toString() {
        return "{% elif " + this.condition.toString() + " %}\n"
                + (elifBody == null ? "" : elifBody.toString());
    }

    @Override
    public String print(int level) {
        String indent = getIndent(level + 1);

        return "elif block\n" +
                indent + "├─ line no: " + lineNumber + "\n" +
                (elifBody == null
                        ? indent + "└─ condition: " + condition.toString() + "\n"
                        : indent + "├─ condition: " + condition.toString() + "\n"
                        + indent + "└─ children:\n" + elifBody.print(level + 2)
                );
    }
}
