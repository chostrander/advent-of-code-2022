import java.io.File;

public class DataFile {
    
    public File getFile() {
        File file = new File(this.getClass().getClassLoader().getResource("data_file.txt").getFile());
        return file;

    }
}
