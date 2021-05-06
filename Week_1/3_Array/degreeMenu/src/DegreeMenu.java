import java.util.Scanner;

public class DegreeMenu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        double fahrenheit;
        double celsius;
        do{
        System.out.println("Menu.");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter F: ");
                fahrenheit = sc.nextDouble();
                System.out.println("F to C: " + FToC(fahrenheit));
                break;
            case 2:
                System.out.print("Enter C: ");
                celsius = sc.nextDouble();
                System.out.println("C to F: " + CToF(celsius));
                break;
            case 0:
                System.exit(0);
                break;
        }
        } while (choice!=0);
    }
    public static double CToF(double celsius){
        double fahrenheit=(9.0/5)*celsius+32;
        return fahrenheit;
    }
    public static double FToC(double fahrenheit){
        double celsius=(5.0/9)*(fahrenheit-32);
        return celsius;
    }

}
