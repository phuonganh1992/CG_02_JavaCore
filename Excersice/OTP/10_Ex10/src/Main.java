public class Main {
    public static void main(String[] args) {
        Document document=new Document("  em  co mot     con     meo ");
        System.out.println(document.countWord());
        System.out.println(document.counChar());
    }
}
