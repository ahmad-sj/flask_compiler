package models.jinja.blocks;

import models.Node;

public class InheritedBlock extends JinjaBlock {
    public String blockName;
    Node subBlocks; // an object of type SubBlocks

    public InheritedBlock(String blockName, Node subBlocks) {
        this.blockName = blockName;
        this.subBlocks = subBlocks;
    }

    @Override
    public String toString() {
        return "{% block " + blockName + " %}\n"
                + (this.subBlocks == null ? "" : subBlocks.toString())
                + "\n{% endblock %}";
    }

    @Override
    public String print(int level) {
        String indent = getIndent(level + 1);

        return "block" + "\n"
                + indent + "├─ line no: " + lineNumber + "\n" +
                (subBlocks == null
                        ? indent + "└─ block name: " + blockName + "\n"
                        : indent + "├─ block name: " + blockName + "\n"
                        + indent + "└─ children: " + "\n"
                        + this.subBlocks.print(level + 2)
                );
    }
}
