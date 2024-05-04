import java.util.*;

public class TestDate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date d = new Date();

		d.displayDate();// printing default values

		loop: while (true) {
			System.out.println("\n*************Menu************\n"+
							   "1.dd/mm/yy format\n"+
							   "2.dd/mm/yy hh:mm format\n"+
							   "3.dd/mm/yy hh:mm:ss format\n"+
							   "4.Exit\n");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:
					System.out.print("Enter year: ");
					int year = sc.nextInt();

					System.out.print("Enter Month: ");
					int month = sc.nextInt();

					System.out.print("Enter Date: ");
					int date = sc.nextInt();

					d = new Date(year, month, date);
					System.out.println("Printing Updated values: ");
					d.displayDate();
					break;

				case 2:

					System.out.print("Enter year: ");
					int year2 = sc.nextInt();

					System.out.print("Enter Month: ");
					int month2 = sc.nextInt();

					System.out.print("Enter year: ");
					int date2 = sc.nextInt();

					System.out.print("Enter Hours: ");
					int hour2 = sc.nextInt();

					System.out.print("Enter Minutes: ");
					int min2 = sc.nextInt();

					d = new Date(year2, month2, date2, hour2, min2);
					System.out.println("Printing Updated values: ");
					d.displayDate();
					break;

				case 3:
					System.out.print("Enter year: ");
					int year3 = sc.nextInt();

					System.out.print("Enter Month: ");
					int month3 = sc.nextInt();

					System.out.print("Enter Date: ");
					int date3 = sc.nextInt();

					System.out.print("Enter Hours: ");
					int hour3 = sc.nextInt();

					System.out.print("Enter Minutes: ");
					int min3 = sc.nextInt();

					System.out.print("Enter seconds: ");
					int sec3 = sc.nextInt();

					d = new Date(year3, month3, date3, hour3, min3, sec3);
					System.out.println("Printing Updated values: ");
					d.displayDate();
					break;

				case 4:
					System.out.println("Exiting menu...");
					break loop;

				default:
					System.out.println("Enter valid options");
					break;

			}
		}

		sc.close();
	}

}
