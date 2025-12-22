package models.jinja;

import models.Node;

public class JinjaExpression extends Node {
    JinjaFilter filter;
    JinjaId id;

    public JinjaExpression() {
    }

    public JinjaExpression(JinjaId id) {
        this.id = id;
    }

    public JinjaExpression(JinjaFilter filter, JinjaId id) {
        this.filter = filter;
        this.id = id;
    }

    public String evaluate(){
        return "{{ "
                + (this.filter == null? "" : this.filter + " ")
                + this.id.toString()
                + " }}";
    }

    @Override
    public String toString() {
        return "{{ "
                + (this.filter == null? "" : this.filter + " ")
                + this.id.toString()
                + " }}";
    }
}
