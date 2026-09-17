package br.com.igorgc.oop.polymorphism.service;

import br.com.igorgc.oop.polymorphism.domain.Computer;
import br.com.igorgc.oop.polymorphism.domain.Product;
import br.com.igorgc.oop.polymorphism.domain.Tomato;

public class TaxCalculator {

    public static void calculateTax(Product product) {
        System.out.println("Tax report");

        double tax = product.calculateTax();

        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Tax to be paid: " + tax);
    }


}