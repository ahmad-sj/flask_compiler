package models.jinja.dataTypes;

import models.Node;

public class SignType extends Node {
    public String sign;

    public SignType(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return this.sign;
    }

    @Override
    public String print(int level) {
        return this.sign + "\n";
    }
}
