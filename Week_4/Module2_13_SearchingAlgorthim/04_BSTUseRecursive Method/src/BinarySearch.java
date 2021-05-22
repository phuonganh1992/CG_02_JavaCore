import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BinarySearch {
    static int[] arrays={1,3,30,89,10,45,7,20,40};
    static int binarySearch(int [] arrays,int left, int right,int value){
        while (left<=right){
            int middle=(left+right)/2;
            if(value==arrays[middle]) return middle;
            if(value<arrays[middle]) right=middle-1;
            else left=middle+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Arrays.sort(arrays);

        for (int element:arrays) {
            System.out.print(element+" ");
        }
        System.out.println();
        int left=0;
        int right=arrays.length-1;
        int value=45;
        System.out.println("Position of "+value+" is: "+binarySearch(arrays,left,right,value));



    }
}
