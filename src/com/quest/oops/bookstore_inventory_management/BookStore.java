package com.quest.oops.bookstore_inventory_management;

public abstract class BookStore {
    private String title;
    private String author;
    private int price;
    private int stock;

    BookStore(String title, String author ,int price,int stock){
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getAuthor() {
        return author;
    }

    public abstract void addBook(BookStore book);


    public abstract void purchaseStock(int quantity , BookStore book) throws OutOfStockException ;

    }

