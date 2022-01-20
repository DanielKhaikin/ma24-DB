package DataBase.Table;

import DataBase.Table.Record.Record;
import Writers.FileWriters.CsvWriters.MadaReportsWriter;


import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;

public abstract class Table<T> {
    private LinkedList<Record> records;
    private HashMap<Integer, Record> index = new HashMap<>();
    private int id;
    private int count;
    private File file;

    public Table(LinkedList<Record> records, int id, File file) {
        this.records = records;
        this.id = id;
        this.count = 0;
        this.file = file;
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

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public abstract void insertRecord(T data);

    public abstract void updateRecord(int recordId, int cellId, T data);

    public void deleteRecord(int id){
        Record record = this.index.get(id);
        this.index.remove(id);
        this.records.remove(record);
        writeDB(this.file);
    }

    public void writeDB(File file){
        MadaReportsWriter madaReportsWriter = new MadaReportsWriter<>(file);
        madaReportsWriter.write(this.records);
    }
}
