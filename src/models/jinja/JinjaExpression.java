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
        if(this.filter != null){
            return this.filter + " " + this.id;
        }
        return this.id.toString();
    }

    @Override
    public String toString() {
        if(this.filter != null){
            return this.filter + " " + this.id;
        }
        return this.id.toString();
    }
}
