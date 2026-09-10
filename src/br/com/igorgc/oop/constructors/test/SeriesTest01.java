package br.com.igorgc.oop.constructors.test;

import br.com.igorgc.oop.constructors.domain.Series;

public class SeriesTest01 {
    public static void main(String[] args) {
        Series series = new Series("Breaking Bad", "TV", 62, "Crime", "Sony");

        series.print();
    }
}