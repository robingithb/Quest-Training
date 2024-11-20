package com.quest.oops.library;

public class FictionBooks extends Book{
    //fiction books storing
    FictionBooks(int isbn, String title, String author, int year, boolean isAvailable){
        super(isbn, title, author, year, isAvailable);
    }
    public void displayFictionBooks(){
        System.out.println("List of Fictions");
        super.displayBooks();
    }
}
