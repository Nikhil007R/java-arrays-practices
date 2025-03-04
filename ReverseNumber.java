import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Count the number of digits
        int temp = number, count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Create an array to store the digits
        int[] digits = new int[count];

        // Store the digits in the array
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10; // Extract last digit
            temp /= 10; // Remove last digit
        }

        // Display the digits in reverse order (already reversed in array)
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        System.out.println(); // Move to the next line
    }
}
