import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SalariedEmployee se[] = new SalariedEmployee[5];

        String name;
        String id;
        int age;
        double salary;
        boolean isPermanant;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the details of Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            name = sc.nextLine();
            
            System.out.print("ID: ");
            id = sc.nextLine();
            //sc.nextLine();

            System.out.print("Age: ");
            age = sc.nextInt();

            System.out.print("Salary: ");
            salary = sc.nextDouble();
            System.out.print("Is employee Permaneat?(true or false):");
            isPermanant = sc.nextBoolean(); // to check if employee is permanent
            sc.nextLine();

            se[i] = new SalariedEmployee(name, id, age, salary, isPermanant);
        }

        double max = se[0].getEmpSalary();
        int index = 0;
        for (int j = 1; j < 5; j++) {
            if (max < se[j].getEmpSalary()) {
                max = se[j].getEmpSalary();
                index = j;
            }
        }
		
		System.out.println();
        System.out.println("Details of Highest Salaried Employee are: ");
        System.out.println("Name:" + se[index].getName());
        System.out.println("Age:" + se[index].getAge());
        System.out.println("ID:" + se[index].getId());
        System.out.println("Salary:" + se[index].getEmpSalary());
    }
}
