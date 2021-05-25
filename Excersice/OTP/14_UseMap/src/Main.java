
import java.util.Scanner;

public class Main {
    public static final Scanner SC = new Scanner(System.in);

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
                    do {
                        keyMap = inputKey();
                        if(customerManagement.getCustomerMap().containsKey(keyMap)) System.out.println("Key exist, pls re-enter!");
                    }while (customerManagement.getCustomerMap().containsKey(keyMap));
                    Customer customer= inputCustomerInformation();
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
        }while (choice>=1 && choice<=9);

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
//    static void chooseKeyNameAge(){
//        
//        switch()
//        
//    }
    static Customer inputCustomerInformation(){
        Scanner SC= SC;
        System.out.print("Enter customer name: ");
        String customerName=SC.nextLine();
        System.out.print("Enter customer age: ");
        int customerAge=SC.nextInt();
        SC.nextLine();
        System.out.print("Enter customer address: ");
        String customerAddress=SC.nextLine();
        System.out.print("Enter customer Identity - string: ");
        String customerIdentity=SC.nextLine();
        System.out.print("Enter customer gender - int(0,1,2): ");
        int customerGender=SC.nextInt();
        return new Customer(customerName,customerAge,customerAddress,customerIdentity,customerGender);
    }
    static String inputKey(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter key - type string: ");
        return sc.nextLine();
    }
    static String inputName(){
        Scanner sc=new Scanner(System.in);
        sc.nextLine();
        System.out.print("Enter customer name: ");
        return sc.nextLine();

    }
}
