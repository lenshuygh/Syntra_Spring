package be.lens.spring.baeldung_tutorial.contoller;

import be.lens.spring.baeldung_tutorial.model.Book;
import be.lens.spring.baeldung_tutorial.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @RequestMapping("books")
    public ModelAndView getBookList() {
        final List<Book> books = bookRepository.getBooks();
        return new ModelAndView("booklist", "books", books);
    }

    @RequestMapping("bookDetail")
    public ModelAndView getBookDetail(@RequestParam("isbn") String isbn) {
        Book book = bookRepository.getBook(isbn);
        return new ModelAndView("bookDetails", "book", book);
    }
}
