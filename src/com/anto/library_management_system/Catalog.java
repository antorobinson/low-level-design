package com.anto.library_management_system;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Catalog implements Search{
    Map<String, List<Book>> bookTitles;
    Map<String, List<Book>> bookAuthors;
    Map<String, List<Book>> bookSubjects;
    Map<String, List<Book>> bookPublicationDates;

    @Override
    public List<Book> searchByTitle(String title) {
        return bookTitles.get(title);
    }

    @Override
    public List<Book> searchByAuthor(String author) {
        return bookAuthors.get(author);
    }

    @Override
    public List<Book> searchBySubject(String subject) {
        return bookSubjects.get(subject);
    }

    @Override
    public List<Book> searchByPubDate(LocalDate pubDate) {
        return bookPublicationDates.get(pubDate.toString());
    }
}
