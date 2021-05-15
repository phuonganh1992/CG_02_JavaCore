public class Book extends Document{
    private String author;
    private int numberPage;

    public Book() {
    }

    public Book(String code, String publisher, int quantity, String author, int numberPage) {
        super(code, publisher, quantity);
        this.author = author;
        this.numberPage = numberPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", numberPage=" + numberPage +
                "} " + super.toString();
    }
}
