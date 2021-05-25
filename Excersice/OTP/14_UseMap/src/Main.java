import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final String TYPE_A = "a";
    public static final String TYPE_B = "b";
    public static final String TYPE_C = "c";
    public static String keyMap;
    public static boolean isDuplicateKeyMap;

    public static void main(String[] args) {
        CustomerManagement customerManagement = new CustomerManagement(availableMap());
        int choice;
        do {
            menu();
            System.out.print("Enter your choice: ");
            choice = SCANNER.nextInt();
            SCANNER.nextLine();
            switch (choice) {
                case 1:
                    do {
                        keyMap = inputKey();
                        isDuplicateKeyMap = customerManagement.getCustomerMap().containsKey(keyMap);
                        if (isDuplicateKeyMap) System.out.println("Key exist, pls re-enter!");
                    } while (isDuplicateKeyMap);
                    customerManagement.add(keyMap, getCustomerInformation());
                    break;
                case 2:
                    customerManagement.display();
                    break;
                case 3:
                    findByKeyOrNameOrAgeRange(customerManagement);
                    break;
                case 4:
                    keyMap = inputKey();
                    customerManagement.edit(keyMap, getCustomerInformation());
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
        } while (choice >= 1 && choice <= 7);
    }

    static void menu() {
        System.out.println("\n========MENU===========");
        System.out.println("1. Add new customer");
        System.out.println("2. Display customer");
        System.out.println("3. Find customer by key/ name/ ageRange");
        System.out.println("4. Edit customer by key");
        System.out.println("5. Delete customer by key/ name/ ageRange");
        System.out.println("6. Sort customer map");
        System.out.println("7. Exit");
    }

    private static void findByKeyOrNameOrAgeRange(CustomerManagement customerManagement) {
        String customerName;
        String type = inputType();
        switch (type) {
            case "a":
                keyMap = inputKey();
                System.out.println("The result of search by key " + keyMap + " is: " + customerManagement.findByKey(keyMap));
                break;
            case "b":
                customerName = getCustomerName();
                System.out.println("The result of search by name: ");
                displayMap(customerManagement.findByName(customerName));
                break;
            case "c":
                System.out.print("Enter min Age: ");
                int minAge = SCANNER.nextInt();
                System.out.print("Enter max Age: ");
                int maxAge = SCANNER.nextInt();
                System.out.println("The result of search by age from " + minAge + " to " + maxAge);
                displayMap(customerManagement.findAgeRange(minAge, maxAge));
                break;
        }
    }

    private static void deleteByKeyOrNameOrAgeRange(CustomerManagement customerManagement) {
        String customerName;
        String type = inputType();
        switch (type) {
            case TYPE_A:
                keyMap = inputKey();
                customerManagement.deleteByKey(keyMap);
                break;
            case TYPE_B:
                customerName = getCustomerName();
                customerManagement.deleteByName(customerName);
                break;
            case TYPE_C:
                System.out.print("Enter min Age: ");
                int minAge = SCANNER.nextInt();
                System.out.print("Enter max Age: ");
                int maxAge = SCANNER.nextInt();
                customerManagement.deleteAgeRange(minAge, maxAge);
                break;
        }
    }

    private static String inputType() {
        String type;
        menuChooseKeyNameAge();
        boolean isWrongType;
        do {
            System.out.print("Enter type:");
            type = SCANNER.nextLine();
            isWrongType = !type.equals(TYPE_A) && !type.equals(TYPE_B) && !type.equals(TYPE_C);
            if (isWrongType) System.out.println("Wrong input, pls re-enter!");
        } while (isWrongType);
        return type;
    }

    static void menuChooseKeyNameAge() {
        System.out.println("a. By key");
        System.out.println("b. By name");
        System.out.println("c. By ageRange");
    }

    static Customer getCustomerInformation() {
        System.out.println("Enter information of customer");
        String customerName = getCustomerName();
        int customerAge = getCustomerAge();
        SCANNER.nextLine();
        String customerAddress = getCustomerAddress();
        String customerIdentity = getCustomerIdentity();
        int customerGender = getCustomerGender();
        return new Customer(customerName, customerAge, customerAddress, customerIdentity, customerGender);
    }

    private static int getCustomerGender() {
        int customerGender;
        boolean invalidCustomerGender;
        do {
            System.out.print("Enter customer gender - int(0,1,2): ");
            customerGender = SCANNER.nextInt();
            invalidCustomerGender = (customerGender != 0) && (customerGender != 1) && (customerGender != 2);
            if (invalidCustomerGender) System.out.println("Wrong input, pls enter gender by number 0,1 or 2!");
        } while (invalidCustomerGender);
        return customerGender;
    }

    private static String getCustomerIdentity() {
        System.out.print("Enter customer Identity - string: ");
        return SCANNER.nextLine();
    }

    private static String getCustomerAddress() {
        System.out.print("Enter customer address: ");
        return SCANNER.nextLine();
    }

    private static int getCustomerAge() {
        System.out.print("Enter customer age: ");
        return SCANNER.nextInt();
    }

    static String getCustomerName() {
        System.out.print("Enter customer name: ");
        return SCANNER.nextLine();
    }

    static String inputKey() {
        System.out.print("Enter key (string): ");
        return SCANNER.nextLine();
    }

    private static Map<String, Customer> availableMap() {
        Map<String, Customer> map = new LinkedHashMap<>();
        map.put("Cus001", new Customer("Hoa", 20, "HN", "ID001", 0));
        map.put("Cus002", new Customer("Anh", 29, "ND", "ID002", 0));
        map.put("Cus003", new Customer("Thanh", 30, "BG", "ID003", 1));
        map.put("Cus004", new Customer("Nam", 40, "DN", "ID004", 0));
        map.put("Cus005", new Customer("Tu", 19, "HCM", "ID005", 1));
        map.put("Cus006", new Customer("Anh", 19, "HCM", "ID006", 2));
        return map;
    }

    static void displayMap(Map<String, Customer> map) {
        if (map.isEmpty()) System.out.println("Found no customer");
        else
            for (Map.Entry<String, Customer> entry : map.entrySet()) {
                System.out.println(entry);
            }
    }
}
