package br.com.igorgc.streams.test;

import br.com.igorgc.streams.domain.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<Book> books = new ArrayList<>(List.of(
            new Book("Clean Code", 8.99),
            new Book("Effective Java", 3.99),
            new Book("Java Concurrency in Practice", 5.99),
            new Book("Head First Java", 2.99),
            new Book("Design Patterns", 5.99),
            new Book("Refactoring", 1.99),
            new Book("Refactoring", 1.99),
            new Book("The Pragmatic Programmer", 4.00)
    ));

    public static void main(String[] args) {
        Stream<Book> stream = books.stream();

        books.forEach(System.out::println);

        long count = stream
                .distinct()
                .filter(book -> book.getPrice() <= 4)
                .count();

        System.out.println(count);
    }
}