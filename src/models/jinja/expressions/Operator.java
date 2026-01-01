package models.jinja.expressions;

/*
 * arithmetic and logical operators
 * */
public class Operator extends Expression {
    public String operator;

    public Operator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return this.operator;
    }

    @Override
    public String print(int level) {
        return this.operator + "\n";
    }
}
