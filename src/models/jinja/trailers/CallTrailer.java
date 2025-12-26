package models.jinja.trailers;

import models.Node;

public class CallTrailer extends Trailer{
    public Node argList;

    public CallTrailer(Node argList) {
        this.argList = argList;
    }

    @Override
    public String toString() {
        return (argList == null ? "" : "(" + argList.toString() + ")");
    }
}
