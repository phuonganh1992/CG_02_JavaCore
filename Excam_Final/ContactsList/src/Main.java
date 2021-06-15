import file.ContactIO;
import model.Contact;
import model.Input;
import service.ContactManagement;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactManagement contactManagement=new ContactManagement();
        Scanner scanner=new Scanner(System.in);
        int choice;
        do {
            menu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Contact list is as below: ");
                    contactManagement.display();
                    break;
                case 2:
                    Contact contact= Input.inputContact();
                    contactManagement.create(contact);
                    System.out.println("Add new contact successfully!");
                    break;
                case 3:
                    String phoneNumberUpdate=Input.inputPhoneNumber();
                    Contact contactUpdate=Input.inputContact();
                    contactManagement.update(phoneNumberUpdate,contactUpdate);
                    break;
                case 4:
                    String phoneNumberDelete=Input.inputPhoneNumber();
                    System.out.print("Are you sure to delete this contact? Y/N: ");
                    String choiceDelete=scanner.nextLine();
                    if(choiceDelete.equals("Y")){
                        contactManagement.delete(phoneNumberDelete);
                    }
                    break;
                case 5:
                    int choiceFind;
                    boolean check=false;
                    do{
                        menu_find();
                        System.out.print("Enter you choice to find: ");
                        choiceFind= scanner.nextInt();
                        scanner.nextLine();
                        switch (choiceFind){
                            case 1:
                                String phoneNumberFind=Input.inputPhoneNumber();
                                int index= contactManagement.findByPhoneNumber(phoneNumberFind);
                                if(index==-1) System.out.println("Found no contact with phone number "+phoneNumberFind);
                                else System.out.println(contactManagement.getContacts().get(index));
                                check=true;
                                break;
                            case 2:
                                System.out.print("Enter name: ");
                                String name=scanner.nextLine();
                                List<Contact> contactsFine=contactManagement.findByName(name);
                                if(contactsFine==null) System.out.println("Found no contact with name: "+name);
                                else {
                                    for (Contact c :contactsFine) {
                                        System.out.println(c);
                                    }
                                }
                                check=true;
                                break;
                        }
                    } while (!check);
                    break;
                case 6:
                    System.out.print("Are you sure to read file? Y/N");
                    String choiceRead=scanner.nextLine();
                    if(choiceRead.equals("Y")) contactManagement.readFromFile();
                    break;
                case 7:
                    System.out.print("Are you sure to write file? Y/N");
                    String choiceWrite=scanner.nextLine();
                    if(choiceWrite.equals("Y")) contactManagement.writeToFile();
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        } while (choice >= 1 && choice <= 8);

    }
    public static void menu(){
        System.out.println("\n========MENU===========");
        System.out.println("1. Display contact list");
        System.out.println("2. Create new contact");
        System.out.println("3. Update contact");
        System.out.println("4. Delete contact");
        System.out.println("5. Find contact");
        System.out.println("6. Read from File");
        System.out.println("7. Write to File");
        System.out.println("8. Exit");
    }
    public static void menu_find(){
        System.out.println("\n========MENU===========");
        System.out.println("1. Find by phone number");
        System.out.println("2. Find by name");
    }
}
