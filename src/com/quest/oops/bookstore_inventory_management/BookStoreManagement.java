package com.quest.oops.bookstore_inventory_management;

public class BookStoreManagement  {

    public final int MAX_BOOKS = 10;
    private BookStore[] books;
    private int numberOfBooks ;
    BookStoreManagement(){
        books = new BookStore[MAX_BOOKS];
        numberOfBooks = 0;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public BookStore[] getBooks() {
        return books;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }
    public void addBooks(BookStore book){
        if(numberOfBooks < MAX_BOOKS){
            books[getNumberOfBooks()] = book;
            setNumberOfBooks(getNumberOfBooks()+1);
            book.addBook(book);
        }else {
            System.out.println("Inventory is full now...");
        }
    }
    public void displayValueBooks(){
        System.out.println("display all book titles that are priced above 200");
        Purchase purchase = (double value) -> {
            for (BookStore book : books){
                if(book != null && book.getPrice() > value){
                    System.out.println(book.getTitle());
                }
            }
        };
        purchase.displayBooks(200);

    }
}
