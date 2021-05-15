import org.omg.CosNaming.NamingContextPackage.NotEmpty;

public class MyLinkedList<E> {

    public int numNodes;
    private Node head;

    public MyLinkedList(Object data) {
        head=new Node(data);
        numNodes++;
    }
    public void add(int index, E element){
        if(index==0) addFirst(element);
        else if(index>=numNodes) addLast(element);
        else {
            Node current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            //curent trỏ tới vị trí index-1
            Node temp = current.next; //temp ở vị trí index
            current.next = new Node(element); //gán element vào vị trí index
            current.next.next=temp; //gán temp vào index+1
            numNodes++;
        }
    }
    public void addFirst(E element){
        Node temp=head; // link temp with head;
        head=new Node(element); // head point to new Node chứa element
        head.next=temp;
        numNodes++;
    }
    public void addLast(E element){
        Node current=head;
        for (int i = 1; i < numNodes; i++) {
            current=current.next; //current trỏ tới vị trí numNodes;
        }
        Node tail=current;
        tail.next=new Node(element);
        tail=tail.next;
        numNodes++;
    }
    public E remove(int index){
        if(index<0 || index>= numNodes) return null;
        else {
            Node previous=head;
            for(int i=1;i<index;i++){
               previous =previous.next;
            }
            Node current=previous.next;

            previous.next=current.next;
            numNodes--;

        }
        return null;
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
