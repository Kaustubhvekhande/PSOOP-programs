import java.util.*;

public class TestFraction {

    public static void main(String[] args) {
        Fraction f = new Fraction();
        Scanner sc = new Scanner(System.in);
        int option;

        System.out.print("Enter the numerator of 1st fraction: ");
        int a = sc.nextInt();
        System.out.print("Enter the denominator of 1st fraction: ");
        int b = sc.nextInt();
        Fraction f1 = new Fraction(a, b);

        System.out.print("Enter the numerator of 2nd fraction: ");
        int c = sc.nextInt();
        System.out.print("Enter the denominator of 2nd fraction: ");
        int d = sc.nextInt();
        Fraction f2 = new Fraction(c, d);

        while (true) {
            System.out.println("Menu:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
            System.out.print("Enter your choice: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    f.addFraction(f1, f2);
                    break;

                case 2:
                    f.subFraction(f1, f2);
                    break;

                case 3:
                    f.mulFaction(f1, f2);
                    break;

                case 4:
                    f.divFaction(f1, f2);
                    break;

                default:
                    System.out.println("\nInvalid Option!");
            }

            System.out.println("\nDo you want to perform another operation?\n1.Yes\n2.No");
            char ch = sc.next().charAt(0);

            if (ch == 'N' || ch == 'n') {
                System.out.println("Exiting the Program...");
                break;
            }
        }
    }
}
