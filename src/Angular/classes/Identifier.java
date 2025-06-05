package Angular.classes;

/*
Rule:
identifier: IDENTIFIER;
 */

public class Identifier {
    String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "Identifier { " + identifier + " }";
    }
}
