package models.jinja.atoms;

public class StringType extends Atom {
    public String value;

    public StringType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @Override
    public String print(int level) {
        return this.value + "\n";
    }
}
