package com.Campus.service;

import com.Campus.model.student;

public class studentservice {
    //calculate total marks of a student
    int calculatetotal(Student student){
        int[] marks = student.getMarks();
        if(marks == null){
            return 0;
        }
        int total = 0;
        for(int i=0; i<marks.length; i++){
            total += marks[i];
        }
        return total;
    }
    //calculate average marks of a student
    public double calculateaverage(Student student){
        int[] marks = student.getMarks();
        if(marks == null || marks.length == 0){
            return 0;
        }
        int total = calculatetotal(student);
        return (double)total/marks.length;
    }
    //find the maximum marks of a student
    public int findmax(Student student){
        int[] marks = student.getMarks();   
        if(marks == null || marks.length == 0){
            return 0;
        }
        int max = marks[0];
        for(int mark : marks){
            if(mark > max){
                max = mark;
            }
        }
        return max;
    }
    // Find minimum mark
    public int findmin(Student student){
        int[] marks = student.getMarks();    
        if(marks == null || marks.length == 0){
            return 0;
        }
        int min = marks[0];
        for(int mark : marks){
            if(mark < min){
                min = mark;
            }
        }
        return min;
    }
    // grade based on marks
    public char findgrade(Student student){
        int[] marks = student.getMarks();
        if(marks == null || marks.length == 0){
            return 'F';
        }
        int total = calculatetotal(student);
        int average = (int)calculateaverage(student);
        if(average >= 90){
            return 'A';
        }else if(average >= 80){
            return 'B';     
    }else if(average >= 70){
            return 'C';
        }else if(average >= 60){
            return 'D';
        }else{
            return 'F';
        }
    }
    //pass or fail
    public String passorfail(Student student){
        int[] marks = student.getMarks();
        if(marks == null || marks.length == 0){
            return "Fail";
        }
        for(int mark : marks){
            if(mark < 40){
                return "Fail";
            }
        }
        return "Pass";
    }
    //display roport card
    public void displayreportcard(Student student){
        System.out.println("Report Card for Student: " + student.getStudentname());
        System.out.println("Student ID: " + student.getStudentid());
        System.out.println("Age: " + student.getAge());
        System.out.println("Department: " + student.getDepartment());
        System.out.println("Total Marks: " + calculatetotal(student));
        System.out.println("Average Marks: " + calculateaverage(student));
        System.out.println("Maximum Marks: " + findmax(student));
        System.out.println("Minimum Marks: " + findmin(student));
        System.out.println("Grade: " + findgrade(student));
        System.out.println("Result: " + passorfail(student));   

}
}