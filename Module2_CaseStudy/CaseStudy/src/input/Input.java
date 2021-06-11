package input;

import model.Client;

import java.util.Scanner;

public class Input {
    public static final Scanner SCANNER = new Scanner(System.in);
//    public static Client inputClient(){
//    }

    public static void inputLogin(){
        String username=SCANNER.nextLine();
        String password=SCANNER.nextLine();
    }
}
