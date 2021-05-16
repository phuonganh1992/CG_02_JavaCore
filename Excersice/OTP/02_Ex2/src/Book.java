import java.util.Scanner;

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
    public void input() {
        Scanner sc=new Scanner(System.in);
        super.input();
        System.out.print("Enter author: ");
        this.author=sc.nextLine();
        System.out.print("Enter number pages: ");
        this.numberPage=sc.nextInt();
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", numberPage=" + numberPage +
                "} " +" is subclass of "+ super.toString();
    }
}
