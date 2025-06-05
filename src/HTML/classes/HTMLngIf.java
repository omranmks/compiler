package HTML.classes;

/*
Rule:
ngIf: NgIf Equal DoubleQuotation WhiteSpace*
 (conditions | variableAccessing)
  WhiteSpace* DoubleQuotation;

 */
public class HTMLngIf {
    HTMLConditions condition;
    HTMLDataAccessing dataAccessing;

    public HTMLConditions getCondition() {
        return condition;
    }

    public HTMLDataAccessing getDataAccessing() {
        return dataAccessing;
    }

    public void setCondition(HTMLConditions condition) {
        this.condition = condition;
    }

    public void setDataAccessing(HTMLDataAccessing dataAccessing) {
        this.dataAccessing = dataAccessing;
    }

    @Override
    public String toString() {
        if (condition != null) {
            return "\nngIf{" +
                    "ngIf = \"" +
                    condition.toString() +
                    "\"" +
                    '}';
        }
        return "HTMLngIf{" +
                "ngIf = \"" +
                dataAccessing.toString() +
                "\"" +

                '}';
    }
}

