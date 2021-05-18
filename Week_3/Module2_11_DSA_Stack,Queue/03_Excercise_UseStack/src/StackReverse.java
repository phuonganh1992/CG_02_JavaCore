import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        System.out.println("-----------------------------INTEGER-----------------------------------");
        Stack<Integer> stackInteger = new Stack<>();
        int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original array is: ");
        for (int element:arrays) {
            System.out.print(element+"\t");
        }
        System.out.println();
        for (int i = 0; i < arrays.length; i++) {
            stackInteger.push(arrays[i]);
        }
        System.out.println("Stack is: ");
        for (Integer i : stackInteger) {
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println("Use pop to get element out of stack and put in to array: ");

        for (int element:arrays) {
            while ((!stackInteger.isEmpty())){
                element=stackInteger.pop();
                System.out.print(element+"\t");
            }
        }
        System.out.println();
        System.out.println("----------------------------STRING---------------------------------");
        Stack<String> stackString=new Stack<>();
        String st="Em co hai con vit";
        String[] mWord=st.split(" ");
        System.out.println("String array is: ");
        for (String element:mWord) {
            System.out.print(element+",");
        }
        System.out.println();
        System.out.println("stack is: ");
        for (String element:mWord){
            stackString.push(element);
        }
        for (String element:stackString) {
            System.out.print(element+",");
        }
        System.out.println();
        System.out.println("Use pop to get element out of stack and put in to array: ");
        for (String element:mWord) {
            while ((!stackString.isEmpty())){
                element=stackString.pop();
                System.out.print(element+",");
            }
        }
    }
}
