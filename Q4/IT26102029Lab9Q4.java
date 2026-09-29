import java.util.Scanner;

public class IT26102029Lab9Q4 {
    
    // a) Calculate final mark (30% assignment, 70% exam)
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    // b) Find and return grade based on final mark
    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    // c) Print student details formatted
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-20s | %-10.2f | %c\n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        // d) Read details for 5 students
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = scanner.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignment = scanner.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double exam = scanner.nextDouble();

            // Calculate final mark and grade
            finalMarks[i] = calcFinalMark(assignment, exam);
            grades[i] = findGrades(finalMarks[i]);
        }

        // Display results table
        System.out.println("Name                 | Final Mark | Grade");
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        scanner.close();
    }
}