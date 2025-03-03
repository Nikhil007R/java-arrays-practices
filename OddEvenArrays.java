import java.util.Scanner;

class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Initialize arrays to store odd and even numbers
        int evenSize = number / 2 + 1;
        int oddSize = number / 2 + 1;
        int[] evenNumbers = new int[evenSize];
        int[] oddNumbers = new int[oddSize];

        // Index variables for even and odd arrays
        int evenIndex = 0, oddIndex = 0;

        // Iterate from 1 to the given number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        // Print the odd numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        // Print the even numbers
        System.out.print("\nEven numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }


    }
}
