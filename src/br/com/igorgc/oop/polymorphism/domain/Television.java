package br.com.igorgc.oop.polymorphism.domain;

public class Television extends Product {

    public static final double TAX_RATE = 0.21;

    public Television(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating television tax");
        return this.price * TAX_RATE;
    }
}