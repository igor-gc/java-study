package br.com.igorgc.collections.test;

import br.com.igorgc.collections.domain.Series;
import br.com.igorgc.collections.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneBrandComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone smartphone1, Smartphone smartphone2) {
        return smartphone1.getBrand().compareTo(smartphone2.getBrand());
    }
}

class SeriesRatingComparator implements Comparator<Series> {

    @Override
    public int compare(Series series1, Series series2) {
        return Double.compare(series1.getRating(), series2.getRating());
    }
}

public class NavigableSetTest01 {

    public static void main(String[] args) {
        NavigableSet<Smartphone> smartphones =
                new TreeSet<>(new SmartphoneBrandComparator());

        Smartphone smartphone =
                new Smartphone("123", "Nokia");

        smartphones.add(smartphone);

        NavigableSet<Series> series =
                new TreeSet<>(new SeriesRatingComparator());

        series.add(new Series(5L, "Stranger Things", 8.7, 4));
        series.add(new Series(1L, "Breaking Bad", 9.5, 5));
        series.add(new Series(4L, "Dark", 8.7, 3));
        series.add(new Series(3L, "The Boys", 8.6, 4));
        series.add(new Series(2L, "The Office", 9.0, 9));
        series.add(new Series(10L, "The Walking Dead", 8.7, 11));

        for (Series serie : series) {
            System.out.println(serie);
        }

        Series seriesToSearch =
                new Series(21L, "The Witcher", 8.7, 4);

        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println("------------");
        System.out.println(series.lower(seriesToSearch));
        System.out.println(series.floor(seriesToSearch));
        System.out.println(series.higher(seriesToSearch));
        System.out.println(series.ceiling(seriesToSearch));

        System.out.println(series.size());
        System.out.println(series.pollLast());
        System.out.println(series.size());
    }
}