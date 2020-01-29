package be.lens.spring.baeldung_tutorial.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BooksRestClientImpl implements BooksClient {
    private String baseUrl;
    private RestTemplate restTemplate;

    @Value("${baseURL}")
    public void setBaseUrl(String baseUrl){
        this.baseUrl = baseUrl;
    }

    @Autowired
    public void setTemplate(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public BookList getAllBooks() {
        ResponseEntity<BookList> responseEntity = restTemplate.getForEntity(baseUrl + "/books",BookList.class);
        if(responseEntity.getStatusCode() == HttpStatus.OK){
            return responseEntity.getBody();
        }else{
            return null;
        }
    }

    @Override
    public Book getBookByIsbn(String isbn) {
        ResponseEntity<Book> responseEntity = restTemplate.getForEntity(baseUrl + "/books/{isbn}",Book.class, isbn);
        if(responseEntity.getStatusCode() == HttpStatus.OK){
            return responseEntity.getBody();
        }else{
            return null;
        }
    }
}
