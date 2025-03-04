import java.util.Scanner;

class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = sc.nextInt();

        // Multi-dimensional array to store weight, height, and BMI
        double[][] personData = new double[numPersons][3]; // [][0] = height, [][1] = weight, [][2] = BMI
        String[] weightStatus = new String[numPersons]; // Array to store weight status

        // Taking input for weight and height of each person
        for (int i = 0; i < numPersons; i++) {
            while (true) {
                System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
                personData[i][1] = sc.nextDouble(); // Store weight

                System.out.print("Enter height (m) of person " + (i + 1) + ": ");
                personData[i][0] = sc.nextDouble(); // Store height

                // Validate inputs: Ensure positive values
                if (personData[i][1] > 0 && personData[i][0] > 0) {
                    break; // Exit loop if valid input
                } else {
                    System.out.println("Invalid input! Weight and height must be positive values. Try again.");
                }
            }

            // Calculate BMI and store it in the array
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determine weight status based on BMI
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] > 18.4 && personData[i][2] < 25) { // Fixed to avoid floating-point errors
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the results
        System.out.println("\nBMI Report:");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Status");

        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
