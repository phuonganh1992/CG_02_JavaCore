public class BubbleSortByStep {
    public static void main(String[] args) {
        bubbleSortByStep(list);

    }
    public static int[]list={90,45,34,-5,7,9,24,30};
    public static void bubbleSortByStep(int[] list){
        boolean needNextPass=true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass=false;
            for (int j = 0 ; j < list.length-i ; j++) {
                if(list[j]> list[j+1]){
                    System.out.println("Swap " + list[j] + " with " + list[j + 1]);
                    int temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                    needNextPass=true;
                }
            }
            if (!needNextPass) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.print("List after the  " + i + "' sort: ");
            for (int element:list) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
