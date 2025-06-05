package Angular.classes;

/*
Rule:
functionDeclaration: Function
                     identifier
                     arguments
                     type?
                     block;
 */
public class FunctionDeclaration {
    String keyWordFunction;
    Identifier identifier;
    Arguments arguments;
    Type type;
    Block block;

    public String getKeyWordFunction() {
        return keyWordFunction;
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

    public void setKeyWordFunction(String keyWordFunction) {
        this.keyWordFunction = keyWordFunction;
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
        if (type != null)
            return "\nFunctionDeclaration{" +
                    "\nkeyWordFunction='" + keyWordFunction + '\'' +
                    "\n, identifier=" + identifier.toString() +
                    "\n, arguments=" + arguments.toString() +
                    "\n, type=" + type.toString() +
                    "\n, block=" + block.toString() +
                    "\n}";
        else
            return "\nFunctionDeclaration{" +
                    "\nkeyWordFunction='" + keyWordFunction + '\'' +
                    "\n, identifier=" + identifier.toString() +
                    "\n, arguments=" + arguments.toString() +
                    "\n, block=" + block.toString() +
                    "\n}";
    }
}
