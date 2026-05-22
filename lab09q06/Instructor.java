package lab09q06;

public class Instructor implements Enrollable, Teachable {
    String instructorName;

    public Instructor(String instructorName) {
        this.instructorName = instructorName;
    }

    @Override
    public void enrollCourse(String courseName) {
        System.out.println("Instructor " + instructorName + " enrolled in: " + courseName);
    }

    @Override
    public void assignCourse(String courseName) {
        System.out.println("Instructor " + instructorName + " assigned to teach: " + courseName);
    }
}