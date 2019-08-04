package com.epam.mbarskii.practiceTdd.isbntools;

class StockManager {

    private ExternalISBNDataService webService;
    private ExternalISBNDataService databaseService;

    void setWebService(ExternalISBNDataService webService) {
        this.webService = webService;
    }

    void setDatabaseService(ExternalISBNDataService databaseService) {
        this.databaseService = databaseService;
    }

    String getLocatorCode(String isbn) {
        Book book = databaseService.lookup(isbn);
        if (book == null)
            book = webService.lookup(isbn);

        return isbn.substring(isbn.length() - 4) +
                book.getAuthor().substring(0, 1) +
                book.getTitle().split(" ").length;
    }
}
