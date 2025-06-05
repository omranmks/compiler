package Angular.classes;

import java.util.ArrayList;
import java.util.List;

/*
Rule:
parameters: (
                parameter
                Comma
            )*
            parameter;
 */
public class Parameters {
    List<Parameter> parameterList = new ArrayList<>();

    public List<Parameter> getParameterList() {
        return parameterList;
    }

    public void setParameterList(List<Parameter> parameterList) {
        this.parameterList = parameterList;
    }

    public void addParameter(Parameter parameter) {
        this.parameterList.add(parameter);
    }


    @Override
    public String toString() {
        String finalString = "";
        finalString += "\nParameters {";
        if (!parameterList.isEmpty()) {
            finalString += "\nParameter List =";
            for (int i = 0; i < parameterList.size(); i++) {
                finalString += parameterList.get(i).toString();
                finalString += "\n ,";
            }
        }
        finalString += "\n}";
        return finalString;
    }
}
