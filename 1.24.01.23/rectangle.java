import java.util.*;

class Rectangle {
    double length, breadth;

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }
}

class Main {
    public static void main(String[] args) {
    
    	Scanner sc = new Scanner(System.in);
        
        // Creating an instance of the Rectangle class for the first rectangle
        Rectangle r1 = new Rectangle();

        // Setting the dimensions of the first rectangle
        r1.length = 3.5;
        r1.breadth = 4.7;

        // Calculating and printing the perimeter and area of the first rectangle
        double peri1 = r1.perimeter();
        double area1 = r1.area();
        System.out.println("Perimeter of Rectangle 1 = " + peri1);
        System.out.println("Area of Rectangle 1 = " + area1);
        
        // Creating an instance of the Rectangle class for the second rectangle
        Rectangle r2 = new Rectangle();
        
        // Taking user input for the dimensions of the second rectangle
        System.out.print("Enter the length of rectangle 2: ");
        r2.length = sc.nextDouble();
        System.out.print("Enter the breadth of rectangle 2: ");
        r2.breadth = sc.nextDouble();
        
        // Calculating and printing the perimeter and area of the second rectangle
        double peri2 = r2.perimeter();
        double area2 = r2.area();
        System.out.println("Perimeter of Rectangle 2 = " + peri2);
        System.out.println("Area of Rectangle 2 = " + area2);
        
        // Close the Scanner to prevent resource leak
        sc.close();
    }
}

