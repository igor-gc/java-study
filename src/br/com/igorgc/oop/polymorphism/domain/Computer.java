package br.com.igorgc.oop.polymorphism.domain;

public class Computer extends Product {

    public static final double TAX_RATE = 0.21;

    public Computer(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating computer tax");
        return this.price * TAX_RATE;
    }
}