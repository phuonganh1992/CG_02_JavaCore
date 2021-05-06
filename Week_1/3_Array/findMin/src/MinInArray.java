import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array={100,35,5,7,30,13,15,17};
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
