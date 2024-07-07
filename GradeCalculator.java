import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1 (out of 100): ");
        double marks1 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 2 (out of 100): ");
        double marks2 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 3 (out of 100): ");
        double marks3 = scanner.nextDouble();

        double totalMarks = marks1 + marks2 + marks3;
        double averagePercentage = totalMarks / 3;

        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.printf("Total Marks: %.2f\n", totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
    }
}

