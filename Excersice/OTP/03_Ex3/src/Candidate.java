import java.util.Scanner;

public class Candidate {
    private String id;
    private String name;
    private String address;
    private int priority;

    public Candidate() {
    }

    public Candidate(String id, String name, String address, int priority) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        this.id = sc.nextLine();
        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        System.out.print("Enter address: ");
        this.address = sc.nextLine();
        System.out.print("Enter priority: ");
        this.priority = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority +
                '}';
    }
}
