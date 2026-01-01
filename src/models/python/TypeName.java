package models.python;

import models.Node;

public class TypeName extends Node {
    String nameString;

    public TypeName(String nameString) {
        this.nameString = nameString;
    }

    @Override
    public String toString() {
        return this.nameString;
    }
}
