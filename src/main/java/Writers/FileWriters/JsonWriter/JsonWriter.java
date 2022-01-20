package Writers.FileWriters.JsonWriter;

import Writers.FileWriters.FileWriter;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonWriter<T> extends FileWriter {

    public JsonWriter(File file) {
        super(file);
    }

    @Override
    public void write(List list) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(this.getFile(), list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
