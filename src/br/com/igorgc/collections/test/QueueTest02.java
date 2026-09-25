package br.com.igorgc.collections.test;

import br.com.igorgc.collections.domain.Series;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Series> series = new PriorityQueue<>(new SeriesRatingComparator().reversed());

        series.add(new Series(5L, "Stranger Things", 8.7, 4));
        series.add(new Series(1L, "Breaking Bad", 9.5, 5));
        series.add(new Series(4L, "Dark", 8.7, 3));
        series.add(new Series(3L, "The Boys", 8.6, 4));
        series.add(new Series(2L, "The Office", 9.0, 9));
        series.add(new Series(10L, "The Walking Dead", 8.7, 11));

        while (!series.isEmpty()) {
            System.out.println(series.poll());
        }
    }
}