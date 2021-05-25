import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        CustomerManagement customerManagement=new CustomerManagement(avaiableMap());
        int choice;
        String keyMap;
        do{
            menu();
            System.out.print("Enter your choice: ");
            choice= SCANNER.nextInt();
            switch (choice){
                case 1:
                    do {
                        keyMap = inputKey();
                        if(customerManagement.getCustomerMap().containsKey(keyMap)) System.out.println("Key exist, pls re-enter!");
                    }while (customerManagement.getCustomerMap().containsKey(keyMap));
                    customerManagement.add(keyMap,inputCustomerInformation());
                    break;
                case 2:
                    customerManagement.display();
                    break;
                case 3:
                    findByKeyOrNameOrAgeRange(customerManagement);
                    break;
                case 4:
                    SCANNER.nextLine();
                    keyMap=inputKey();
                    customerManagement.edit(keyMap,inputCustomerInformation());
                    break;
                case 5:
                    deleteByKeyOrNameOrAgeRange(customerManagement);
                    break;
                case 6:
                    customerManagement.sort();
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        }while (choice>=1 && choice<=7);
    }

    private static void findByKeyOrNameOrAgeRange(CustomerManagement customerManagement) {
        String type;
        String customerName;
        String keyMap;
        do {
            type = inputType();
            switch (type){
                case "a":
                    keyMap= inputKey();
                    System.out.println("The result of search by key "+keyMap+" is: "+ customerManagement.findByKey(keyMap));
                    break;
                case "b":
                    customerName=inputName();
                    System.out.println("The result of search by name: ");
                    displayMap(customerManagement.findByName(customerName));
                    break;
                case "c":
                    System.out.print("Enter min Age: ");
                    int minAge=SCANNER.nextInt();
                    System.out.print("Enter max Age: ");
                    int maxAge=SCANNER.nextInt();
                    System.out.println("The result of search by age from "+minAge+" to "+maxAge);
                    displayMap(customerManagement.findAgeRange(minAge,maxAge));
                    break;
            }
        } while (type.equals("a") || type.equals("b") || type.equals("c"));
    }
    private static void deleteByKeyOrNameOrAgeRange(CustomerManagement customerManagement) {
        String type;
        String customerName;
        String keyMap;
        do {
            type = inputType();
            switch (type){
                case "a":
                    keyMap= inputKey();
                    customerManagement.deleteByKey(keyMap);
                    break;
                case "b":
                    customerName=inputName();
                    customerManagement.deleteByName(customerName);
                    break;
                case "c":
                    System.out.print("Enter min Age: ");
                    int minAge=SCANNER.nextInt();
                    System.out.print("Enter max Age: ");
                    int maxAge=SCANNER.nextInt();
                    customerManagement.deleteAgeRange(minAge,maxAge);
                    break;
            }
        } while (type.equals("a") || type.equals("b") || type.equals("c"));
    }

    private static String inputType() {
        String type;
        menuChooseKeyNameAge();
        System.out.print("Enter type:");
        SCANNER.nextLine();
        type=SCANNER.nextLine();
        if(!type.equals("a") && !type.equals("b") && !type.equals("c")) System.out.println("Wrong input, pls re-enter!");
        return type;
    }

    private static Map<String,Customer> avaiableMap() {
        Map<String,Customer> map=new LinkedHashMap<>();
        map.put("Cus001",new Customer("Hoa",20,"HN","ID001",0));
        map.put("Cus002",new Customer("Anh",29,"ND","ID002",0));
        map.put("Cus003",new Customer("Thanh",30,"BG","ID003",1));
        map.put("Cus004",new Customer("Nam",40,"DN","ID004",0));
        map.put("Cus005",new Customer("Tu",19,"HCM","ID005",1));
        map.put("Cus006",new Customer("Anh",19,"HCM","ID006",2));
        return map;
    }

    static void menu(){
        System.out.println("\n========MENU===========");
        System.out.println("1. Add new customer");
        System.out.println("2. Display customer");
        System.out.println("3. Find customer by key/ name/ ageRange");
        System.out.println("4. Edit customer by key");
        System.out.println("5. Delete customer by key/ name/ ageRange");
        System.out.println("6. Sort customer map");
        System.out.println("7. Exit");
    }
    static void menuChooseKeyNameAge(){
        System.out.println("a. By key");
        System.out.println("b. By name");
        System.out.println("c. By ageRange");
    }
    static Customer inputCustomerInformation(){
        System.out.println("Enter information of customer");
        System.out.print("Enter customer name: ");
        String customerName= SCANNER.nextLine();
        System.out.print("Enter customer age: ");
        int customerAge= SCANNER.nextInt();
        SCANNER.nextLine();
        System.out.print("Enter customer address: ");
        String customerAddress= SCANNER.nextLine();
        System.out.print("Enter customer Identity - string: ");
        String customerIdentity= SCANNER.nextLine();
        System.out.print("Enter customer gender - int(0,1,2): ");
        int customerGender= SCANNER.nextInt();
        return new Customer(customerName,customerAge,customerAddress,customerIdentity,customerGender);
    }
    static String inputKey(){
        System.out.print("Enter key (string): ");
        return SCANNER.nextLine();
    }
    static String inputName(){
        System.out.print("Enter customer name: ");
        return SCANNER.nextLine();
    }
    static void displayMap(Map<String,Customer>map){
        if(map.isEmpty()) System.out.println("Found no customer");
        else
            for (Map.Entry<String,Customer> entry: map.entrySet()) {
            System.out.println(entry);
        }
    }
}
