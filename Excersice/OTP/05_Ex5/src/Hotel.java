import java.util.Scanner;

public class Hotel {
    private Person[] people;
    private int size;

    public Hotel() {
        people=new Person[100];
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
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

    public void add(Person person){
        people[size]=person;
        size++;
    }

    public int find(String id){
        for (int i = 0; i < size; i++) {
            if(people[i].getId().equals(id)) return i;
            break;
        }
        return -1;
    }
    public void delete(String id){
        int index=find(id);
        if(index!=-1){
            for (int i = index; i < size-1; i++) {
                people[i]=people[i+1];
            }
            people[size-1]=null;
            size--;
        }
    }

    public int calculateRent(String id){
        int index=find(id);
        return people[index].getRoom().getPrice()*people[index].getDayRent();
    }
    public void display(){
        System.out.println("Hotel have "+size+" clients");
        for (int i = 0; i < size; i++) {
            System.out.println(people[i]);
        }
    }
}
