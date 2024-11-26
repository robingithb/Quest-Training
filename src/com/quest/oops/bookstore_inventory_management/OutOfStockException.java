package com.quest.oops.bookstore_inventory_management;

import javax.management.RuntimeMBeanException;

public class OutOfStockException extends Exception {

    public OutOfStockException(String message) {
        super(message);
    }
}
