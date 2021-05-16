import java.util.Arrays;
import java.util.Scanner;

public class Family {
    private Person[] people;
    private int size;
    private String address;

    public Family() {
        people=new Person[0];
    }

    public Family(int size) {
        this.size = size;
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
        System.out.print("Enter size: ");
        this.size = sc.nextInt();
        for(int i=0;i<size;i++){
            Person person=new Person();
            person.input();
            people[i]=person;
        }
    }

    @Override
    public String toString() {
        return "Family{" +
                "people=" + Arrays.toString(people) +
                ", size=" + size +
                ", address='" + address + '\'' +
                '}';
    }
}
