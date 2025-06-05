import java.io.FileWriter;
import java.util.*;

public class SemanticCheck {
    SymbolTable st;

    public SemanticCheck(SymbolTable st) {
        this.st = st;
    }

    public void CheckErrors() {
        try {
            FileWriter errors = new FileWriter(System.getProperty("user.dir") + "\\src\\Result\\Semantic.txt");
            LibsImporting(errors);
            VariableTypes(errors);
            Redeclare(errors);
            MissingComponent(errors);
            TemplateCompilation(errors);
            errors.flush();
            errors.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void LibsImporting(FileWriter file) {
        Set<String> moduleIdentifiers = new HashSet<>();
        for (Row row : this.st.getRows()) {
            if (RowType.Module.toString().equals(row.getKey()))
                moduleIdentifiers.add(row.getIdentifier());
        }

        for (Row row : this.st.getRows()) {
            String id = row.identifier.substring(1);
            if (RowType.Decorator.toString().equals(row.getKey()))
                if (!moduleIdentifiers.contains(id)) {
                    try {
                        file.append("Line: " + row.getLine() + "; " + "Cannot find name '" + id + "'.");
                        file.append("\n");
                    } catch (Exception e) {
                    }
                }
        }
    }

    private void VariableTypes(FileWriter file) {
        for (Row row : this.st.getRows()) {
            if (row.getKey() == RowType.Variable.toString())
                if (row.getValue() != null)
                    if (!row.getType().equals(row.getValue()) && row.getType() != "any")
                        try {
                            file.append("Line: " + row.getLine() + "; " + "Type '" + row.getValue() + "' is not assignable to type '" + row.getType() + "'.");
                            file.append("\n");
                        } catch (Exception e) {
                        }
        }
    }

    private void Redeclare(FileWriter file) {
        Map<String, Integer> varIdentifiers = new HashMap<>();
        for (Row row : this.st.getRows())
            if (row.getKey().equals(RowType.Variable.toString()) || row.getKey().equals(RowType.Attribute.toString())) {
                if (!varIdentifiers.containsKey(row.getIdentifier())) {
                    varIdentifiers.put(row.getIdentifier(), row.getScope());
                } else {
                    if (varIdentifiers.get(row.getIdentifier()) <= row.getScope())
                        try {
                            file.append("Line: " + row.getLine() + "; " + "Error: Cannot redeclare block-scoped variable '" + row.getIdentifier() + "'.");
                            file.append("\n");
                        } catch (Exception e) {
                        }
                    else
                        varIdentifiers.put(row.getIdentifier(), row.getScope());
                }

            }
    }

    private void MissingComponent(FileWriter file) {
        boolean flag = false;
        for (Row row : this.st.getRows()) {
            if (row.getKey().equals(RowType.Decorator.toString()) && row.getIdentifier().equals("@Component"))
                flag = true;

            else if (row.getKey().equals(RowType.Class.toString()) && !flag) {
                try {
                    file.append("Line: " + row.getLine() + "; " + "Unexpected value '" + row.getIdentifier() + "' declared by the module 'AppModule'. Please add a @Component annotation.");
                    file.append("\n");
                } catch (Exception e) {
                }
            }
        }
    }

    private void TemplateCompilation(FileWriter file) {
        Set<String> attribute = new HashSet<>();
        String component = "";
        for (Row row : this.st.getRows()) {
            if (row.getKey().equals(RowType.Attribute.toString()))
                attribute.add(row.getIdentifier());
            if (row.getKey().equals(RowType.Class.toString()))
                component = row.getIdentifier();
        }

        for (Row row : this.st.getRows())
            if (row.getKey().equals(RowType.Html.toString()))
                if (!attribute.contains(row.getIdentifier()))
                    try {
                        file.append("Template Line: " + row.getLine() + "; " + "Property '" + row.getIdentifier() + "' does not exist on type '" + component + "'.");
                        file.append("\n");
                    } catch (Exception e) {
                    }
    }
}
