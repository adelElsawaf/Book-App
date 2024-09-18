package com.example.bookapp.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.bookapp.shared.Constants.logger;

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
        logger.info("invoke createBook method for book: {}" ,toBeSavedBook);
        BookEntity createdBook = bookRepository.save(toBeSavedBook);
        logger.info("successfully created book : {}",createdBook.toString());
        return createdBook;
    }
}