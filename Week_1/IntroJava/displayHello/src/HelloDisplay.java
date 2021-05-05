import java.util.Scanner;

public class HelloDisplay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.printf("Hello: %s",name);
    }
}
