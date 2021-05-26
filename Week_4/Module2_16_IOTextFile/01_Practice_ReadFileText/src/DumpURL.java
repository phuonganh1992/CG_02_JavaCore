import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class DumpURL {
    public static void main(String[] args) {
        int [] a={2,3,5,7,9};
        try{
            URL url=new URL("https://codegym.vn/");
            URLConnection conn= url.openConnection();
            InputStream stream= conn.getInputStream();
            InputStreamReader streamReader=new InputStreamReader(stream);
            BufferedReader reader=new BufferedReader(streamReader);
            String line;
            while ((line= reader.readLine()) !=null){
                System.out.println(line);
            }
            reader.close();


        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

