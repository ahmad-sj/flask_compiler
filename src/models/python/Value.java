package models.python;

import models.Node;

import java.util.ArrayList;

public class Value extends Node {
    Node baseValue;
    ArrayList<Node> trailerList;

    public Value(Node baseValue, ArrayList<Node> trailerList) {
        this.baseValue = baseValue;
        this.trailerList = trailerList;
    }

    @Override
    public String toString() {
        StringBuilder trailers = new StringBuilder();

        if (trailerList != null) {
            for (int i = 0; i < trailerList.size(); i++) {
                trailers.append(trailerList.get(i));
            }
        }

        return baseValue.toString() + trailers.toString();
    }
}
