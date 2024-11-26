package com.quest.oops.bookstore_inventory_management;

public class NormalBooks  extends BookStore{
    private String bookType;
    NormalBooks(String title, String author, int price, int stock , String bookType) {
        super(title, author, price, stock);
        this.bookType = bookType;
    }

    @Override
    public void purchaseStock(int quantity, BookStore book) throws OutOfStockException {
        {
            if(quantity > book.getStock()){
                throw new OutOfStockException("not enough stock");
            }else {
                book.setStock(book.getStock() - quantity);
                double totalAmount = book.getPrice() * quantity;
                System.out.println("Book purchased with amount = "+totalAmount);
            }
        }
    }

    @Override
    public void addBook(BookStore book) {
        System.out.println(book.getTitle() + " added successfully");
    }

}
