import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String PATH_FILE = "D:\\Java\\Week_4\\Module2_16_IOTextFile\\04_Excercise_ReadFileCsv\\src\\file\\FileFromNotepad.csv";

    public static void main(String[] args) {
        File file=new File(PATH_FILE);
        BufferedReader bufferedReader=null;
        try {
            if(!file.exists()) throw new FileNotFoundException("File is not found");
            FileReader fileReader=new FileReader(file);
            bufferedReader=new BufferedReader(fileReader);
            String line=null;

            while ((line= bufferedReader.readLine())!=null){

                display(parseCsvLine(line));
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try{
                if(bufferedReader != null) bufferedReader.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static List<String> parseCsvLine(String csvLine){
        List<String> result=new ArrayList<>();
        if (csvLine!=null){
            String[] splitData=csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }
    public static void display(List<String> country){
        System.out.println(
                "Country [id= "
                        + country.get(0)
                        + ", code= " + country.get(1)
                        + " , name=" + country.get(2)
                        + "]");
    }
}
