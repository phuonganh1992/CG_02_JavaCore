
import java.util.Scanner;

public class Classes {
    private String name;
    private Student[] students;
    private int size;

    public Classes() {
        students=new Student[100];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter class name: ");
        this.name=sc.nextLine();
        System.out.println("Enter number of students in class");
        this.size=sc.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("Information of student "+(i+1));
            Student student=new Student();
            student.input();
            students[i]=student;
        }
    }
    public void add(Student student){
        students[size]=student;
        size++;
    }
    public void display(){
        System.out.println("Class "+name+" have "+size+" students:");
        for(int i=0;i<size;i++){
            System.out.println(students[i]);
        }
    }

}
