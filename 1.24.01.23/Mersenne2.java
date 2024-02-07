import java.util.Scanner;
import java.lang.Math;

class Checker {
    int num;
    int Mersenne;

    void merse() {
        this.Mersenne = (int) Math.pow(2, this.num) - 1;
    }

    void check() {
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(this.Mersenne); i++) {
            if (this.Mersenne % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime && this.Mersenne > 1) {
            System.out.println(this.Mersenne + " is a prime number");
        } else {
            System.out.println(this.Mersenne + " is not a prime number");
        }
    }
}

public class Mersenne2 {
    public static void main(String[] args) {
        Checker m1 = new Checker();
        System.out.println("Please enter the number");
        Scanner sc = new Scanner(System.in);
        m1.num = sc.nextInt();
        m1.merse();
        m1.check();
    }
}

