package com.quest.oops.library;

public abstract class LibraryOperations {
    //to add books
    public abstract void addBook(Book book);
    //add members
    public abstract  void addMember(LibraryMember member);
    //to search books using isbn
    public abstract void searchBook(int isbn);
    //borrow books using isbn and members id
    public abstract void borrowBook(int isbn , int memberId);
    //return book using isbn and members id
    public abstract void returnBook(int isbn , int memberId);
}
