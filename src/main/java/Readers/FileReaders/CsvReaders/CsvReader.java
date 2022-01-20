package Readers.FileReaders.CsvReaders;

import Readers.FileReaders.FileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public abstract class CsvReader<T> extends FileReader {
    private static final String DELIMITER = ",";

    public CsvReader(File file) {
        super(file);
    }

    @Override
    public Set read() {
        HashSet<T> hashSet = new HashSet<>();
        try {
            BufferedReader br = Files.newBufferedReader(Path.of(this.getFile().getAbsolutePath()));
            String line = br.readLine();
            while ((line = br.readLine()) != null){
                String[] record = line.split(DELIMITER);
                T t =  recordToObj(record);
                hashSet.add(t);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hashSet;
    }

    public abstract T recordToObj(String[] record);


}
