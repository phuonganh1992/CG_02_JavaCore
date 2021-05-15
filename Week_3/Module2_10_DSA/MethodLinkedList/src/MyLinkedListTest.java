import java.util.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
    MyLinkedList<String> linkedList=new MyLinkedList<String>("em");
        linkedList.addFirst("anh");
        linkedList.addFirst("bo");
        linkedList.addFirst("me");
        linkedList.addFirst("con");
        linkedList.addFirst("meomeo");
        linkedList.addFirst("gaugau");
        linkedList.printList();
        System.out.println();
        linkedList.clear();
        System.out.println();
        System.out.println(linkedList.size()) ;







    }
}
