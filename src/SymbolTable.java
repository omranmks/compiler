import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    List<Row> rows = new ArrayList<Row>();

    public List<Row> getRows() {
        return rows;
    }

    public void addRow(Row row) {
        this.rows.add(row);
    }

    public void print() {
        for (Row row : rows) {
            if (row != null) {
                System.out.println(row.getScope() + "\t\t" + row.getLine() + "\t\t" + row.getKey() + "\t\t" + row.getIdentifier() + "\t\t" + row.getType() + "\t\t" + row.getValue());
            }
        }
    }
}
