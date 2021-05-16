public class CandidateC extends Candidate{
    public final String LITERATURE="Literature";
    public final String HISTORY="History";
    public final String GEOGRAPHY="Geography";

    public CandidateC() {
    }

    public CandidateC(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }
    @Override
    public String toString() {
        return "CandidateC{" +
                "id='" + super.getId() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", priority=" + super.getPriority() +'\'' +
                ", Subject: "+LITERATURE+"-"+HISTORY+"-"+GEOGRAPHY+
                '}';
    }
}
