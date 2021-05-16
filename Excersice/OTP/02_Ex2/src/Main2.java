import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ManageDocument listDocument=new ManageDocument();
        int choice;
        int size;
        Scanner sc=new Scanner(System.in);
        do{
            menu();
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    switch (chooseType()){
                        case "a":
                            System.out.println("Enter information of book ");
                            Document book=new Book();
                            book.input();
                            listDocument.add(book);
                            break;
                        case "b":
                            System.out.println("Enter information of magazine ");
                            Document magazine=new Magazine();
                            magazine.input();
                            listDocument.add(magazine);
                            break;
                        case "c":
                            System.out.println("Enter information of newspaper ");
                            Document newspaper=new Newspaper();
                            newspaper.input();
                            listDocument.add(newspaper);
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Enter your code to delete: ");
                    sc.nextLine();
                    String codeDelete=sc.nextLine();
                    if(listDocument.find(codeDelete)!=-1) listDocument.delete(codeDelete);
                    else System.out.println("No document with code as above");
                    break;
                case 3:
                    listDocument.displayDocument();
                    break;
                case 4:
                    switch (chooseType()) {
                        case "a":
                            listDocument.searchBook();
                            break;
                        case "b":
                            listDocument.searchMagazine();
                            break;
                        case "c":
                            listDocument.searchNewspaper();
                            break;
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        } while (choice>=1 && choice<=5);
    }
    static void menu(){
        System.out.println("\n========MENU===========");
        System.out.println("1. Add new document");
        System.out.println("2. Delete document");
        System.out.println("3. Display information");
        System.out.println("4. Search document");
        System.out.println("5. Exit");
    }
    static String chooseType(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: book");
        System.out.println("Enter b: magazine");
        System.out.println("Enter c: newspaper");
        System.out.print("Enter your type: ");
        return sc.nextLine();
    }
}
