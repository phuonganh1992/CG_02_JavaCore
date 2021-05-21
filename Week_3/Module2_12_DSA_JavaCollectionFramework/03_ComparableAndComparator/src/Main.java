import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student("Ha",30,"HN");
        Student student2=new Student("Anh",25,"DN");
        Student student3=new Student("Trung",50,"HCM");
        Student student4=new Student("Xuan",29,"BG");
        Student student5=new Student("Anh",39,"BG");
        Student student6=new Student("Anh",16,"BG");
        System.out.println("---------------------------COMPARABLE------------------------------------");
        Set<Student> comparableStudents=new TreeSet<>();
        comparableStudents.add(student1);
        comparableStudents.add(student2);
        comparableStudents.add(student3);
        comparableStudents.add(student4);
        comparableStudents.add(student5);
        for (Student student:comparableStudents) {
            System.out.println(student);
        }
        System.out.println("----------------------------COMPARATOR--------------------------------");
        Set<Student> comparatorStudents=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        comparatorStudents.add(student1);
        comparatorStudents.add(student2);
        comparatorStudents.add(student3);
        comparatorStudents.add(student4);
        comparatorStudents.add(student5);
        for (Student student:comparatorStudents) {
            System.out.println(student);
        }
    }
}
