package com.campus.app;
import com.campus.model.ScholarshipStudent;
import com.campus.model.Student;
import com.campus.service.Studentservice;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // inputs from users
            System.out.println("Enter Student id: ");
            int studentid = sc.nextInt();
            System.out.println("Enter Student name: ");
            String studentname = sc.next();
            System.out.println("Enter Student age: ");
            int studentage = sc.nextInt();
            System.out.println("Enter Student department: ");
            String studentdepartment = sc.next();
            System.out.println(" number of subjects: ");
            int numSubjects = sc.nextInt();
            int[] marks = new int[numSubjects];
            System.out.println("Enter Student marks of " + numSubjects + " subjects: ");
            for (int i = 0; i < numSubjects; i++) {
                System.out.println("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
                sc.nextLine();
            }
            System.out.println("Enter the scholarship percentage: ");
            double scholarshipPercentage = sc.nextDouble();
            sc.nextLine();
            Student student=new Student(studentid,studentname,studentage,studentdepartment,marks,scholarshipPercentage);  
            student.displayStudentinfo(true);
            Student.displayStudentCount();
            Studentservice studentService=new Studentservice();
            studentService.displayreportcard(student);
            sc.close();
        }
    }
}
