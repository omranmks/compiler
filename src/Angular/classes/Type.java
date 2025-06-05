package Angular.classes;

/*
Rule:
type: Colon
      (
        (
            String      |
            Number      |
            Boolean     |
            Any         |
            identifier  |
            objectType
        )
        (
            LeftSquareBracket
            RightSquareBracket
        )?
      ) |
      Void;
 */

public class Type {
    String typeString;
    String typeNumber;
    String typeBoolean;
    String typeAny;
    Identifier typeIdentifier;
    Object typeObject;
    String leftSquareBracket;
    String rightSquareBracket;
    String typeVoid;

    public String getTypeString() {
        return typeString;
    }

    public String getTypeNumber() {
        return typeNumber;
    }

    public String getTypeBoolean() {
        return typeBoolean;
    }

    public String getTypeAny() {
        return typeAny;
    }

    public Identifier getTypeIdentifier() {
        return typeIdentifier;
    }

    public Object getTypeObject() {
        return typeObject;
    }

    public String getLeftSquareBracket() {
        return leftSquareBracket;
    }

    public String getRightSquareBracket() {
        return rightSquareBracket;
    }

    public String getTypeVoid() {
        return typeVoid;
    }

    public String getType() {
        String finalString = "";
        if (typeVoid != null)
            return typeVoid;
        else {
            if (typeString != null)
                finalString += typeString;
            else if (typeNumber != null)
                finalString += typeNumber;
            else if (typeBoolean != null)
                finalString += typeBoolean;
            else if (typeAny != null)
                finalString += typeAny;
            else if (typeIdentifier != null)
                finalString += typeIdentifier.toString();
            else
                finalString += typeObject.toString();

            if (leftSquareBracket != null) {
                finalString += leftSquareBracket;
                finalString += rightSquareBracket;
            }
            return finalString;
        }
    }

    public void setTypeString(String typeString) {
        this.typeString = typeString;
    }

    public void setTypeNumber(String typeNumber) {
        this.typeNumber = typeNumber;
    }

    public void setTypeBoolean(String typeBoolean) {
        this.typeBoolean = typeBoolean;
    }

    public void setTypeAny(String typeAny) {
        this.typeAny = typeAny;
    }

    public void setTypeIdentifier(Identifier typeIdentifier) {
        this.typeIdentifier = typeIdentifier;
    }

    public void setTypeObject(Object typeObject) {
        this.typeObject = typeObject;
    }

    public void setLeftSquareBracket(String leftSquareBracket) {
        this.leftSquareBracket = leftSquareBracket;
    }

    public void setRightSquareBracket(String rightSquareBracket) {
        this.rightSquareBracket = rightSquareBracket;
    }

    public void setTypeVoid(String typeVoid) {
        this.typeVoid = typeVoid;
    }

    @Override
    public String toString() {
        String finalString = "";
        finalString += "Type {";
        finalString += " :";
        if (typeVoid != null)
            finalString += typeVoid;
        else {
            if (typeString != null)
                finalString += typeString;
            else if (typeNumber != null)
                finalString += typeNumber;
            else if (typeBoolean != null)
                finalString += typeBoolean;
            else if (typeAny != null)
                finalString += typeAny;
            else if (typeIdentifier != null)
                finalString += typeIdentifier.toString();
            else
                finalString += typeObject.toString();

            if (leftSquareBracket != null) {
                finalString += leftSquareBracket;
                finalString += rightSquareBracket;
            }
        }
        finalString += " }";
        return finalString;
    }
}
