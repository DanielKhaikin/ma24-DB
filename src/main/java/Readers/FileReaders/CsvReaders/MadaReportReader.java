package Readers.FileReaders.CsvReaders;

import Parsers.MadaReport;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MadaReportReader<T> extends CsvReader{
    private static final String pattern1 = "dd.MM.yyyy";
    private static final String pattern2 = "dd/MM/yyyy";

    public MadaReportReader(File file) {
        super(file);
    }

    @Override
    public MadaReport recordToObj(String[] record) {
        String MDACODE = record[0];
        String IDNum = record[1];
        int IDType = Integer.parseInt(record[2]);
        String firstName = record[3];
        String lastName = record[4];
        String city = record[5];
        String street = record[6];
        int buildingNumber = Integer.parseInt(record[7]);
        String barCode = record[8];
        Date getDate = null, takeDate = null, resultDate = null;
        try {
            getDate = new SimpleDateFormat(pattern1).parse(record[9]);
            takeDate = new SimpleDateFormat(pattern1).parse(record[10]);
            resultDate = new SimpleDateFormat(pattern2).parse(record[11]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new MadaReport(MDACODE, IDNum, IDType, firstName, lastName, city, street, buildingNumber, barCode, getDate, takeDate, resultDate);
    }
}
