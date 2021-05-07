import java.util.Scanner;

public class CharInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String input=sc.nextLine();
        System.out.print("Enter your character: ");
        String value=sc.nextLine();
        int count=0;
        for (int i=0; i<input.length();i++) {
            if(value.charAt(0)==input.charAt(i)){
                count++;
            }
        }

        System.out.println("Character "+value+" appear "+count+" times in string");
    }
}
