package model;



import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class StudentManagement {
    private List<Student> studentList=null;

    public StudentManagement() {
        studentList=new LinkedList<>();
    }

    public StudentManagement(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void add(Student student){
        studentList.add(student);
        System.out.println("Adding student successfully");
    }

    public void display(){
        for (Student student :studentList) {
            System.out.println(student);
        }
    }

    public boolean checkExistCode(String studentCode){
        for (Student student:studentList) {
            if(student.getStudentCode().equals(studentCode)) return true;
        }
        return false;
    }

    public int findIndexByCode(String studentCode){
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentCode().equals(studentCode)) return i;
        }
        return -1;
    }

    public Student findByCode(String studentCode){
        for (Student student:studentList) {
            if(student.getStudentCode().equals(studentCode)) return student;
        }
        return null;
    }

    public List<Student> findByName(String studentName){
        List<Student> sameNameList=new LinkedList<>();
        for (Student student:studentList) {
            if(student.getStudentName().equals(studentName)) sameNameList.add(student);
        }
        if (sameNameList.size()==0) System.out.println("Found no student with name of "+studentName);
        return sameNameList;
    }

    public List<Student> findByScoreRange(double minScore, double maxScore){
        List<Student> sameScoreRangeList=new LinkedList<>();
        for (Student student:studentList) {
            if(student.getStudentAge()>=minScore && student.getStudentAge()<=maxScore){
                sameScoreRangeList.add(student);
            }
        }
        return sameScoreRangeList;
    }
    public void edit(Student student){
        int index=findIndexByCode(student.getStudentCode());
        if(index==-1) System.out.println("Found no student");
        else {
            studentList.set(index,student);
            System.out.println("Edit completely");
        }
    }
    public void deleteByCode(String studentCode){
        int index=findIndexByCode(studentCode);
        if(index==-1) System.out.println("Found no student to delete with code "+studentCode);
        else {
            studentList.remove(index);
            System.out.println("Deleted successfully a student with code "+studentCode );
        }
    }

    public void deleteByName(String studentName){
        List<Student> sameNameList=findByName(studentName);
        studentList.removeAll(sameNameList);
        System.out.println("Removed all student with name of "+studentName);
    }
    public void deleteByScoreRange(double minScore, double maxScore){
        List<Student> sameScoreRange=findByScoreRange(minScore,maxScore);
        studentList.removeAll(sameScoreRange);
        System.out.println("Removed all student with score from "+minScore+" to "+maxScore);
    }
    public void sort(){
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getStudentAvgScore()-o2.getStudentAvgScore()==0) return o1.getStudentName().compareTo(o2.getStudentName());
                return (int) (o1.getStudentAvgScore()-o2.getStudentAvgScore());
            }
        });

    }
    public void writeToFile(){
        try {
            StudentIO.writeToFile("src/file/data.csv",studentList);
            System.out.println("Write successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readFromFile(){
        try {
            this.studentList = StudentIO.readFromFile("src/file/data.csv");
            System.out.println("Read from file successfully");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
