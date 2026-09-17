package br.com.igorgc.oop.polymorphism.test;

import br.com.igorgc.oop.polymorphism.domain.Computer;
import br.com.igorgc.oop.polymorphism.domain.Television;
import br.com.igorgc.oop.polymorphism.domain.Tomato;
import br.com.igorgc.oop.polymorphism.service.TaxCalculator;

public class ProductTest01 {

    public static void main(String[] args) {
        Computer computer = new Computer("NUC10i7", 11000);
        Tomato tomato = new Tomato("Sicilian Tomato", 10);
        Television television = new Television("Samsung 50\"", 5000);

        TaxCalculator.calculateTax(computer);

        System.out.println("-------------------------");

        TaxCalculator.calculateTax(tomato);

        System.out.println("-------------------------");

        TaxCalculator.calculateTax(television);
    }
}