package lab09q06;

public class ELearningApp {
    public static void main(String[] args) {

        Student student = new Student("John Perera");
        System.out.println("--- Student ---");
        student.enrollCourse("Object Oriented Programming");

        System.out.println();

        Instructor instructor = new Instructor("Alice Green");
        System.out.println("--- Instructor ---");
        instructor.enrollCourse("Data Structures");
        instructor.assignCourse("Database Systems");
    }
}