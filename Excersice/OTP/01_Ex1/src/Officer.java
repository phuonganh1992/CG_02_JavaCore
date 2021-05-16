import java.util.Scanner;

public class Officer {
    private String name;
    private int age;
    private String gender;
    private String address;

    public Officer() {
    }

    public Officer(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name=sc.nextLine();
        System.out.print("Enter age: ");
        this.age=sc.nextInt();
        System.out.print("Enter gender: ");
        sc.nextLine();
        this.gender=sc.nextLine();
        System.out.print("Enter address: ");
        this.address=sc.nextLine();
    }

    @Override
    public String toString() {
        return "Officer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
