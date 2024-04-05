import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Choice");
        int choice = 0;
        System.out.println("\n***********Menu**********\n" +
                "1. Cylinder\n" +
                "2. Cone\n" +
                "3. Sphere\n" +
                "4. Exit");
        while (choice != 4) {
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the base radius of Cylinder:");
                    double r1 = sc.nextDouble();
                    System.out.println("Enter the height of Cylinder:");
                    double h1 = sc.nextDouble();

                    // Creating an object of Cylinder class
                    Cylinder c1 = new Cylinder(r1, h1);

                    // Calling methods of Cylinder class
                    System.out.printf("The surface area of Cylinder is: %.2f\n", c1.getSurfaceArea());
                    System.out.printf("The volume of Cylinder is: %.2f\n", c1.getVolume());
                    break;

                case 2:
                    System.out.println("Enter the base radius of Cone:");
                    double r2 = sc.nextDouble();
                    System.out.println("Enter the height of Cone:");
                    double h2 = sc.nextDouble();

                    // Creating an object of Cone class
                    Cone c2 = new Cone(r2, h2);

                    // Calling methods of Cone class
                    System.out.printf("The surface area of Cone is: %.2f\n", c2.getSurfaceArea());
                    System.out.printf("The volume of Cone is: %.2f\n", c2.getVolume());
                    break;

                case 3:
                    System.out.println("Enter the radius of Sphere:");
                    double r3 = sc.nextDouble();

                    // Creating an object of Sphere class
                    Sphere c3 = new Sphere(r3);

                    // Calling methods of Sphere class
                    System.out.printf("The surface area of Sphere is: %.2f\n", c3.getSurfaceArea());
                    System.out.printf("The volume of Sphere is: %.2f\n", c3.getVolume());
                    break;

                case 4:
                    System.out.println("Exiting Program");
                    break;

                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        }

        sc.close();
    }
}
