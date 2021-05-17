import java.util.Scanner;

public class Hotel {
    private Person[] people;
    private int size;

    public Hotel() {

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void input() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        this.size = sc.nextInt();
        people=new Person[size];
        for(int i=0;i<size;i++){
            System.out.println("Information of person "+(i+1));
            Person person=new Person();
            person.input();
            people[i]=person;
        }
    }
    public int calculateRent(Person person){
    }

}
