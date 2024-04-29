import java.util.Scanner;
import java.lang.Math;

class Shape {
    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    public double getSide() {
        return 0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getSide() {
        return Double.NaN;
    }
}

class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getSide() {
        return side1;
    }
}

class Pentagon extends Shape {
    private double side;

    public Pentagon(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return 5 * side;
    }

    @Override
    public double getSide() {
        return side;
    }
}

