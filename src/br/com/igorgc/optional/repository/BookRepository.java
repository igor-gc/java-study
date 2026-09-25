package br.com.igorgc.optional.repository;

import br.com.igorgc.optional.domain.Book;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class BookRepository {
    private static List<Book> books = List.of(
            new Book(1, "Clean Code", 464),
            new Book(2, "Effective Java", 416)
    );

    public static Optional<Book> findById(Integer id) {
        return findBy(book -> book.getId().equals(id));
    }

    public static Optional<Book> findByTitle(String title) {
        return findBy(book -> book.getTitle().equals(title));
    }

    private static Optional<Book> findBy(Predicate<Book> predicate) {
        Book found = null;

        for (Book book : books) {
            if (predicate.test(book)) {
                found = book;
            }
        }

        return Optional.ofNullable(found);
    }
}