import java.util.Scanner;

public class StudentCard2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Multi-dimensional array to store marks of Physics, Chemistry, and Maths
        double[][] marks = new double[numStudents][3]; // [][0] = Physics, [][1] = Chemistry, [][2] = Maths
        double[] percentage = new double[numStudents]; // Array to store percentage
        String[] grades = new String[numStudents]; // Array to store grades
        String[] remarks = new String[numStudents]; // Array to store remarks

        // Taking input for marks of students
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                
                while (true) {
                    System.out.print(subject + " Marks (out of 100): ");
                    marks[i][j] = sc.nextDouble();

                    if (marks[i][j] >= 0 && marks[i][j] <= 100) {
                        break; // Valid marks, exit loop
                    } else {
                        System.out.println("Invalid input! Marks must be between 0 and 100. Try again.");
                    }
                }
            }

            // Calculate total and percentage
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = (totalMarks / 300) * 100;

            // Assign Grade and Remarks
            if (percentage[i] >= 80) {
                grades[i] = "A";
                remarks[i] = "Level-4, above agency-normalized standards";
            } else if (percentage[i] >= 70) {
                grades[i] = "B";
                remarks[i] = "Level-3, at agency-normalized standards";
            } else if (percentage[i] >= 60) {
                grades[i] = "C";
                remarks[i] = "Level-2, below but approaching agency-normalized standards";
            } else if (percentage[i] >= 50) {
                grades[i] = "D";
                remarks[i] = "Level-1, well below agency-normalized standards";
            } else if (percentage[i] >= 40) {
                grades[i] = "E";
                remarks[i] = "Level-1, Too below agency-normalized standards";
            } else {
                grades[i] = "F";
                remarks[i] = "Remedial standards";
            }
        }

        // Display the results
        System.out.println("\nStudent Report:");

        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-35s\n", "Student", "Physics", "Chemistry", "Maths", "Total", "Percentage", "Grade & Remarks");


        for (int i = 0; i < numStudents; i++) {
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-1s (%s)\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], totalMarks, percentage[i], grades[i], remarks[i]);
        }
    }
}
