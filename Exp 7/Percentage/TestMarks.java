

import java.util.*;

public class TestMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        A a = new A();
        B b = new B();

        System.out.println("Enter the number of subjects for Student A: ");
        int num_subjectsA = sc.nextInt();

        sc.nextLine(); // Consume the newline left by nextInt()

        for (int i = 0; i < num_subjectsA; i++) {
            String subject;
            int mark;

            System.out.println("Enter the subject "+(i+1) +" name and marks(out of 100)");
            subject = sc.nextLine();
            mark = sc.nextInt();
            a.addSubject(subject, mark);
            sc.nextLine(); // Consume the newline left by nextInt()
        }

        System.out.println("Enter the number of subjects for Student B: ");
        int num_subjectsB = sc.nextInt();

        sc.nextLine(); // Consume the newline left by nextInt()

        for (int i = 0; i < num_subjectsB; i++) {
            String subject;
            int mark;

            System.out.println("Enter the subject name and marks(out of 100)");
            subject = sc.nextLine();
            mark = sc.nextInt();
            b.addSubject(subject, mark);
            sc.nextLine(); // Consume the newline left by nextInt()
        }

        System.out.println("The percentage of Student A is " + a.getPercentage() + "%.");
        System.out.println("The Marks of Student A in each subject is");
        a.showPerformance();

        System.out.println("The percentage of Student B is " + b.getPercentage() + "%.");
        System.out.println("The Marks of Student B in each subject is");
        b.showPerformance();
    }
}
