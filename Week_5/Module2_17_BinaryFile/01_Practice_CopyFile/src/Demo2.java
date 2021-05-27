import java.io.*;

public class Demo2 {
    public static void main(String[] args) throws IOException{
        File file=new File("D:\\Java\\Week_5\\Module2_17_BinaryFile\\01_Practice_CopyFile\\src\\file\\data.txt");
        FileWriter fileWriter=new FileWriter(file);
        fileWriter.write("hahaha");
        fileWriter.close();
//        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
//        FileReader fr = new FileReader("data.txt");
//        BufferedReader br = new BufferedReader(fr);
//
//        int i;
//        while ((i = br.read()) != -1) {
//            System.out.print((char) i);
//        }
//        br.close();
//        fr.close();
    }
}
