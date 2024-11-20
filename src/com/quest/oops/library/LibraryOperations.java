package com.quest.oops.library;

public abstract class LibraryOperations {

    public abstract void addBook(Book book);

    public abstract  void addMember(LibraryMember member);

    public abstract void searchBook(int isbn);

    public abstract void borrowBook(int isbn , int memberId);

    public abstract void returnBook(int isbn , int memberId);
}
