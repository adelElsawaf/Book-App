package com.example.bookapp.book;

import com.example.bookapp.book.response.Book;
import com.example.bookapp.book.request.CreateBookRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.bookapp.shared.Constants.logger;

/**
 * The type Book service.
 */
@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    /**
     * Create new book entity.
     *
     * @param toBeCreatedBookRequest the to be saved book
     * @return the saved book entity
     */
    public Book createBook(CreateBookRequest toBeCreatedBookRequest) {
        logger.info("invoke createBook method for book: {}", toBeCreatedBookRequest);
        BookEntity createdBook = bookRepository.save(BookEntity
                .builder()
                .title(toBeCreatedBookRequest.getTitle())
                .ISBN(toBeCreatedBookRequest.getISBN())
                .authorName(toBeCreatedBookRequest.getAuthorName())
                .publishDate(toBeCreatedBookRequest.getPublishDate())
                .build());

        logger.info("successfully created book : {}", createdBook.toString());
        return mapToResponse(createdBook);
    }
    private Book mapToResponse(BookEntity book) {
        return Book.builder()
                .id(book.getId())
                .title(book.getTitle())
                .authorName(book.getAuthorName())
                .ISBN(book.getISBN())
                .publishDate(book.getPublishDate())
                .build();
    }
}