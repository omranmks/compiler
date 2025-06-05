package HTML.classes;
/*
Rule:
interpolation: DoubleLeftCurlyBrace WhiteSpace* statement WhiteSpace* DoubleRightCurlyBrace;

 */
public class HTMLInterpolation {
    HTMLStatement statement;

    public HTMLStatement getStatement() {
        return statement;
    }

    public void setStatement(HTMLStatement statement) {
        this.statement = statement;
    }

    @Override
    public String toString() {
        return "\nInterpolation{" +
                "\n{{"  +
                statement.toString() +
                "\n}}" +
                "\n}";
    }
}
