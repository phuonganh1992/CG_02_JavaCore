import java.util.Arrays;


public class BinarySearch {
    static int[] arrays={1,3,30,89,10,45,7,20,40};
    static int binarySearch(int [] array,int left, int right,int value){
        int middle=(left+right)/2;
        if (left<=right){
            if(value==arrays[middle]) return middle;
            if(value<arrays[middle]) return binarySearch(array,left,middle-1,value);
            else return binarySearch(array,middle+1,right,value);
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
