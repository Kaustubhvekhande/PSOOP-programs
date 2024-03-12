class Employee {
    private String name;
    private String id;
    private int age;

    public Employee(String n, String i, int a) {
        super();
        this.name = n;
        this.id = i;
        this.age = a;
    }

    // Setter methods for class Employee
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter methods for class Employee
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

}

class SalariedEmployee extends Employee {
    private double empSalary;
    boolean isPermanant;

    SalariedEmployee(String n, String i, int a, double empSalary,boolean isPermanant) {
        super(n, i, a);
        setEmpSalary(empSalary);
        this.isPermanant=isPermanant;
    }

    // Setter methods for class SalariedEmployee
    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    // Getter methods for class SalariedEmployee
    public double getEmpSalary() {
        if (isPermanant) {
            return empSalary+2000;
        }
        else
        return empSalary;
    }

}