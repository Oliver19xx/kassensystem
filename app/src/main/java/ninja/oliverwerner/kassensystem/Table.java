package ninja.oliverwerner.kassensystem;

// TODO: 21.11.2016 Tisch-Klasse einbauen in den Programmablauf
public class Table {

    private int tableId;
    private String tableName;

    public Table(int tableId, String tableName){
        this.tableId = tableId;
        this.tableName = tableName;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
