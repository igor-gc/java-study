package br.com.igorgc.lambdas.test;

import br.com.igorgc.lambdas.domain.Product;
import br.com.igorgc.lambdas.service.ProductComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        ProductComparators productComparators = new ProductComparators();

        List<Product> productList = new ArrayList<>(List.of(
                new Product("Keyboard", 250.00),
                new Product("Monitor", 1200.00),
                new Product("Mouse", 150.00)
        ));

        productList.sort(productComparators::compareByPriceNonStatic);
        productList.sort((product1, product2) -> productComparators.compareByPriceNonStatic(product1, product2));

        System.out.println(productList);
    }
}