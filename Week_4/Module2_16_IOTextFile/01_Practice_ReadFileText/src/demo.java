import java.io.IOException;

public class demo {
    public static void main(String[] args) {
//        System.out.println("out mess");
//        System.err.println("err mess");
        System.out.print("Enter a character: ");
        try {
            int i=System.in.read();
            System.out.println("Your enter is: ");
            System.out.println(i);
        }
        catch (IOException e){
            System.out.println("Error reading from user");
        }




    }
}
