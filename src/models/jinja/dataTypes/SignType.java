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
}
