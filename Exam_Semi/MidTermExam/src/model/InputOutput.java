package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class InputOutput {
//    public static void main(String[] args) {
//        Student student=getStudentInformation();
//        System.out.println(student);
//    }
    public static final Scanner SCANNER=new Scanner(System.in);
    public static Student getStudentInformation() {
        System.out.println("Enter information of student");
        String studentCode = getStudentCode();
        String studentName = getStudentName();
        LocalDate studentDateOfBirth=getDateOfBirth();

        System.out.print("Enter address: ");
        String studentAddress=SCANNER.nextLine();
        String studentEmail = getStudentEmail();
        System.out.print("Enter average score: ");
        double studentScore=SCANNER.nextDouble();

        int studentGender = getStudentGender();
        SCANNER.nextLine();

        return new Student(studentCode,studentName,studentDateOfBirth,studentGender,studentAddress,studentEmail,studentScore);
    }
    public static int getStudentGender() {
        int studentGender;
        boolean invalidStudentGender;
        do {
            System.out.print("Enter customer gender - int(0,1,2): ");
            studentGender = SCANNER.nextInt();
            invalidStudentGender = (studentGender != 0) && (studentGender != 1) && (studentGender != 2);
            if (invalidStudentGender) System.out.println("Wrong input, pls enter gender by number 0,1 or 2!");
        } while (invalidStudentGender);
        return studentGender;
    }

    public static String getStudentCode() {
        String studentCode;
        do {
            System.out.print("Enter code: ");
            studentCode=SCANNER.nextLine();
            if(!ValidateStudent.valid(studentCode,ValidateStudent.CODE_REGEX)) System.out.println("Invalid code!");
        } while (!ValidateStudent.valid(studentCode,ValidateStudent.CODE_REGEX));
        return studentCode;
    }

    public static String getStudentName() {
        String studentName;
        do {
            System.out.print("Enter name: ");
            studentName=SCANNER.nextLine();
            if(!ValidateStudent.valid(studentName,ValidateStudent.NAME_REGEX)) System.out.println("Invalid name!");
        } while (!ValidateStudent.valid(studentName,ValidateStudent.NAME_REGEX));
        return studentName;
    }

    public static String getStudentEmail() {
        String studentEmail;
        do {
            System.out.print("Enter email: ");
            studentEmail=SCANNER.nextLine();
            if(!ValidateStudent.valid(studentEmail,ValidateStudent.EMAIL_REGEX)) System.out.println("Invalid email");
        } while (!ValidateStudent.valid(studentEmail,ValidateStudent.EMAIL_REGEX));
        return studentEmail;
    }

    private static LocalDate getDateOfBirth() {
        String dateString;
        do {
            System.out.print("Enter date of birth (format dd/mm/yyyy): ");
            dateString = SCANNER.nextLine();
            if (!ValidateStudent.valid(dateString, ValidateStudent.DATEOFBIRTH_REGEX))
                System.out.println("Invalid date!");
        } while (!ValidateStudent.valid(dateString, ValidateStudent.DATEOFBIRTH_REGEX));
        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate studentDateOfBirth = LocalDate.parse(dateString,dateTimeFormatter);
        return studentDateOfBirth;
    }
}
