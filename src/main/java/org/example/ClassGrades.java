package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Manages a collection of student grades for a class
public class ClassGrades {
    // List to store all student grades
    private List<StudentGrade> gradeList;

    // Constructor initializes the empty ArrayList of student grades
    public ClassGrades() {
        gradeList = new ArrayList<>();
    }

    // Method to add a new student grade to the grade list
    public void addStudentGrade(StudentGrade grade) {
        gradeList.add(grade);
    }

    // Method to remove a student by their name
    public void removeStudentByName(String name) {
        gradeList.removeIf(student -> student.getStudentName().equalsIgnoreCase(name));
    }

    // Method to remove a student by their position in the ArrayList
    public void removeStudentByPosition(int index) {
        if (index >= 0 && index < gradeList.size()) {
            gradeList.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Method to search for a student by name and return their grade information
    public StudentGrade searchStudent(String name) {
        for (StudentGrade student : gradeList) {
            if (student.getStudentName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    // Method to display students by their grades
    public void showGradeListByGrade(String grade) {
        for (StudentGrade student : gradeList) {
            if (student.getGrade().equalsIgnoreCase(grade)) {
                System.out.println(student);
            }
        }
    }

    // Method to display all students and their grades
    public void showAllGrades() {
        for (StudentGrade student : gradeList) {
            System.out.println(student);
        }
    }
}

