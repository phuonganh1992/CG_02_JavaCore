import java.util.Scanner;

public class StudentPass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;

        do {
            System.out.print("Enter a size:");
            size = sc.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);
        int[] array=new int[size];
        for(int i=0;i<array.length;i++) {
            System.out.print("Enter the mark of student "+i+": ");
            array[i]=sc.nextInt();
        }
        int count=0;
        System.out.println("List of mark: ");
        for(int a:array) {
            System.out.print(a+"\t");
            if(a>=5 && a<=10) {
                count++;
            }
        }
        System.out.println("\n The number of students passing in exam: "+count);
    }
}
