import java.util.Scanner;

class AccInfo {
    // Data members
    String accname;
    String accno;
    String acctype;
    double accbalance;
    

    // Method to initialize account details
    void initialize(String name, String number, String type, double balance) {
        accname = name;
        accno = number;
        acctype = type;
        accbalance = balance;
    }

    // Method to display account balance
    void balance() {
        System.out.println("Account Holder name: " + accname);
        System.out.println("Account Balance: " + accbalance + "\n");
    }

    // Method to deposit an amount
    void deposit(double amount) {
        accbalance += amount;
        System.out.println("Amount deposited successfully.\n");
        balance();
    }

    // Method to withdraw an amount
    void withdraw(double amount) {
        if (amount <= accbalance) {
            accbalance -= amount;
            System.out.println("Withdrawal Successful. Please collect the amount.\n");
            balance();
        } else {
            System.out.println("Insufficient balance. Withdrawal not allowed\n");
        }
    }
}

public class Account2 {
    public static void main(String[] args) {
        AccInfo a1 = new AccInfo();
        Scanner sc = new Scanner(System.in);
        int option;
        String name;
        String number;
        String type;
        double balance;
        double amount;

        System.out.print("Welcome to SPIT Bank\nHow can we help you?\n");

        System.out.println("Please Initialize the account");
        System.out.print("Enter the Account holder name:");
        name = sc.nextLine();
        System.out.print("Enter the Account Number: ");
        number = sc.nextLine();
        System.out.print("Enter the Account Type: ");
        type = sc.nextLine();
        System.out.print("Enter the Account Balance: ");
        balance = sc.nextDouble();
        a1.initialize(name, number, type, balance);

        while (true) {
            System.out.println(
                    "Menu:\n1. Check Balance\n2. Withdraw Amount\n3. Deposit Amount\n4. Exit\nEnter the Menu number option");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    a1.balance();
                    break;
                case 2:
                    System.out.println("Enter the withdrawal Amount:");
                    amount = sc.nextDouble();
                    a1.withdraw(amount);
                    break;
                case 3:
                    System.out.println("Enter the Deposit Amount:");
                    amount = sc.nextDouble();
                    a1.deposit(amount);
                    break;
                case 4:
                    sc.close();
                    System.out.println("Exiting program. Thank you!");
                    return;
                default:
                    System.out.println("Please enter a valid option");
                    break;
            }
        }
    }
}

