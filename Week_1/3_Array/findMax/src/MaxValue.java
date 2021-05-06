import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter array size: ");
            size = sc.nextInt();
            if(size>20) {
                System.out.println("Size should not exceed 20, pls re-enter!");
            }
        } while (size>20);
        int[] array=new int[size];
        for(int i=0;i<array.length;i++) {
            System.out.print("Enter element "+i+" : ");
            array[i]=sc.nextInt();
        }
        System.out.printf("%-20s%s","Elements in array is: ","");
        for(int a:array) {
            System.out.print(a+"\t");
        }
        int max=array[0];
        int index=0;
        for(int i=0;i<array.length;i++){
            if(max<array[i]) {
                max=array[i];
                index=i;
            }
        }
        System.out.println();
        System.out.println("Max value in array is: "+max+" at position: "+index);
    }
}
