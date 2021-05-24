import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Town town=new Town();
        Family family=inputFamily();
        town.add(family);
        town.display();
    }
    static Person inputPerson(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        String id = sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter career: ");
        String career = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        return new Person(name,age,career,id);
    }
    static Family inputFamily(){
        Family family=new Family();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter address: ");
        String address=sc.nextLine();
        System.out.print("Enter family size: ");
        int size= sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Fill information of member "+(i+1));
            Person person=inputPerson();
            family.getMembers().add(person);
        }
        return family;
    }
}
