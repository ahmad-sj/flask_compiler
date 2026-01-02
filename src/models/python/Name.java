package models.python;

import models.Node;

import java.util.ArrayList;

public class Name extends Node {
    Node id; // of type IdType
    ArrayList<Node> trailerList; // list of type IdType

    public Name(Node id, ArrayList<Node> trailerList) {
        this.id = id;
        this.trailerList = trailerList;
    }

    @Override
    public String toString() {
        StringBuilder trailers = new StringBuilder();

        if (trailerList != null) {
            for (int i = 0; i < trailerList.size(); i++) {
                trailers.append(trailerList.get(i));

                if (i + 1 < trailerList.size())
                    trailers.append(".");
            }
        }
        
        return id.toString() + trailers;
    }
}
