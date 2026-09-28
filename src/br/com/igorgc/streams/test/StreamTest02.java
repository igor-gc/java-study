package br.com.igorgc.streams.test;

import br.com.igorgc.streams.domain.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {
    private static List<Book> books = new ArrayList<>(List.of(
            new Book("Clean Code", 8.99),
            new Book("Effective Java", 3.99),
            new Book("Java Concurrency in Practice", 5.99),
            new Book("Head First Java", 2.99),
            new Book("Design Patterns", 5.99),
            new Book("Refactoring", 1.99),
            new Book("The Pragmatic Programmer", 4.00)
    ));

    public static void main(String[] args) {
        List<String> titles = books.stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .filter(book -> book.getPrice() <= 4)
                .limit(3)
                .map(Book::getTitle)
                .collect(Collectors.toList());

        System.out.println(titles);
    }
}