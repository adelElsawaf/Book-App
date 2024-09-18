package com.example.bookapp.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Book repository.
 */
@Repository
public interface BookRepository extends JpaRepository<BookEntity,Long> {

}