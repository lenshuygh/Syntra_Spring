package be.lens.spring.baeldung_tutorial.service;

import be.lens.spring.baeldung_tutorial.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book getBookByIsbn(String isbn);
}
