import java.util.Scanner;

public class ElementSpice {
    public static void main(String[] args) {
        //init array
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        int size=sc.nextInt();
        int[]array=new int[size];
        for(int i=0;i<array.length;i++) {
            System.out.print("Enter element "+i+": ");
            array[i]=sc.nextInt();
        }
        System.out.printf("%-20s%s","Elements in array: ","");
        for (int a:array) {
            System.out.print(a+"\t");
        }
        //Enter number to delete
        System.out.print("\n"+"Enter number to delete: ");
        int x=sc.nextInt();

        //Check x is in array
        int index_del=indexValue(array,x);

        //Delete x out array
        int count=0;
        while(index_del!=-1) {
            for (int i = index_del; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1-count] = 0;
            count++;
            index_del=indexValue(array,x);
        }
        System.out.printf("%-20s%s","After delete, elements in array: ","");
        for (int a:array) {
            System.out.print(a+"\t");
        }
    }
    public static int indexValue(int[]arr,int x) {
        int index=-1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==x) {
                index=i;
                break;
            }
        }
        return index;
    }
}
