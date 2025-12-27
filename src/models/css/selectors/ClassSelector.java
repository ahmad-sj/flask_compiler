package models.css.selectors;

public class ClassSelector extends Selector{
    String className;

    public ClassSelector(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "." + this.className;
    }
}
