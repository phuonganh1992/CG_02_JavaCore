import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String town;

    public Student() {
    }

    public Student(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
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

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter town: ");
        this.town = sc.nextLine();
        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        System.out.print("Enter age: ");
        this.age = sc.nextInt();
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", town='" + town + '\'' +
                '}';
    }
}
