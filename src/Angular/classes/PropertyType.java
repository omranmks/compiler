package Angular.classes;

public class PropertyType {
    Identifier identifier;
    Type type;

    public Identifier getIdentifier() {
        return identifier;
    }

    public Type getType() {
        return type;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PropertyType {" +
                " " +identifier.toString() +
                " " + type.toString() +
                " }";
    }
}
