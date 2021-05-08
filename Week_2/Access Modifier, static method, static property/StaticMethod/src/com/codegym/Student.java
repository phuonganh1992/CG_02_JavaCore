package com.codegym;

public class Student {
    private int rollno;
    private String name;
    private static String college="BBDIT";
    Student(int roll,String name){
        this.rollno=roll;
        this.name=name;
    }
    static void change() {
        college="CODEGYM";
    }
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}

