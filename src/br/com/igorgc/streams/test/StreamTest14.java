package br.com.igorgc.streams.test;

import br.com.igorgc.streams.domain.Book;
import br.com.igorgc.streams.domain.Category;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class StreamTest14 {
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
        Map<Category, Long> collect = books.stream()
                .collect(groupingBy(Book::getCategory, Collectors.counting()));

        System.out.println(collect);

        Map<Category, Optional<Book>> collect1 = books.stream()
                .collect(groupingBy(Book::getCategory,
                        Collectors.maxBy(Comparator.comparing(Book::getPrice))));

        System.out.println(collect1);

        Map<Category, Book> collect2 = books.stream()
                .collect(groupingBy(Book::getCategory,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Book::getPrice)),
                                Optional::get)));

        System.out.println(collect2);

        Map<Category, Book> collect3 = books.stream()
                .collect(Collectors.toMap(
                        Book::getCategory,
                        Function.identity(),
                        BinaryOperator.maxBy(Comparator.comparing(Book::getPrice))));

        System.out.println(collect3);
    }
}