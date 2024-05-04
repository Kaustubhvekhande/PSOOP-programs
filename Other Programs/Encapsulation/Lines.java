
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

    double getSlope() {
        return (y2 - y1) / (x2 - x1);
    }

    Lines(double m, double y_int) {
        this.slope = m;
        this.y_int = y_int;
        y_int = y1 - slope * x1;

        System.out.printf("The Equation of line in slope-intercept formt is: y = %.2fx + %.2f\n", slope, y_int);
    }

    Lines(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.x2= x2;
        this.y1 = y1;
        this.y2 = y2;
        System.out.printf("The Equation of line in two point form is : (y -%.2f)/%.2f = %.2f (x -%.2f)/(%.2f)\n", y1,
                y1 - y2,
                getSlope(), x1, x1 - x2);
    }

    Lines(double x1, double y1, double m) {
        this.x1 = x1;
        this.y1 = y1;
        this.slope = m;
        System.out.printf("The Equation of line in one point form is : (y -%.2f) = %.2f (x -%.2f)\n", y1,
                getSlope(), x1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1, x2, y1, y2, m, y_int;

        loop: while (true) {

            // Display the menu
            System.out.print("Menu:\n" + "1. Print two point form\n" + "2. Print one point form\n"
                    + "3. Print slope intercept form\n" + "4. Exit\n" + "Enter your choice: ");

            // Read the user's choice
            int choice = sc.nextInt();

            switch (choice) {
                case 1:

                    System.out.println("Enter the x1,y1,x2,y2 values for line");
                    x1 = sc.nextDouble();
                    y1 = sc.nextDouble();
                    x2 = sc.nextDouble();
                    y2 = sc.nextDouble();
                    Lines l1 = new Lines(x1, y1, x2, y2);
                    break;
                case 2:
                    System.out.println("Enter the values of x1,y1 and slope for line");
                    x1 = sc.nextDouble();
                    y1 = sc.nextDouble();
                    m = sc.nextDouble();
                    Lines l2 = new Lines(x1, y1, m);
                    break;
                case 3:
                    System.out.println("Enter values of slope and y-intercept for line");
                    m = sc.nextDouble();
                    y_int = sc.nextDouble();
                    Lines l3 = new Lines(m, y_int);
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
