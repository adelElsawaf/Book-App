package com.example.bookapp.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Book service.
 */
@Service
public class BookService {

    @Autowired
    private  BookRepository bookRepository;

    /**
     * Create new book entity.
     *
     * @param toBeSavedBook the to be saved book
     * @return the saved book entity
     */
    public BookEntity createBook(BookEntity toBeSavedBook) {
        return bookRepository.save(toBeSavedBook);
    }
}