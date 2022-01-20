package DataBase.Table;

import DataBase.Table.Record.Record;

import java.util.HashMap;
import java.util.LinkedList;

public abstract class Table<T> {
    private LinkedList<Record> records;
    private HashMap<Integer, Record> index = new HashMap<>();
    private int id;
    private int count;

    public Table(LinkedList<Record> records, int id) {
        this.records = records;
        this.id = id;
        this.count = 0;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public abstract void insertRecord(T data);

    public abstract void updateRecord(int recordId, int cellId, T data);

    public void deleteRecord(int id){
        Record record = this.index.get(id);
        this.index.remove(id);
        this.records.remove(record);
    }
}
