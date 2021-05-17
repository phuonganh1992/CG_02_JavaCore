import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel=new Hotel();
        int choice;
        int index;
        String id;
        Scanner sc=new Scanner(System.in);
        do{
            menu();
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    Person person=new Person();
                    person.input();

                    hotel.add(person);
                    break;
                case 2:
                    System.out.print("Enter id of client to delete: ");
                    sc.nextLine();
                    id=sc.nextLine();
                    index=hotel.find(id);
                    if(index!=-1) hotel.delete(id);
                    else System.out.println("No client with id above, pls re-input");
                    break;
                case 3:
                    hotel.display();
                    break;
                case 4:
                    System.out.print("Enter id of client to search: ");
                    sc.nextLine();
                    id=sc.nextLine();
                    index=hotel.find(id);
                    if(index==-1) System.out.println("No client with id above, pls re-input");
                    else System.out.println(hotel.getPeople()[index]);
                    break;
                case 5:
                    System.out.print("Enter id of client to calculate the rental: ");
                    sc.nextLine();
                    id=sc.nextLine();
                    index=hotel.find(id);
                    if(index==-1) System.out.println("No client with id above, pls re-input");
                    else System.out.println("Rental is "+hotel.calculateRent(id));
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }while (choice>=1 && choice<=5);
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
