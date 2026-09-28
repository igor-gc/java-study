package br.com.igorgc.streams.domain;

import java.util.Objects;

public class Book {
    private String title;
    private double price;
    private Category category;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public Book(String title, double price, Category category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }

    public Category getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}