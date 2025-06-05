package Angular.classes;

/*
Rule:
declaration: Let    |
             Const  |
             Var;
 */

public class Declaration {
    String declarationLet;
    String declarationConst;
    String declarationVar;

    public String getDeclarationLet() {
        return declarationLet;
    }

    public String getDeclarationConst() {
        return declarationConst;
    }

    public String getDeclarationVar() {
        return declarationVar;
    }

    public void setDeclarationLet(String declarationLet) {
        this.declarationLet = declarationLet;
    }

    public void setDeclarationConst(String declarationConst) {
        this.declarationConst = declarationConst;
    }

    public void setDeclarationVar(String declarationVar) {
        this.declarationVar = declarationVar;
    }

    @Override
    public String toString() {
        if (declarationLet != null)
            return "\nDeclaration{" +
                    "\ndeclarationLet='" + declarationLet + '\'' +
                    "\n}";
        else if (declarationConst != null)
            return "\nDeclaration{" +
                    "\ndeclarationConst='" + declarationConst + '\'' +
                    "\n}";
        else
            return "\nDeclaration{" +
                    "\ndeclarationVar='" + declarationVar + '\'' +
                    "\n}";
    }
}