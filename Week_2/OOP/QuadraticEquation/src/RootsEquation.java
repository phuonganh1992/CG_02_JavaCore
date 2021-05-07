import java.util.Scanner;

public class RootsEquation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        double a=sc.nextDouble();
        System.out.print("Enter b: ");
        double b=sc.nextDouble();
        System.out.print("Enter c: ");
        double c=sc.nextDouble();
        QuadraticEquation equation=new QuadraticEquation(a,b,c);
        double delta=equation.getDiscriminant();
        if(delta>0){
            System.out.println("Equation has 2 roots");
            System.out.println("Root 1 is: "+equation.getRoot1());
            System.out.println("Root 2 is: "+equation.getRoot2());
        } else if(delta==0){
            System.out.println("Equation has 1 root: "+equation.getRoot1());
        } else System.out.println("The equation has no root");
    }
}
