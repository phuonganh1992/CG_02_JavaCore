public class SelectionSort {
    static int[] list = {1, 9, 4, 6, 5, -4,-1};
    static void selectionSort(int[] list){
        for (int i = 0; i < list.length-1; i++) {
            int currentMin=list[i];
            int currentMinIndex=i;
            for (int j = i+1; j < list.length; j++) {
                if (currentMin>list[j]){
                    currentMin=list[j];
                    currentMinIndex=j;
                }
            }
            if (currentMinIndex!=i){
                list[currentMinIndex]=list[i];
                list[i]=currentMin;
            }
        }
    }
    public static void main(String[] args) {
    selectionSort(list);
        System.out.println("List afert selection soring: ");
        for (int element:list) {
            System.out.print(element+"\t");
        }
    }
}
