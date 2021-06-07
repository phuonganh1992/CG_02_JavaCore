package model;

import javafx.util.converter.LocalDateStringConverter;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

public class StudentIO {
    public static void writeToFile(String pathFile, List<Student> studentList) throws IOException {
        File file=new File(pathFile);
        FileWriter fileWriter=new FileWriter(file);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.write("Student code,Student name,Student date of birth,Student age,Student gender,Student address,Student email,Student average score\n");
        for (Student student:studentList) {
            bufferedWriter.write(student.getStudentCode()+","+
                    student.getStudentName()+","+
                    student.displayDateOfBirth()+","+
                    student.getStudentAge()+","+
                    student.getStudentGender()+","+
                    student.getStudentAddress()+","+
                    student.getStudentEmail()+","+
                    student.getStudentAvgScore()+"\n"
            );
        }
        bufferedWriter.close();
        fileWriter.close();
    }

    public static List<Student> readFromFile(String pathFile) throws IOException {
        List<Student> studentList=new LinkedList<>();
        File file=new File(pathFile);
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String lineCSV= bufferedReader.readLine();
        while ((lineCSV=bufferedReader.readLine())!=null){
            String[] lineContent=lineCSV.split(",");
            String studentCode=lineContent[0];
            String studentName=lineContent[1];
            String dateString=lineContent[2];
            DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate studentDateOfBirth=LocalDate.parse(dateString,formatter);
            int studentGender=Integer.parseInt(lineContent[4]);
            String studentAddress=lineContent[5];
            String studentEmail=lineContent[6];
            double studentAvgScore=Double.parseDouble(lineContent[7]);
            Student student=new Student(studentCode,studentName,studentDateOfBirth,studentGender,studentAddress,studentEmail,studentAvgScore);
            studentList.add(student);
        }
        return studentList;

    }
}
