package com.quest.oops.bookstore_inventory_management;

public class SpecialEditionBook extends BookStore {

    private final  int DISCOUNT_PERCENTAGE = 30;
    private String bookType;

    SpecialEditionBook(String title, String author, int price, int stock, String bookType) {
        super(title, author, price, stock);
        this.bookType  = bookType;
    }

    @Override
    public void addBook(BookStore book) {
        System.out.println(book.getTitle() + " added successfully");
    }

    @Override
    public void purchaseStock(int quantity , BookStore book) throws OutOfStockException {
       if(quantity > book.getStock()){
           throw new OutOfStockException("not enough stock");
       }else {
           book.setStock(book.getStock() - quantity);
           double totalAmount = (book.getPrice() * DISCOUNT_PERCENTAGE)/100;

           totalAmount = totalAmount * quantity;
           System.out.println("Book purchased with amount = "+totalAmount);
       }
    }

}
