package be.lens.spring.baeldung_tutorial.service;

import be.lens.spring.baeldung_tutorial.model.Book;
import be.lens.spring.baeldung_tutorial.model.BooksClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BooksClient booksClient;

    @Override
    public List<Book> getAllBooks() {
        return booksClient.getAllBooks().getBookList();
    }

    @Override
    public Book getBookByIsbn(String isbn) {
        return booksClient.getBookByIsbn(isbn);
    }
}
