public class Main {
    public static void main(String[] args) {
        School school=new School();
        school.input();
        school.display();
        Student student=new Student();
        student.input();
        school.add(student);
        school.display();
        school.display(20);
        System.out.println("The number of Student with age of 23, town of DN: "+school.countStudent(23,"DN"));

    }

}
