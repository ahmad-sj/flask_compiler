package models.jinja.blocks.inheritedBlock;

import models.jinja.blocks.JinjaBlock;

public class InheritedBlockStart extends JinjaBlock {
    public String name;

    public InheritedBlockStart(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{% block " + this.name + " %}";
    }
}
