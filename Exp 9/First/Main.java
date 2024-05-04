import java.util.*;

public class Main {

    public void checkAge(int age) throws Exception {
        if (age < 0) {
            throw new Exception("Age cannot be negative");
        }
    }

    public static void checkPass(String pass) throws Exception {
        if (!pass.equals("123456")) {
            throw new Exception("Invalid Password");
        }
    }

    public void checkSal(int salary) throws Exception {
        if (salary < 0) {
            throw new Exception("Salary cannot be negative");
        }
    }

    public static void mainMethod() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n\nMenu: ");
            System.out.println("1. Check Age");
            System.out.println("2. Check Password");
            System.out.println("3. Check Salary");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter your age: ");
                        int age = sc.nextInt();
                        Main obj = new Main();
                        obj.checkAge(age);
                        System.out.println("Your age is valid.");
                        break;
                    case 2:
                        System.out.print("Enter your password: ");
                        String password = sc.next();
                        checkPass(password);
                        System.out.println("Password is valid.");
                        break;
                    case 3:
                        System.out.print("Enter your salary: ");
                        int sal = sc.nextInt();
                        Main obj1 = new Main();
                        obj1.checkSal(sal);
                        System.out.println("The salary is " + sal);
                        break;
                    default:
                        System.out.println("Invalid Choice!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number!");
                sc.nextLine(); // to clear the buffer
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("\nDo you want to continue? Y/N");
                char ch = sc.next().charAt(0);
                if (ch == 'Y' || ch == 'y') {
                    System.out.println("\n\nPress Enter Key To Continue...");
                    sc.nextLine();
                    mainMethod();
                } else {
                    System.exit(0);
                }
            }
        } while (true);
    
    }

    public static void main(String[] args) {
        mainMethod();
    }
}