package HTML.classes;

/*
Rule:
propertyAccessing: identifier;
 */
public class HTMLPropertyAccessing {
    HTMLIdentifier identifier;

    public HTMLIdentifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(HTMLIdentifier identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "\nPropertyAccessing{" +
                 identifier.toString() +
                "\n}";
    }
}
