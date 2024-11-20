package com.quest.oops.library;

import java.util.Arrays;

public class LibraryMember{
    public static int BORROWED_COUNT = 0; //number of borrowed books
    private int memberId ;
    private  String memberName;
    private String contactInfo;
    private int[] borrowedBooks;



    LibraryMember(int memberId,String memberName,String contactInfo,int[] borrowedBooks){
        this.memberId = memberId;
        this.memberName = memberName;
        this.contactInfo = contactInfo;
        this.borrowedBooks = borrowedBooks;
    }
    //getters
    public int getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public int[] getBorrowedBooks() {
        return borrowedBooks;
    }
    //setters
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setBorrowedBooks(int[] borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
    //for borrow the books
    public void borrow(int isbn,Book book){
        //find the number of borrowed book
       int borrowLength = borrowedBooks.length;
        for (int borrowedBook : borrowedBooks) {
            if (borrowedBook != 0) {
                BORROWED_COUNT++;
            }
        }
        //checking the borrowed count is  less than the limit
       if(book.getIsAvailable()){
           borrowedBooks[BORROWED_COUNT] = isbn;
           book.setAvailable(false);
           System.out.println("book borrowed by "+getMemberName());
       }
       else {
           System.out.println("book can not borrowed");
       }
    }
    //to return books
    public void returnBook(int isbn,Book book){
        boolean flag = false;
        //finding the books object from the books array and  checking with its id
        for(int i =0;i<borrowedBooks.length;i++){
            if(borrowedBooks[i] == isbn){
                int j;
                for( j = i;j<borrowedBooks.length-1;j++){
                    borrowedBooks[j] = borrowedBooks[j+1];
                }
//                borrowedBooks[j+1] = 0;
                book.setAvailable(true);
                borrowedBooks[borrowedBooks.length -1] = 0;
//                BORROWED_COUNT -= 1;
                System.out.println("book successfully returned");
                flag = true;
            }
        }
        if(!flag){
            System.out.println("Book not found");
        }
    }
    //display the members
    public void displayMember(){
        System.out.println("\n Members \n Member Id : "+memberId +"\nMember Name :"+getMemberName()+
                "\nContact Info : "+getContactInfo()+
                "\nBorrowed Books : "+ Arrays.toString(getBorrowedBooks()));
    }

}

