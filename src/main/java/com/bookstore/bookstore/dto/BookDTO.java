package com.bookstore.bookstore.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    private Long id;

    @NotBlank(message = "Title is required")
    private String title;

    @NotBlank(message = "ISBN is required")
    private String isbn;

    @Positive(message = "Price must be positive")
    private Double price;

    private LocalDate publishedDate;

    private String genre;

    @NotNull(message = "Author ID is required")
    private Long authorId;

    private String authorName; // For response
}
