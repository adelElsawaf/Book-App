package com.example.bookapp.book;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

/**
 * The type Book entity.
 */
@Entity
@Table(name = "books")
@Data
public class BookEntity {
    @Column(name = "bookId")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String authorName;
    private String ISBN;
    private LocalDate publishDate;

}