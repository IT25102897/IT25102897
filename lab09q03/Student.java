package lab09q03;

public class Student {
    String studentId;
    String studentName;
    static String universityName;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void displayStudentInfo() {
        System.out.println("University: " + universityName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println();
    }
}