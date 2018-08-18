package Employee;

import java.io.*;

public class Employee {

    private int age;
    private String name;
    private double salary;

    public Employee(String name) {
        this.name = name;
    }

    public void empAge(int empAge){
        this.age = empAge;
    }

    public void empSalary(double empSalary){
        this.salary = empSalary;
    }

    public void printDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: " + this.salary);
    }
}
