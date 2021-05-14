import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger=new MyList<Integer>(12);

        System.out.println("Số phần tử là: ");
        System.out.println(listInteger.size());
        listInteger.add(3,12);

        System.out.println("Số phần tử là: ");
        System.out.println(listInteger.size());

    }


}
