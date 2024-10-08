package utsa.practice.grades;

// Represents the grade information for a student
public class StudentGrade {
    // Attributes for course number, student ID, student name, and grade
    private String courseNumber;
    private String studentID;
    private String studentName;
    private String grade;

    // Constructor to initialize all attributes
    public StudentGrade(String courseNumber, String studentID, String studentName, String grade) {
        this.courseNumber = courseNumber;
        this.studentID = studentID;
        this.studentName = studentName;
        this.grade = grade;
    }

    // Getters and setters for each attribute
    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Method to display the student's grade information
    public String toString() {
        return "Course: " + courseNumber + ", StudentID: " + studentID +
                ", Name: " + studentName + ", Grade: " + grade;
    }
}

