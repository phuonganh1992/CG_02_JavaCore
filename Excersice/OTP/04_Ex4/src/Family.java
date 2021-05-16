import java.util.Arrays;

public class Family {
    private Person[] people;
    private int size;
    private String address;

    public Family() {
        people=new Person[0];
    }

    public Family(int size) {
        this.size = size;
        people=new Person[size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
