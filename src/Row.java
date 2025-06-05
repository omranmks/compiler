public class Row {
    int scope;
    int line;
    String key; // Module, Decorator, Function, Variable
    String identifier;
    String type;
    String value;

    public Row(int scope, int line, String key, String identifier, String type, String value) {
        this.scope = scope;
        this.line = line;
        this.key = key;
        this.identifier = identifier;
        this.type = type;
        this.value = value;
    }

    public int getScope() {
        return scope;
    }

    public void setScope(int scope) {
        this.scope = scope;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
