package HTML.classes;



public class HTMLArrayElementAccessing {
    HTMLString typeString;
    HTMLNumber typeNumber;

    public HTMLString getTypeString() {
        return typeString;
    }

    public HTMLNumber getTypeNumber() {
        return typeNumber;
    }

    public void setTypeString(HTMLString typeString) {
        this.typeString = typeString;
    }

    public void setTypeNumber(HTMLNumber typeNumber) {
        this.typeNumber = typeNumber;
    }

    @Override
    public String toString() {
        if (typeString != null)
            return "\nArrayElementAccessing {" +
                    "\n, [" +
                    "\n, " + typeString.toString() +
                    "\n, ]" +
                    "\n}";
        else
            return "\nArrayElementAccessing{" +
                    "\n, [" +
                    "\n" + typeNumber.toString() +
                    "\n, ]" +
                    "\n}";
    }
}
