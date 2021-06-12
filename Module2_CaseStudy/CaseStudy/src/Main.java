import controller.TaxiApp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        TaxiApp taxiApp=new TaxiApp();
        int choice_1;
        try {
            do{
                menu_1();
                System.out.print("Enter your choice 1: ");
                choice_1=SCANNER.nextInt();
                switch (choice_1){
                    case 1:
                        taxiApp.login();
                        int choice_2;
                        do{
                            menu_2();
                            System.out.print("Enter your action : ");
                            choice_2=SCANNER.nextInt();
                            switch (choice_2){
                                case 1:
                                    taxiApp.findTaxi();
                                    break;
                                case 2:
                                    taxiApp.findHistory();
                                    break;
                                case 3:
                                    System.exit(0);
                                    break;
                            }


                        } while (choice_2>=1 && choice_2<=2);
                        break;
                    case 2:
                        taxiApp.register();

                        break;
                    case 3:
                        System.exit(0);
                        break;
                }

            }while (choice_1>=1 && choice_1<=2);

        }
        catch (InputMismatchException e){
            System.out.println("Input mismatch exception");
        }
    }
    public static void menu_1(){
        System.out.println("----------------MENU_1---------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");

    }
    public static void menu_2(){
        System.out.println("----------------MENU_2---------------");
        System.out.println("1. Find taxi");
        System.out.println("2. Find history");
        System.out.println("3. Exit");
    }
}
