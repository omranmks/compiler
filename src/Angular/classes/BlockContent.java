package Angular.classes;

/*
Rule:
block:      variable    |
            function    |
            ifElseBlock |
            forBlock    |
            whileBlock  |
            return;
 */
public class BlockContent {
    Variable variable;
    Function function;
    IfElseBlock ifElseBlock;
    ForBlock forBlock;
    WhileBlock whileBlock;
    Return aReturn;

    public Variable getVariable() {
        return variable;
    }

    public Function getFunction() {
        return function;
    }

    public IfElseBlock getIfElseBlock() {
        return ifElseBlock;
    }

    public ForBlock getForBlock() {
        return forBlock;
    }

    public WhileBlock getWhileBlock() {
        return whileBlock;
    }

    public Return getaReturn() {
        return aReturn;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public void setIfElseBlock(IfElseBlock ifElseBlock) {
        this.ifElseBlock = ifElseBlock;
    }

    public void setForBlock(ForBlock forBlock) {
        this.forBlock = forBlock;
    }

    public void setWhileBlock(WhileBlock whileBlock) {
        this.whileBlock = whileBlock;
    }

    public void setaReturn(Return aReturn) {
        this.aReturn = aReturn;
    }

    @Override
    public String toString() {
        if (variable != null)
            return "BlockContent { {\n" +
                    variable.toString() +
                    "\n} }";
        else if (function != null)
            return "BlockContent { {\n" +
                    function.toString() +
                    "\n} }";
        else if (ifElseBlock != null)
            return "BlockContent { {\n" +
                    ifElseBlock.toString() +
                    "\n} }";
        else if (forBlock != null)
            return "BlockContent { {\n" +
                    forBlock.toString() +
                    "\n} }";
        else if (whileBlock != null)
            return "BlockContent { {\n" +
                    whileBlock.toString() +
                    "\n} }";
        else
            return "BlockContent { {\n" +
                    aReturn.toString() +
                    "\n} }";
    }
}
