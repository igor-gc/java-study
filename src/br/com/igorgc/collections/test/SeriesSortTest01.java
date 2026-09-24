package br.com.igorgc.collections.test;

import br.com.igorgc.collections.domain.Series;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeriesSortTest01 {

    public static void main(String[] args) {
        List<Series> series = new ArrayList<>(6);

        series.add(new Series(5L, "Stranger Things", 8.7));
        series.add(new Series(1L, "Breaking Bad", 9.5));
        series.add(new Series(4L, "Dark", 8.7));
        series.add(new Series(3L, "The Boys", 8.6));
        series.add(new Series(2L, "The Office", 9.0));

        for (Series serie : series) {
            System.out.println(serie);
        }

        Collections.sort(series);

        System.out.println("-------------");

        for (Series serie : series) {
            System.out.println(serie);
        }
    }
}