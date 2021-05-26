import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {
    void readFileText(String pathFile) {
        try {
            File file = new File("filenew.txt");
            if (!file.exists()) {
                throw new FileNotFoundException("Can not find this file");
            }
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String line=null;
//            int sum=0;
            while ((line= bufferedReader.readLine())!=null){
                System.out.println(line);
//                sum+=Integer.parseInt(line);
            }
            bufferedReader.close();
//            System.out.println("Sum= "+sum);

        }catch (Exception e){
            System.err.println("File is not found or error on content");
        }
    }

    public static void main(String[] args) {
        ReadFileExample readFileExample=new ReadFileExample();
        readFileExample.readFileText("Numbers.txt");

    }
}
