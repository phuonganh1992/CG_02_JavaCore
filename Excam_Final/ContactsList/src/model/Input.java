package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import static model.Validation.*;


public class Input {
//    public static void main(String[] args) {
//
//    }
    public static final Scanner SCANNER=new Scanner(System.in);
    public static Contact inputContact() {
        System.out.println("Enter information of contact");
        String phoneNumber = inputPhoneNumber();
        System.out.print("Enter group: ");
        String group =SCANNER.nextLine();
        System.out.print("Enter name: ");
        String name =SCANNER.nextLine();
        System.out.print("Enter gender: ");
        String gender =SCANNER.nextLine();
        System.out.print("Enter address: ");
        String address =SCANNER.nextLine();
        String email=inputEmail();
        LocalDate dateOfBirth= inputDate();
        return new Contact(phoneNumber,group,name,gender,address,email,dateOfBirth);
    }


    public static String inputPhoneNumber() {
        String phoneNumber;
        do {
            System.out.print("Enter phoneNumber: ");
            phoneNumber=SCANNER.nextLine();
            if(!Validation.isValid(phoneNumber, PHONE_NUMBER_REGEX)) System.out.println("Invalid phone number!");
        } while (!Validation.isValid(phoneNumber, PHONE_NUMBER_REGEX));
        return phoneNumber;
    }


    public static String inputEmail() {
        String email;
        do {
            System.out.print("Enter email: ");
            email=SCANNER.nextLine();
            if(!Validation.isValid(email, EMAIL_REGEX)) System.out.println("Invalid email");
        } while (!Validation.isValid(email,EMAIL_REGEX));
        return email;
    }

    private static LocalDate inputDate() {
        String dateString;
        do {
            System.out.print("Enter date of birth (format dd/mm/yyyy): ");
            dateString = SCANNER.nextLine();
            if (!Validation.isValid(dateString, DATEOFBIRTH_REGEX))
                System.out.println("Invalid date!");
        } while (!Validation.isValid(dateString, DATEOFBIRTH_REGEX));
        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateString,dateTimeFormatter);
        return date;
    }
}
