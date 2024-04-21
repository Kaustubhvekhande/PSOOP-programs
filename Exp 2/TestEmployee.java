import java.util.*;

class TestEmployee{
	public static void main(String[] args) {
	Employee e1= new Employee();
	Scanner sc = new Scanner(System.in);
	
	//print the default details
	System.out.println("The default values are: ");
	e1.printInfo();
	
	System.out.print("Enter the name of Employee: ");
	String name = sc.nextLine();
	e1.setName(name);
	
	System.out.print("Enter the age of Employee: ");
	int age = sc.nextInt();
	e1.setAge(age);
	
	System.out.print("Enter the Salary of Employee:");
	int salary = sc.nextInt();
	e1.setSalary(salary);
	
	// Print the updated details
	System.out.println("\nUpdated details are:");
	e1.printInfo();
	
	sc.close();
	
	}
}
