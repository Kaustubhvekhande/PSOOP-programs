

abstract public class Account {
    String Acc_Name;
    double balance;
    String Acc_No;

    Account(String n, double b, String num) {
        this.Acc_Name = n;
        this.balance = b;
        this.Acc_No = num;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    abstract void display();
}

class Savings extends Account {
    double intererst;
    double min_bal = 0;

    Savings(String n, double b, String num, double i) {
        super(n, b, num);
        this.intererst = i;
    }

    void deposit(double ammount) {
        try {
            if (ammount < 0) {
                throw new IllegalArgumentException("Negative ammount");
            } else {
                balance += ammount;
                System.out.println("Deposit Succesfull");
            }
        } catch (Exception e) {
            System.out.println("Deposit Failed" + e.getMessage());
        }
    }

    void withdraw(double ammount) {
        try {
            if (ammount < 0) {
                throw new IllegalArgumentException("Negative ammount");
            } else if (ammount > balance) {
                throw new IllegalArgumentException("Insufficient Funds");
            } else {
                balance -= ammount;
                System.out.println("Withdraw Succesfull");
            }
        } catch (Exception e) {
            System.out.println("Withdrawal Failed" + e.getMessage());
        }
    }

    void display() {

        System.out.println("Account Name: " + Acc_Name);
        System.out.println("Account Number: " + Acc_No);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + intererst);

    }

    void addInterest() throws ArithmeticException {
        if (intererst < 0) {
            throw new ArithmeticException("Interest rate cannot be negative");
        } else {
            balance += balance * intererst / 100;
        }
    }

    void transfer(double ammount, Account acc) {
        if (balance > ammount) {
            balance -= ammount;
            acc.deposit(ammount);
        } else {
            System.out.println("Transfer Failed : Insufficient Funds");
        }
    }
}
