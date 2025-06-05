package Angular.classes;

/*
Rule:
argument: accessModifiers?
          identifier
          QuestionMark?
          type?;
 */

public class Argument {
    AccessModifiers accessModifier;
    Identifier identifier;
    String questionMark;
    Type type;

    public AccessModifiers getAccessModifier() {
        return accessModifier;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public String getQuestionMark() {
        return questionMark;
    }

    public Type getType() {
        return type;
    }

    public void setAccessModifier(AccessModifiers accessModifier) {
        this.accessModifier = accessModifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public void setQuestionMark(String questionMark) {
        this.questionMark = questionMark;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String finalString = "";
        finalString += "Argument { ";
        if (accessModifier != null)
            finalString += accessModifier.toString();
        finalString += " ";
        finalString += identifier.toString();
        if (questionMark != null)
            finalString += questionMark;
        finalString += " ";
        if (type != null)
            finalString += type.toString();
        finalString += " }";
        return finalString;
    }
}
