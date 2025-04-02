package cmu.edu.ds.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class Books {

    @NotBlank
    @JsonProperty("ISBN")
    private String ISBN;

    @NotBlank
    private String title;


    @NotBlank(message = "Author cannot be null")
    @JsonProperty("Author")
    private String author;

    @NotBlank
    private String description;

    @NotBlank
    private String genre;

    @DecimalMin("0.00")
    @Digits(integer = 6, fraction = 2)
    @NotNull(message = "Price cannot be null")
    private double price;

    @Min(0)
    private int quantity;

    public Books() {}

    public Books(String isbn, String title, String author, String description, String genre, double price, int quantity) {
        this.ISBN = isbn;
        this.title = title;
        this.author = author;
        this.description = description;
        this.genre = genre;
        this.price = price;
        this.quantity = quantity;
    }
}

