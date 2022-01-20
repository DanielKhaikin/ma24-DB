package Writers.FileWriters;

import java.io.File;
import java.util.List;

public class CsvReaders<T> extends FileWriter{
    public CsvReaders(File file) {
        super(file);
    }

    @Override
    public void write(List list) {

    }
}
