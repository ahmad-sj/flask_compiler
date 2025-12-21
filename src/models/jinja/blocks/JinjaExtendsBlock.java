package models.jinja.blocks;

public class JinjaExtendsBlock extends JinjaBlock {
    public String templateName;

    public JinjaExtendsBlock(String templateName) {
        this.templateName = templateName;
    }

    @Override
    public String toString() {
        return "{% extends "+ this.templateName + " %}\n";
    }
}
