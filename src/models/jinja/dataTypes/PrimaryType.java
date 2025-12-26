package models.jinja.dataTypes;

import models.Node;

import java.util.ArrayList;

public class PrimaryType extends Node {
    Node atom;
    ArrayList<Node> trailerList;

    public PrimaryType(Node atom, ArrayList<Node> trailerList) {
        this.atom = atom;
        this.trailerList = trailerList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        if (trailerList != null){
            for (int i = 0; i < trailerList.size(); i++) {
                stringBuilder.append(trailerList.get(i).toString());

                if (i + 1 < trailerList.size())
                    stringBuilder.append(".");
            }
        }
        return atom.toString() + (stringBuilder.isEmpty()? "" : stringBuilder.toString());
    }
}
