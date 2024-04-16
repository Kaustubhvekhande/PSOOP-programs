import java.util.Scanner;

interface SavingAccount {
    double getSimpleInterest();
}

interface CurrentAccount {
    double getCompoundInterest();
}

class Customer implements SavingAccount, CurrentAccount {
    private String accountType;
    private double interestRate;
    private double balance;

    public Customer(String accountType, double interestRate, double balance) {
        this.accountType = accountType;
        this.interestRate = interestRate;
        this.balance = balance;
    }

    @Override
    public double getSimpleInterest() {
        // Simple interest calculation
        double simpleInterest = (balance * interestRate) / 100;
        return simpleInterest;
    }

    @Override
    public double getCompoundInterest() {
        // Compound interest calculation (assuming annual compounding)
        double compoundInterest = balance * Math.pow((1 + interestRate / 100), 1) - balance;
        return compoundInterest;
    }

    public void printInterest() {
        if (accountType.equals("Saving")) {
            System.out.println("Simple Interest: " + getSimpleInterest());
        } else if (accountType.equals("Current")) {
            System.out.println("Compound Interest: " + getCompoundInterest());
        } else {
            System.out.println("Invalid account type");
        }
    }
}

public class Account {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account type (Saving/Current):");
        String accountType = scanner.nextLine();

        System.out.println("Enter interest rate:");
        double interestRate = scanner.nextDouble();

        System.out.println("Enter balance:");
        double balance = scanner.nextDouble();

        Customer customer = new Customer(accountType, interestRate, balance);

        System.out.println("\nCustomer:");
        customer.printInterest();

        scanner.close();
    }
}
