public class BubbleSort2 {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    static void bubbleSort2(int[] list){
        boolean needNextPass = true;
        for (int i = 0; i < list.length && needNextPass  ; i++) {
            needNextPass=false;
            for (int j = 0; j < list.length-i; j++) {
                if(list[j]>list[j+1]){
                    int temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort2(list);
        for (int element:list) {
            System.out.print(element+" ");
        }
    }
}
