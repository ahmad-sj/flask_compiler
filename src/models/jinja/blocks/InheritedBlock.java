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
}
