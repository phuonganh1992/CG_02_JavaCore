import java.io.*;
import java.util.List;

public class Main {
    static final String PATH_SOURCE_FILE="src/file/products.txt";
    static final String PATH_DEST_FILE="src/file/destFile.txt";
    public static void main(String[] args) {

        try {
            copyBinaryFile(PATH_SOURCE_FILE,PATH_DEST_FILE);
            readDataFromFile(PATH_SOURCE_FILE);
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
    }
    public static void copyBinaryFile(String souce,String dest) throws IOException {
        InputStream inputStream=new FileInputStream(souce);
        OutputStream outputStream=new FileOutputStream(dest);
        byte[] bytes=new byte[1024];
        int length;
        while ((length=inputStream.read(bytes))!=-1){
            outputStream.write(bytes,0,length);
        }
        inputStream.close();
        outputStream.close();
        System.out.println("File is copied successfully");
    }
}
