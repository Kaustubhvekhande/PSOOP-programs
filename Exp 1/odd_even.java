import java.util.*;

class Number {
    // Class variables to store start, end, odd count, and even count
    int start, end, odd = 0, even = 0;

    // Method to print and count odd numbers in the specified range
    void odd() {
        System.out.println("The odd numbers are: ");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                odd++; // Increment odd count
            }
        }
        System.out.println("\n");
        System.out.println("The total odd numbers are " + odd + "\n");
    }

    // Method to print and count even numbers in the specified range
    void even() {
        System.out.println("The even numbers are: ");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                even++; // Increment even count
            }
        }
        System.out.println("\n");
        System.out.println("The total even numbers are " + even + "\n");
    }
}

class TestOddEven {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Create an instance of the Number class
        Number n1 = new Number();

        // Prompt the user to enter the start and end of the range
        System.out.println("Enter the start of range: ");
        n1.start = sc.nextInt();
        System.out.println("Enter the end of range: ");
        n1.end = sc.nextInt();

        // Call the odd and even methods to print and count odd and even numbers
        n1.odd();
        n1.even();

        // Close the Scanner to avoid resource leaks
        sc.close();
    }
}

