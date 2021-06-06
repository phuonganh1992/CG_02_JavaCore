package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private String studentCode;
    private String studentName;
    private LocalDate studentDateOfBirth;
    private int studentAge;
    private int studentGender;
    private String studentAddress;
    private String studentEmail;
    private double studentAvgScore;


    public Student() {
    }

    public Student(String studentCode, String studentName, LocalDate studentDateOfBirth, int studentGender, String studentAddress, String studentEmail, double studentAvgScore) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.studentDateOfBirth = studentDateOfBirth;
        this.studentGender = studentGender;
        this.studentAddress = studentAddress;
        this.studentEmail = studentEmail;
        this.studentAvgScore = studentAvgScore;
        this.studentAge=LocalDate.now().getYear()-studentDateOfBirth.getYear();
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public LocalDate getStudentDateOfBirth() {
        return studentDateOfBirth;
    }

    public void setStudentDateOfBirth(LocalDate studentDateOfBirth) {
        this.studentDateOfBirth = studentDateOfBirth;
    }

    public int getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(int studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public double getStudentAvgScore() {
        return studentAvgScore;
    }

    public void setStudentAvgScore(double studentAvgScore) {
        this.studentAvgScore = studentAvgScore;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge() {
        this.studentAge = LocalDate.now().getYear()-studentDateOfBirth.getYear();
    }

    public String displayGender(){
        switch (this.studentGender){
            case 0:
                return "female";
            case 1:
                return "male";
        }
        return "other";
    }

    public String displayDateOfBirth(){
        return studentDateOfBirth.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentCode='" + studentCode + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + getStudentAge() +
                ", studentGender=" + displayGender() +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentAvgScore=" + studentAvgScore +
                '}';
    }
}
