package Angular.classes;

/*
Rule:
elseStatement: Else block;
 */

public class ElseStatement {
    Block block;

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "\nElseStatement {" +
                "\n else" +
                "\n, " + block.toString() +
                "\n}";
    }
}
