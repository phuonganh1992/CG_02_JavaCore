import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        try {
            System.out.println("Sides of triangle are: " + a + ", " + b + ", " + c);
            if (a < 0 || b<0 || c<0 || (a+b<=c) || (a+c<=b) || (b+c<=a)) {
                throw new IllegalTriangleException();
            }
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
