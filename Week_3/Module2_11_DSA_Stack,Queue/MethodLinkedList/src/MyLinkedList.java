import org.omg.CosNaming.NamingContextPackage.NotEmpty;

public class MyLinkedList<E> {

    private int numNodes;
    private Node head;

    public MyLinkedList(Object data) {
        head=new Node(data);
    }
    public void add(int index, E element){
        Node tail=head;
        tail.next=new Node(element);

    }


    public class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
}
