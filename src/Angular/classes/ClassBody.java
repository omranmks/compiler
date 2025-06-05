package Angular.classes;

import java.util.ArrayList;
import java.util.List;

public class ClassBody {
    List<ClassAttribute> classAttributeList = new ArrayList<>();
    List<ClassMethod> classMethodList = new ArrayList<>();

    public List<ClassAttribute> getClassAttributeList() {
        return classAttributeList;
    }

    public List<ClassMethod> getClassMethodList() {
        return classMethodList;
    }

    public void setClassAttributeList(List<ClassAttribute> classAttributeList) {
        this.classAttributeList = classAttributeList;
    }

    public void setClassMethodList(List<ClassMethod> classMethodList) {
        this.classMethodList = classMethodList;
    }

    public void addClassAttribute(ClassAttribute classAttribute) {
        this.classAttributeList.add(classAttribute);
    }

    public void addClassMethod(ClassMethod classMethod) {
        this.classMethodList.add(classMethod);
    }

    @Override
    public String toString() {
        String finalString = "";
        finalString += "ClassBody { {";
        if (!classAttributeList.isEmpty()) {
            for (ClassAttribute classAttribute : classAttributeList) {
                finalString += "\n";
                finalString += classAttribute.toString();
            }
        }
        if (!classMethodList.isEmpty()) {
            for (ClassMethod classMethod : classMethodList) {
                finalString += "\n";
                finalString += classMethod.toString();
            }
        }
        finalString += "\n} }";
        return finalString;
    }
}
