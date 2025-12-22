package models.jinja.blocks.forBlock;

import models.jinja.JinjaId;
import models.jinja.blocks.JinjaStatement;

import java.util.ArrayList;

public class ForBlockStartStatement extends JinjaStatement {
    ForLoopVariables loopVariablesList;
    JinjaId iterable;

    public ForBlockStartStatement(ForLoopVariables loopVariablesList, JinjaId iterable) {
        this.loopVariablesList = loopVariablesList;
        this.iterable = iterable;
    }

    @Override
    public String toString() {
        return "{% for " + loopVariablesList.toString() + " in " + this.iterable + " %}";
    }
}
