package br.com.igorgc.oop.inheritance.test;

import br.com.igorgc.oop.inheritance.domain.Address;
import br.com.igorgc.oop.inheritance.domain.Employee;
import br.com.igorgc.oop.inheritance.domain.Person;

public class InheritanceTest01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("3rd Street");
        address.setZipCode("012345-209");

        Person person = new Person("Paul Allen");
        person.setName("John Smith");
        person.setTaxId("1111111");
        person.setAddress(address);
        person.print();

        Employee employee = new Employee("James Cameron");
        employee.setName("Robert Johnson");
        employee.setTaxId("2222222");
        employee.setAddress(address);
        employee.setSalary(20000);

        System.out.println("----------------");

        employee.print();
    }
}