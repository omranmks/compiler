package Angular.classes;

public class Class {
    Identifier identifier;
    ClassBody classBody;

    public Identifier getIdentifier() {
        return identifier;
    }

    public ClassBody getClassBody() {
        return classBody;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public void setClassBody(ClassBody classBody) {
        this.classBody = classBody;
    }

    @Override
    public String toString() {
        return "Class {" +
                "\nclass " +
                identifier.toString() +
                "\n" + classBody.toString() +
                "\n}";
    }
}
