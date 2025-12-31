package models.jinja.atoms;

public class IntType extends Atom {
    public int value;

    public IntType(int value) {
        this.value = value;
    }

    public IntType(String value) {
        this.value = Integer.parseInt(value);
    }

    @Override
    public String toString() {
        return Integer.toString(this.value);
    }

    @Override
    public String print(int level) {
        return this.value + "\n";
    }
}
