package models.jinja.blocks.inheritedBlock;

import models.jinja.blocks.JinjaStatement;

public class InheritedBlockEndStatement extends JinjaStatement {
    public String name;

    public InheritedBlockEndStatement(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{% " + this.name + " endblock %}";
    }
}
