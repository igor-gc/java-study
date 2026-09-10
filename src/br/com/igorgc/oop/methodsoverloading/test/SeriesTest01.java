package br.com.igorgc.oop.methodsoverloading.test;

import br.com.igorgc.oop.methodsoverloading.domain.Series;

public class SeriesTest01 {
    public static void main(String[] args) {
        Series series = new Series();

        series.init("Breaking Bad", "TV", 62, "Crime");

        series.print();
    }
}