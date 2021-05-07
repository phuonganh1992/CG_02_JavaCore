import java.util.Scanner;
public class MinInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        int size=sc.nextInt();
        int[] array=new int[size];
        for(int i=0;i<array.length;i++) {
            System.out.print("Enter element "+i+" : ");
            array[i]=sc.nextInt();
        }
        System.out.printf("%-20s%s","Elements in array is: ","");
        for(int a:array) {
            System.out.print(a+"\t");
        }
        int index=indexMinValue(array);
        System.out.println("The smallest element in array is: "+array[index]+" at position: "+index);
    }
    public static int indexMinValue(int[]arr){
        int min=arr[0];
        int index=0;
        for(int i=0;i<arr.length;i++) {
            if(min>arr[i]) {
                min=arr[i];
                index=i;
            }
        }
        return index;
    }

}
