package models.jinja.blocks.forBlock;

import models.jinja.blocks.JinjaStatement;

public class ForBlockEndStatement extends JinjaStatement {
    public ForBlockEndStatement() {
    }

    @Override
    public String toString() {
        return "{% endfor %}";
    }
}
