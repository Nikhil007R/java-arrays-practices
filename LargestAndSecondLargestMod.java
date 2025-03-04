import java.util.Scanner;

class LargestAndSecondLargestMod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initializing array size and index
        int maxDigit = 10; // Initial max size
        int[] digits = new int[maxDigit];
        int index = 0; // To track array position

        // Extract digits and store them in the array
        while (number != 0) {
            // If index reaches maxDigit, increase array size
            if (index == maxDigit) {
                maxDigit += 10; // Increase size by 10
                int[] temp = new int[maxDigit]; // Create new array
                System.arraycopy(digits, 0, temp, 0, digits.length); // Copy existing data
                digits = temp; // Assign expanded array
            }

            digits[index] = number % 10; // Extract last digit
            number /= 10; // Remove last digit
            index++; // Move to next array position
        }

        // If no digits were extracted, exit
        if (index == 0) {
            System.out.println("No digits found in the number.");
            return;
        }

        // Initialize variables to store largest and second-largest digits
        int largest = -1;
        int secondLargest = -1;

        // Loop to find the largest and second-largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = digits[i]; // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; // Update second largest
            }
        }

        // Display the results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second Largest digit: " + (secondLargest == -1 ? "No second largest digit" : secondLargest));
    }
}
