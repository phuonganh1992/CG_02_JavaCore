package input;

import model.Client;
import model.Validation;

import java.util.Scanner;

public class Input {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static Client inputClient(){
        Client client=new Client();
        Validation validation=new Validation();
        System.out.println("Enter client information");
        System.out.print("Enter client Id: ");
        int clientId=SCANNER.nextInt();
        SCANNER.nextLine();
        System.out.print("Enter client name: ");
        String clientName=SCANNER.nextLine();
        System.out.print("Enter client phone number: ");
        String clientPhoneNumber="";
        do{
            clientPhoneNumber=SCANNER.nextLine();
            if(!validation.isValid(clientPhoneNumber,validation.PHONE_NUMBER_REGEX)) System.out.println("Wrong format of phone number");
        }while (!validation.isValid(clientPhoneNumber,validation.PHONE_NUMBER_REGEX));

        System.out.print("Enter client address: ");
        String clientAddress=SCANNER.nextLine();
        System.out.print("Enter client username: ");
        String clientUsername;
        do{
            clientUsername=SCANNER.nextLine();
            if (!validation.isValid(clientUsername,validation.USER_NAME_REGEX)) System.out.println("Wrong format of username");
        } while (!validation.isValid(clientUsername,validation.USER_NAME_REGEX));

        System.out.println("Enter client password");
        String clientPassword;
        do{
            clientPassword=SCANNER.nextLine();
            if(!validation.isValid(clientPassword,validation.PASSWORD_REGEX)) System.out.println("Wrong format of password");
        } while (!validation.isValid(clientPassword,validation.PASSWORD_REGEX));

        return new Client(clientId,clientName,clientPhoneNumber,clientAddress,clientUsername,clientPassword);
    }
}
