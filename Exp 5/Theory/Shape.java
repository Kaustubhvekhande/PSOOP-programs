public class Shape {
    private String color;

    public Shape() {
        super();
        System.out.println("Shape called");
        color = "Powder Blue";
    }

    public Shape(String color) {
        super();
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
    private double length;
    private double width;

    public Rectangle() {
        super("Green");
        System.out.println("Rectangle is called");
        length = width = 1;

    }

    public Rectangle(double length, double breadth, String color) {
      
        super(color);
        System.out.println("Rectangle is called");
        this.length = length;
        this.width = breadth;

    }

    // Accessor methods
    public void setLength(double len) {
        if (len <= 0) {
            throw new IllegalArgumentException("Length must be greater than zero.");
        }
        length = len;
    }

    public void setWidth(double wid) {
        if (wid <= 0) {
            throw new IllegalArgumentException("Width must be greater than zero.");
        }
        width = wid;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }

    public void Display() {
        System.out.println("Color: " + getColor());
        System.out.print("Length: " + getLength());
        System.out.println(", Width: " + getWidth());
    }
}

class Box extends Rectangle {
    private double height;

    public void setHeight(double h) {
        if (h <= 0) {
            throw new IllegalArgumentException("Height must be greater than zero.");
        } else
            height = h;
    }

    public double getHeight() {
        return height;
    }

    Box() {
        height = 1;
    }

    Box(double Length, Double Width, String color, Double Height) {
        super(Length, Width, color);
        this.height = Height;

    }

    double getVolume(){
        return height*getArea();
    }
    public void Display() {
        super.Display();
        System.out.println("Height: " + getHeight());
    }
}

class TestRectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.Display();
        r.setColor("Red");
        r.setLength(3.51);
        r.setWidth(2.5);
        r.Display();
        System.out.println("Area: " + r.getArea() + " square units");


        Box b = new Box(3.4, 2.6, "Purple", 2.5);
        b.Display();
        System.out.println("Volume: " + b.getVolume() + " cubic units");
    }
}