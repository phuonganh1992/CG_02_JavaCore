package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    private List<Student> studentList;

    public StudentManagement() {
        studentList=new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void add(Student student){
        studentList.add(student);
    }
    public void writeToFile(String path, List<Student> studentList) throws IOException {
        File file=new File(path);
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(studentList);
        objectOutputStream.close();
        fileOutputStream.close();
    }
    public List<Student> readDataFromFile(String path) throws IOException, ClassNotFoundException {
        List<Student> studentList=new ArrayList<>();
        File file=new File(path);
        FileInputStream fileInputStream=new FileInputStream(file);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        studentList=(List<Student>) objectInputStream.readObject();
        System.out.println();
        return studentList;
    }
}
