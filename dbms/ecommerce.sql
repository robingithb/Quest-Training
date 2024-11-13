

CREATE TABLE Customer (
    CustomerID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Email VARCHAR(100),
    Phone VARCHAR(15),
    Address VARCHAR(255)
);

 

CREATE TABLE Product (
    ProductID INT PRIMARY KEY,
    ProductName VARCHAR(100),
    Price DECIMAL(10, 2),
    StockQuantity INT
);

 

CREATE TABLE Customer_Order (
    OrderID INT PRIMARY KEY,
    CustomerID INT,
    OrderDate DATE,
    TotalAmount DECIMAL(10, 2),
    FOREIGN KEY (CustomerID) REFERENCES Customer(CustomerID)
);

 

CREATE TABLE Order_Item (
    OrderItemID INT PRIMARY KEY,
    OrderID INT,
    ProductID INT,
    Quantity INT,
    PriceAtPurchase DECIMAL(10, 2),
    FOREIGN KEY (OrderID) REFERENCES Customer_Order(OrderID),
    FOREIGN KEY (ProductID) REFERENCES Product(ProductID)
);




select * from Customer;
select * from Customer_Order;
select * from Order_Item;
select * from Product;

insert into Product values (1006,"Kurta",1060.00,15);
insert into Product values (1003,"Top",1200.00,1),(1004,"Jeans",2200.00,4),(1005,"Sleevs",900.00,1);

select * from Product where Price > 1000;
insert into Order_Item values(112,1,1004,11,2000);

select * from Product where ProductID in (select ProductID from Order_Item where Quantity >10);
select count(ProductID) from Product;
select * from Product where  (select max(Price) from Product limit 1); 
select * from Product where price = (select min(Price)from Product);
select * from Product where price > ( select avg(Price) from Product);
select sum(Price) from Product;