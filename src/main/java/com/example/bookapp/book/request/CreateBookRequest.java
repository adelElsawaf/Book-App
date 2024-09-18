package com.example.bookapp.book.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

/**
 * The type Create book request.
 */
@Data
public class CreateBookRequest {
    @NotBlank
    private String title;
    @NotBlank
    private String authorName;
    @NotBlank
    private String ISBN;
    @NotNull
    private LocalDate publishDate;
}
