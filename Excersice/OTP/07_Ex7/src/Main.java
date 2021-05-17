public class Main {
    public static void main(String[] args) {
        ManageTeacher manageTeacher=new ManageTeacher();
        Teacher teacher_1=new Teacher("Hoang",26,"HT","T001",500,100,200);
        Teacher teacher_2=new Teacher("Anh",30,"ND","T002",1000,100,200);
        Teacher teacher_3=new Teacher("Ngan",27,"ND","T003",900,100,200);
        Teacher teacher_4=new Teacher("Hoa",27,"ND","T004",900,100,200);
        manageTeacher.add(teacher_1);
        manageTeacher.add(teacher_2);
        manageTeacher.add(teacher_3);
        manageTeacher.add(teacher_4);
        manageTeacher.display();
        manageTeacher.delete("T003");
        manageTeacher.display();
        System.out.println("Salary paid for all teachers is: "+manageTeacher.calculateSalary());




    }
}
