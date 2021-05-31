import java.io.*;
import java.util.List;

public class Main {
    static final String PATH_SOURCE_FILE="src/file/products.txt";
    static final String PATH_DEST_FILE="src/file/destFile.txt";
    public static void main(String[] args) {
        try {
            copyBinaryFile(PATH_SOURCE_FILE,PATH_DEST_FILE);
            System.out.println();
            readDataFromFile(PATH_SOURCE_FILE);
            readDataFromFile(PATH_DEST_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void readDataFromFile(String pathFile) throws IOException, ClassNotFoundException {
        InputStream inputStream=new FileInputStream(pathFile);
        int i;
        while ((i= inputStream.read())!=-1){
            System.out.print(i);
        }
        inputStream.close();
        System.out.println();
    }
    public static void copyBinaryFile(String source,String dest) throws IOException {
        File sourceFile=new File(source);
        if(!sourceFile.exists()) {
            System.out.println("File is not found!");
            sourceFile.createNewFile();
        }

        InputStream inputStream=new FileInputStream(sourceFile);
        System.out.println("Source File has length of: "+sourceFile.length());
        File destFile=new File(dest);
        if(destFile.exists()) System.out.println("Dest file exists!");
        System.out.println("Dest File has length of: "+destFile.length());
        OutputStream outputStream=new FileOutputStream(destFile);
        byte[] bytes=new byte[1024];
        int length;
        while ((length=inputStream.read(bytes))!=-1){
            outputStream.write(bytes,0,length);
        }
        inputStream.close();
        outputStream.close();
        System.out.println("File is copied successfully");
        System.out.println("Dest File has length of: "+destFile.length());
    }
}
