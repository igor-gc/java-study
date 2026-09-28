package br.com.igorgc.streams.test;

import br.com.igorgc.streams.domain.Book;
import br.com.igorgc.streams.domain.Category;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
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
        Map<Category, List<Book>> categoryBookMap = new HashMap<>();
        List<Book> fiction = new ArrayList<>();
        List<Book> technology = new ArrayList<>();
        List<Book> business = new ArrayList<>();

        for (Book book : books) {
            switch (book.getCategory()) {
                case FICTION: fiction.add(book); break;
                case TECHNOLOGY: technology.add(book); break;
                case BUSINESS: business.add(book); break;
            }
        }

        categoryBookMap.put(Category.FICTION, fiction);
        categoryBookMap.put(Category.TECHNOLOGY, technology);
        categoryBookMap.put(Category.BUSINESS, business);

        System.out.println(categoryBookMap);

        Map<Category, List<Book>> collect = books.stream()
                .collect(Collectors.groupingBy(Book::getCategory));

        System.out.println(collect);
    }
}