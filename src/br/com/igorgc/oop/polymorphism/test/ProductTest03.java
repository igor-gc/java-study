package br.com.igorgc.oop.polymorphism.test;

import br.com.igorgc.oop.polymorphism.domain.Computer;
import br.com.igorgc.oop.polymorphism.domain.Product;
import br.com.igorgc.oop.polymorphism.domain.Tomato;
import br.com.igorgc.oop.polymorphism.service.TaxCalculator;

public class ProductTest03 {

    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 3000);

        Tomato tomato = new Tomato("American", 20);
        tomato.setExpirationDate("11/12/2026");

        TaxCalculator.calculateTax(tomato);

        System.out.println("-----------------");

        TaxCalculator.calculateTax(product);
    }
}