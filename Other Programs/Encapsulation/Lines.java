
import java.util.Scanner;

public class Lines {
    double slope, y_int, x1, x2, y1, y2;

    Lines() {
        x1 = 0;
        y1 = 0;
        x2 = 1;
        y2 = 1;
        slope = 1;
        y_int = 0;
    }

    Lines(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.slope = getSlope();
        this.y_int = y1 - slope * x1;
    }

    double getSlope() {
        return (y2 - y1) / (x2 - x1);
    }

    void interceptForm() {

        y_int = y1 - slope * x1;

        System.out.printf("The Equation of line in slope-intercept formt is: y = %.2fx + %.2f\n", slope, y_int);
    }

    void twoPoint() {
        System.out.printf("The Equation of line in two point form is : (y -%.2f)/%.2f = %.2f (x -%.2f)/(%.2f)\n", y1,
                y1 - y2,
                getSlope(), x1, x1 - x2);
    }

    void onePoint() {
        System.out.printf("The Equation of line in one point form is : (y -%.2f) = %.2f (x -%.2f)\n", y1,
                getSlope(), x1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of x1:");
        double x1 = sc.nextDouble();
        System.out.println("Enter value of y1:");
        double y1 = sc.nextDouble();

        System.out.println("Enter value of x2:");
        double x2 = sc.nextDouble();
        System.out.println("Enter value of y2:");
        double y2 = sc.nextDouble();

        Lines l = new Lines(x1, y1, x2, y2);

        double m = l.getSlope();
        System.out.printf("The slope of given line is: %.2f\n", m);

        loop: while (true) {

            // Display the menu
            System.out.print("Menu:\n" + "1. Print two point form\n" + "2. Print one point form\n"
                    + "3. Print slope intercept form\n" + "4. Exit\n" + "Enter your choice: ");

            // Read the user's choice
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    l.twoPoint();
                    break;
                case 2:
                    l.onePoint();
                    break;
                case 3:
                    l.interceptForm();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break loop;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }

}
