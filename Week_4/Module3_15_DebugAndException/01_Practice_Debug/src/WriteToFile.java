public class WriteToFile {
    public static void main(String[] args) {
        try{
            FileWriter.write("hello.txt","Hello!");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
