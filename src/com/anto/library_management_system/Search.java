package com.anto.library_management_system;

import java.time.LocalDate;
import java.util.List;

public interface Search {
    List<Book> searchByTitle(String title);
    List<Book> searchByAuthor(String author);
    List<Book> searchBySubject(String subject);
    List<Book> searchByPubDate(LocalDate pubDate);
}
