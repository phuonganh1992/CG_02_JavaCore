import java.util.Scanner;

public class Worker extends Officer {
    private int level;

    public Worker() {
    }

    public Worker(int level) {
        this.level = level;
    }

    public Worker(String name, int age, String gender, String address, int level) {
        super(name, age, gender, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void input() {
        Scanner sc=new Scanner(System.in);
        super.input();
        System.out.print("Enter level: ");
        this.level=sc.nextInt();
    }

    @Override
    public String toString() {
        return "Worker{" +
                "level=" + level +
                "} " + " is subclass of "+super.toString();
    }
}
