import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Queue<String> queueString=new LinkedList<String>();
        Stack<String> stackString=new Stack<String>();
        String palindrome="Able was I ere I saw Elba";
        String [] palindromeArray=palindrome.split("");
        for (String charPalindrome: palindromeArray) {
            queueString.add(charPalindrome);
        }
        System.out.println(queueString);
        for (String charPalindrome: palindromeArray) {
            stackString.add(charPalindrome);
        }
        System.out.println(stackString);




    }
}
