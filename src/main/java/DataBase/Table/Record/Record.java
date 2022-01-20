package DataBase.Table.Record;

import DataBase.Table.Record.Cell.Cell;

import java.util.HashMap;
import java.util.LinkedList;

public class Record<T> {
    private LinkedList<Cell> cells;
    private HashMap<Integer, Cell> index = new HashMap<>();
    private int count = 0;
    private int id;

    public Record(LinkedList<Cell> cells, int id) {
        this.cells = cells;
        this.id = id;
    }

    public LinkedList<Cell> getCells() {
        return cells;
    }

    public void setCells(LinkedList<Cell> cells) {
        this.cells = cells;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void updateCell(int id, T data){
        Cell cell = this.index.get(id);
        this.cells.remove(cell);
        this.index.remove(id);
        cell.setData(data);
        this.cells.add(cell);
        this.index.put(id, cell);

    }

    public void insertCell(T data){
        this.count++;
        Cell cell = new Cell(data, this.count);
        this.cells.add(cell);
        this.index.put(this.count, cell);
    }

    public void deleteCell(int id){
        Cell cell = this.index.get(id);
        this.index.remove(id);
        this.cells.remove(cell);
    }
}
