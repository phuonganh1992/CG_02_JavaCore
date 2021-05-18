public class QueueClient {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(6);
        queue.enqueue(4);
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.enqueue(100);
        queue.dequeue();
        queue.enqueue(200);
//        System.out.println(queue);

        queue.display();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
//        queue.dequeue();
        queue.display();


//        queue.enqueue(24);
//        queue.dequeue();
//        queue.enqueue(98);
//        queue.enqueue(45);
//        queue.enqueue(23);
//        queue.enqueue(435);
    }
}
