package br.com.igorgc.streams.test;

import br.com.igorgc.streams.domain.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 1. Order books by title
// 2. Retrieve the first 3 book titles with price less than or equal to 4
public class StreamTest01 {
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
        books.sort(Comparator.comparing(Book::getTitle));

        List<String> titles = new ArrayList<>();

        for (Book book : books) {
            if (book.getPrice() <= 4) {
                titles.add(book.getTitle());
            }

            if (titles.size() >= 3) {
                break;
            }
        }

        System.out.println(books);
        System.out.println(titles);
    }
}