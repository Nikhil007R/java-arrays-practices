import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Frequency array to store count of digits (0-9)
        int[] frequency = new int[10];

        // Extract digits and count frequency
        int temp = Math.abs(number); // Taking absolute value to handle negative numbers
        while (temp != 0) {
            int digit = temp % 10; // Extract last digit
            frequency[digit]++; // Increment count of that digit
            temp /= 10; // Remove last digit
        }

        // Display the frequency of each digit
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) { // Display only digits that appear
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }
    }
}
