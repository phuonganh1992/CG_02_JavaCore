import java.util.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
    MyLinkedList<Integer> linkedList=new MyLinkedList<Integer>(10);
        linkedList.addFirst(20);
        linkedList.addFirst(30);
        linkedList.addFirst(40);
        linkedList.addFirst(50);
        linkedList.printList();
        System.out.println();

        linkedList.remove(4);
        System.out.println(linkedList.numNodes);
        linkedList.printList();
        System.out.println();


    }
}
