import java.util.Date;
import java.util.Scanner;

public class Newspaper extends Document{
    private int dayIssue;

    public Newspaper() {
    }

    public Newspaper(String code, String publisher, int quantity, int dayIssue) {
        super(code, publisher, quantity);
        this.dayIssue = dayIssue;
    }

    public int getDateIssue() {
        return dayIssue;
    }

    public void setDayIssue(int dayIssue) {
        this.dayIssue = dayIssue;
    }

    @Override
    public void input() {
        Scanner sc=new Scanner(System.in);
        super.input();
        System.out.print("Enter day issue: ");
        this.dayIssue=sc.nextInt();
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "dateIssue=" + dayIssue +
                "} " + super.toString();
    }
}
