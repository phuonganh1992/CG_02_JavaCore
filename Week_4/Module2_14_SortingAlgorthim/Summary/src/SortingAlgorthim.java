public class SortingAlgorthim {
    public static void main(String[] args) {
        int[] arrays={10,9,3,7,5,-6,-3,7,1};
        bubbleSort_2(arrays);
        System.out.println("Array after sorting: ");
        for (int element:arrays) {
            System.out.print(element+"\t");
        }
    }
    public static void bubbleSort_2(int [] array){
        boolean needNextPass=true;
        for (int i = 1; i < array.length && needNextPass; i++) {
            System.out.println("i = "+i);
            needNextPass=false;
            for (int j = 0; j < array.length-i ; j++) {
                System.out.println("j = "+j);
                if(array[j]>array[j+1]){
                    System.out.println("j trong if "+j);
                    System.out.println("Swap "+array[j]+" with "+array[j+1]);
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    needNextPass=true;
                }
            }
            if(!needNextPass) System.out.println("Array do not need next step sort");
            System.out.println("Array after sort "+i);
            for (int element:array) {
                System.out.print(element+"\t");
            }
            System.out.println();

        }
    }
    public static void insertionSort(int[] array){
        int pos,x;
        for (int i = 1; i < array.length; i++) {
            x=array[i];
            pos=i;
            while (pos>0 && x<array[pos-1]){
                array[pos]=array[pos-1];
                pos--;
            }
            array[pos]=x;
        }
    }
    public static void selectionSort(int[] array){
        int min;
        for (int i = 0; i < array.length; i++) {
            min=i;
            for (int j = i; j < array.length ; j++) {
                if(array[min]>array[j]){
                    min=j;
                }
            }
            if (min!=i){
                int temp=array[min];
                array[min]=array[i];
                array[i]=temp;
            }

        }
    }
    public static void bubbleSort_1(int [] array){
        for (int i = 0; i < array.length ; i++) {
            for (int j = array.length-1; j >0 ; j--) {
                if(array[j]<array[j-1]){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }
    }

}
