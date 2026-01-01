package models.css.selectors;

import models.Node;

import java.util.ArrayList;

public class GroupSelector extends Selector {
    ArrayList<Node> selectorList;

    public GroupSelector(ArrayList<Node> selectorList) {
        this.selectorList = selectorList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < selectorList.size(); i++) {
            stringBuilder.append(selectorList.get(i).toString());

            if (i + 1 < selectorList.size())
                stringBuilder.append(", ");
        }

        return stringBuilder.toString();
    }
}
