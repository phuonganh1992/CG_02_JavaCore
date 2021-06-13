import controller.TaxiApp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        TaxiApp taxiApp = new TaxiApp();
        int choice_1;
        boolean check_1 = false;
        try {
            do {
                menu_1();
                System.out.print("Enter your choice 1: ");
                choice_1 = SCANNER.nextInt();
                switch (choice_1) {
                    case 1:
                        taxiApp.login();
                        int choice_2;
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
                                    break;
                                case 3:
                                    System.exit(0);
                                    break;
                            }
                        } while (choice_2<=3 && choice_2>=1);
                        check_1=true;
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
        System.out.println("1: Accept this taxi");
        System.out.println("2: Cancel");
    }

    private static void menu_4() {
        System.out.println("-----------------------------MENU_4---------------------------------");
        System.out.println("1: Have not arrived yet, keep going---------------------------------");
        System.out.println("2: Finished, pls make payment");
    }
}
