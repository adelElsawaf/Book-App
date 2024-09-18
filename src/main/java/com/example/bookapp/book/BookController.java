package com.example.bookapp.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Book controller.
 */
@RestController
@RequestMapping("books")
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
        return new ResponseEntity<>(bookService.createBook(book), HttpStatus.CREATED);
    }
}