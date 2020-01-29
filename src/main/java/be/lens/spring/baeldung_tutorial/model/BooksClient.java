package be.lens.spring.baeldung_tutorial.model;

import java.util.List;

public interface BooksClient {
    BookList getAllBooks();

    Book getBookByIsbn(String isbn);
}
