public class Main {
    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.front=queue.rear=null;
        Solution solution=new Solution();
        solution.enqueue(queue,10);
        solution.enqueue(queue,20);
        solution.enqueue(queue,30);
        solution.enqueue(queue,40);
        System.out.println("----------------------------------------");
        solution.displayQueue(queue);
        System.out.println("----------------------------------------");
        solution.dequeue(queue);
        solution.displayQueue(queue);
    }


}
