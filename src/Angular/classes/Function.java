package Angular.classes;

/*
Rule:
function:   functionDeclaration |
            (
                functionAccessing
                SemiColon
            );
 */
public class Function {
    FunctionDeclaration functionDeclaration;
    FunctionAccessing functionAccessing;

    public FunctionDeclaration getFunctionDeclaration() {
        return functionDeclaration;
    }

    public FunctionAccessing getFunctionAccessing() {
        return functionAccessing;
    }

    public void setFunctionDeclaration(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    public void setFunctionAccessing(FunctionAccessing functionAccessing) {
        this.functionAccessing = functionAccessing;
    }

    @Override
    public String toString() {
        if (functionDeclaration != null)
            return "Function {" +
                    functionDeclaration.toString() +
                    "\n}";
        else
            return "Function{" +
                    functionAccessing.toString() +
                    ";" +
                    "\n}";
    }
}
