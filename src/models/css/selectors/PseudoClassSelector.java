package models.css.selectors;

import models.Node;

public class PseudoClassSelector extends Selector{
    Node selector;
    String state; //like :hover, :active, ...

    public PseudoClassSelector(Node selector, String state) {
        this.selector = selector;
        this.state = state;
    }

    @Override
    public String toString() {
        return selector.toString() + ":" + state;
    }
}
