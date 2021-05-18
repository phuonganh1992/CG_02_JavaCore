public class QueueClient {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(6);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.display();

        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
//        queue.enqueue(9);


        queue.display();


    }
}
