package br.com.igorgc.oop.polymorphism.test;

import br.com.igorgc.oop.polymorphism.domain.Computer;
import br.com.igorgc.oop.polymorphism.domain.Product;
import br.com.igorgc.oop.polymorphism.domain.Tomato;

public class ProductTest02 {

    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 3000);

        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.calculateTax());

        System.out.println("------------");

        Product product2 = new Tomato("American", 20);

        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
        System.out.println(product2.calculateTax());
    }
}