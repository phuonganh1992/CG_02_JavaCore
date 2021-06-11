import controller.TaxiApp;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        TaxiApp taxiApp=new TaxiApp();
        int choice;
        do{
            menu();
            choice=SCANNER.nextInt();
            switch (choice){
                case 1:
                    taxiApp.login();
                    break;
                case 2:
                    break;
            }

        }while (choice>=1 && choice<=2);



    }
    public static void menu(){
        System.out.println("----------------MENU---------------");
        System.out.println("1. Login");
        System.out.println("2. Register");

    }
}
