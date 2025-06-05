package Angular.classes;

public class Export {
    Identifier identifier;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "\nExport {" +
                "\n export" +
                "\n {" +
                "\n" + identifier.toString() +
                "\n }" +
                "\n ;" +
                "\n}";
    }
}
