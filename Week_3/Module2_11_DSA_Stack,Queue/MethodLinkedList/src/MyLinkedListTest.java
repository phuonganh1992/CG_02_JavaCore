public class MyLinkedListTest {
    public static void main(String[] args) {
    MyLinkedList<Integer> linkedList=new MyLinkedList<Integer>(10);
    linkedList.add(0,15);
    linkedList.add(0,17);
    linkedList.add(0,19);
    linkedList.add(0,21);
    linkedList.add(1,30);
    linkedList.printList();
    }
}
