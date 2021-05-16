import java.util.Scanner;

public class Document {
    private String code;
    private String publisher;
    private int quantity;

    public Document() {
    }

    public Document(String code, String publisher, int quantity) {
        this.code = code;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        quantity = quantity;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter code: ");
        this.code=sc.nextLine();
        System.out.print("Enter publisher: ");
        this.publisher=sc.nextLine();
        System.out.print("Enter quantity: ");
        this.quantity=sc.nextInt();
    }

    @Override
    public String toString() {
        return "Document{" +
                "code='" + code + '\'' +
                ", publisher='" + publisher + '\'' +
                ", Quantity=" + quantity +
                '}';
    }
}
