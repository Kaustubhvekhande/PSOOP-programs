import java.util.Scanner;

class Test {
    private double base;
    private int power;
    private int logbase;
    private int argument;

    // Constructor for the test object. Initializes all variables to 0 or null
    public Test() {
        this.base = 2;
        this.power = 2;
        this.logbase = 2;
        this.argument = 2;
    }

    public double calculate(double base, int power) {
        return Math.pow(base, power);
    }

    public double calculate(int logbase, int argument) {
        return Math.log(argument) / Math.log(logbase);
    }

}

public class Testpow {
    public static void main(String[] args) {
        Test t = new Test();

        loop:while (true) {
            System.out.println("********* Menu **********\n" +
                               "1.Perform the power\n" +
                               "2.Perform the logarithm\n" +
                               "3.Exit\n");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Enter the Base: ");
                double b = scanner.nextDouble();
                System.out.print("Enter the Power: ");
                int p = scanner.nextInt();
                System.out.printf("Result is %.3f%n", t.calculate(b, p));
            } else if (choice == 2) {
                System.out.print("Base of Logarithm : ");
                int lg = scanner.nextInt();
                System.out.print("Argument of Logarithm : ");
                int arg = scanner.nextInt();
                System.out.printf("Result is %.6f%n", t.calculate(lg, arg));
            } else if (choice == 3) {
                System.out.println("Exiting Program...");
                scanner.close();
                break loop;
            } else

            {
                System.out.println("Wrong Choice!! Please Enter Again.");
            }
        }

    }
}
