import javafx.scene.transform.Scale;

import java.util.Scanner;

public class ArrayConcat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // init first array
        System.out.print("Enter size of first array: ");
        int size_1=sc.nextInt();
        int [] array_1=new int[size_1];
        for(int i=0;i<array_1.length;i++) {
            System.out.print("Enter element "+i+": ");
            array_1[i]=sc.nextInt();
        }
        System.out.printf("%-20s%s","Elements in first array: ","");
        for (int a:array_1) {
            System.out.print(a+"\t");
        }
        System.out.println();

        //init second array
        System.out.print("Enter size of second array: ");
        int size_2=sc.nextInt();
        int [] array_2=new int[size_2];
        for(int i=0;i<array_2.length;i++) {
            System.out.print("Enter element "+i+": ");
            array_2[i]=sc.nextInt();
        }
        System.out.printf("%-20s%s","Elements in second array: ","");
        for (int a:array_2) {
            System.out.print(a+"\t");
        }
        System.out.println();

        //concat array 1 & array 2 to array 3;
        int size_3=size_1+size_2;
        int [] array_3=new int[size_3];
        for(int i=0;i<array_1.length;i++) {
            array_3[i]=array_1[i];
        }
        for(int i=0;i<array_2.length;i++) {
            array_3[array_1.length+i]=array_2[i];
        }
        System.out.printf("%-20s%s","Elements in third array: ","");
        for (int a:array_3) {
            System.out.print(a+"\t");
        }

    }
}
