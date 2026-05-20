package lab08q01;

public class Student {
    private String studentID;
    private String studentName;
    private Course[] courses = new Course[3];
    private int courseCount = 0;

    public Student() {
        this.studentID = "000";
        this.studentName = "Unknown";
    }

    public Student(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public void enrollCourse(Course c) {
        if (courseCount < 3) {
            courses[courseCount] = c;
            courseCount++;
            System.out.println("Course enrolled successfully.");
        } else {
            System.out.println("Cannot enroll. Maximum courses reached.");
        }
    }

    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Enrolled Courses:");
        for (int i = 0; i < courseCount; i++) {
            courses[i].displayCourseDetails();
        }
    }
}