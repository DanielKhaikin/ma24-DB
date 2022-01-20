package DataBase.Table;

import java.util.HashMap;
import java.util.LinkedList;

public class Table {
    private LinkedList<Record> records;
    private HashMap<Integer, Record> index = new HashMap<>();
    private int id;
    private int count = 0;

    public Table(LinkedList<Record> records, int id) {
        this.records = records;
        this.id = id;
    }

    public LinkedList<Record> getRecords() {
        return records;
    }

    public void setRecords(LinkedList<Record> records) {
        this.records = records;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<Integer, Record> getIndex() {
        return index;
    }

    public void setIndex(HashMap<Integer, Record> index) {
        this.index = index;
    }
}
