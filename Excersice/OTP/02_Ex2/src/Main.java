import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManageDocument listBook=new ManageDocument();
        int choice;
        Scanner sc=new Scanner(System.in);
        do{
            menu();
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;

            }



        } while (choice>=1 && choice<=5);


    }
    static void menu(){
        System.out.println("\n========MENU===========");
        System.out.println("1. Add new document");
        System.out.println("2. Delete document");
        System.out.println("3. Display information");
        System.out.println("4. Search document");
        System.out.println("5. Exit");
    }
}
