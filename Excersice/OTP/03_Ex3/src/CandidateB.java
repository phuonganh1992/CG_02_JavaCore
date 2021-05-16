public class CandidateB extends Candidate{
    public final String MATH="Math";
    public final String CHEMISTRY="Chemistry";
    public final String BIOLOGY="Biology";

    public CandidateB() {
    }

    public CandidateB(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "CandidateB{" +
                "id='" + super.getId() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", priority=" + super.getPriority() +'\'' +
                ", Subject: "+MATH+"-"+BIOLOGY+"-"+CHEMISTRY+
                '}';
    }
}
