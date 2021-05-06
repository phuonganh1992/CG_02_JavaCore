import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money=1.0;
        int month=1;
        double interest_rate=1.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter deposit amount: ");
        money=sc.nextDouble();
        System.out.println("Enter deposit month: ");
        month=sc.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interest_rate = sc.nextDouble();
        double total_interest=0;
        for(int i=0;i<month;i++) {
            total_interest+=money*(interest_rate/100)/12*month;
        }
        System.out.println("Total interest received: "+total_interest);
    }
}
