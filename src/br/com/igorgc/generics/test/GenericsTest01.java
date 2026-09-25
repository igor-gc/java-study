package br.com.igorgc.generics.test;

import br.com.igorgc.collections.domain.Customer;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // Type erasure
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");

        for (String name : names) {
            System.out.println(name);
        }

        add(names, new Customer("Charlie"));

        for (Object object : names) {
            System.out.println(object);
        }
    }

    private static void add(List list, Customer customer) {
        list.add(customer);
    }
}