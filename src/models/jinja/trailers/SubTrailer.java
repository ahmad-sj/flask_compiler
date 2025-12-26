package models.jinja.trailers;

import models.Node;

/**
 *  atom subscription trailer
 * */
public class SubTrailer extends Trailer {
    public Node expr;

    public SubTrailer(Node expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "[" + expr.toString() + "]";
    }
}
