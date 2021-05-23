
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerManagement customerManagement=new CustomerManagement();
        int choice;
        String keyMap;
        String customerName;

        Scanner sc=new Scanner(System.in);
        do{
            menu();
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    Customer customer= inputCustomerInformation();
                    keyMap=inputKey();
                    customerManagement.add(keyMap,customer);
                    break;
                case 2:
                    customerManagement.display();
                    break;
                case 3:
                    keyMap= inputKey();
                    System.out.println("The result of search by key "+keyMap+" is: "+customerManagement.findByKey(keyMap));
                    break;
                case 4:
                    customerName=inputName();
                    System.out.println("The result of search by key "+customerName+" is: "+customerManagement.findByName(customerName));
                    break;
                case 5:
                    customer=inputCustomerInformation();
                    keyMap=inputKey();
                    customerManagement.edit(keyMap,customer);
                    break;
                case 6:
                    keyMap= inputKey();
                    customerManagement.deleteByKey(keyMap);
                    break;
                case 7:
                    customerName=inputName();
                    customerManagement.deleteByName(customerName);
                    break;
                case 8:
                    customerManagement.sort();
                    break;
                case 9:
                    System.exit(0);
                    break;
            }
        }while (choice>=1 && choice<=7);

    }
    static void menu(){
        System.out.println("\n========MENU===========");
        System.out.println("1. Add new customer");
        System.out.println("2. Display customer");
        System.out.println("3. Find customer by key");
        System.out.println("4. Find customer by name");
        System.out.println("5. Edit customer by key");
        System.out.println("6. Delete customer by key");
        System.out.println("7. Delete customer by name");
        System.out.println("8. Sort customer map");
        System.out.println("9. Exit");
    }
    static Customer inputCustomerInformation(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String customerName=sc.nextLine();
        System.out.print("Enter customer age: ");
        int customerAge=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter customer address: ");
        String customerAddress=sc.nextLine();
        System.out.print("Enter customer Identity: ");
        String customerIdentity=sc.nextLine();
        System.out.print("Enter customer gender: ");
        int customerGender=sc.nextInt();
        return new Customer(customerName,customerAge,customerAddress,customerIdentity,customerGender);
    }
    static String inputKey(){
        Scanner sc=new Scanner(System.in);
        sc.nextLine();
        System.out.print("Enter key: ");
        return sc.nextLine();
    }
    static String inputName(){
        Scanner sc=new Scanner(System.in);
        sc.nextLine();
        System.out.print("Enter customer name: ");
        return sc.nextLine();

    }
}
