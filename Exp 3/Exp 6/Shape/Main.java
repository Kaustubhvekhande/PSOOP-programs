import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter information for Circle:");
        System.out.print("Radius: ");
        double circleRadius = scanner.nextDouble();
        Circle circle = new Circle(circleRadius);

        System.out.println("\nEnter information for Triangle:");
        System.out.print("Side 1: ");
        double triangleSide1 = scanner.nextDouble();
        System.out.print("Side 2: ");
        double triangleSide2 = scanner.nextDouble();
        System.out.print("Side 3: ");
        double triangleSide3 = scanner.nextDouble();
        Triangle triangle = new Triangle(triangleSide1, triangleSide2, triangleSide3);

        System.out.println("\nEnter information for Pentagon:");
        System.out.print("Side: ");
        double pentagonSide = scanner.nextDouble();
        Pentagon pentagon = new Pentagon(pentagonSide);

        System.out.println("\nShapes Information:");
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Side: " + circle.getSide());

        System.out.println("\nTriangle Area: " + triangle.getArea());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());
        System.out.println("Triangle Sides: " + triangle.getSide());

        System.out.println("\nPentagon Area: " + pentagon.getArea());
        System.out.println("Pentagon Perimeter: " + pentagon.getPerimeter());
        System.out.println("Pentagon Side: " + pentagon.getSide());

        scanner.close();
    }
}
