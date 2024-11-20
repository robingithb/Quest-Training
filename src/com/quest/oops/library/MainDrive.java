package com.quest.oops.library;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MainDrive {
    public static final int MAX_BOOK_BORROWED = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book;
        LibraryMember member;
        Library library = new Library(100, 10);//giving max book and members
        while (true) {
            System.out.println("\n Library Operations\n" +
                    "1 - Add book \n" +
                    "2 - Search Book \n" +
                    "3 - Borrow book \n" +
                    "4 - Return Book \n" +
                    "5 - Add Member \n" +
                    "6 - Display All books available \n" +
                    "7 - All Members \n" +
                    "8 - Quit \n" +
                    "Enter the choice \n");
            int choice = intTypeCheck(sc);
            int bookId; //to use object of book
            int membId; //to use object of  libraryMember
            switch (choice) {
                case 1:
                    //add a book
                    book = genreOfBooks(sc);
                    library.addBook(book);
                    break;
                case 2:
                    //search for a book
                    System.out.println("Enter Book Id");
                    int id = intTypeCheck(sc);
                    library.searchBook(id);
                    break;
                case 3:
                    //borrow a book
                    System.out.println("Enter book id and member Id");
                    bookId = intTypeCheck(sc);
                    membId = intTypeCheck(sc);
                    library.borrowBook(bookId, membId);
                    break;
                case 4:
                    //return a book
                    System.out.println("Enter book id and member Id");
                    bookId = intTypeCheck(sc);
                    membId = intTypeCheck(sc);
                    library.returnBook(bookId, membId);
                    break;
                case 5:
                    //add member
                    member = addMember(sc);
                    library.addMember(member);
                    break;
                case 6:
                    //display the books
                    library.displayBooks();
                    break;
                case 7:
                    //display   the members
                    library.displayMembers();
                case 8:
                    //exiting from library
                    System.out.println("Exiting from library");
                    break;
                default:
                    //for invalid option
                    System.out.println("Invalid option");
                    break;
            }
            if (choice == 8) {
                break;
            }
        }

    }

    /// for add genre of the book and add book
    public static Book genreOfBooks(Scanner sc) {
        int isbn;
        String title;
        String author;
        int year;
        boolean isAvailable;
        //decide fiction oro non fiction
        System.out.println("Enter the genre 1 . fictional 2.non fictional");
        if (intTypeCheck(sc) == 1) {
            System.out.println("enter isbn");
            isbn = intTypeCheck(sc);
            sc.nextLine();
            System.out.println("enter the title");
            title = stringTypeCheck(sc);
            System.out.println("enter the author");
            author = stringTypeCheck(sc);
            System.out.println("enter the publication year");
            year = intTypeCheck(sc);
            System.out.println("enter the availability  yes - true | no - false");
            isAvailable = booleanTypeCheck(sc);
            return new FictionBooks(isbn, title, author, year, isAvailable);
        } else {
            System.out.println("enter isbn");
            isbn = intTypeCheck(sc);
            sc.nextLine();
            System.out.println("enter the title");
            title = stringTypeCheck(sc);
            System.out.println("enter the author");
            author = stringTypeCheck(sc);
            System.out.println("enter the publication year");
            year = intTypeCheck(sc);
            System.out.println("enter the availability  yes - true | no - false");
            isAvailable = booleanTypeCheck(sc);
            return new NonFictionBooks(isbn, title, author, year, isAvailable);

        }
    }

    //for adding the members
    public static LibraryMember addMember(Scanner sc) {

        int memberId;
        String memberName;
        String contactInfo;
        int[] borrowedBooks;
        System.out.println("Enter member id");
        memberId = intTypeCheck(sc);
        sc.nextLine();
        System.out.println("Enter member name");
        memberName = stringTypeCheck(sc);
        System.out.println("Enter member's contact Info");
        contactInfo = stringTypeCheck(sc);
        System.out.println("Enter number of borrowed books");
        int numberOfBorrowBooks = intTypeCheck(sc);
        borrowedBooks = new int[5];
        //to handle any previously borrowed book and or not
        for (int j = 0; j < MAX_BOOK_BORROWED; j++) {
            if (j < numberOfBorrowBooks) {
                borrowedBooks[j] = intTypeCheck(sc);
            } else {
                borrowedBooks[j] = 0;
            }
        }
        return new LibraryMember(memberId, memberName, contactInfo, borrowedBooks);
    }
    //to check integer values
    private static int intTypeCheck(Scanner sc) {
        int value; //store  temporary
        while (!sc.hasNextInt()) {
            System.out.println("Enter valid Integer NUmber");
            sc.next();
        }
        value = sc.nextInt();
        return value; //it returns the integer value
    }
    //to check boolean values
    private static boolean booleanTypeCheck(Scanner sc) {
        boolean value; //store  temporary
        while (!sc.hasNextBoolean()) {
            System.out.println("Enter valid Boolean");
            sc.next();
        }
        value = sc.nextBoolean();
        return value; //it returns the boolean value
    }
    //to check string values
    private static String stringTypeCheck(Scanner sc) {
        String str;
        while (true) {

            str = sc.nextLine();

            // Check if the input is nonempty and only contains letters and spaces
            if (str.matches("[a-zA-Z\\s]+") && !str.trim().isEmpty()) {
                break; // Valid input, exit the loop
            } else {
                System.out.println("Invalid input. Please enter a valid name (letters and spaces only).");
            }
        }
        return str;
    }
}


