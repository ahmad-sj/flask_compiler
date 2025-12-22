package models.jinja.blocks.inheritedBlock;

import models.jinja.blocks.JinjaStatement;

public class InheritedBlockStartStatement extends JinjaStatement {
    public String name;

    public InheritedBlockStartStatement(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{% block " + this.name + " %}";
    }
}
