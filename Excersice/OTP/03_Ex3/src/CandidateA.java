public class CandidateA extends Candidate{
    public final String MATH="Math";
    public final String PHYSICS="Physics";
    public final String CHEMISTRY="Chemistry";

    public CandidateA() {
    }

    public CandidateA(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "CandidateA{" +
                "id='" + super.getId() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", priority=" + super.getPriority() +'\'' +
                ", Subject: "+MATH+"-"+PHYSICS+"-"+CHEMISTRY+
                '}';
    }
}
