public class Solution {
    public void enqueue(Queue q,int value){
        Node temp=new Node(value);
        if(q.front==null){
            q.front=q.rear=temp;
        }
        q.rear.link=temp;
        q.rear=temp;

    }
    public void dequeue(Queue q){

        if(q.front==null) System.out.println("Queue is empty!");
        else ()

    }
    public void displayQueue(){

    }
}
