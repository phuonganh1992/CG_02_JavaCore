import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManageOfficer officer=new ManageOfficer();
        int choice;
        Scanner sc=new Scanner(System.in);
        do{
            menu();
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter a: worker");
                    System.out.println("Enter b: engineer");
                    System.out.println("Enter c: staff");
                    System.out.print("Enter type of officer: ");
                    sc.nextLine();
                    String type=sc.nextLine();
                    switch (type){
                        case "a":
                            Officer worker=new Worker();
                            System.out.println("Enter information of officer: ");
                            worker.input();
                            officer.add(worker);
                            break;
                        case "b":
                            Officer engineer=new Engineer();
                            System.out.println("Enter information of officer: ");
                            engineer.input();
                            officer.add(engineer);
                            break;
                        case "c":
                            Officer staff=new Staff();
                            System.out.println("Enter information of officer: ");
                            staff.input();
                            officer.add(staff);
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Enter name to find: ");
                    sc.nextLine();
                    String nameToFind=sc.nextLine();
                    int index=officer.find(nameToFind);
                    officer.displayOfficer(index);
                    break;
                case 3:
                    officer.displayOfficer();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }while (choice>=1 && choice<=4);
    }
    static void menu(){
        System.out.println("\n========MENU===========");
        System.out.println("1. Add new officer");
        System.out.println("2. Find officer");
        System.out.println("3. Display officer list");
        System.out.println("4. Exit");
    }
}
