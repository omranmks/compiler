package Angular.classes;
/*
Rule:
accessModifiers: Private    |
                 Public     |
                 Protected;
 */

public class AccessModifiers {
    String modifierPrivate;
    String modifierPublic;
    String modifierProtected;

    public String getModifierPrivate() {
        return modifierPrivate;
    }

    public String getModifierPublic() {
        return modifierPublic;
    }

    public String getModifierProtected() {
        return modifierProtected;
    }

    public void setModifierPrivate(String modifierPrivate) {
        this.modifierPrivate = modifierPrivate;
    }

    public void setModifierPublic(String modifierPublic) {
        this.modifierPublic = modifierPublic;
    }

    public void setModifierProtected(String modifierProtected) {
        this.modifierProtected = modifierProtected;
    }

    @Override
    public String toString() {
        if (modifierPrivate != null)
            return "AccessModifiers { " +
                    "Modifier = " + modifierPrivate +
                    " }";
        else if (modifierPublic != null)
            return "AccessModifiers { " +
                    "Modifier = " + modifierPublic +
                    " }";
        else
            return "AccessModifiers { " +
                    "Modifier = " + modifierProtected +
                    " }";
    }
}
