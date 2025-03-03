import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object as "sc"

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check for a valid input
        if (number < 1) {
            System.out.println("Error: Enter a positive integer.");
            return;
        }

        // Create an array to store results
        String[] results = new String[number + 1];

        // Loop from 0 to the entered number
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz"; // Multiple of both 3 and 5
            } else if (i % 3 == 0) {
                results[i] = "Fizz"; // Multiple of 3
            } else if (i % 5 == 0) {
                results[i] = "Buzz"; // Multiple of 5
            } else {
                results[i] = String.valueOf(i); // Store number as string
            }
        }

        // Print results in the required format
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
