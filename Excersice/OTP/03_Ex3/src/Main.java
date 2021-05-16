public class Main {
    public static void main(String[] args) {
        Enrollment enrollment=new Enrollment();
        Candidate a=new CandidateA("code1","huong","hn",1);
        Candidate b=new CandidateB("code2","hoa","hn",1);
        Candidate c=new CandidateC("code3","hong","hn",1);
        enrollment.add(a);
        enrollment.add(b);
        enrollment.add(c);
        enrollment.display();
        Candidate d=enrollment.find("code3");
        System.out.println(d);

    }
}
