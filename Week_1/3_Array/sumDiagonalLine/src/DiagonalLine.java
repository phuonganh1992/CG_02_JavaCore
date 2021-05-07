import java.util.Scanner;

public class DiagonalLine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of square matrix: ");
        int size=sc.nextInt();
        System.out.println();

        int[][] array=new int[size][size];
        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array[i].length;j++){
                System.out.print("Enter element ["+i+"]["+j+"]: ");
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("Elements in Array: ");
        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+"  ");
            }
            System.out.println();
        }
        int total=0;
        for (int i=0;i< array.length;i++) {
            total+=array[i][i];
        }
        System.out.println("The sum of Diagonal Line in square matrix: "+total);
    }
}
