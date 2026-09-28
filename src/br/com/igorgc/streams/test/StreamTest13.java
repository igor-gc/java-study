package br.com.igorgc.streams.test;

import br.com.igorgc.streams.domain.Book;
import br.com.igorgc.streams.domain.Category;
import br.com.igorgc.streams.domain.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static br.com.igorgc.streams.domain.Promotion.*;
import static java.util.stream.Collectors.groupingBy;

public class StreamTest13 {
    private static List<Book> books = new ArrayList<>(List.of(
            new Book("The Lost City", 8.99, Category.FICTION),
            new Book("Java Fundamentals", 10.99, Category.TECHNOLOGY),
            new Book("The Last Journey", 5.99, Category.FICTION),
            new Book("Database Essentials", 2.99, Category.TECHNOLOGY),
            new Book("Business Strategy", 5.99, Category.BUSINESS),
            new Book("The Silent Forest", 1.99, Category.FICTION),
            new Book("The Silent Forest", 1.99, Category.FICTION),
            new Book("Startup Guide", 4.00, Category.BUSINESS)
    ));

    public static void main(String[] args) {
        Map<Promotion, List<Book>> collect = books
                .stream()
                .collect(groupingBy(book -> book.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE));

        System.out.println(collect);

        // Map<Category, Map<Promotion, List<Book>>>

        Map<Category, Map<Promotion, List<Book>>> collect1 = books
                .stream()
                .collect(groupingBy(Book::getCategory,
                        groupingBy(book -> book.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE)));

        System.out.println(collect1);
    }
}