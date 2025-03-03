import java.util.Scanner;

class TwoDToOneDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Create a 2D array (matrix)
        int[][] matrix = new int[rows][cols];

        // Take user input for the matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Create a 1D array of size (rows * cols)
        int[] oneDArray = new int[rows * cols];
        int index = 0; // Index for 1D array

        // Copy elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                oneDArray[index++] = matrix[i][j];
            }
        }

        // Display the 1D array
        System.out.println("1D Array after copying elements:");
        for (int num : oneDArray) {
            System.out.print(num + " ");
        }

        
    }
}
