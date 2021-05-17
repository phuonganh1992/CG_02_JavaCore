import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String id;
    private Room room;
    private int dayRent;

    public Person() {
    }

    public Person(String name, int age, String id, Room room, int dayRent) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.room = room;
        this.dayRent = dayRent;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getDayRent() {
        return dayRent;
    }

    public void setDayRent(int dayRent) {
        this.dayRent = dayRent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        this.id = sc.nextLine();
        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        System.out.print("Enter age: ");
        this.age = sc.nextInt();
        System.out.print("Enter day rent: ");
        this.dayRent = sc.nextInt();
        this.room=new Room();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}