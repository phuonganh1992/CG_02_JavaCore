import java.util.ArrayList;
import java.util.List;

public class Town {
    private List<Family> families;

    public Town() {
        families=new ArrayList<>();
    }
    public void add(Family family){
        families.add(family);
    }

    public void display(){
        System.out.println("Town have "+families.size()+" families:");
        for(Family family:families){
            family.display();
        }
    }
}
