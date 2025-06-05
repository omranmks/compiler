package Angular.classes;

public class ExportClass {
    Class aClass;

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    @Override
    public String toString() {
        return "\nExportClass {" +
                "\nexport " +
                aClass +
                "\n}";
    }
}
