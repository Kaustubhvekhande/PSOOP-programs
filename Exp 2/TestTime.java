import java.util.*;



class TestTime{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Time t1= new Time();
		System.out.println("Enter the total seconds: ");
		int totSec = sc.nextInt();
		t1.conversion1(totSec);
		
		Time t2= new Time();
		System.out.println("Enter The hours ");
		int hour = sc.nextInt();
		System.out.println("Enter The minutes ");
		int min = sc.nextInt();
		System.out.println("Enter The seconds ");
		int sec = sc.nextInt();
		t2.conversion2( hour, min, sec);
		
		sc.close();
	}

}
