import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = input.nextLine();

        System.out.println("Enter basic salary: ");
        double salary = input.nextDouble();

        System.out.println("Enter performance rating (1-5): ");
        int rating = input.nextInt();

        Employee emp = new Employee(name, salary, rating);

        emp.displayDetails();
    }
}
