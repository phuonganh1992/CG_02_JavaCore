import java.util.Scanner;

public class ShapeDraw {
    public static void main(String[] args) {
        int choice=-1;
        Scanner sc=new Scanner(System.in);
        while(choice!=0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, bottom-left, bottom-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    for (int i=0;i<3;i++) {
                        for(int j=0;j<7;j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    System.out.println("Top-left");
                    for(int i=7;i>0;i--) {
                        for(int j=1;j<i;j++){
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("Bottom-left");
                    for(int i=7;i>0;i--) {
                        for(int j=7;j>=i;j--){
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("Top-right");
                    for(int i=7;i>0;i--) {
                        for(int j=7;j>=i;j--){
                            System.out.print(" ");

                        }
                        for(int k=0;k<i;k++){
                            System.out.print("*");
                        }

                        System.out.print("\n");
                    }
                    System.out.println("Bottom-right");
                    for(int i=7;i>0;i--) {
                        for(int j=0;j<i;j++){
                            System.out.print(" ");

                        }
                        for(int k=7;k>i;k--){
                            System.out.print("*");
                        }

                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    for (int i=0; i<10; i++){
                        if(i % 2==0){
                            continue;
                        }
                        for (int j=10;j > i/2 ; j--){
                            System.out.print("-");
                        }
                        for (int k = 0;k < i;k++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
