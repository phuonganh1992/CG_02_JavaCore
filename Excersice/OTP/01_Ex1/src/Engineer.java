import java.util.Scanner;

public class Engineer extends Officer{
    private String techicalTraining;

    public Engineer() {
    }

    public Engineer(String techicalTraining) {
        this.techicalTraining = techicalTraining;
    }

    public Engineer(String name, int age, String gender, String address, String techicalTraining) {
        super(name, age, gender, address);
        this.techicalTraining = techicalTraining;
    }

    public String getTechicalTraining() {
        return techicalTraining;
    }

    public void setTechicalTraining(String techicalTraining) {
        this.techicalTraining = techicalTraining;
    }

    @Override
    public void input() {
        Scanner sc=new Scanner(System.in);
        super.input();
        System.out.print("Enter technicalTraining: ");
        this.techicalTraining=sc.nextLine();
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "techicalTraining='" + techicalTraining + '\'' +
                "} " +" is subclass of "+ super.toString();
    }
}
