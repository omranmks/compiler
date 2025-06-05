package Angular.classes;

/*
Rule:
functionCall: identifier LeftParenthesis parameters? RightParenthesis;
 */
public class FunctionCall {
    Identifier identifier;
    Parameters parameters;

    public Identifier getIdentifier() {
        return identifier;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public void setParameters(Parameters parameters) {
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
