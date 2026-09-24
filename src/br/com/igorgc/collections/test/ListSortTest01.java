package br.com.igorgc.collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {

    public static void main(String[] args) {
        List<String> series = new ArrayList<>(6);

        series.add("Breaking Bad");
        series.add("Dark");
        series.add("Stranger Things");
        series.add("The Boys");
        series.add("The Office");

        Collections.sort(series);

        List<Double> ratings = new ArrayList<>();

        ratings.add(9.1);
        ratings.add(8.5);
        ratings.add(9.3);
        ratings.add(8.9);

        for (String serie : series) {
            System.out.println(serie);
        }

        System.out.println(ratings);

        Collections.sort(ratings);

        System.out.println(ratings);
    }
}