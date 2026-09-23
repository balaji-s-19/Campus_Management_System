package com.Campus.model;

public class student{
    //Enacapsulation - data hiding
    // instance variables
    private int studentid;
    private String studentname;
    private int age;
    private String department;
    private int[] marks;

    //static variable to keep track of the number id student objects created
    private static int studentcount = 0;

    //default constructor
    public student(){

        studentcount++;

}
    

    //parameterized constructor
    public student(int studentid, String studentname, int age, String department, int[] marks){
        this.studentid = studentid;
        this.studentname = studentname;
        this.age = age;
        this.department = department;
        this.marks = marks;

        studentcount++;
    }
    //getter  
    public  int getStudentid() {
        return studentid;
    }   
    public String getStudentname() {
        return studentname;
    }       
    public int getAge() {
        return age;
    }
    public String getDepartment() {
        return department;
    }
    public int[] getMarks() {
        return marks;
    }
    //setter
    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }
    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDepartment(String department) {
        this.department = department;
    }   
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public void displayStudentinfo(){
        System.out.println("Student ID: " + studentid);
        System.out.println("Student Name: " + studentname);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }
    public void displaystudentinfo(boolean showmarks){
        displayStudentinfo();
        if(showmarks){
            System.out.print("Marks: "+java.util.Arrays.toString(marks));
         }
    }
    //static method belong to class,not to object
    public static void displayStudentCount(){
        System.out.println("Total number of students: " + studentcount);
    }
} 