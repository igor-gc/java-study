package br.com.igorgc.oop.inheritance.domain;

public class Employee extends Person {

    private double salary;

    static {
        System.out.println("Inside Employee static initialization block");
    }

    {
        System.out.println("Inside Employee initialization block 1");
    }

    {
        System.out.println("Inside Employee initialization block 2");
    }

    public Employee(String name) {
        super(name);
        System.out.println("Inside Employee constructor");
    }

    public void print(){
        super.print();
        System.out.println("Salary: " + salary);
    }

    public void printPaymentReport() {
        System.out.println("I " + this.name + " received a salary of " + this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}