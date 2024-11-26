package com.quest.oops.bookstore_inventory_management;

public class BookSoreMainDrive {
    public static void main(String[] args) {
        BookStoreManagement bookStoreManagement = new BookStoreManagement();
        BookStore bookStore1 ;
        bookStoreManagement.addBooks(new SpecialEditionBook("hey malini", "HM", 200, 15, "special"));
        bookStoreManagement.addBooks(new SpecialEditionBook("Maya", "MM", 300, 5, "special"));
        bookStoreManagement.addBooks(new SpecialEditionBook("My love", "LL", 350, 25, "special"));
        bookStoreManagement.addBooks(new NormalBooks("Thira", "Jaya", 100, 35, "Normal"));
        bookStoreManagement.addBooks(new NormalBooks("Beautiful Nights", "GG", 100, 3, "Normal"));
        bookStoreManagement.addBooks(new NormalBooks("Apna", "RR", 200, 15, "Normal"));
        BookStore books;
        try{
            books = findBook(bookStoreManagement,"maya");
            if(books != null){
                books.purchaseStock(5,books);
            }
        } catch (OutOfStockException e) {
            e.printStackTrace();
        }

        bookStoreManagement.displayValueBooks();

    }

    public static BookStore findBook(BookStoreManagement bookStoreManagement, String title) {
        BookStore[] books = bookStoreManagement.getBooks();
        int numberOfBooks = bookStoreManagement.getNumberOfBooks();
        for (int i = 0; i < numberOfBooks; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];

            }
        }
        return null;
    }
}
