import java.util.Arrays;
import java.util.Scanner;

public class Family {
    private Person[] people;
    private int size;
    private String address;

    public Family() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        this.size = sc.nextInt();
        people=new Person[size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter address: ");
        this.address=sc.nextLine();
        for(int i=0;i<size;i++){
            System.out.println("Information of person "+(i+1));
            Person person=new Person();
            person.input();
            people[i]=person;
        }
    }
    public void display(){
        System.out.println("Family have "+size+" person:");
        for(int i=0;i<size;i++){
            System.out.println(people[i]);
        }
    }
}
