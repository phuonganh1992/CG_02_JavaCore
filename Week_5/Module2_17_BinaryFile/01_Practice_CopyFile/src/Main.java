import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) throws IOException {
        File sourceFile=new File("D:\\Java\\Week_5\\Module2_17_BinaryFile\\01_Practice_CopyFile\\src\\file\\Source.txt");
        File destFile=new File("D:\\Java\\Week_5\\Module2_17_BinaryFile\\01_Practice_CopyFile\\src\\file\\Dest.txt");
        copyFileUsingJava7Files(sourceFile,destFile);

        File sourceFile_2=new File("D:\\Java\\Week_5\\Module2_17_BinaryFile\\01_Practice_CopyFile\\src\\file\\Source2.txt");
        File destFile_2=new File("D:\\Java\\Week_5\\Module2_17_BinaryFile\\01_Practice_CopyFile\\src\\file\\Dest2.txt");
        copyFileUsingStream(sourceFile_2,destFile_2);
    }
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
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
