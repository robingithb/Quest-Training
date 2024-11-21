package com.quest.oops.library_management;

public class Books {

    public static final int MAX_BOOKS = 100;
    private static Books[] books = new Books[MAX_BOOKS];
    public static int BOOKS_COUNT = 0;

    private int isbn;
    private String title;
    private String author;
    private boolean isAvailable;


    Books(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;

    }

    //setters

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    //getters

    public int getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public static Books[] getBooks() {
        return books;
    }

    public static int getBooksCount() {
        return BOOKS_COUNT;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public static void addBook(Books book) {
        if (BOOKS_COUNT < MAX_BOOKS && book != null) {
            books[BOOKS_COUNT] = book;
            BOOKS_COUNT += 1;
            System.out.println("Book added successfully " + book.getTitle());
        } else {
            System.out.println("Book is not Added !!! try again...");
        }
    }

    @Override
    public String toString() {
        return "Books" +
                "\nisbn=" + isbn +
                "\n title='" + title + '\'' +
                "\n author='" + author + '\'' +
                "\n isAvailable=" + isAvailable ;

    }

    public static void displayBooks() {
        for (int i = 0; i < BOOKS_COUNT; i++) {
            System.out.println(books[i].toString());
        }
    }
}



