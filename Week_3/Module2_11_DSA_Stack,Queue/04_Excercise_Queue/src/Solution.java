public class Solution {
    public void enqueue(Queue q, int value) {
        Node temp = new Node(value);
        Node q1 = q.front;
        if (q.front == null) {
            q.front = q.rear = temp;
        }
        q.rear.link = temp;
        q.rear = temp;
        q.rear.link = q.front;
    }

    public int dequeue(Queue q) {
        if (q.front == null) {
            System.out.println("Queue is empty!");
            return Integer.MIN_VALUE;
        }
        int value;
        if (q.front == q.rear) {
            value = q.front.data;
            q.front = null;
            q.rear = null;
//            return value;
        } else {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.link;
            q.rear.link = q.front;
//            return value;
        }
        return value;
    }

    public void displayQueue(Queue q) {
        Node temp = q.front;
        while (true) {
            System.out.println(temp.data);
            temp = temp.link;
            if (temp.link == q.front) {
                System.out.println(temp.data);
                break;
            }
        }
    }
}
