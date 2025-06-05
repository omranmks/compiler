package Angular.classes;

/*
Rule:
whileBlock: whileStatement block;
 */
public class WhileBlock {
    WhileStatement whileStatement;
    Block block;

    public WhileStatement getWhileStatement() {
        return whileStatement;
    }

    public Block getBlock() {
        return block;
    }

    public void setWhileStatement(WhileStatement whileStatement) {
        this.whileStatement = whileStatement;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "\nWhileBlock{" +
                "\nwhileStatement=" + whileStatement.toString() +
                "\n, block=" + block.toString() +
                "\n}";
    }
}
