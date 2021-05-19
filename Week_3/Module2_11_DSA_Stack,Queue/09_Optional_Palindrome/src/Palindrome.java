import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Queue<String> queueString=new LinkedList<>();
        Stack<String> stackString=new Stack<>();
        String palindrome="Able was I ere I saw Elba";
        String [] palindromeArray=palindrome.toLowerCase().split("");
        for (String charPalindrome: palindromeArray) {
            queueString.add(charPalindrome);
        }
        System.out.println("Chuỗi Queue: "+queueString);
        for (String charPalindrome: palindromeArray) {
            stackString.push(charPalindrome);
        }

        System.out.println("Chuỗi stack: "+stackString);

        for (int i = 0; i < palindromeArray.length; i++) {
            if(queueString.peek().equals(stackString.peek())) {
                queueString.remove();
                stackString.pop();
            }
        }
        if(queueString.isEmpty()) System.out.println("Your string is a palindrome");
    }
}
