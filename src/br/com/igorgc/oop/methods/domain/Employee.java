package br.com.igorgc.oop.methods.domain;

public class Employee {
    public String name;
    public int age;
    public double[] salaries;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);

        if (salaries == null) {
            return;
        }

        for (double salary : salaries) {
            System.out.print(salary + " ");
        }

        printAverageSalary();
    }

    public void printAverageSalary() {
        if (salaries == null) {
            return;
        }
        double average = 0;

        for (double salary : salaries) {
            average += salary;
        }

        System.out.println("\nAverage salary: " + average);
    }
}