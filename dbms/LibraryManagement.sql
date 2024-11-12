use LibraryManagement;


-- Books table with the following columns:
-- book_id (Primary Key, INT, Auto Increment)
-- title (VARCHAR)
-- author_id (Foreign Key referencing author_id in the Authors table)
-- publication_year (YEAR)
-- price (DECIMAL)
CREATE TABLE Books (
    book_id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(50) NOT NULL,
    author_id INT ,
    publication_year INT NOT NULL,
    price DECIMAL(10,2),
    FOREIGN KEY (author_id) REFERENCES Author(author_id),
    check (publication_year > 0 and price>0)
);

-- Authors table with the following columns:
-- author_id (Primary Key, INT, Auto Increment)
-- first_name (VARCHAR)
-- last_name (VARCHAR)
create table Author(
	author_id int primary key auto_increment,
    first_name varchar(50) not null,
    last_name varchar(50)
    );

    -- Borrowers table with the following columns:
-- borrower_id (Primary Key, INT, Auto Increment)
-- first_name (VARCHAR)
-- last_name (VARCHAR)
-- email (VARCHAR, Unique)
-- dob (DATE)
create table Borrowers (
	borrower_id int primary key auto_increment,
    first_name varchar(50) not null,
    last_name varchar(50),
    email varchar(50) unique,
    dob date
    );

-- Loans table with the following columns:
-- loan_id (Primary Key, INT, Auto Increment)
-- borrower_id (Foreign Key referencing borrower_id in the Borrowers table)
-- book_id (Foreign Key referencing book_id in the Books table)
-- loan_date (DATE)
-- return_date (DATE)
create table Loans(
	loan_id int primary key auto_increment,
    borrower_id int,
    book_id int,
    loan_date date,
    return_date date,
    foreign key (borrower_id) references Borrowers(borrower_id),
    foreign key (book_id) references Books(book_id),
    check (return_date > loan_date)
    );


-- Insert Records:
-- Insert 5 records into each of the four tables (Books, Authors, Borrowers, and Loans).
--  Ensure the data is realistic and consistent with the relationships between the tables.
insert into Author (first_name,last_name) values("Robin","Thomas"),("OMV","Kurup"),("Nila","Ram"),("Meera","Rajan");
select * from Author;

insert into Books (title,author_id,publication_year,price) values("AaduGeevitham",1,2007,299),
				("Gods Eye",2,2021,199),
                ("Chaloo",3,2006,399),
                ("Apna",4,2019,350),
                ("Aarachaar",5,2015,599);
insert into Books (title,author_id,publication_year,price) values("The Great Gatsby",2,2019,199);
insert into Books (title,author_id,publication_year,price) values("Moby dick",3,2018,399);

insert into Borrowers(first_name,last_name,email,dob) values ("Thasni","Robin","thasni@gmail.com","2000-10-21"),
		 ("Shiji","Thomas","shiji@gmail.com","1999-12-25"),
		 ("Arun","Kumar","arun@gmail.com","2003-10-21"),
          ("Deepak","Anil","deepak@gmail.com","2000-01-11"),
           ("Thesin","Srbastain","theslin@gmail.com","2003-10-01");
insert into Borrowers(first_name,last_name,email,dob) values ("Sreedaran","Pillai","sree@gmail.com","1960-09-21");

insert into Loans(borrower_id,book_id,loan_date,return_date) values (1,1,"2023-07-21","2023-09-21"),
			(2,2,"2023-09-20","2023-11-21"),
            (3,3,"2023-11-21","2024-01-21"),
            (4,4,"2024-01-21","2024-03-21"),
            (5,5,"2024-03-21","2024-05-21");
insert into Loans(borrower_id,book_id,loan_date,return_date) values (6,11,"2024-07-21","2024-09-21");


-- Perform the Following SQL Operations:
-- SELECT Queries:
-- Select all columns from the Books table.
select * from Books;

select * from Author;
select * from Borrowers;
select * from Loans;

-- Select the title, price, and publication_year of books where price > 200.
select title,price,publication_year from Books where price > 200;

-- Select the first_name, last_name, and email of borrowers who have borrowed books after '2024-01-01'.
select first_name ,last_name from Borrowers where borrower_id in
	(select borrower_id from Loans where loan_date > "2024-01-01");

-- Update the price of the book with title = 'The Great Gatsby' to 25.00.
update Books set price = 25.00 where title = "The Great Gatsby";

-- Delete the book from the Books table where title = 'Moby Dick'.
delete from Loans where book_id = (select book_id from Books where title = "Moby dick");
delete from Books where title = "Moby dick";

-- Alter the Books table to add a new column genre of type VARCHAR(50).
alter table Books add column genre varchar(50);

-- Use the COUNT function to find the total number of borrowers.
select count(borrower_id) as number_of_borrowers from Borrowers;

-- Use the SUM function to find the total price of all books in the library.
select sum(price) from Books;

-- Use the AVG function to calculate the average price of books.
select avg(price) from Books;

-- Write a subquery to find all books that have been borrowed by any borrower who is over 30 years old.
select title from Books where book_id in (
	select book_id from Loans where borrower_id in(
		select borrower_id from Borrowers where datediff(curdate(),dob)/365 >30));




