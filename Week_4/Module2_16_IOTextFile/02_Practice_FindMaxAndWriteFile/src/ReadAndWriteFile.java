import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile=new ReadAndWriteFile();
        List<Integer> list= readAndWriteFile.readFile("D:\\Java\\Week_4\\Module2_16_IOTextFile\\02_Practice_FindMaxAndWriteFile\\FindMaxNumber.txt");
        System.out.println(list);
        int max=findMax(list);
        System.out.println(max);
        readAndWriteFile.writeFile("WriteMax.txt",max);
    }
    public List<Integer> readFile(String pathFile){
        List<Integer> numbers=new ArrayList<>();
        try {
            File file=new File(pathFile);
            if(!file.exists()) throw new FileNotFoundException("Can not find file with path above");
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=null;
            while ((line= bufferedReader.readLine()) !=null) {
                numbers.add(Integer.parseInt(line));
            }
        }
        catch (Exception e){
            System.err.println("File does not exist or error content");
        }
        return numbers;
    }

    public void writeFile(String pathfile, int max){
        try {
            File file = new File(pathfile);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write("Max value in list is: "+max);
            bufferedWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static int findMax(List<Integer> numbers){
        int max=numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if(max<numbers.get(i)) max=numbers.get(i);
        }
        return max;
    }
}
