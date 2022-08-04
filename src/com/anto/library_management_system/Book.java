package com.anto.library_management_system;

import lombok.Data;

import java.util.List;

@Data
public class Book {
    private String ISBN;
    private String title;
    private List<Author> author;
    private String publisher;
    private String language;
    private int noOfPages;
}
