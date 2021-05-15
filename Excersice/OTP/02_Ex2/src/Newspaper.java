import java.util.Date;

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
    public String toString() {
        return "Newspaper{" +
                "dateIssue=" + dayIssue +
                "} " + super.toString();
    }
}
