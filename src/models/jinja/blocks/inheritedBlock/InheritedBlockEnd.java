package models.jinja.blocks.inheritedBlock;

import models.jinja.blocks.JinjaBlock;

public class InheritedBlockEnd extends JinjaBlock {
    public String name;

    public InheritedBlockEnd(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{% " + this.name + " endblock %}";
    }
}
