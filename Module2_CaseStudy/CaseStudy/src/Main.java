import controller.AdminApp;
import controller.App;
import controller.TaxiApp;
import input.Input;
import model.Taxi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        TaxiApp taxiApp = new TaxiApp();
        AdminApp adminApp=new AdminApp();

        int choice_1;
        boolean check_1 = false;
        try {
            do {
                menu_1();
                System.out.print("Enter your choice 1: ");
                choice_1 = SCANNER.nextInt();
                SCANNER.nextLine();
                switch (choice_1) {
                    case 1:
                        if (app.login() == 1) {
                            int choice_2;
                            taxiApp.setClient(app.getClient());
                            do {
                                menu_2();
                                System.out.print("Enter your choice 2: ");
                                choice_2 = SCANNER.nextInt();
                                SCANNER.nextLine();
                                switch (choice_2) {
                                    case 1:
                                        taxiApp.makeOrder();
                                        int choice_3;
                                        boolean check_3=false;
                                        do {
                                            menu_3();
                                            System.out.print("Enter you choice 3: ");
                                            choice_3 = SCANNER.nextInt();
                                            switch (choice_3) {
                                                case 1:
                                                    taxiApp.acceptTaxi();
                                                    System.out.println("Meet driver, Taxi going ---------");
                                                    int choice_4;
                                                    boolean check_4=false;
                                                    do {
                                                        menu_4();
                                                        System.out.print("Enter your choice 4: ");
                                                        choice_4 = SCANNER.nextInt();
                                                        switch (choice_4) {
                                                            case 1:
                                                                System.out.println("------------------going----------------------");
                                                                break;
                                                            case 2:
                                                                taxiApp.payment();
                                                                check_4 = true;
                                                                break;
                                                        }
                                                    } while (!check_4);
                                                    check_3=true;
                                                    break;
                                                case 2:
                                                    taxiApp.rejectTaxi();
                                                    check_3=true;
                                                    break;
                                            }
                                        } while (!check_3);
                                        break;
                                    case 2:
                                        taxiApp.findHistory();
                                        System.out.print("Do you want to filter? Y/N: ");
                                        String answer=SCANNER.nextLine();
                                        if(answer.equals("Y")) {
                                            System.out.print("Enter start period - dd/MM/yyyy: ");
                                            String startPeriod=SCANNER.nextLine();
                                            System.out.print("Enter end period - dd/MM/yyyy: ");
                                            String endPeriod=SCANNER.nextLine();
                                            taxiApp.filterHistory(Input.inputDate(startPeriod),Input.inputDate(endPeriod));
                                        }
                                        break;
                                    case 3:
                                        System.exit(0);
                                        break;
                                }
                            } while (choice_2<=3 && choice_2>=1);
                            check_1=true;
                        } else {
                            System.out.println("Admin App");
                            adminFunction(adminApp);
                        }
                        break;
                    case 2:
                        taxiApp.register();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                }
            } while (!check_1);
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch exception");
        }
    }

    public static void menu_1() {
        System.out.println("-----------------------------MENU_1--------------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");

    }

    public static void menu_2() {
        System.out.println("-----------------------------MENU_2--------------------------------");
        System.out.println("1. Find taxi");
        System.out.println("2. Find history");
        System.out.println("3. Exit");
    }

    public static void menu_3() {
        System.out.println("-----------------------------MENU_3---------------------------------");
        System.out.println("1. Accept this taxi");
        System.out.println("2. Cancel");
    }

    public static void menu_4() {
        System.out.println("-----------------------------MENU_4---------------------------------");
        System.out.println("1. Have not arrived yet, keep going---------------------------------");
        System.out.println("2. Finished, pls make payment");
    }

    public static void menu_admin(){
        System.out.println("-----------------------------MENU_ADMIN---------------------------------");
        System.out.println("1. Add new taxi");
        System.out.println("2. Display taxi list");
        System.out.println("3. Update taxi");
        System.out.println("4. Delete taxi by taxi ID");
        System.out.println("5. Find taxi by taxi ID");
        System.out.println("6. Sort taxi");
        System.out.println("7. Display all order");
        System.out.println("8. Filter order by date");
        System.out.println("9. Exit");

    }
    public static void adminFunction(AdminApp adminApp){
        int adminChoice;
        boolean check_admin=false;
        do {
            menu_admin();
            System.out.print("Admin_Enter your choice: ");
            adminChoice = SCANNER.nextInt();
            SCANNER.nextLine();
            switch (adminChoice) {
                case 1:
                    Taxi taxi= Input.inputTaxi();
                    adminApp.createTaxi(taxi);
                    check_admin=true;
                    break;
                case 2:
                    adminApp.displayTaxi();
                    check_admin=true;
                    break;
                case 3:
                    int taxiIdUpdate=Input.inputTaxiIdToFind();
                    Taxi taxiUpdate=Input.inputTaxi();
                    adminApp.update(taxiIdUpdate,taxiUpdate);
                    check_admin=true;
                    break;
                case 4:
                    int taxiIDDelete=Input.inputTaxiIdToFind();
                    adminApp.deleteTaxi(taxiIDDelete);
                    check_admin=true;
                    break;
                case 5:
                    int taxiIDFind=Input.inputTaxiIdToFind();
                    Taxi taxiFind=adminApp.findById(taxiIDFind);
                    if(taxiFind==null) System.out.println("Found no taxi with id "+taxiIDFind);
                    else System.out.println(taxiFind);
                    check_admin=true;
                    break;
                case 6:
                    adminApp.sortTaxi();
                    System.out.println("Sorted successfully!");
                    check_admin=true;
                    break;
                case 7:
                    adminApp.displayOrder();
                    check_admin=true;
                    break;
                case 8:
                    System.out.print("Enter start date: ");
                    String startDateString=SCANNER.nextLine();
                    System.out.print("Enter end date: ");
                    String endDateString=SCANNER.nextLine();
                    adminApp.filterByDate(Input.inputDate(startDateString),Input.inputDate(endDateString));
                    check_admin=true;
                    break;
                case 9:
                    System.exit(0);
                    break;
            }
        } while (check_admin);

    }

}
