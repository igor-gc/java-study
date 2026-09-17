package br.com.igorgc.oop.polymorphism.service;

import br.com.igorgc.oop.polymorphism.domain.Computer;
import br.com.igorgc.oop.polymorphism.domain.Tomato;

public class TaxCalculator {

    public static void calculateComputerTax(Computer computer) {
        System.out.println("Computer tax report");

        double tax = computer.calculateTax();

        System.out.println("Computer: " + computer.getName());
        System.out.println("Price: " + computer.getPrice());
        System.out.println("Tax to be paid: " + tax);
    }

    public static void calculateTomatoTax(Tomato tomato) {
        System.out.println("Tomato tax report");

        double tax = tomato.calculateTax();

        System.out.println("Tomato: " + tomato.getName());
        System.out.println("Price: " + tomato.getPrice());
        System.out.println("Tax to be paid: " + tax);
    }
}