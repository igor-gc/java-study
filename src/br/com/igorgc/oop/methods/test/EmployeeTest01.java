package br.com.igorgc.oop.methods.test;

import br.com.igorgc.oop.methods.domain.Employee;

public class EmployeeTest01 {

    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("Carlos");
        employee.setAge(23);
        employee.setSalaries(new double[]{1200, 987.32, 2000});

        employee.print();

        System.out.println("Average " + employee.getAverage()) ;
    }
}