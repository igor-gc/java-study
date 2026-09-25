package br.com.igorgc.lambdas.test;

import br.com.igorgc.lambdas.domain.Product;
import br.com.igorgc.lambdas.service.ProductComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

// Reference to a constructor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<ProductComparators> newProductComparators = ProductComparators::new;
        ProductComparators productComparators = newProductComparators.get();

        List<Product> productList = new ArrayList<>(List.of(
                new Product("Keyboard", 250.00),
                new Product("Monitor", 1200.00),
                new Product("Mouse", 150.00)
        ));

        productList.sort(productComparators::compareByPriceNonStatic);

        System.out.println(productList);

        BiFunction<String, Double, Product> productBiFunction = (name, price) -> new Product(name, price);
        BiFunction<String, Double, Product> productBiFunction2 = Product::new;

        System.out.println(productBiFunction2.apply("Headset", 350.00));
    }
}