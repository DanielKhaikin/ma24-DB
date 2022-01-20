package Writers.FileWriters.CsvWriters;

import Parsers.MadaReport;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;

public class MadaReportsWriter<T> extends CsvWriter{
    public MadaReportsWriter(File file) {
        super(file);
    }

    @Override
    public CsvSchema createTable() {
        CsvSchema schema = CsvSchema.builder().setUseHeader(true)
                .addColumn("MDACODE")
                .addColumn("IDNum")
                .addColumn("IDType")
                .addColumn("FirstName")
                .addColumn("LastName")
                .addColumn("City")
                .addColumn("Street")
                .addColumn("BuildingNumber")
                .addColumn("Barcode")
                .addColumn("GetDate")
                .addColumn("TakeDate")
                .addColumn("ResultDate")
                .build();
        return schema;
    }

    @Override
    public ObjectWriter createWriter(CsvMapper mapper, CsvSchema schema) {
        ObjectWriter writer = mapper.writerFor(MadaReport.class).with(schema);
        return writer;
    }
}
