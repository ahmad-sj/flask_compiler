package models.jinja.trailers;

import models.Node;

public class MemberTrailer extends Trailer {
    Node id;

    public MemberTrailer(Node id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "." + this.id.toString();
    }
}
