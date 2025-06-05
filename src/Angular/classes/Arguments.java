package Angular.classes;

import java.util.ArrayList;
import java.util.List;

/*
Rule:
arguments:  LeftParenthesis
            (
                argument
                Comma
            )*
            argument?
            RightParenthesis;
 */
public class Arguments {
    List<Argument> argumentList = new ArrayList<>();

    public List<Argument> getArgumentList() {
        return argumentList;
    }

    public void setArgumentList(List<Argument> argumentList) {
        this.argumentList = argumentList;
    }

    public void addArgument(Argument argument) {
        this.argumentList.add(argument);
    }

    @Override
    public String toString() {
        String finalString = "";
        finalString += "Arguments {\n(";
        if (!argumentList.isEmpty()) {
            for (Argument arg : argumentList) {
                finalString += "\n";
                finalString += arg.toString();
                finalString += ",";
            }
        }
        finalString += "\n)\n}";
        return finalString;
    }
}
