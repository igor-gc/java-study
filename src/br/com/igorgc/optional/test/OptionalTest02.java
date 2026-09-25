package br.com.igorgc.optional.test;

import br.com.igorgc.optional.domain.Book;
import br.com.igorgc.optional.repository.BookRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Book> bookByTitle = BookRepository.findByTitle("Clean Code");
        bookByTitle.ifPresent(book -> book.setTitle("Clean Code 2"));
        System.out.println(bookByTitle);

        Book bookById = BookRepository.findById(2).orElseThrow(IllegalArgumentException::new);
        System.out.println(bookById);

        Book newBook = BookRepository.findByTitle("Java Concurrency in Practice")
                .orElseGet(() -> new Book(3, "Java Concurrency in Practice", 432));
        System.out.println(newBook);
    }
}