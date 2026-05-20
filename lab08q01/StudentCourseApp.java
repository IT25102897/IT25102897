package lab08q01;

public class StudentCourseApp {
    public static void main(String[] args) {

        Course c1 = new Course("SE1020", "Object Oriented Programming");
        Course c2 = new Course("SE1030", "Data Structures");
        Course c3 = new Course("SE1040", "Database Systems");

        Student student = new Student("S001", "John Perera");

        student.enrollCourse(c1);
        student.enrollCourse(c2);
        student.enrollCourse(c3);

        System.out.println();
        student.displayStudentDetails();
    }
}