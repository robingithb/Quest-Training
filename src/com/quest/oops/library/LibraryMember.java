package com.quest.oops.library;

import java.util.Arrays;

public class LibraryMember{
    public static int BORROWED_COUNT = 0;
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
    public void borrow(int isbn,Book book){
       int borrowLength = borrowedBooks.length;
       if(BORROWED_COUNT < borrowLength && (book.getIsAvailable())){
           borrowedBooks[BORROWED_COUNT] = isbn;
           BORROWED_COUNT +=1;
           book.setAvailable(false);
           System.out.println("book borrowed by "+getMemberName());
       }
       else {
           System.out.println("book can not borrowed");
       }
    }
    public void returnBook(int isbn,Book book){
        boolean flag = false;
        for(int i =0;i<borrowedBooks.length;i++){
            if(borrowedBooks[i] == isbn){
                for(int j = i;j<borrowedBooks.length-1;j++){
                    borrowedBooks[j] = borrowedBooks[j+1];
                }
                book.setAvailable(true);
                borrowedBooks[BORROWED_COUNT] = 0;
                BORROWED_COUNT -= 1;
                System.out.println("book successfully returned");
                flag = true;
            }
        }
        if(!flag){
            System.out.println("Book not found");
        }
    }
    public void displayMember(){
        System.out.println("Member Id : "+memberId +"\nMember Name :"+getMemberName()+
                "\nContact Info : "+getContactInfo()+
                "\nBorrowed Books : "+ Arrays.toString(getBorrowedBooks()));
    }

}

