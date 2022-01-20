package DataBase.Table.Record.Cell;

public class Cell<T> {

    private T data;
    private int id;

    public Cell(T data, int id) {
        this.data = data;
        this.id = id;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
