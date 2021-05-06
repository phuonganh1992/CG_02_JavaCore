import java.util.Scanner;

public class ArrayReversation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int size;
        do {
            System.out.print("Enter size: ");
            size=sc.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20!");
            }
        } while (size>20);
        int[] array=new int[size];
        for(int i=0;i<array.length;i++) {
            System.out.print("Enter element "+i+": ");
            array[i]=sc.nextInt();

        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int first=0;
        int last=array.length-1;
        while (first<=last){
            int temp= array[first];
            array[first]=array[last];
            array[last]=temp;
            first++;
            last--;
        }
        System.out.println();
        System.out.printf("%-20s%s","Elements in reverse array: ","");
        for (int a:array) {
            System.out.print(a+"\t");
        }





        }
    }

