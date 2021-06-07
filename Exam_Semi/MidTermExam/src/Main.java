
import model.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final String FILE_PATH="src/file/data.csv";
    public static final String TYPE_A = "a";
    public static final String TYPE_B = "b";
    public static final String TYPE_C = "c";
    public static final Scanner SCANNER=new Scanner(System.in);
    public static void main(String[] args) {
        StudentManagement studentManagement=new StudentManagement(currentStudentList());
        ValidateStudent validateStudent=new ValidateStudent();
        Scanner scanner=new Scanner(System.in);
        int choice;
        do {
            menu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Student student= InputOutput.getStudentInformation();
                    studentManagement.add(student);
                    break;
                case 2:
                    studentManagement.display();
                    break;
                case 3:
                    Student studentEdit= InputOutput.getStudentInformation();
                    studentManagement.edit(studentEdit);
                    break;
                case 4:
                    deleteByCodeNameScore(studentManagement);
                    System.out.println("Delete successfully!");

                    break;
                case 5:
                    findByCodeNameScore(studentManagement);
                    break;
                case 6:
                    studentManagement.sort();
                    System.out.println("Sorted successfully!");
                    break;
                case 7:
                    studentManagement.writeToFile();
                    break;
                case 8:
                    studentManagement.readFromFile();
                    break;
                case 9:
                    System.exit(0);
                    break;
            }
        } while (choice >= 1 && choice <= 7);

    }
    public static void menu() {
        System.out.println("\n========MENU===========");
        System.out.println("1. Add new student");
        System.out.println("2. Display student list");
        System.out.println("3. Edit student");
        System.out.println("4. Delete student by code/ name/ score range");
        System.out.println("5. Find student by code/ name/ score range");
        System.out.println("6. Sort student");
        System.out.println("7. Write to File");
        System.out.println("8. Read from File");
        System.out.println("9. Exit");
    }
    static void menuChooseCodeNameScore() {
        System.out.println("a. By code");
        System.out.println("b. By name");
        System.out.println("c. By score range");
    }
    private static void deleteByCodeNameScore(StudentManagement studentManagement) {
        String type = inputType();
        switch (type) {
            case TYPE_A:
                String studentCode= InputOutput.getStudentCode();
                System.out.println("Are you sure to delete? Enter Y for agree");
                String answer=SCANNER.nextLine();
                if(answer.equals("Y")){
                    studentManagement.deleteByCode(studentCode);
                }
                break;
            case TYPE_B:
                String studentName=InputOutput.getStudentName();
                studentManagement.deleteByName(studentName);
                break;
            case TYPE_C:
                System.out.print("Enter min score: ");
                double minScore = SCANNER.nextDouble();
                System.out.print("Enter max score: ");
                double maxScore = SCANNER.nextDouble();
                studentManagement.deleteByScoreRange(minScore, maxScore);
                break;
        }
    }
    private static void findByCodeNameScore(StudentManagement studentManagement) {
        String type = inputType();
        switch (type) {
            case TYPE_A:
                String studentCode= InputOutput.getStudentCode();
//                studentManagement.findByCode(studentCode);
                System.out.println("Students found as below: ");
                System.out.println(studentManagement.findByCode(studentCode));
                break;
            case TYPE_B:
                String studentName=InputOutput.getStudentName();
//                studentManagement.findByName(studentName);
                System.out.println("Student found as below: ");
                System.out.println(studentManagement.findByName(studentName));
                break;
            case TYPE_C:
                System.out.print("Enter min score: ");
                double minScore = SCANNER.nextDouble();
                System.out.print("Enter max score: ");
                double maxScore = SCANNER.nextDouble();
                System.out.println("Student found as below: ");
                System.out.println(studentManagement.findByScoreRange(minScore, maxScore));
                break;
        }
    }
    private static String inputType() {
        String type;
        menuChooseCodeNameScore();
        boolean isWrongType;
        do {
            System.out.print("Enter type:");
            type = SCANNER.nextLine();
            isWrongType = !type.equals(TYPE_A) && !type.equals(TYPE_B) && !type.equals(TYPE_C);
            if (isWrongType) System.out.println("Wrong input, pls re-enter!");
        } while (isWrongType);
        return type;
    }
    public static List<Student> currentStudentList(){
        List<Student> currentStudentList=new LinkedList<>();
        currentStudentList.add(new Student("C0321K1","Lai Phuong Anh",LocalDate.of(1992,12,12),0,"Nam Dinh","phuonganh.1992@gmail.com",9));
        currentStudentList.add(new Student("C0221H1","Huy Chuong",LocalDate.of(1994,5,30),1,"Nam Dinh","chuong.huy@codegym.vn",8));
        currentStudentList.add(new Student("C0221K2","Huy Hung",LocalDate.of(1993,7,20),1,"Ha Noi","hung.huy@codegym.vn",7));
        currentStudentList.add(new Student("C0321K2","Van Tu",LocalDate.of(2001,12,20),1,"Ha Noi","tu.vuong@codegym.vn",9));
        currentStudentList.add(new Student("C0321K4","Huy Chuong",LocalDate.of(2001,12,20),1,"Ha Noi","tu.vuong@codegym.vn",9));
    return currentStudentList;
    }

}
