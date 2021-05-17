import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel=new Hotel();
        int choice;
        Scanner sc=new Scanner(System.in);
        do{
            menu();
            System.out.print("Enter your choice: ");
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
                    break;
                case 6:
                    System.exit(0);
                    break;

            }
        }while (choice>=1 && choice<=5)


    }
    static void menu(){
        System.out.println("\n========MENU===========");
        System.out.println("1. Add new client");
        System.out.println("2. Delete delete client");
        System.out.println("3. Display all client in hotel");
        System.out.println("4. Search client");
        System.out.println("5. Calculate rent");
        System.out.println("6. Exit");
    }


}
