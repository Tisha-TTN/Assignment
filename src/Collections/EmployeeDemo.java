package Collections;
import java.util.*;

// Employee class implementing Comparable for default sorting on Name
class Employee implements Comparable<Employee> {
    private Double age;
    private Double salary;
    private String name;

    // Constructor
    public Employee(String name, Double age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters
    public Double getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    // Default sorting based on Name
    @Override
    public int compareTo(Employee other) {
        return this.name.compareTo(other.name);
    }

    // To display Employee details
    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

// Comparator for sorting based on Salary
class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getSalary().compareTo(e2.getSalary());
    }
}

// Main class
public class EmployeeDemo {
    public static void main(String[] args) {
        // Creating a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", 30.0, 50000.0));
        employees.add(new Employee("Alice Brown", 28.0, 60000.0));
        employees.add(new Employee("Bob Smith", 35.0, 55000.0));

        // Sorting by default (Name)
        Collections.sort(employees);
        System.out.println("Sorted by Name (Default):");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // Sorting by Salary using Comparator
        employees.sort(new SalaryComparator());
        System.out.println("\nSorted by Salary:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
