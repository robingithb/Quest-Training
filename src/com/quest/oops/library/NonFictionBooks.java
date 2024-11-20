package com.quest.oops.library;

public class NonFictionBooks extends Book{
    //non-fiction books storing
    NonFictionBooks(int isbn, String title, String author, int year, boolean isAvailable){
        super(isbn, title, author, year, isAvailable);
    }
    public void displayFictionBooks(){
        System.out.println("List of Non - Fictions");
        super.displayBooks();
    }
}
