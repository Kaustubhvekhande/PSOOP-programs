import java.util.*;

public class TestPosting {
    public static void main(String[] args) {
        // Posting posting = new Posting();
        Scanner sc = new Scanner(System.in);
        int coursework, apttest, techtest, interview;

        loop: while (true) {

            System.out.println("\nEnter the post you want to apply\n" +
                    "1.Programmer\n" +
                    "2.Team Leader\n" +
                    "3.Project Manager\n"+
                    "4.Exit\n");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Marks for coursework, Aptiitute Test, Technical test & Interview");
                    coursework = sc.nextInt();
                    apttest = sc.nextInt();
                    techtest = sc.nextInt();
                    interview = sc.nextInt();
                    Posting p1 = new Posting(coursework, apttest, techtest, interview);
                    p1.display(choice);
                    break;
                case 2:
                    System.out.println("Enter the Marks for Technical test & Interview");
                    techtest = sc.nextInt();
                    interview = sc.nextInt();
                    Posting p2 = new Posting(techtest, interview);
                    p2.display(choice);
                    break;
                case 3:
                    System.out.println("Enter the Marks for Interview");
                    interview = sc.nextInt();
                    Posting p3 = new Posting(interview);
                    p3.display(choice);
                    break;

                case 4:
                    break loop;

                default:
                    System.out.println("Enter valid Choise");
                    break;
            }
        }

        sc.close();

    }
}
