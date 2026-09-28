package br.com.igorgc.streams.test;

import br.com.igorgc.streams.domain.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
    private static List<Book> books = new ArrayList<>(List.of(
            new Book("Clean Code", 8.99),
            new Book("Effective Java", 10.99),
            new Book("Java Concurrency in Practice", 5.99),
            new Book("Head First Java", 2.99),
            new Book("Design Patterns", 5.99),
            new Book("Refactoring", 1.99),
            new Book("Refactoring", 1.99),
            new Book("The Pragmatic Programmer", 4.00)
    ));

    public static void main(String[] args) {
        System.out.println(books.stream().count());
        System.out.println(books.stream().collect(Collectors.counting()));

        books.stream().max(Comparator.comparing(Book::getPrice)).ifPresent(System.out::println);
        books.stream().collect(Collectors.maxBy(Comparator.comparing(Book::getPrice))).ifPresent(System.out::println);

        System.out.println(books.stream().mapToDouble(Book::getPrice).sum());
        System.out.println(books.stream().collect(Collectors.summingDouble(Book::getPrice)));

        books.stream().mapToDouble(Book::getPrice).average().ifPresent(System.out::println);
        System.out.println(books.stream().collect(Collectors.averagingDouble(Book::getPrice)));

        DoubleSummaryStatistics collect = books.stream().collect(Collectors.summarizingDouble(Book::getPrice));
        System.out.println(collect);

        String titles = books.stream().map(Book::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);
    }
}