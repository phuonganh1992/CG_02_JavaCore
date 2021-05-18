import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> binaryStack=new Stack<Integer>();
        int number=111;
        while (number!=0){
            int item=number%2;
            binaryStack.push(item);
            number=number/2;
        }
        System.out.println("Stack is: ");
        for (int element:binaryStack) {
            System.out.print(element);
        }
        System.out.println();

        String st="";
        for (int i = 0; i < 7; i++) {

            st+=binaryStack.pop();
        }
        System.out.println("Present in Binary: "+st);

    }
}
