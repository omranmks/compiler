package Angular.classes;

/*
Rule:
variableDeclaration:  declaration?
                      identifier
                      type?;
 */
public class VariableDeclaration {
    Declaration declaration;
    Identifier identifier;
    Type type;

    public Declaration getDeclaration() {
        return declaration;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public Type getType() {
        return type;
    }

    public void setDeclaration(Declaration declaration) {
        this.declaration = declaration;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String finalString = "";
        finalString += "VariableDeclaration {";
        if (declaration != null)
            finalString += "\n" + declaration.toString();
        finalString += "\n" + identifier.toString();
        if (type != null)
            finalString += "\n" + type.toString();
        finalString += "\n}";
        return finalString;
    }
}
