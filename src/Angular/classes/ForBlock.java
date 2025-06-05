package Angular.classes;

public class ForBlock {
    ForStatment forStatment;
    Block block;

    public ForStatment getForStatment() {
        return forStatment;
    }

    public Block getBlock() {
        return block;
    }

    public void setForStatment(ForStatment forStatment) {
        this.forStatment = forStatment;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "ForBlock {" +
                "\n" + forStatment.toString() +
                "\n" + block.toString() +
                "\n}";
    }
}
