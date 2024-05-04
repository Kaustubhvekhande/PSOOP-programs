

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the account holder name: ");
        String name = sc.nextLine();
        System.out.print("Enter the account balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter the account number: ");
        String num = sc.next();

        System.out.print("Enter the interest Rate: ");
        double rate = sc.nextDouble();

        Savings s = new Savings(name, balance, num, rate);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account Information");
            System.out.println("4. Add Interest");
            System.out.println("5. Transfer");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    s.deposit(depositAmount);
                    s.display();
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    s.withdraw(withdrawAmount);
                    s.display();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    s.addInterest();
                    s.display();
                    break;
                case 5:
                    System.out.print("Enter amount to transfer: ");
                    double transferAmount = sc.nextDouble();
                    System.out.print("Enter account number to transfer to: ");
                    String transferAccount = sc.next();
                    Account otherAccount = new Savings("Other Account", 0, transferAccount, 0);
                    s.transfer(transferAmount, otherAccount);
                    s.display();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                    break;
            }
        } while (choice != 6);

        sc.close();
    }
}
