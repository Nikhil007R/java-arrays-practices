import java.util.Scanner;

class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Arrays to store marks, percentage, grades, and remarks
        double[] physics = new double[numStudents];
        double[] chemistry = new double[numStudents];
        double[] maths = new double[numStudents];
        double[] percentage = new double[numStudents];
        String[] grades = new String[numStudents];
        String[] remarks = new String[numStudents];

        // Taking input for marks of students
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            physics[i] = getValidMarks(sc, "Physics");
            chemistry[i] = getValidMarks(sc, "Chemistry");
            maths[i] = getValidMarks(sc, "Maths");

            // Calculate total and percentage
            double totalMarks = physics[i] + chemistry[i] + maths[i];
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
            double totalMarks = physics[i] + chemistry[i] + maths[i];
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-1s (%s)\n",
                    (i + 1), physics[i], chemistry[i], maths[i], totalMarks, percentage[i], grades[i], remarks[i]);
        }
    }

    // Method to take valid marks input
    public static double getValidMarks(Scanner sc, String subject) {
        double marks;
        while (true) {
            System.out.print(subject + " Marks (out of 100): ");
            marks = sc.nextDouble();

            if (marks >= 0 && marks <= 100) {
                return marks; // Valid input, return marks
            } else {
                System.out.println("Invalid input! Marks must be between 0 and 100. Try again.");
            }
        }
    }
}
