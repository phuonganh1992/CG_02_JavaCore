import java.util.Scanner;

public class VariableBelongArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        int size=sc.nextInt();
        sc.nextLine();
        //initialize array
        String[] array=new String[size];
        for(int i=0;i<array.length;i++){
            System.out.print("Enter element "+i+":");
            array[i]=sc.nextLine();
        }
        System.out.printf("%-20s%s","Element in array: ","");
        for (String a:array) {
            System.out.print(a+"\t");
        }
        System.out.println();
        //Enter your string
        System.out.print("Enter your string: ");
        String variable=sc.nextLine();
        boolean belongArray=false;
        for(int i=0;i<array.length;i++) {
            if(array[i].equals(variable)) {
                belongArray=true;
                System.out.println(variable+" is in array "+" with index: "+i);
            }
        }
        if(!belongArray) System.out.println("Your string is not in array");

    }
}
