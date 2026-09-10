package br.com.igorgc.oop.initializationblock.test;

import br.com.igorgc.oop.initializationblock.domain.Series;

public class SeriesTest01 {
    public static void main(String[] args) {
        Series series = new Series("Game of Thrones");

        for (int episode : series.getEpisodes()) {
            System.out.println(episode + " ");
        }


    }
}
