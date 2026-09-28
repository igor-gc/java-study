package br.com.igorgc.streams.test;

import br.com.igorgc.streams.domain.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
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
        System.out.println(books.stream().anyMatch(book -> book.getPrice() > 9));
        System.out.println(books.stream().allMatch(book -> book.getPrice() > 0));
        System.out.println(books.stream().noneMatch(book -> book.getPrice() < 0));

        books.stream()
                .filter(book -> book.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);

        books.stream()
                .filter(book -> book.getPrice() > 3)
                .sorted(Comparator.comparing(Book::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);

        books.stream()
                .filter(book -> book.getPrice() > 3)
                .max(Comparator.comparing(Book::getPrice))
                .ifPresent(System.out::println);
    }
}