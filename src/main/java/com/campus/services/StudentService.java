package com.campus.services;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private static List<String> students = new ArrayList<>();

    //get student
    public StudentService(){
        students.add("101 - bill - java");
        students.add("102 - john - python");
        students.add("103 - smith - c++");
    }

    public List<String> getStudents() {
        return students;
    }
    //add student
    public void addStudent(String name, String course) {
        students.add(String.valueOf(students.size() + 101) + " - " + name + " - " + course);
    }

}
