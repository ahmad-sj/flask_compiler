package models.jinja.blocks;

public class ExtendsBlock extends JinjaBlock {
    public String templateName;

    public ExtendsBlock(String templateName) {
        this.templateName = templateName;
    }

    @Override
    public String toString() {
        return "{% extends "+ this.templateName + " %}\n";
    }
}
