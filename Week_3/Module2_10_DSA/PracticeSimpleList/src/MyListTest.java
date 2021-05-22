import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
    MyList<Integer> listInteger=new MyList<Integer>();
        listInteger.add(3);
        listInteger.add(5);
        listInteger.add(7);
        listInteger.add(9);
        listInteger.add(11);

        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));
        System.out.println(listInteger.size);

    }
}
