import java.lang.*;
import java.util.*;

class Grades {

    int[] grade;

    Grades(int n) {
        this.grade = new int[n];
    }

    void sortArray(int[] n) {
        Arrays.sort(n);
    }

    double getAvg() {
        int sum = 0;
        for (int i = 0; i < grade.length; i++) {
            sum = sum + grade[i]; // initializing the variable
        }
        return sum / grade.length; // returning average of grades
    }

    int getMin() {
        sortArray(this.grade);
        return this.grade[0];
    }

    int getMax() {
        sortArray(grade);
        return this.grade[grade.length - 1];
    }

    int getMedian() {
        sortArray(grade);
        if (grade.length % 2 == 0) {
            return (grade[grade.length / 2] + grade[(grade.length / 2) - 1]) / 2;
        } else {
            return grade[(grade.length / 2) + 1];
        }
    }

    double getStdDevation() {
        double sqsum = 0.0;
        for (int i = 0; i < grade.length; i++) {
            sqsum += Math.pow((getAvg() - grade[i]), 2);
        }
        return Math.sqrt(sqsum / grade.length);
    }
}

class GradeStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int n = sc.nextInt();
        Grades g = new Grades(n);

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the grade of student %d:", i+1);
            g.grade[i] = sc.nextInt();
        }
        int choice = 0;
        System.out.println("1. Average");
        System.out.println("2. Minimum");
        System.out.println("3. Maximum");
        System.out.println("4. Median");
        System.out.println("5. Standard Deviation");
        System.out.println("6. Exit");
        while (choice != 6) {

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Average: " + g.getAvg());
                    break;
                case 2:
                    System.out.println("Minimum: " + g.getMin());
                    break;
                case 3:
                    System.out.println("Maximum: " + g.getMax());
                    break;
                case 4:
                    System.out.println("Median: " + g.getMedian());
                    break;
                case 5:
                    System.out.printf("Standard Deviation: %.2f",g.getStdDevation());
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
            System.out.println();
        }

        sc.close();

    }
}
