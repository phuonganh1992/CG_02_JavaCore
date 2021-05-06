import java.util.Scanner;

public class VND {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter USD: ");
        double usd=sc.nextDouble();
        double exchange_rate=23000;
        double vnd=usd*exchange_rate;
        System.out.println(usd+" USD is equivalent "+vnd+" VND");
    }
}
