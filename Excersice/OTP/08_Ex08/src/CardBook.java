public class CardBook {
    private String codeCard;
    private int borrowBookDate;
    private int dueDate;
    private String codeBook;
    private Student student;

    public CardBook() {
    }

    public CardBook(String codeCard, int borrowBookDate, int dueDate, String codeBook, Student student) {
        this.codeCard = codeCard;
        this.borrowBookDate = borrowBookDate;
        this.dueDate = dueDate;
        this.codeBook = codeBook;
        this.student = student;
    }

    public String getCodeCard() {
        return codeCard;
    }

    public void setCodeCard(String codeCard) {
        this.codeCard = codeCard;
    }

    public int getBorrowBookDate() {
        return borrowBookDate;
    }

    public void setBorrowBookDate(int borrowBookDate) {
        this.borrowBookDate = borrowBookDate;
    }

    public int getDueDate() {
        return dueDate;
    }

    public void setDueDate(int dueDate) {
        this.dueDate = dueDate;
    }

    public String getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(String codeBook) {
        this.codeBook = codeBook;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "CardBook{" +
                "codeCard='" + codeCard + '\'' +
                ", borrowBookDate=" + borrowBookDate +
                ", dueDate=" + dueDate +
                ", codeBook='" + codeBook + '\'' +
                ", student=" + student.toString() +
                '}';
    }
}
