package com.example.bookapp.book;


import static com.example.bookapp.shared.Constants.logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Book controller.
 */
@RestController
@RequestMapping("books")
@Validated
public class BookController {
    @Autowired
    private BookService bookService;

    /**
     * Create book response entity.
     *
     * @param book the book
     * @return the response entity with created book
     */
    @PostMapping
    public ResponseEntity<BookEntity> createBook(@RequestBody BookEntity book) {
       logger.info("invoke createBook method for book: {}" ,book);
       BookEntity createdBook = bookService.createBook(book);
       logger.info("Finish createBook method with response: {}" ,createdBook.toString());
       return ResponseEntity.status(HttpStatus.OK).body(createdBook);


    }
}