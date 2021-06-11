package file;


import java.io.IOException;
import java.util.List;

public interface FileIO<T>  {
    void writeToFile(String pathFile, List<T> list) throws IOException;
    List<T> readFromFile(String pathFile) throws IOException;


}
