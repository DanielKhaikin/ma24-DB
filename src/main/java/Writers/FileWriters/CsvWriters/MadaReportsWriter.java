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
                .addColumn("mdacode")
                .addColumn("idnum")
                .addColumn("idtype")
                .addColumn("firstName")
                .addColumn("lastName")
                .addColumn("city")
                .addColumn("street")
                .addColumn("buildingNumber")
                .addColumn("barcode")
                .addColumn("getDate")
                .addColumn("takeDate")
                .addColumn("resultDate")
                .build();
        return schema;
    }

    @Override
    public ObjectWriter createWriter(CsvMapper mapper, CsvSchema schema) {
        ObjectWriter writer = mapper.writerFor(MadaReport.class).with(schema);
        return writer;
    }
}
