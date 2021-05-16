import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String career;
    private String id;

    public Person() {
    }

    public Person(String name, int age, String career, String id) {
        this.name = name;
        this.age = age;
        this.career = career;
        this.id = id;
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

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
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
        System.out.print("Enter career: ");
        this.career = sc.nextLine();
        System.out.print("Enter age: ");
        this.age = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", career='" + career + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
