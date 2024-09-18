package com.example.bookapp.book;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

/**
 * The type Book entity.
 */
@Entity
@Table(name = "books")
@Data
@Builder
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