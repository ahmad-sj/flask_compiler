package models.jinja;

public class JinjaId {
    String idName;

    public JinjaId() {
    }

    public JinjaId(String idName) {
        this.idName = idName;
    }

    @Override
    public String toString() {
        return idName;
    }
}
