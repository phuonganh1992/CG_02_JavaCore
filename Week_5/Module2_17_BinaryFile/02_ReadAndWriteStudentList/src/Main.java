import model.Student;
import model.StudentManagement;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Main {
    final static String PATH_FILE="D:\\Java\\Week_5\\Module2_17_BinaryFile\\02_ReadAndWriteStudentList\\src\\file\\studentData.txt";
    public static void main(String[] args) {
        StudentManagement studentManagement=new StudentManagement();

        try {
            studentManagement.add(new Student(1, "Anh", "HN"));
            studentManagement.add(new Student(2, "Minh", "HN"));
            studentManagement.add(new Student(3, "Hoa", "DN"));
            studentManagement.add(new Student(4, "Thanh", "HCM"));
            studentManagement.add(new Student(5, "Nam", "HN"));
            studentManagement.writeToFile(PATH_FILE,studentManagement.getStudentList());

            List<Student> studentList= studentManagement.readDataFromFile(PATH_FILE);
            for (Student student :studentList) {
                System.out.println(student);
            }

        }
        catch (FileNotFoundException e){
            System.out.println("File is not found");
        }
        catch (NullPointerException e){
            System.out.println("Null point exception");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
