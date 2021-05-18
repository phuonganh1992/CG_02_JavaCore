public class MyStack {
    private int[] arr;
    private int size;
    private int index;

    public MyStack(int size) {
        this.size = size;
        arr=new int[size];
    }
    public void push(int element){
        if(isFull()) System.out.println("Stack is full, unable to push item "+element);
        else {
            arr[index] = element;
            index++;
        }
    }
//    public int pop()throws Exception{
//        if(isEmpty()) throw new Exception("Stackk is null");
//        return arr[index-1];
//
//
//    }
    public int pop(){
        if(isEmpty()) {
            System.out.println("Stack is empy, unable pop element out of stack!");
            return 0;
        }
        else {
            int temp = arr[index - 1];
            index--;
            return temp;
        }
    }
    public int size(){
        return index;

    }
    public boolean isEmpty(){
        if(index==0) return true;
        return false;
    }
    public boolean isFull(){
        if(index==size) return true;
        return false;
    }
}
