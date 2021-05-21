import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student("Ha",20,"HN");
        Student student2=new Student("Hung",27,"DN");
        Student student3=new Student("Trang",19,"HY");
        System.out.println("---------------------------------MAP-----------------------------");
        Map<Integer,Student> studentMap=new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);
        System.out.println("Key in student map: ");
        for(Integer key:studentMap.keySet()){
            System.out.println(key);
        }
        System.out.println("Value in student map: ");
        for (Student value:studentMap.values()) {
            System.out.println(value);
        }
        System.out.println("Entry in student map: ");
        for(Map.Entry entry: studentMap.entrySet()){
            System.out.println(entry);
        }
        System.out.println("------------------------------SET--------------------------------");
        Set<Student> studentSet=new HashSet<Student>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student1);
        System.out.println(studentSet);
        System.out.println("Student Set include: ");
        for (Student student:studentSet) {
            System.out.println(student);
        }
    }
}
