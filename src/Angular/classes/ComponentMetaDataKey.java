package Angular.classes;

public class ComponentMetaDataKey {
    Identifier identifier;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "ComponentMetaDataKey { " +
                identifier.toString() +
                ":" +
                " }";
    }
}
