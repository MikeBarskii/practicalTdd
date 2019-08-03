package com.epam.mbarskii.isbntools;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StockManagementTest {

    @Test
    public void testCanGetACorrectLocatorCode() {
        ExternalISBNDataService service = new ExternalISBNDataService() {
            public Book lookup(String isbn) {
                return new Book(isbn, "Of Mice And Men", "J. Steinbeck");
            }
        };

        StockManager stockManager = new StockManager();
        stockManager.setService(service);

        String isbn = "0140177396";
        String locatorCode = stockManager.getLocatorCode(isbn);
        assertEquals("7396J4", locatorCode);
    }
}
