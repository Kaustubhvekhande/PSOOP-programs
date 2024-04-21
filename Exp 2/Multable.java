import java.util.Scanner;

public class Multable {

    int num;
    int den;

    Multable() {
		num = 1;
		den = 1;
	}

    Multable(int a, int b) {
		this.num = a;
		this.den = b;
	}

    int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    void reduce() {
        int divisor = gcd(num, den);
        num /= divisor;
        den /= divisor;
    }

    void print() {
        System.out.print("" + num + "/" + den);
    }

    void mulFaction(Multable f1, Multable f2) {
		this.num = (f1.num * f2.num);
		this.den = (f1.den * f2.den);
		reduce();
		print();
	}

    void mulTable(int n) {
        int i;
        Multable m = new Multable();
        System.out.print("\n\t");
        for (i = 1; i <= n; i++) {
            Multable f1 = new Multable(i, n);
            f1.reduce(); 
            f1.print();
            System.out.print("\t");
        }
        System.out.println("\n");
        for (i = 1; i <= n; i++) {
            Multable f1 = new Multable(i, n);
            f1.reduce(); 
            f1.print();
            System.out.print("\t");
            for (int j = 1; j <= n; j++) {
                Multable f2 = new Multable(j, n);
                m.mulFaction(f1,f2);
                System.out.print("\t");
            }
            System.out.print("\n\n");
        }

        


        


    }
    
    

    public static void main(String[] args) {
        Multable ml = new Multable();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the denominator for multiplication table: ");
        int d = sc.nextInt();
        if (d <= 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
        } else {
            ml.mulTable(d);
        }
        sc.close();
    }
}
