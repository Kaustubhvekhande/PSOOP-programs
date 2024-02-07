import java.util.*;

public class TestDate{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date d = new Date();
		
		
		
		d.displayDate();//printing default values
		System.out.println("Menu:\n1.dd/mm/yy format\n2.dd/mm/yy hh:mm format\n3.dd/mm/yy hh:mm:ss format");
		int choice= sc.nextInt();
		
		switch(choice){
			case 1:
				System.out.println("Enter year: ");
				int year = sc.nextInt();
		
				System.out.println("Enter Month: ");
				int month = sc.nextInt();
				
				System.out.println("Enter Date: ");
				int date = sc.nextInt();
				
				d= new Date(year,month,date);
				break;
				
			case 2:
				
				System.out.println("Enter year: ");
				int year2 = sc.nextInt();
				
				System.out.println("Enter Month: ");
				int month2 = sc.nextInt();
				
				System.out.println("Enter year: ");
				int date2 = sc.nextInt();
				
				System.out.println("Enter Hours: ");
				int hour2 = sc.nextInt();
				
				System.out.println("Enter Minutes: ");
				int min2 = sc.nextInt();
				
				d= new Date(year2,month2,date2, hour2, min2);
				break;
				
			case 3:
				System.out.println("Enter year: ");
				int year3 = sc.nextInt();
				
				System.out.println("Enter Month: ");
				int month3 = sc.nextInt();
				
				System.out.println("Enter year: ");
				int date3 = sc.nextInt();
				
				System.out.println("Enter Hours: ");
				int hour3 = sc.nextInt();
				
				System.out.println("Enter Minutes: ");
				int min3 = sc.nextInt();
				
				System.out.println("Enter seconds: ");
				int sec3 = sc.nextInt();
				
				d = new Date(year3,month3,date3, hour3, min3, sec3);
				break;
				
				default:
					System.out.println("Enter valid options");
					break;
				
		}
		
		
		
		
		
		
				
		System.out.println("Printing Updated values: ");		
		d.displayDate();
	}

}
