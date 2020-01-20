package be.lens.spring.baeldung_tutorial.repository;

import be.lens.spring.baeldung_tutorial.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> getBooks();

    Book getBook(String isbn);
}
