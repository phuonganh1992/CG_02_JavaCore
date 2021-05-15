public class Document {
    private String code;
    private String publisher;
    private int Quantity;

    public Document() {
    }

    public Document(String code, String publisher, int quantity) {
        this.code = code;
        this.publisher = publisher;
        Quantity = quantity;
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
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    @Override
    public String toString() {
        return "Document{" +
                "code='" + code + '\'' +
                ", publisher='" + publisher + '\'' +
                ", Quantity=" + Quantity +
                '}';
    }
}
