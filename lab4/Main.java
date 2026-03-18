package lab4;
class Driver {
    String driverID;
    String driverName;
    double baseSalary;
    int performanceScore;

    // Constructor 1
    Driver(String id, String name) {
        driverID = id;
        driverName = name;
        baseSalary = 0;
        performanceScore = 1;
    }

    // Constructor 2
    Driver(double salary) {
        baseSalary = salary;
        performanceScore = 1;
    }

    // Constructor 3
    Driver(String id, String name, double salary, int score) {
        driverID = id;
        driverName = name;
        baseSalary = salary;
        setPerformanceScore(score);
    }

    // Setter with validation
    void setPerformanceScore(int score) {
        if (score >= 1 && score <= 5)
            performanceScore = score;
        else
            performanceScore = 1;
    }

    // Bonus calculation
    double calculateBonus() {
        double rate = 0;

        switch (performanceScore) {
            case 5: rate = 0.20; break;
            case 4: rate = 0.15; break;
            case 3: rate = 0.10; break;
            case 2: rate = 0.05; break;
            default: rate = 0.02;
        }

        return baseSalary * rate;
    }

    double calculateBonus(int score) {
        double rate = 0;

        switch (score) {
            case 5: rate = 0.20; break;
            case 4: rate = 0.15; break;
            case 3: rate = 0.10; break;
            case 2: rate = 0.05; break;
            default: rate = 0.02;
        }

        return baseSalary * rate;
    }

    double calculateTotalSalary() {
        return baseSalary + calculateBonus();
    }

    void displayDetails() {
        System.out.println("Driver ID: " + driverID);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Performance Score: " + performanceScore);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " + calculateTotalSalary());
        System.out.println("--------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Driver d1 = new Driver("D01", "Kamal", 50000, 5);
        Driver d2 = new Driver("D02", "Nimal", 40000, 3);

        d1.displayDetails();
        d2.displayDetails();

        // Custom bonus check
        System.out.println("Custom Bonus (Score 4 for D1): " + d1.calculateBonus(4));
    }
}