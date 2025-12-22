package models.jinja;

import models.Node;

public class JinjaFilter extends Node {
    String formatString;

    public JinjaFilter() {
    }

    public JinjaFilter(String formatString) {
        this.formatString = formatString;
    }

    @Override
    public String toString() {
        return formatString;
    }
}
