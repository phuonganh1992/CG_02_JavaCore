import java.util.Arrays;
import java.util.Comparator;

public class ComparatorCircleTest {
    public static void main(String[] args) {
        Circle[] circles=new Circle[4];
        circles[0]=new Circle(4.0);
        circles[1]=new Circle();
        circles[2]=new Circle(5.0);
        circles[3]=new Circle(2.0,"red",false);
        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        Comparator a=new ComparatorCircle();

        Arrays.sort(circles,a);
        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
