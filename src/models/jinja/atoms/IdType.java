package models.jinja.atoms;

public class IdType extends Atom {
    public String name;

    public IdType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public String print(int level) {
        return this.name + "\n";
    }
}
