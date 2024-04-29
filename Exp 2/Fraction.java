import java.util.Scanner;

class Fraction {
	int num;
	int den;

	// Default constructor
	Fraction() {
		num = 1;
		den = 1;
	}

	// Parameterized constructor
	Fraction(int a, int b) {
		this.num = a;
		this.den = b;
	}

	// Method to find the greatest common divisor
	int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	// Method to reduce the fraction to its simplest form
	void reduce() {
		int divisor = gcd(num, den);
		num /= divisor;
		den /= divisor;
	}

	// Method to print the fraction
	void print() {
		System.out.print("" + num + "/" + den);
	}

	// Method to add two fractions
	void addFraction(Fraction f1, Fraction f2) {
		this.num = (f1.num * f2.den) + (f1.den * f2.num);
		this.den = (f1.den * f2.den);
		reduce();
		print();
	}

	// Method to subtract one fraction from another
	void subFraction(Fraction f1, Fraction f2) {
		this.num = (f1.num * f2.den) - (f1.den * f2.num);
		this.den = (f1.den * f2.den);
		reduce();
		print();
	}

	// Method to multiply two fractions
	void mulFaction(Fraction f1, Fraction f2) {
		this.num = (f1.num * f2.num);
		this.den = (f1.den * f2.den);
		reduce();
		print();
	}

	// Method to divide one fraction by another
	void divFaction(Fraction f1, Fraction f2) {
		this.num = (f1.num * f2.den);
		this.den = (f1.den * f2.num);
		reduce();
		if (this.den == 0) {
			System.out.println("Undefined!");
		} else {
			print();
		}
	}

	// Method to generate multiplication table for a given fraction
	void mulTable(int n) {
        int i;
        Fraction m = new Fraction();
        System.out.print("\n\t");
        for (i = 1; i < n; i++) { // for loop printing for 1st row of the table
            Fraction f1 = new Fraction(i, n);
            f1.reduce(); 
            f1.print();
            System.out.print("\t");
        }
        System.out.println("\n");
        for (i = 1; i < n; i++) { // for loop printing 1st column of the table
            Fraction f1 = new Fraction(i, n);
            f1.reduce(); 
            f1.print();
            System.out.print("\t");
            for (int j = 1; j < n; j++) { // nested for loop for calculating and printing  other columns and rows
                Fraction f2 = new Fraction(j, n);
                m.mulFaction(f1,f2);
                System.out.print("\t");
            }
            System.out.print("\n\n");
        }
	}

	// Main method
	public static void main(String[] args) {
		Fraction f = new Fraction();
		Scanner sc = new Scanner(System.in);
		int option;
		int a,b,c,d;

		// Taking input for the first fraction
		System.out.print("Enter the numerator of 1st fraction: ");
		a = sc.nextInt();
		do{
			System.out.print("Enter the denominator of 1st fraction: ");
			b = sc.nextInt();
			if (b == 0) { // Checking if denominator is zero
			   System.out.println("Denominator of Fraction can't be zero. Enter valid Denominator");
			}
			else
				break;
		}while(true);
		
		Fraction f1 = new Fraction(a, b);

		// Taking input for the second fraction
		System.out.print("Enter the numerator of 2nd fraction: ");
		c = sc.nextInt();
		do{
			System.out.print("Enter the denominator of 2nd fraction: ");
			d = sc.nextInt();
			if (d == 0) { // Checking if denominator is zero
			   System.out.println("Denominator of Fraction can't be zero. Enter valid Denominator");
			}
			else
				break;
		}while(true);
		Fraction f2 = new Fraction(c, d);

		// Menu for fraction operations
		loop: while (true) {
			System.out.println("\n\nMenu:\t1.Addition\t2.Subtraction\t3.Multiplication\t4.Division\t5.Exit");
			System.out.print("Enter your choice: ");
			option = sc.nextInt();

			switch (option) {
				case 1:
					System.out.print("The resultant Addition of Fractions is:");
					f.addFraction(f1, f2);
					break;

				case 2:
					System.out.print("The resultant Subtraction  of Fractions is:");
					f.subFraction(f1, f2);
					break;

				case 3:
					System.out.print("The resultant Multiplication  of Fractions is:");
					f.mulFaction(f1, f2);
					break;

				case 4:
					System.out.print("The resultant Division  of Fractions is:");
					f.divFaction(f1, f2);
					break;

				case 5:
					System.out.println("Exiting the calculator");
					break loop;

				default:
					System.out.println("\nInvalid Option!");
					break;
			}	
		}

		// Generating multiplication table for a given fraction
		System.out.print("Enter the denominator for multiplication table: ");
        int z = sc.nextInt();
        if (z <= 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
        } else {
            f.mulTable(z);
        }
		sc.close();
	}

}
