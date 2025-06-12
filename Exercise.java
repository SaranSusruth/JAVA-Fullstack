// Create a class called Employee
class Employee
{
    private String name;
    private double salary;

    Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public String getDetails()
    {
        return "Name: " + name + ", Salary: " + salary;
    }
}

// Create a class Manager that extends Employee
class Manager extends Employee
{
    private String department;

    Manager(String name, double salary, String department)
    {
        super(name, salary);
        this.department = department;
    }

    public String getDetails()
    {
        return super.getDetails() + ", Department: " + department;
    }
}

public class Exercise
{
    public static void main(String[] args)
    {
        // Create Employee and Manager objects
        // Print their details using getDetails()
        Employee employee = new Employee("Alice", 50000.0);
        Manager manager = new Manager("Bob", 80000.0, "IT");
        
        System.out.println(employee.getDetails());
        System.out.println(manager.getDetails());
    }
}
