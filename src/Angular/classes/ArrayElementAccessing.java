package Angular.classes;

/*
Rule:
arrayElementAccessing:  LeftSquareBracket
                        (
                            string |
                            number
                        )
                        RightSquareBracket;
 */
public class ArrayElementAccessing {
    TypeString typeString;
    TypeNumber typeNumber;

    public TypeString getTypeString() {
        return typeString;
    }

    public TypeNumber getTypeNumber() {
        return typeNumber;
    }

    public void setTypeString(TypeString typeString) {
        this.typeString = typeString;
    }

    public void setTypeNumber(TypeNumber typeNumber) {
        this.typeNumber = typeNumber;
    }

    @Override
    public String toString() {
        if (typeString != null)
            return "\nArrayElementAccessing {" +
                    "\n, [" +
                    "\n, " + typeString +
                    "\n, ]" +
                    "\n}";
        else
            return "\nArrayElementAccessing{" +
                    "\n, [" +
                    "\n, " + typeNumber +
                    "\n, ]" +
                    "\n}";
    }
}
