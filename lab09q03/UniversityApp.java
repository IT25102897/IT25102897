package lab09q03;

public class UniversityApp {
    public static void main(String[] args) {

        Student.universityName = "SLIIT University";

        Student s1 = new Student("S001", "John Perera");
        Student s2 = new Student("S002", "Alice Green");
        Student s3 = new Student("S003", "David Silva");

        System.out.println("--- Initial University Name ---");
        s1.displayStudentInfo();
        s2.displayStudentInfo();
        s3.displayStudentInfo();

        Student.universityName = "University of Colombo";

        System.out.println("--- After Changing University Name ---");
        s1.displayStudentInfo();
        s2.displayStudentInfo();
        s3.displayStudentInfo();
    }
}