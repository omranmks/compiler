package Angular.classes;

/*
Rule:
anonymousFunction:  arguments
                    type?
                    Arrow
                    block;
 */

public class AnonymousFunction {
    Arguments arguments;
    Type type;
    Block block;

    public Arguments getArguments() {
        return arguments;
    }

    public Type getType() {
        return type;
    }

    public Block getBlock() {
        return block;
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
            return "\nAnonymousFunction {" +
                    "\n" + arguments.toString() +
                    "\n," + type.toString() +
                    "\n, =>" +
                    "\n," + block.toString() +
                    "\n}";
        else
            return "\nAnonymousFunction {" +
                    "\n" + arguments.toString() +
                    "\n, =>" +
                    "\n," + block.toString() +
                    "\n}";
    }
}
