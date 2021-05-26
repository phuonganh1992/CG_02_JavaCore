import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SourceAndTargetFile {

    public static final String PATH_SOURCE_FILE = "D:\\Java\\Week_4\\Module2_16_IOTextFile\\03_Excercise_CopyFileText\\src\\File\\SourceFile.txt";
    public static final String PATH_TARGET_FILE = "D:\\Java\\Week_4\\Module2_16_IOTextFile\\03_Excercise_CopyFileText\\src\\File\\TargetFile.txt";

    public static void main(String[] args) {
        SourceAndTargetFile sourceAndTargetFile=new SourceAndTargetFile();
        sourceAndTargetFile.createSourceFile(PATH_SOURCE_FILE);
        sourceAndTargetFile.createTargetFile(PATH_TARGET_FILE);
        List<String> listReadFromSource= sourceAndTargetFile.readSourceFile(PATH_SOURCE_FILE);
        sourceAndTargetFile.writeTargetFile(PATH_TARGET_FILE,listReadFromSource);

    }
    public void createSourceFile(String pathFile){
        File file=new File(pathFile);
        try {
            FileWriter fileWriter=new FileWriter(file);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            fileWriter.write("I have a dream\n");
            fileWriter.write("I have passion for being a professional dev");
            bufferedWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public void createTargetFile(String pathFile){
        try {
            File file=new File(pathFile);
            if(file.exists()) System.out.println("Target file exists");
            FileWriter fileWriter=new FileWriter(file);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public List<String> readSourceFile(String pathFile) {
        List<String> list=new ArrayList<>();

        try{
            File file=new File(pathFile);
            if (!file.exists()) throw new FileNotFoundException("Found no file with pathfile: "+pathFile);
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=null;
            while ((line= bufferedReader.readLine())!=null){
                list.add(line);
            }
        }
        catch (IOException e){
            System.err.println("File not found or content error");
        }
        return list;
    }
    public void writeTargetFile(String pathFile,List<String> list){
        try{
            File file=new File(pathFile);
            FileWriter fileWriter=new FileWriter(file);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            for (String element:list) {
                bufferedWriter.write(element);
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
