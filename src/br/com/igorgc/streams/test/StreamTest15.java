package br.com.igorgc.streams.test;

import br.com.igorgc.streams.domain.Book;
import br.com.igorgc.streams.domain.Category;
import br.com.igorgc.streams.domain.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static br.com.igorgc.streams.domain.Promotion.NORMAL_PRICE;
import static br.com.igorgc.streams.domain.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.*;

public class StreamTest15 {
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
        Map<Category, DoubleSummaryStatistics> collect = books.stream()
                .collect(groupingBy(Book::getCategory, summarizingDouble(Book::getPrice)));
        System.out.println(collect);
        // Map<Category, List<Promotion>>

        Map<Category, Set<Promotion>> collect1 = books.stream()
                .collect(groupingBy(Book::getCategory, mapping(StreamTest15::getPromotion, toSet())));
        System.out.println(collect1);

        Map<Category, LinkedHashSet<Promotion>> collect2 = books.stream()
                .collect(groupingBy(Book::getCategory, mapping(StreamTest15::getPromotion,
                        toCollection(LinkedHashSet::new))));
        System.out.println(collect2);
    }

    private static Promotion getPromotion(Book book) {
        return book.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}