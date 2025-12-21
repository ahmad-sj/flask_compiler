package models.html.tags;

public class EndTag extends Tag {

    public EndTag(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "</" + this.name +">";
    }
}
