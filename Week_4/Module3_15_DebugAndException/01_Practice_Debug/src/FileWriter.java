import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter {

    public static void write(String fileName, String s) throws FileNotFoundException{
        try {
            File file = new File(fileName);
            PrintWriter out = new PrintWriter(file);
            out.println(s);
            out.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
