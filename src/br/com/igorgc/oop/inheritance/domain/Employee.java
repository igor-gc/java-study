package br.com.igorgc.oop.inheritance.domain;

public class Employee extends Person {

    private double salary;

    public Employee(String name) {
        super(name);
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