import java.util.Scanner;

public class ColumnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows=sc.nextInt();
        System.out.println();
        System.out.print("Enter cols: ");
        int cols=sc.nextInt();
        System.out.println();
        int[][] array=new int[rows][cols];
        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array[i].length;j++){
                System.out.print("Enter element ["+i+"]["+j+"]: ");
                array[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.print("Enter col want to sum: ");
        int col=sc.nextInt();
        int total=0;
        for (int i=0;i<array.length;i++) {
            total+=array[i][col];
        }
        System.out.println("Total col "+col+" is: "+total);
    }
}
