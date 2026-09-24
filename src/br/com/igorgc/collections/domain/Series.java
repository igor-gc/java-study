package br.com.igorgc.collections.domain;

import java.util.Objects;

public class Series implements Comparable<Series> {

    private Long id;
    private String name;
    private double rating;

    public Series(Long id, String name, double rating) {
        Objects.requireNonNull(id, "Id cannot be null");
        Objects.requireNonNull(name, "Name cannot be null");

        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Series series = (Series) object;

        return Double.compare(series.rating, rating) == 0
                && id.equals(series.id)
                && name.equals(series.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, rating);
    }

    @Override
    public String toString() {
        return "Series{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public int compareTo(Series otherSeries) {
        // Negative if this < otherSeries
        // Zero if this == otherSeries
        // Positive if this > otherSeries

//        if (this.id < otherSeries.getId()) {
//            return -1;
//        } else if (this.id.equals(otherSeries.getId())) {
//            return 0;
//        } else {
//            return 1;
//        }

        return this.name.compareTo(otherSeries.getName());
//        return Double.compare(rating, otherSeries.getRating());
//        return Double.valueOf(rating).compareTo(otherSeries.getRating());
//        return this.id.compareTo(otherSeries.getId());
    }
}