import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.printf("Numerator:");
            int numerator = scanner.nextInt();
            System.out.printf("Denominator:");
            int denominator = scanner.nextInt();
            int result = numerator / denominator;
            System.out.printf("\nResult: %d / %d = %d \n", numerator, denominator, result);
        }
        catch (InputMismatchException e){
            System.out.println("Input error");
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic error");
        }

    }
}
