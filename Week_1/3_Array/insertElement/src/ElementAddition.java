import java.util.Scanner;

public class ElementAddition {
    public static void main(String[] args) {
        //init array
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        int size=sc.nextInt();
        int[]array=new int[size];
        for(int i=0;i<array.length;i++) {
            System.out.print("Enter element "+i+": ");
            array[i]=sc.nextInt();
        }
        System.out.printf("%-20s%s","Elements in array: ","");
        for (int a:array) {
            System.out.print(a+"\t");
        }

        //Enter number & index to insert
        System.out.print("\n"+"Enter number to insert: ");
        int x=sc.nextInt();
        int index;
        do {
        System.out.print("\n"+"Enter index of number to insert: ");
        index=sc.nextInt();
        if(index<=1 || index>=array.length-1) {
            System.out.println("Can not insert, pls re-enter");
        }
        } while (index<=1 || index>=array.length-1);

        //insert
        for (int i=array.length-1;i>index;i--){
            array[i]=array[i-1];

        }
        array[index]=x;
        //print new array;
        System.out.printf("%-20s%s","After insertion, elements in array: ","");
        for (int a:array) {
            System.out.print(a+"\t");
        }
    }
}
