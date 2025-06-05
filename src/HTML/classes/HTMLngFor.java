package HTML.classes;

/*
Rule:
ngFor: NgFor Equal DoubleQuotation WhiteSpace*
        (
            forStatment
            WhiteSpace*
            SemiColon
            WhiteSpace*
        )?
        forStatment
        WhiteSpace* DoubleQuotation;
 */
public class HTMLngFor {
HTMLForStatement forStatement;
HTMLForStatement secondForStatement;

    public HTMLForStatement getForStatement() {
        return forStatement;
    }

    public HTMLForStatement getSecondForStatement() {
        return secondForStatement;
    }

    public void setForStatement(HTMLForStatement forStatement) {
        this.forStatement = forStatement;
    }

    public void setSecondForStatement(HTMLForStatement secondForStatement) {
        this.secondForStatement = secondForStatement;
    }

    @Override
    public String toString() {
        if(forStatement!=null){
            return "\nngFor{" +
                    "ngFor = \"" +
                    forStatement.toString() +
                     secondForStatement.toString() +
                    "\""+
                    '}';
        }
        return "\nngFor{" +
                "ngFor = \"" +
                 secondForStatement.toString() +
                "\""+
                '}';
    }
}
