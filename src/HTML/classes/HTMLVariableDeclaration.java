package HTML.classes;
/*
Rule:
variableDeclaration:  Let
                      WhiteSpace+
                      identifier;
 */
public class HTMLVariableDeclaration {
HTMLIdentifier identifier;

    public HTMLIdentifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(HTMLIdentifier identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "\n VariableDeclaration{" +
                "let " + identifier.toString() +
                '}';
    }
}
