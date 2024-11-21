package com.quest.oops.library_management;

public interface LibraryOperations {

    void borrowBook(int isbn , Members members);

    void returnBook(int isbn , Members members , int numberOfDates);


}
