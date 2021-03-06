import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger=new MyList<Integer>(15);
        System.out.println("Capacity is: "+listInteger.elements.length);
        System.out.println("Size is: "+listInteger.size());
//        listInteger.setSize(4);
        listInteger.print();
        listInteger.add(0,12);
        listInteger.add(1,15);
        listInteger.add(2,17);
        listInteger.add(3,19);
        listInteger.add(4,21);
        listInteger.add(5,23);
        listInteger.print();
        System.out.println("Size after add is: "+listInteger.size());
        System.out.println("Capacity after add is: "+listInteger.elements.length);

        System.out.println(listInteger.contains(20));
        System.out.println(listInteger.indexOf(21));
        MyList<Integer> copyList= (MyList<Integer>) listInteger.clone();

        System.out.println("copy list is: ");
        for (Object o: copyList.elements
             ) {
            System.out.println(o);
        }

        listInteger.remove(5);
        listInteger.print();
        System.out.println("Size after remove is: "+listInteger.size());
        System.out.println("Capacity after remove is: "+listInteger.elements.length);

        listInteger.clear();
        listInteger.print();
        System.out.println("Size after clear is: "+listInteger.size());
        System.out.println("Capacity after clear is: "+listInteger.elements.length);

        listInteger.ensureCapacity(50);
        System.out.println("Capacity is: "+listInteger.elements.length);
    }


}
