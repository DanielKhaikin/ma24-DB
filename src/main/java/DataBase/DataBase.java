package DataBase;

import DataBase.Table.Table;

import java.util.HashMap;
import java.util.LinkedList;

public class DataBase {
    private LinkedList<Table> tables;
    private HashMap<Integer, Table> index = new HashMap<>();
    private int count = 0;

    public DataBase(LinkedList<Table> tables) {
        this.tables = tables;
    }

    public LinkedList<Table> getTables() {
        return tables;
    }

    public void setTables(LinkedList<Table> tables) {
        this.tables = tables;
    }

    public HashMap<Integer, Table> getIndex() {
        return index;
    }

    public void setIndex(HashMap<Integer, Table> index) {
        this.index = index;
    }
}
