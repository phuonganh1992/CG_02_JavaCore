import java.util.ArrayList;
public class Enrollment {
    private ArrayList<Candidate> candidates;

    public Enrollment() {
        this.candidates = new ArrayList<>();
    }
    public void add(Candidate candidate){
        candidates.add(candidate);
    }
    public void display(){
        for (Candidate element:candidates) {
            System.out.println(element);
        }
    }
    public Candidate find(String id){
        for (Candidate element:candidates) {
            if (element.getId().equals(id)) return element;
        }
        return null;
    }

}
