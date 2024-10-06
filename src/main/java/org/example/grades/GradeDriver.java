package org.example.grades;

import java.util.Scanner;

public class GradeDriver {
    public static void main(String[] args) {
        // Create a ClassGrades object to manage student grades
        ClassGrades classGrades = new ClassGrades();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Main menu loop
        while (running) {
            // Display the menu options to the user
            System.out.println("\nClass Grade System:");
            System.out.println("1. Add student grade");
            System.out.println("2. Edit student grade");
            System.out.println("3. Remove student by name");
            System.out.println("4. Remove student by position");
            System.out.println("5. Search student");
            System.out.println("6. Show all students and grades");
            System.out.println("7. Show list of students by grade");
            System.out.println("8. Exit");

            // Read the user's choice
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1: // Add a student grade
                    System.out.println("Enter course number:");
                    String course = scanner.nextLine();
                    System.out.println("Enter student ID:");
                    String id = scanner.nextLine();
                    System.out.println("Enter student name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter grade:");
                    String grade = scanner.nextLine();

                    // Create a new student grade and add to the list
                    StudentGrade newStudent = new StudentGrade(course, id, name, grade);
                    classGrades.addStudentGrade(newStudent);
                    System.out.println("Student grade added.");
                    break;

                case 2: // Edit student grade
                    System.out.println("Enter the name of the student to edit:");
                    String editName = scanner.nextLine();
                    StudentGrade student = classGrades.searchStudent(editName);

                    if (student != null) {
                        System.out.println("Editing student: " + student);
                        System.out.println("Enter new course number (or press Enter to keep the same):");
                        String newCourse = scanner.nextLine();
                        System.out.println("Enter new student ID (or press Enter to keep the same):");
                        String newID = scanner.nextLine();
                        System.out.println("Enter new student name (or press Enter to keep the same):");
                        String newName = scanner.nextLine();
                        System.out.println("Enter new grade (or press Enter to keep the same):");
                        String newGrade = scanner.nextLine();

                        // Update student information only if new values are provided
                        if (!newCourse.isEmpty()) student.setCourseNumber(newCourse);
                        if (!newID.isEmpty()) student.setStudentID(newID);
                        if (!newName.isEmpty()) student.setStudentName(newName);
                        if (!newGrade.isEmpty()) student.setGrade(newGrade);
                        System.out.println("Student information updated.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3: // Remove student by name
                    System.out.println("Enter the name of the student to remove:");
                    String removeName = scanner.nextLine();
                    classGrades.removeStudentByName(removeName);
                    System.out.println("Student removed (if they existed).");
                    break;

                case 4: // Remove student by position
                    System.out.println("Enter the position of the student to remove:");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    classGrades.removeStudentByPosition(index);
                    System.out.println("Student removed from position.");
                    break;

                case 5: // Search for a student by name
                    System.out.println("Enter the name of the student to search:");
                    String searchName = scanner.nextLine();
                    StudentGrade foundStudent = classGrades.searchStudent(searchName);

                    if (foundStudent != null) {
                        System.out.println("Student found: " + foundStudent);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 6: // Show all students and grades
                    System.out.println("All students and their grades:");
                    classGrades.showAllGrades();
                    break;

                case 7: // Show students by grade
                    System.out.println("Enter the grade to filter by:");
                    String filterGrade = scanner.nextLine();
                    System.out.println("Students with grade " + filterGrade + ":");
                    classGrades.showGradeListByGrade(filterGrade);
                    break;

                case 8: // Exit the system
                    running = false;
                    break;

                default: // Invalid option
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        // Close scanner before exiting
        scanner.close();
        System.out.println("Exiting the system.");
    }
}
