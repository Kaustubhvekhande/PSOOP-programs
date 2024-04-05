public abstract class Shape {
    String color;

    abstract double getArea();

    public abstract String toString();

    abstract String getColor();
}

class Circle extends Shape {
    float radius;

    Circle(String color, float r) {
        super.color = color; // calling the parent's reference variable (color).
        this.radius = r;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    String getColor() {
        return super.color;
    } // getter method for color in circle class

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color= " + getColor() + "]";
    }
}

class Rectangle extends Shape {
    private float length;
    private float breadth;

    public Rectangle(String color,float l, float b) {
        super.color = color;
        length = l;
        breadth = b;
    }

    @Override
    double getArea() {
        return length * breadth;
    }

    @Override
    String getColor() {
        return super.color;
    }// getter method for color in rectangle class

    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", breadth=" + breadth + ", Color= " + getColor() + "]";
    }
}