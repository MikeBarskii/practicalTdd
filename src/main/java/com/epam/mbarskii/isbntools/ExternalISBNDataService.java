package com.epam.mbarskii.isbntools;

public interface ExternalISBNDataService {
    Book lookup(String isbn);
}
