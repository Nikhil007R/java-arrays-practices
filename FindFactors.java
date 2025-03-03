import java.util.Arrays;
import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize array with a default size
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors and store them in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // If array is full, increase its size using Arrays.copyOf()
                if (index == factors.length) {
                    factors = Arrays.copyOf(factors, factors.length * 2); // Double the size
                }
                factors[index++] = i; // Store factor
            }
        }

        // Copy only the filled elements to a new exact-sized array
        factors = Arrays.copyOf(factors, index);

        // Display the factors
        System.out.println("Factors of " + number + ": " + Arrays.toString(factors));

        
    }
}
