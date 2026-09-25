package br.com.igorgc.collections.test;

import br.com.igorgc.collections.domain.Series;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {

    public static void main(String[] args) {
        Set<Series> series = new LinkedHashSet<>();

        series.add(new Series(5L, "Stranger Things", 8.7, 4));
        series.add(new Series(1L, "Breaking Bad", 9.5, 5));
        series.add(new Series(4L, "Dark", 8.7, 3));
        series.add(new Series(3L, "The Boys", 8.6, 4));
        series.add(new Series(2L, "The Office", 9.0, 9));

        for (Series serie : series) {
            System.out.println(serie);
        }
    }
}