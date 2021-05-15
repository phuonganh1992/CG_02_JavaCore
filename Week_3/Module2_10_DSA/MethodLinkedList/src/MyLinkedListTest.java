import java.util.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
    MyLinkedList<Integer> linkedList=new MyLinkedList<Integer>(10);
    linkedList.addFirst(100);
    linkedList.add(0,15);
    linkedList.add(0,17);
    linkedList.add(0,19);
//    linkedList.add(0,21);
//    linkedList.add(1,30);
//    linkedList.add(2,35);
//    linkedList.add(5,40);
        System.out.println(linkedList.numNodes);
        linkedList.printList();
//        linkedList.addLast(300);
//        linkedList.add(13,400);
        linkedList.remove(2);

        System.out.println(linkedList.numNodes);
    linkedList.printList();

    }
}
