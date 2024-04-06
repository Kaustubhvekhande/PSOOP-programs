import java.util.*;

abstract class  AmusementPark{
	double totalcost;
		abstract double getcost(int p[],int age[]);
}

class Esselworld extends AmusementPark {
	@Override
	double getcost(int p[], int age[]) {
		// Calculate the cost of tickets
		double adultTicket = 1050;
		double childTicket = 660;
		double totalcost = 0;
		int n;
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		for (int i = 0; i < p.length; i++) {
			if (age[i] >= 21) {
				totalcost = totalcost + adultTicket;
			} else {
				totalcost += childTicket;
			}

		}
		for (int i = 0; i < p.length; i++) {
			System.out.println("enter the number game played by  player " + (i + 1) + " :");
			while (flag) {
				System.out.println("enter the game you want to play 1,2,3,4,5 AND 6 for exit ");
				n = sc.nextInt();
				if (n > 3 && n < 6) {
					totalcost += 50;

				}

				else if (n >= 6) {
					System.out.println("thanks for coming");
					flag = false;
				}

			}
			flag = true;

		}

		return totalcost;
	}

}



class Imagica extends AmusementPark {
	@Override
	double getcost(int p[], int age[]) {
		// Calculate the cost of tickets
		double adultTicket = 1050;
		double childTicket = 660;
		double totalcost = 0;
		int n;
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		for (int i = 0; i < p.length; i++) {
			if (age[i] >= 21) {
				totalcost = totalcost + adultTicket;
			} else {
				totalcost += childTicket;
			}

		}
		for (int i = 0; i < p.length; i++) {
			System.out.println("enter the number game played by  player " + (i + 1) + " :");
			while (flag) {
				System.out.println("enter the game you want to play 1,2,3,4,5,6,7 AND 8 for exit ");
				n = sc.nextInt();
				if (n > 3 && n < 8) {
					totalcost += 50;

				}

				else if (n >= 8) {
					System.out.println("thanks for coming");
					flag = false;
				}

			}
			flag = true;

		}

		return totalcost;
	}

}
