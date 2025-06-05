package Angular.classes;

/*
Rule:
classMethod: (
                 Constructor    |
                 (
                    accessModifiers?
                    identifier
                 )
             )
             arguments
             type?
             block;
 */
public class ClassMethod {
    AccessModifiers accessModifiers;
    Identifier identifier;
    Arguments arguments;
    Type type;
    Block block;

    public AccessModifiers getAccessModifiers() {
        return accessModifiers;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public Arguments getArguments() {
        return arguments;
    }

    public Type getType() {
        return type;
    }

    public Block getBlock() {
        return block;
    }

    public void setAccessModifiers(AccessModifiers accessModifiers) {
        this.accessModifiers = accessModifiers;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public void setArguments(Arguments arguments) {
        this.arguments = arguments;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        String finalString = "";
        finalString += "ClassMethod {";
        if (accessModifiers != null) {
            finalString += "\n" + accessModifiers.toString();
            finalString += "\n" + identifier.toString();
        }else {
            finalString += "\nconstructor ";
        }
        finalString += arguments.toString();
        if (type != null)
            finalString += "\n" + type.toString();
        finalString += "\n" + block.toString();
        finalString += "\n}";
        return finalString;
    }
}
