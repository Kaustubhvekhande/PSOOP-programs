import java.util.*;

class AccInfo {
    // Data members
    String name;
    long accno;
    String acctype;
    double accbalance;
    Scanner sc = new Scanner(System.in);

    // Method to initialize account details
    void initialize() {
        System.out.print("Enter Account holder name:");
        name = sc.nextLine();

        System.out.println("Enter Account number:");
        accno = sc.nextLong();

        while (true) {
            System.out.print("Enter account type (saving/current):");
            String accounttype = sc.next().toLowerCase();
            if (accounttype.equals("savings") || accounttype.equals("current")) {
                acctype = accounttype;
                break; // Exit the loop if a valid account type is entered
            } else {
                System.out.println("Please enter a valid account type (savings or current)");
            }
        }

        System.out.println("Enter initial Account Balance: ");
        accbalance = sc.nextDouble();
    }

    // Method to display account balance
    void balance() {
        System.out.println("Account Holder name: " + name);
        System.out.println("Account Balance: " + accbalance + "\n");
    }

    // Method to deposit an amount
    void deposit() {
        System.out.print("Enter the Deposit amount:");
        double amount = sc.nextDouble();
        accbalance += amount;
        System.out.println("Amount deposited successfully.\n");
        balance();
    }

    // Method to withdraw an amount
    void withdraw() {
        System.out.print("Enter the withdrawal Amount:");
        double amount = sc.nextDouble();
        if (amount <= accbalance) {
            accbalance -= amount;
            System.out.println("Withdrawal Successful. Please collect the amount.\n");
            balance();
        } else {
            System.out.println("Insufficient balance. Withdrawal not allowed\n");
        }
    }

    // Method to close the Scanner to prevent resource leak
    void closeScanner() {
        sc.close();
    }
}

public class Account {
    public static void main(String[] args) {
        // Creating a new instance for the class AccInfo in main
        AccInfo a1 = new AccInfo();
        Scanner sc = new Scanner(System.in);
        int option;

        // Welcome Message
        System.out.print("Welcome to SPIT Bank\nHow can we help you?\n");

        // Prompt the user to initialize the account
        System.out.println("Please Initialize the account");
        a1.initialize();

        // Main menu loop
        while (true) {
            System.out.println(
                    "Menu:\n1. Check Balance\n2. Withdraw Amount\n3. Deposit Amount\n4. Exit\nEnter the Menu number option");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    a1.balance();
                    break;
                case 2:
                    a1.withdraw();
                    break;
                case 3:
                    a1.deposit();
                    break;
                case 4:
                    a1.closeScanner();
                    sc.close();
                    System.out.println("Exiting program. Thank you!");
                    return; // Exit the main method
                default:
                    System.out.println("Please enter a valid option");
                    break;
            }
        }
    }
}
