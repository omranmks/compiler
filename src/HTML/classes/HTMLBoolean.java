package HTML.classes;
//boolean: True | False;
public class HTMLBoolean {
String atrue;
String afalse;

    public void setAtrue(String atrue) {
        this.atrue = atrue;
    }

    public void setAfalse(String afalse) {
        this.afalse = afalse;
    }

    public String getAtrue() {
        return atrue;
    }

    public String getAfalse() {
        return afalse;
    }

    @Override
    public String toString() {
        if (atrue != null)
            return "\nBoolean{" +
                    "\natrue='" + atrue + '\'' +
                    "\n}";
        return "\nBoolean{" +
                "\n, afalse='" + afalse + '\'' +
                "\n}";
    }
}
