package Angular.classes;

/*
Rule:
string: SingleQuotationString   |
        DoubleQuotationString   |
        MultiLinesString;
 */

public class TypeString {
    String singleQuotationString;
    String doubleQuotationString;
    String multiLinesString;

    public String getSingleQuotationString() {
        return singleQuotationString;
    }

    public String getDoubleQuotationString() {
        return doubleQuotationString;
    }

    public String getMultiLinesString() {
        return multiLinesString;
    }

    public void setSingleQuotationString(String singleQuotationString) {
        this.singleQuotationString = singleQuotationString;
    }

    public void setDoubleQuotationString(String doubleQuotationString) {
        this.doubleQuotationString = doubleQuotationString;
    }

    public void setMultiLinesString(String multiLinesString) {
        this.multiLinesString = multiLinesString;
    }

    @Override
    public String toString() {
        if (singleQuotationString != null)
            return "TypeString { " +
                    "Single Quotation String = " + singleQuotationString +
                    " }";
        else if (doubleQuotationString != null)
            return "TypeString { " +
                    "Double Quotation String = " + doubleQuotationString +
                    " }";
        else
            return "TypeString { " +
                    "MultiLines String = " + multiLinesString +
                    " }";
    }
}
