import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays to store salary, years of service, new salary, and bonus amount
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalary = new double[10];
        double[] bonusAmount = new double[10];

        // Variables to store total bonus, total old salary, and total new salary
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Loop to take input from the user
        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    // Take salary input
                    System.out.print("Enter salary of employee " + (i + 1) + ": ");
                    salary[i] = sc.nextDouble();

                    // Take years of service input
                    System.out.print("Enter years of service of employee " + (i + 1) + ": ");
                    yearsOfService[i] = sc.nextDouble();

                    // Validate inputs
                    if (salary[i] <= 0 || yearsOfService[i] < 0) {
                        System.out.println("Invalid input! Salary must be positive and years of service cannot be negative. Try again.");
                        i--; // Decrement index to re-enter the data for the same employee
                    }
                    break; // Exit loop if input is valid
                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter numeric values.");
                    sc.next(); // Clear invalid input
                    i--; // Decrement index to retry input
                }
            }
        }

        // Loop to calculate the bonus and new salary
        for (int i = 0; i < 10; i++) {
            // Calculate bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonusAmount[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonusAmount[i] = salary[i] * 0.02; // 2% bonus
            }

            // Compute new salary
            newSalary[i] = salary[i] + bonusAmount[i];

            // Update totals
            totalBonus += bonusAmount[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary of Employees: " + totalOldSalary);
        System.out.println("Total New Salary of Employees: " + totalNewSalary);
    }
}
