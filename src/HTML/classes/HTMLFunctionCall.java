package HTML.classes;
/*
Rule:
functionCall: identifier LeftParenthesis WhiteSpace* parameters? WhiteSpace* RightParenthesis;
 */

public class HTMLFunctionCall {
    HTMLIdentifier identifier;
    HTMLParameters parameters;

    public HTMLIdentifier getIdentifier() {
        return identifier;
    }

    public HTMLParameters getParameters() {
        return parameters;
    }

    public void setIdentifier(HTMLIdentifier identifier) {
        this.identifier = identifier;
    }

    public void setParameters(HTMLParameters parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        if (parameters != null)
            return "\nFunctionCall {" +
                    "\n, " + identifier.toString() +
                    "\n, (" +
                    "\n, " + parameters.toString() +
                    "\n, )" +
                    "\n}";
        else
            return "\nFunctionCall {" +
                    "\n, " + identifier.toString() +
                    "\n, (" +
                    "\n, )" +
                    "\n}";
    }
}
