package Writers.FileWriters.CsvWriters;

import Writers.FileWriters.FileWriter;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.io.IOException;
import java.util.List;

public abstract class CsvWriter<T> extends FileWriter {
    public CsvWriter(File file) {
        super(file);
    }

    @Override
    public void write(List list) {
        CsvMapper mapper = new CsvMapper();
        CsvSchema schema = createTable();
        ObjectWriter writer = createWriter(mapper, schema);
        try {
            writer.writeValues(this.getFile()).writeAll(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract CsvSchema createTable();

    public abstract ObjectWriter createWriter(CsvMapper mapper, CsvSchema schema);
}
