import java.util.Scanner;

public class School {
    private Classes[] classes;
    private int size;

    public School() {
        classes=new Classes[100];
    }

    public Classes[] getClasses() {
        return classes;
    }

    public void setClasses(Classes[] classes) {
        this.classes = classes;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void  input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of class: ");
        this.size=sc.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("Information of classes "+(i+1));
            Classes classes1=new Classes();
            classes1.input();
            classes[i]=classes1;
        }
    }
    public void add(Student student){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the class to add student: ");
        String nameClass=sc.nextLine();
        int index=find(nameClass);
        if(index==-1) System.out.println("Wrong name, pls re-input");
        else classes[index].add(student);
    }
    public int find(String name){
        for (int i = 0; i < size; i++) {
            if(classes[i].getName().equals(name)) return i;
        }
        return -1;
    }
    public void display(){
        System.out.println("School have "+size+" classes:");
        for(int i=0;i<size;i++){
            classes[i].display();
        }
    }
    public void display(int age){
        System.out.println("The student with age more than "+age);
        for (int i = 0; i < size; i++) {
            for (int j=0;j<classes[i].getSize();j++){
                if(classes[i].getStudents()[j].getAge()>age){
                    System.out.println(classes[i].getStudents()[j]);
                }
            }
        }
    }
    public int countStudent(int age, String town){
        int count=0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < classes[i].getSize(); j++) {
                if (classes[i].getStudents()[j].getAge()==age && classes[i].getStudents()[j].getTown().equals(town)) count++;
            }
        }
        return count;
    }

}
