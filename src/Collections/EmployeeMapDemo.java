package Collections;

import java.util.*;

// Employee class used as Key in HashMap
class Employee1 {
    private String name;
    private int age;
    private String designation;

    // Constructor
    public Employee1(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }

    // Overriding equals() to compare Employee objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // If same object
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee1 employee = (Employee1) obj;
        return age == employee.age && name.equals(employee.name) && designation.equals(employee.designation);
    }

    // Overriding hashCode() to ensure uniqueness
    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }

    // Display Employee details
    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", designation='" + designation + "'}";
    }
}

// Main class
public class EmployeeMapDemo {
    public static void main(String[] args) {
        // Corrected: Use Employee1 as the key type
        Map<Employee1, Double> employeeSalaryMap = new HashMap<>();

        // Creating Employee objects
        Employee1 emp1 = new Employee1("Alice", 30, "Software Engineer");
        Employee1 emp2 = new Employee1("Bob", 35, "Manager");
        Employee1 emp3 = new Employee1("Charlie", 28, "Analyst");

        // Adding Employees and their Salaries to Map
        employeeSalaryMap.put(emp1, 70000.0);
        employeeSalaryMap.put(emp2, 90000.0);
        employeeSalaryMap.put(emp3, 60000.0);

        // Printing Employee Salaries
        for (Map.Entry<Employee1, Double> entry : employeeSalaryMap.entrySet()) {
            System.out.println(entry.getKey() + " => Salary: " + entry.getValue());
        }
    }
}

