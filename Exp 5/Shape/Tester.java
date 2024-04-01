import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Testing Rectangle class
        Rectangle rectangle1 = new Rectangle(); // Default rectangle
        rectangle1.Display();
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println();

        System.out.println("Enter length, width, and color for rectangle 2:");
        double length2 = scanner.nextDouble();
        double width2 = scanner.nextDouble();
        String color2 = scanner.next();

        Rectangle rectangle2 = new Rectangle(length2, width2, color2);
        rectangle2.Display();
        System.out.println("Area: " + rectangle2.getArea());

        // Testing Box class
        Box box1 = new Box(); // Default box
        System.out.println();
        box1.Display();
        System.out.println("Area: " + box1.getArea());
        System.out.println("Volume: " + box1.getVolume());

        System.out.println("Enter length, width, height, and color for box 2:");
        double lengthBox2 = scanner.nextDouble();
        double widthBox2 = scanner.nextDouble();
        double heightBox2 = scanner.nextDouble();
        String colorBox2 = scanner.next();

        Box box2 = new Box(lengthBox2, widthBox2, heightBox2, colorBox2);
        box2.Display();
        System.out.println("Area: " + box2.getArea());
        System.out.println("Volume: " + box2.getVolume());

        scanner.close();
    }
}

