package br.com.igorgc.collections.test;

import br.com.igorgc.collections.domain.Customer;
import br.com.igorgc.collections.domain.Series;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        Series series1 = new Series(5L, "Stranger Things", 8.7, 4);
        Series series2 = new Series(1L, "Breaking Bad", 9.5, 5);
        Series series3 = new Series(4L, "Dark", 8.7, 3);
        Series series4 = new Series(3L, "The Boys", 8.6, 4);
        Series series5 = new Series(2L, "The Office", 9.0, 9);

        List<Series> customer1Series = List.of(series1, series2, series3);
        List<Series> customer2Series = List.of(series3, series4);

        Map<Customer, List<Series>> customerSeriesMap = new HashMap<>();
        customerSeriesMap.put(customer1, customer1Series);
        customerSeriesMap.put(customer2, customer2Series);

        for (Map.Entry<Customer, List<Series>> entry : customerSeriesMap.entrySet()) {
            System.out.println("----" + entry.getKey().getName());

            for (Series serie : entry.getValue()) {
                System.out.println("-------" + serie.getName());
            }
        }
    }
}
