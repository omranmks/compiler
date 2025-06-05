package Angular.classes;

/*
Rule:
propertyAccessing: identifier;
 */
public class PropertyAccessing {
    Identifier identifier;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "\nPropertyAccessing{" +
                "\nidentifier=" + identifier.toString() +
                "\n}";
    }
}
