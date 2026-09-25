package br.com.igorgc.lambdas.test;

import br.com.igorgc.lambdas.domain.Product;
import br.com.igorgc.lambdas.service.ProductComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>(List.of(
                new Product("Keyboard", 250.00),
                new Product("Monitor", 1200.00),
                new Product("Mouse", 150.00)
        ));

        productList.sort((product1, product2) -> product1.getName().compareTo(product2.getName()));
        productList.sort(ProductComparators::compareByName);
        productList.sort(ProductComparators::compareByPrice);

        System.out.println(productList);
    }
}