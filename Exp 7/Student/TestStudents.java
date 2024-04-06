import java.util.Scanner;

public class TestStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Creating instances of courses
        Comp compCourse = new Comp();
        IT itCourse = new IT();
        
        // Taking input from the user for Comp course
        System.out.println("Enter the number of students for Comp course:");
        int numCompStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        for (int i = 0; i < numCompStudents; i++) {
            String name, UID, year;
            do {
                System.out.println("Enter student details (name, UID, year) for Comp course:");
                name = scanner.nextLine();
                UID = scanner.nextLine();
                year = scanner.nextLine();
                if (!isValidYear(year)) {
                    System.out.println("Invalid year! Please enter FE, SE, or TE.");
                }
            } while (!isValidYear(year));
            compCourse.addStudent(name, UID, year);
        }
        
        // Taking input from the user for IT course
        System.out.println("Enter the number of students for IT course:");
        int numITStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        for (int i = 0; i < numITStudents; i++) {
            String name, UID, year;
            do {
                System.out.println("Enter student details (name, UID, year) for IT course:");
                name = scanner.nextLine();
                UID = scanner.nextLine();
                year = scanner.nextLine();
                if (!isValidYear(year)) {
                    System.out.println("Invalid year! Please enter FE, SE, or TE.");
                }
            } while (!isValidYear(year));
            itCourse.addStudent(name, UID, year);
        }
        
        // Ask user to choose a course
        System.out.println("Choose a course (1 for Comp, 2 for IT):");
        int choice = scanner.nextInt();
        
        // Print student details of the chosen course
        if (choice == 1) {
            System.out.println("Students in Comp course:");
            compCourse.studentDetails();
        } else if (choice == 2) {
            System.out.println("Students in IT course:");
            itCourse.studentDetails();
        } else {
            System.out.println("Invalid choice!");
        }
        
        scanner.close();
    }
    
    // Method to check if the entered year is valid
    private static boolean isValidYear(String year) {
        return year.equals("FE") || year.equals("SE") || year.equals("TE");
    }
}
