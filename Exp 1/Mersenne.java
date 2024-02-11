import java.util.Scanner;
import java.lang.Math;

class Checker {
    int count;

    public void isMersenne(int start, int end) {
        for (int i = start; i <= end; i++) {
            int temp = (int) Math.pow(2, i) - 1;
            if (isPrime(temp)) {
                System.out.println("The Mersenne Prime number is: " + (temp));
                System.out.println("The value of p is: " + i);
                count++;
            }
        }
        System.out.println("The total number of Mersenne Prime numbers in the given range is " + count);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Mersenne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Checker c1 = new Checker();
        int start, end;

        System.out.println("Please Enter the range-start:");
        start = sc.nextInt();

        System.out.println("Please Enter the range-end:");
        end = sc.nextInt();

        c1.isMersenne(start, end);
    }
}

