public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head=0;
    private int tail=-1;
    private int currentSize=0;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        queueArr=new int[capacity];
    }

    public int[] getQueueArr() {
        return queueArr;
    }

    public void setQueueArr(int[] queueArr) {
        this.queueArr = queueArr;
    }

    public boolean isQueueFull(){
        if(currentSize==capacity) return true;
        return false;
    }
    public boolean isQueueEmpty(){
        if(currentSize==0) return true;
        return false;
    }
    public void enqueue(int item){
        if(isQueueFull()) System.out.println("Overflow! unable to add element "+item);
        else {
            tail++;
//            if(tail==capacity-1) tail=0;
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to queue!");
        }
    }
    public void dequeue(){
        if(isQueueEmpty()) System.out.println("Empty! unable to remove element to array");
        else {
            head++;
            if(head==capacity-1){
                System.out.println("Pop element is "+queueArr[head-1]);
                head=0;
            }
            else System.out.println("Pop element is "+queueArr[head-1]);
            currentSize--;
        }
    }
    public void display(){
        for (int i = 0; i < currentSize; i++) {
            System.out.println(queueArr[i]);
        }
    }
}
