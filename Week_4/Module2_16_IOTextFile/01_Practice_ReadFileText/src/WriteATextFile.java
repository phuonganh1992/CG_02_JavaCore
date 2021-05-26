import java.io.FileWriter;
import java.io.IOException;

public class WriteATextFile {
    public static void main(String[] args)  {
        try {
            FileWriter writer = new FileWriter("filenew.txt");
//        writer.write("Hello");
//        writer.close();
            writer.write(3);
            writer.write("haha");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
}
