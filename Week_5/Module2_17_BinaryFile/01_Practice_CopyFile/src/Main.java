import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) {
        File sourceFile=new File("D:\\Java\\Week_5\\Module2_17_BinaryFile\\01_Practice_CopyFile\\src\\file\\Source.txt");
        File destFile=new File("D:\\Java\\Week_5\\Module2_17_BinaryFile\\01_Practice_CopyFile\\src\\file\\Dest.txt");
        try{
            copyFileUsingJava7Files(sourceFile,destFile);
            System.out.printf("Copy completed");
        }
        catch (IOException e){
            System.out.printf("Can't copy that file");
            System.out.printf(e.getMessage());
        }


        File sourceFile_2=new File("D:\\Java\\Week_5\\Module2_17_BinaryFile\\01_Practice_CopyFile\\src\\file\\Source2.txt");
        File destFile_2=new File("D:\\Java\\Week_5\\Module2_17_BinaryFile\\01_Practice_CopyFile\\src\\file\\Dest2.txt");

        try{
            copyFileUsingStream(sourceFile_2,destFile_2);
            System.out.printf("Copy completed");
        }
        catch (IOException e) {
            System.out.printf("Can't copy that file");
            System.out.printf(e.getMessage());
        }

    }
    public static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);

    }
    private static void copyFileUsingStream(File source, File dest) throws IOException{
        InputStream inputStream= new FileInputStream(source);
        OutputStream outputStream=new FileOutputStream(dest);
        byte [] buffer=new byte[1024];
        int length;
        while ((length=inputStream.read(buffer))>0){
            outputStream.write(buffer,0,length);
        }
        inputStream.close();
        outputStream.close();
    }
}

