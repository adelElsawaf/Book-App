package com.example.bookapp.book.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Data
@Builder
public class Book {
    private Long id;

    private String title;

    private String authorName;

    private String ISBN;

    private LocalDate publishDate;
}
