package models.jinja;

public class JinjaFilter {
    String formatString;

    public JinjaFilter() {
    }

    public JinjaFilter(String formatString) {
        this.formatString = formatString;
    }

    @Override
    public String toString() {
        return formatString;
    }
}
