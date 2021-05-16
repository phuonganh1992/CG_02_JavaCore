import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManageDocument listBook=new ManageDocument();
        ManageDocument listMagazine=new ManageDocument();
        ManageDocument listNewspaper=new ManageDocument();
        int choice;
        Scanner sc=new Scanner(System.in);
        do{
            menu();
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    switch (chooseType()){
                        case "a":
                            System.out.print("How many books do you want to add? ");
                            int sizeOfBooks= sc.nextInt();
                            for (int i = 0; i <sizeOfBooks ; i++) {
                                System.out.println("Enter information of book "+(i+1));
                                Book book=new Book();
                                book.input();
                                listBook.add(book);
                            }
                            break;

                        case "b":
                            System.out.print("How many magazines do you want to add? ");
                            int sizeOfMagazines= sc.nextInt();
                            for (int i = 0; i <sizeOfMagazines ; i++) {
                                System.out.println("Enter information of magazine "+(i+1));
                                Magazine magazine=new Magazine();
                                magazine.input();
                                listMagazine.add(magazine);
                            }
                            break;
                        case "c":
                            System.out.print("How many newspapers do you want to add? ");
                            int sizeOfNewspaper= sc.nextInt();
                            for (int i = 0; i <sizeOfNewspaper ; i++) {
                                System.out.println("Enter information of newspaper "+(i+1));
                                Newspaper newspaper=new Newspaper();
                                newspaper.input();
                                listNewspaper.add(newspaper);
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Enter your code to delete: ");
                    sc.nextLine();
                    String codeDelete=sc.nextLine();
                    if(listBook.find(codeDelete)!=-1) listBook.delete(codeDelete);
                    else if(listMagazine.find(codeDelete)!=-1) listMagazine.delete(codeDelete);
                    else if(listNewspaper.find(codeDelete)!=-1) listNewspaper.delete(codeDelete);
                    else System.out.println("No document with code as above");
                    break;
                case 3:
                    switch (chooseType()){
                        case "a":
                            listBook.displayDocument();
                            break;
                        case "b":
                            listMagazine.displayDocument();
                            break;
                        case "c":
                            listNewspaper.displayDocument();
                            break;
                    }
                case 4:
                    System.out.print("Enter your code to find: ");
                    sc.nextLine();
                    String codeFind=sc.nextLine();
                    int index;
                    if(listBook.find(codeFind)!=-1) {
                        index = listBook.find(codeFind);
                        listBook.displayDocument(index);
                    } else if (listMagazine.find(codeFind)!=-1) {
                        index=listMagazine.find(codeFind);
                        listMagazine.displayDocument(index);
                    } else if(listNewspaper.find(codeFind)!=-1) {
                        index= listNewspaper.find(codeFind);
                        listNewspaper.displayDocument(index);
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
        String type=sc.nextLine();
        return type;
    }
}
