package Readers.FileReaders;

import Readers.Reader;

import java.io.File;
import java.util.Set;

public abstract class FileReader implements Reader {
    private File file;

    public FileReader(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public abstract Set read();
}
