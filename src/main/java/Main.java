import Parsers.MadaReport;
import Readers.FileReaders.CsvReaders.MadaReportReader;
import Writers.FileWriters.CsvWriters.MadaReportsWriter;

import java.io.File;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        File sourceFile = new File("C:\\Users\\Daniel\\BuildADB\\src\\main\\resources\\MadaReports.csv");
        File destFile = new File("C:\\Users\\Daniel\\HadogemHamatmidJson\\madarep.csv");
        MadaReportReader madaReportReader = new MadaReportReader<>(sourceFile);
        HashSet<MadaReport> madaReports = (HashSet<MadaReport>) madaReportReader.read();
        LinkedList<MadaReport> list = new LinkedList<>();
        for (MadaReport madaReport: madaReports ) {
            list.add(madaReport);
        }
        MadaReportsWriter madaReportsWriter = new MadaReportsWriter<>(destFile);
        madaReportsWriter.write(list);
        System.out.println(madaReports.size());
    }
}
