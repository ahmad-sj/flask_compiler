package models.jinja.dataTypes;

import models.Node;

public class IdType extends Node {
    public String name;

    public IdType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public String print(int level) {
        return this.name;
    }
}
