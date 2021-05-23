public class InsertionSort {
    public static void main(String[] args) {
        insertionSort(list);
        for (int element:list) {
            System.out.print(element+"\t");
        }
    }
    static int[] list={12,3,10,8,-2,56,-6,5,7};
    static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++) {
            int pos=i;
            int x=list[i];
            while (pos>0 && x<list[pos-1]){
                list[pos]=list[pos-1];
                pos--;
            }
            list[pos]=x;
            System.out.println("List after sorting "+i);
            for (int element:list) {
                System.out.print(element+"\t");
            }
            System.out.println();

        }
    }
}
