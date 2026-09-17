package br.com.igorgc.oop.abstractclasses.test;

import br.com.igorgc.oop.abstractclasses.domain.Developer;
import br.com.igorgc.oop.abstractclasses.domain.Manager;

public class EmployeeTest01 {

    public static void main(String[] args) {
        Manager manager = new Manager("Alysson", 5000);
        Developer developer = new Developer("Jake", 12000);

        System.out.println(manager);
        System.out.println(developer);

        manager.print();
        developer.print();
    }
}