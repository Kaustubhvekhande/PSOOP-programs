import java.util.*;
import java.text.*;

public class TestShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rectangle, circle, square;

        System.out.print("Enter the number of rectangles: ");
        rectangle = sc.nextInt();
        System.out.print("Enter the number of Circles: ");
        circle = sc.nextInt();
        System.out.print("Enter the number of Squares: ");
        square = sc.nextInt();

        Working wo = new Working();

        ArrayList<Double> areaRectangle = new ArrayList<>();

        for (int i = 0; i < rectangle; i++) {
            System.out.print("Enter the length of rectangle  " + (i + 1) + ":");
            double l = sc.nextDouble();
            System.out.print("Enter the width of rectangle " + (i + 1) + ":");
            double w = sc.nextDouble();
            System.out.println();
            areaRectangle.add(wo.rectangleArea(l, w));
        }

        ArrayList<Double> areaSquare = new ArrayList<>();

        for (int i = 0; i < square; i++) {
            System.out.print("Enter the side of square" + (i + 1) + " :");
            double s = sc.nextDouble();
            System.out.println();
            areaSquare.add(wo.squareArea(s));
        }

        ArrayList<Double> areaCircle = new ArrayList<>();

        for (int i = 0; i < circle; i++) {
            System.out.print("Enter the radius of circle" + (i + 1) + " :");
            double s = sc.nextDouble();
            System.out.println();
            areaCircle.add(wo.circleArea(s));
        }

        DecimalFormat df = new DecimalFormat("#.###");

        ArrayList<String> roundedAreaRectangle = new ArrayList<>();
        for (double area : areaRectangle) {
            roundedAreaRectangle.add(df.format(area));
        }

        ArrayList<String> roundedAreaSquare = new ArrayList<>();
        for (double area : areaSquare) {
            roundedAreaSquare.add(df.format(area));
        }

        ArrayList<String> roundedAreaCircle = new ArrayList<>();
        for (double area : areaCircle) {
            roundedAreaCircle.add(df.format(area));
        }

        System.out.println("The areas of Rectangles are " + roundedAreaRectangle);
        System.out.println("The areas of Square are " + roundedAreaSquare);
        System.out.println("The areas of Circle are " + roundedAreaCircle);

        sc.close();
    }
}
