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
        int IDType = 
    }
}
