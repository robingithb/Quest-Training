package com.quest.oops.library;

public class Book {
    private int isbn;
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    Book(int isbn, String title, String author, int year, boolean isAvailable) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
    public boolean getIsAvailable(){
        return isAvailable;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void displayBooks(){
        String status ;
        if(getIsAvailable()){
            status = "Yes";
        }else{
            status  = "No";
        }
        System.out.println("Book Id : "+isbn +"\nBook Name :"+getTitle() +
                "\nAuthor Name : "+getAuthor() +
                "\nPublished Year : "+getYear()+
                "\nAvailable Status : "+status);
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

}