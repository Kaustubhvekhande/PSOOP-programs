import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Enter the number of days for the deposit:");
        int days = scanner.nextInt();

        Bank[] banks = { new SBI_Bank(), new ICICI_Bank(), new AXIS_Bank() };
        double[] principals = { 10000, 12500, 20000 };
        String[] bankNames = { "SBI", "ICICI", "AXIS" };

        for (int i = 0; i < banks.length; i++) {
            float rate = banks[i].getROI(days);
            double amount = banks[i].calculateAmount(principals[i], rate, days);
            Calendar maturityDate = banks[i].calculateMaturityDate(days);

            System.out.println("Bank Name: " + bankNames[i]);
            System.out.println("Amount Deposited: " + principals[i]);
            System.out.println("Duration (Days): " + days);
            System.out.println("Interest Rate (% per annum): " + rate);
            System.out.printf("Maturity Amount: %.2f\n", amount);
            System.out.println("Maturity Date: " + sdf.format(maturityDate.getTime()));
            System.out.println("---------------------------------------");
        }

        scanner.close();
    }
}
