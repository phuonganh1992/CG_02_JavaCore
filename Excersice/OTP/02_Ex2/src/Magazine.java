public class Magazine extends Document {
    private int issueNumber;
    private int monthIssue;

    public Magazine() {
    }

    public Magazine(String code, String publisher, int quantity, int issueNumber, int monthIssue) {
        super(code, publisher, quantity);
        this.issueNumber = issueNumber;
        this.monthIssue = monthIssue;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getMonthIssue() {
        return monthIssue;
    }

    public void setMonthIssue(int monthIssue) {
        this.monthIssue = monthIssue;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issueNumber=" + issueNumber +
                ", monthIssue=" + monthIssue +
                "} " + super.toString();
    }
}
