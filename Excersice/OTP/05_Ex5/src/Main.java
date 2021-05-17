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
                    hotel.add();
                    break;
                case 2:
                    System.out.print("Enter id of client to delete: ");
                    sc.nextLine();
                    String idDelete=sc.nextLine();
                    int index=hotel.find(idDelete);
                    if(index!=-1) hotel.delete(idDelete);
                    else System.out.println("No client with id above, pls re-input");
                    break;
                case 3:
                    hotel.display();
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
