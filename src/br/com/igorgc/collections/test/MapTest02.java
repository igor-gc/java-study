package br.com.igorgc.collections.test;

import br.com.igorgc.collections.domain.Customer;
import br.com.igorgc.collections.domain.Series;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {

    public static void main(String[] args) {
        Customer customer1 =
                new Customer("Alice");

        Customer customer2 =
                new Customer("Bob");

        Series series1 =
                new Series(5L, "Stranger Things", 8.7, 4);

        Series series2 =
                new Series(3L, "The Boys", 8.6, 4);

        Map<Customer, Series> customerSeries =
                new HashMap<>();

        customerSeries.put(customer1, series1);
        customerSeries.put(customer2, series2);

        for (Map.Entry<Customer, Series> entry :
                customerSeries.entrySet()) {

            System.out.println(
                    entry.getKey().getName() +
                            " - " +
                            entry.getValue().getName()
            );
        }
    }
}