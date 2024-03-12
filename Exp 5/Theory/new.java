import java.util.*;

class Shape {

    private String color;

    public Shape() {
        System.out.println("Shape called");
        color = "Powder Blue";
    }

    public Shape(String color) {
        System.out.println("Shape called");
        this.color = color;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}

class Rectangle extends Shape {

    float length;
    float breadth;

    public Rectangle() {
        // super("Green");
        System.out.println("Rectangle is called");
        length = breadth = 1;

    }

    public Rectangle(float length, float breadth, String color) {
        // super(color);
        System.out.println("Rectangle is called");
        this.length = length;
        this.breadth = breadth;

    }

    public void setLength(float length) {
        this.length = length;
        this.breadth = breadth;

    }

    {
        this.length = length;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }

    public float getLength() {
        return length;
    }

    public float getBreadth() {
        return breadth;
    }

    public float area() {
        return length * breadth;
    }

    public void display() {
        System.out.println("Color:" + getColor());
        System.out.println("Length: " + length + "");
        System.out.println("Breadth: " + breadth + "");
    }

}

class TestRectangle {

    public static void main(String args[]) {

        Rectangle r = new Rectangle();

        r.display();
        r.setColor("Lilac");
        r.setBreadth(3.5f);
        r.setLength(4.0f);
        r.display();

        System.out.println("Area:" + r.area());
        r.display();

        Rectangle r1 = new Rectangle(4.7f, 3.2f, "Purple");
        r1.display();
    }

}
