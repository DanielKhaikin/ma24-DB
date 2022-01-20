import Parsers.MadaReport;
import Readers.FileReaders.CsvReaders.MadaReportReader;

import java.io.File;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Daniel\\BuildADB\\src\\main\\resources\\MadaReports.csv");
        MadaReportReader madaReportReader = new MadaReportReader<>(file);
        HashSet<MadaReport> madaReports = (HashSet<MadaReport>) madaReportReader.read();
        System.out.println(madaReports.size());
    }
}
