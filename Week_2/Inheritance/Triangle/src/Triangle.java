import java.util.Scanner;

public class Triangle extends Shape {
    private double side1=1;
    private double side2=1;
    private double side3=1;
    public Triangle(){
    }
    public Triangle(String color,boolean filled ,double a, double b, double c){
        super(color, filled);
        side1=a;
        side2=b;
        side3=c;
    }
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double[] get3Sides(){
        return new double[]{side1,side2,side3};
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }
    public double getArea(){
        double p=(side1+side2+side3)/2;
        double s=Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        return s;
    }
    @Override
    public String toString(){
        return "A Triangle with 3 sides {"+get3Sides()[0]+","+get3Sides()[1]+","+get3Sides()[2]+"}, perimeter= "+getPerimeter()+", area= "+getArea()+", which is subclass of "+super.toString();
    }
}
class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 sides: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter your color: ");
        String color=sc.nextLine();
        Triangle angle=new Triangle(color,true,a,b,c);
        System.out.println(angle);

        Triangle triangle2=new Triangle();
        System.out.println(triangle2);
    }



}