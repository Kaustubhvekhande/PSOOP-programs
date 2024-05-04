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
        // Assuming time = 1 year here for simplicity
        return (balance * interestRate) / 100;
    }

    @Override
    public double getCompoundInterest() {
        // Assuming time = 1 year here for simplicity
        return balance * ((1 + interestRate / 100) - 1);
    }

    public void calculateInterest() {
        double interest;
        if (accountType.equals("Saving")) {
            interest = getSimpleInterest();
        } else if (accountType.equals("Current")) {
            interest = getCompoundInterest();
        } else {
            interest = 0;  // Handle invalid account type
        }

        System.out.println("Interest for " + accountType + " account: " + interest);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account type (Saving or Current): ");
        String accountType = scanner.nextLine();

        System.out.println("Enter interest rate: ");
        double interestRate = scanner.nextDouble();

        System.out.println("Enter balance: ");
        double balance = scanner.nextDouble();

        Customer customer = new Customer(accountType, interestRate, balance);
        customer.calculateInterest();

        scanner.close();
    }
}
