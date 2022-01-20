package DataBase.Table;

import DataBase.Table.Record.Cell.Cell;
import DataBase.Table.Record.Record;
import Parsers.MadaReport;
import java.util.LinkedList;

public class MadaReportsTable extends Table{

    private static final int ParamNum = 12;

    public MadaReportsTable(LinkedList linkedList, int id) {
        super(linkedList, id);
    }

    @Override
    public void insertRecord(Object data) {
        insertMadaReport((MadaReport) data);
    }

    public void insertMadaReport(MadaReport data){
        String MDACODE = data.getMDACODE();
        String IDNum = data.getIDNum();
        String IDType = data.getIDType();
        String firstName = data.getFirstName();
        String lastName = data.getLastName();
        String city = data.getCity();
        String street = data.getStreet();
        String buildingNumber = data.getBuildingNumber();
        String barcode = data.getBarcode();
        String getDate = data.getGetDate();
        String takeDate = data.getTakeDate();
        String resultDate = data.getResultDate();
        LinkedList<Cell> cells = new LinkedList<>();
        this.setCount(this.getCount()+ 1);
        Record record = new Record<>(cells,this.getCount());
        record.insertCell(MDACODE);
        record.insertCell(IDNum);
        record.insertCell(IDType);
        record.insertCell(firstName);
        record.insertCell(lastName);
        record.insertCell(cells);
        record.insertCell(city);
        record.insertCell(street);
        record.insertCell(buildingNumber);
        record.insertCell(barcode);
        record.insertCell(getDate);
        record.insertCell(takeDate);
        record.insertCell(resultDate);
        this.getRecords().add(record);
        this.getIndex().put(this.getCount(), record);
    }

    @Override
    public void updateRecord(int recordId, int cellId, Object data) {
        Record record = (Record) this.getIndex().get(recordId);
        record.updateCell(cellId, data);
    }
}
