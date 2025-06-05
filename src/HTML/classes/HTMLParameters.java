package HTML.classes;


import java.util.ArrayList;
import java.util.List;

/*
Rule:

parameters: (
                WhiteSpace*
                parameter
                WhiteSpace*
                Comma
                WhiteSpace*
            )*
            parameter;
 */
public class HTMLParameters {
    List<HTMLParameter> parameterList = new ArrayList<>();

    public List<HTMLParameter> getParameterList() {
        return parameterList;
    }

    public void setParameterList(List<HTMLParameter> parameterList) {
        this.parameterList = parameterList;
    }

    public void addParameter(HTMLParameter parameter) {
        this.parameterList.add(parameter);
    }


    @Override
    public String toString() {
        String finalString = "";
        finalString += "\nParameters {";
        if (!parameterList.isEmpty()) {
            for (int i = 0; i < parameterList.size(); i++) {
                finalString += parameterList.get(i).toString();
                finalString += "\n ,";
            }
        }
        finalString += "\n}";
        return finalString;
    }
}
