package Angular.classes;

/*
Rule:
ifStatement: If LeftParenthesis conditions RightParenthesis block;
 */
public class IfStatement {
    Conditions conditions;
    Block block;

    public Conditions getConditions() {
        return conditions;
    }

    public Block getBlock() {
        return block;
    }

    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "\nIfElseStatement{" +
                "\n if" +
                "\n, (" +
                "\n, " + conditions.toString() +
                "\n, )" +
                "\n, " + block.toString() +
                "\n}";
    }
}
