import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<Person> members;

    private String address;

    public Family() {
        members=new ArrayList<>();
    }

    public List<Person> getMembers() {
        return members;
    }

    public void setMembers(List<Person> members) {
        this.members = members;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void display(){
        System.out.println("Family have "+members.size()+" person:");
        for(Person member:members){
            System.out.println(member);
        }
    }
}
