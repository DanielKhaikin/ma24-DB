package Writers.FileWriters;

import Writers.Writer;

import java.io.File;

public abstract class FileWriter<T> implements Writer {
    private File file;

    public FileWriter(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
