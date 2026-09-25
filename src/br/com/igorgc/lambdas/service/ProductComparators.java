package br.com.igorgc.lambdas.service;

import br.com.igorgc.lambdas.domain.Product;

public class ProductComparators {
    public static int compareByName(Product product1, Product product2) {
        return product1.getName().compareTo(product2.getName());
    }

    public static int compareByPrice(Product product1, Product product2) {
        return Double.compare(product1.getPrice(), product2.getPrice());
    }
}