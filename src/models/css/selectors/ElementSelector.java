package models.css.selectors;

public class ElementSelector extends Selector{
    String elementName;

    public ElementSelector(String elementName) {
        this.elementName = elementName;
    }

    @Override
    public String toString() {
        return this.elementName;
    }
}
