import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student("Ha",30,"HN");
        Student student2=new Student("Anh",25,"DN");
        Student student3=new Student("Trung",50,"HCM");
        Student student4=new Student("Xuan",29,"BG");
        Set<Student> students=new TreeSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        for (Student student:students) {
            System.out.println(student);
        }
    }
}
