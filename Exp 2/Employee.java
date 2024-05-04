


class Employee{
	String name;
	int age;
	int salary;
	
	Employee(){
		this.name="unknown";
		this.age= 18;
		this.salary = 20000;
	}
	
	void setName(String name){
		this.name= name;
	}
	
	String getName(){
		return name;
	}
	
	void setAge(int age){
		this.age = age;
	}
	
	int getAge(){
		return age;
	}
	
	void setSalary(int salary){
		this.salary= salary;
	}
	int getSalary(){
		return salary;
	}
	
	void printInfo(){
		System.out.println("The Employee Details are: ");
		System.out.println("Employee name: "+name);
		System.out.println("Employee age: "+age+ " years");
		System.out.println("Salary: $"+salary);
	}
}


