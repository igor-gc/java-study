package br.com.igorgc.collections.test;

import br.com.igorgc.collections.domain.Series;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {

    public static void main(String[] args) {
        List<Series> series = new ArrayList<>(6);

        series.add(new Series(5L, "Stranger Things", 8.7, 4));
        series.add(new Series(1L, "Breaking Bad", 9.5, 5));
        series.add(new Series(4L, "Dark", 8.7, 3));
        series.add(new Series(3L, "The Boys", 8.6, 4));
        series.add(new Series(2L, "The Office", 9.0, 9));

//        Iterator<Series> seriesIterator = series.iterator();
//
//        while (seriesIterator.hasNext()) {
//            if (seriesIterator.next().getNumberOfSeasons() == 0) {
//                seriesIterator.remove();
//            }
//        }

        series.removeIf(
                serie -> serie.getNumberOfSeasons() == 0
        );

        System.out.println(series);
    }
}