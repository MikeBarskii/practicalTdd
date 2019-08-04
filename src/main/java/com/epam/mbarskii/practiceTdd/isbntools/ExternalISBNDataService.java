package com.epam.mbarskii.practiceTdd.isbntools;

public interface ExternalISBNDataService {
    Book lookup(String isbn);
}
