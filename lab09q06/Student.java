package lab09q06;

public class Student implements Enrollable {
    String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public void enrollCourse(String courseName) {
        System.out.println("Student " + studentName + " enrolled in: " + courseName);
    }
}