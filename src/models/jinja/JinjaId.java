package models.jinja;

import models.Node;

public class JinjaId extends Node {
    String idName;

    public JinjaId() {
    }

    public JinjaId(String idName) {
        this.idName = idName;
    }

    @Override
    public String toString() {
        return idName;
    }
}
