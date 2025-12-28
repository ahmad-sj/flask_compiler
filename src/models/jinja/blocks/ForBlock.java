package models.jinja.blocks;

import models.Node;

import java.util.ArrayList;

public class ForBlock extends JinjaBlock {
    public ArrayList<Node> loopVars;
    public Node iterable;
    public Node forBody; // an object of type SubBlocks

    public ForBlock(ArrayList<Node> loopVars, Node iterable, Node forBody) {
        this.loopVars = loopVars;
        this.iterable = iterable;
        this.forBody = forBody;
    }

    @Override
    public String toString() {
        StringBuilder loopVars = new StringBuilder();

        for (int i = 0; i < this.loopVars.size(); i++) {
            loopVars.append(this.loopVars.get(i));

            if (i + 1 < this.loopVars.size())
                loopVars.append(", ");
        }

        return "{% for " + loopVars + " in " + iterable.toString() + " %}\n"
                + (forBody == null ? "" : forBody.toString())
                + "\n{% endfor %}";
    }

    @Override
    public String print(int level) {
        String indent = getIndent(level + 1);

        StringBuilder loopVars = new StringBuilder();

        for (int i = 0; i < this.loopVars.size(); i++) {
            loopVars.append(this.loopVars.get(i));

            if (i + 1 < this.loopVars.size())
                loopVars.append(", ");
        }

        return "for block\n"
                + indent + "├─ line no: " + lineNumber + "\n"
                + indent + "├─ loop vars: " + loopVars.toString() + "\n" +
                (forBody == null
                        ? ""
                        : indent + "└─ for body:\n" + forBody.print(level + 2) + "\n"
                );
    }
}
