import java.util.Scanner;

public class MaxIn2DimensionArray {
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

        int x=0;
        int y=0;
        int max=array[0][0];
        for (int i=0;i<array.length;i++) {
            for(int j=0;j<array[i].length;j++) {
                if(max<array[i][j]){
                    max=array[i][j];
                    x=i;
                    y=j;
                }
            }
        }
        System.out.println("Max Value is: "+max+" at position ["+x+"]["+y+"]");
    }
}
