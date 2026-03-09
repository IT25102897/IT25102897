public class Employee {

    private String name;
    private double basicSalary;
    private int performanceRating;

    public Employee(String name, double basicSalary, int performanceRating) {
        this.name = name;
        this.basicSalary = basicSalary;

        if (performanceRating >= 1 && performanceRating <= 5) {
            this.performanceRating = performanceRating;
        } else {
            this.performanceRating = 1;
        }
    }

    public double calculateBonus() {
        double bonus = 0;

        switch (performanceRating) {
            case 5:
                bonus = basicSalary * 0.20;
                break;
            case 4:
                bonus = basicSalary * 0.15;
                break;
            case 3:
                bonus = basicSalary * 0.10;
                break;
            case 2:
                bonus = basicSalary * 0.05;
                break;
            case 1:
                bonus = 0;
                break;
        }

        return bonus;
    }

    public double calculateTotalSalary() {
        return basicSalary + calculateBonus();
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Performance Rating: " + performanceRating);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " + calculateTotalSalary());

    }
}
