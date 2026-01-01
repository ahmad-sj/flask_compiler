package models.css.selectors;

public class IdSelector extends Selector{
    String idName;

    public IdSelector(String idName) {
        this.idName = idName;
    }

    @Override
    public String toString() {
        return "#" + this.idName;
    }
}
