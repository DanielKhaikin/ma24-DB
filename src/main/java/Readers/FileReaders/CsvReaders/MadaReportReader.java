package Readers.FileReaders.CsvReaders;

import Parsers.MadaReport;

import java.io.File;

public class MadaReportReader<T> extends CsvReader{

    public MadaReportReader(File file) {
        super(file);
    }

    @Override
    public MadaReport recordToObj(String[] record) {
        String MDACODE = record[0];
        String IDNum = record[1];
        String IDType = record[2];
        String firstName = record[3];
        String lastName = record[4];
        String city = record[5];
        String street = record[6];
        String buildingNumber = record[7];
        String barCode = record[8];
        String getDate = record[9];
        String takeDate = record[10];
        String resultDate = record[11];
        return new MadaReport(MDACODE, IDNum, IDType, firstName, lastName, city, street, buildingNumber, barCode, getDate, takeDate, resultDate);
    }
}
