import model.Contact;
import service.ContactManagement;

public class test {
    public static void main(String[] args) {
        ContactManagement management=new ContactManagement();
        management.readFromFile();
        System.out.println(management.getContacts().size());
        int i=management.findByPhoneNumber("0971234568");
        System.out.println(i);
    }
}
