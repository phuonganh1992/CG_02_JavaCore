import org.omg.CosNaming.NamingContextPackage.NotEmpty;

public class MyLinkedList<E> {

    private int numNodes;
    private Node head;

    public MyLinkedList(Object data) {
        head=new Node(data);
    }
    public void add(int index, E element){
        if(index==0) addFirst(element);
        else if(index>=numNodes) addLast(element);
        else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            //curent ở index-1
            Node temp = current.next; //index
            current.next = new Node(element); //gán element vào index
            current.next.next = temp; //gán temp vào index+1
        }
    }
    public void addFirst(E element){
        Node temp=head;
        head=new Node(element);
        head.next=temp;
        numNodes++;

    }
    public void addLast(E element){

    }
    public void printList(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"\t");
            temp=temp.next;
        }
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
