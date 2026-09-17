package br.com.igorgc.oop.polymorphism.domain;

public class Tomato extends Product {

    public static final double TAX_RATE = 0.06;

    private String expirationDate;

    public Tomato(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating tomato tax");
        return this.price * TAX_RATE;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}