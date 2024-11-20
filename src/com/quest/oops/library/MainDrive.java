package com.quest.oops.library;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MainDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book;
        LibraryMember member;
        LibraryMember libraryMember;
        Library library = new Library(100, 10);
        while (true) {
            System.out.println("Library Operations\n" +
                    "1 - Add book \n" +
                    "2 - Search Book \n" +
                    "3 - Borrow book \n" +
                    "4 - Return Book \n" +
                    "5 - Add Member \n" +
                    "6 - Display All books available \n" +
                    "7 - All Members \n" +
                    "8 - Quit \n" +
                    "Enter the choice \n");
            int choice = sc.nextInt();
            int bookId;
            int membId;
            switch (choice) {
                case 1:
                    book = genreOfBooks(sc);
                    library.addBook(book);
                    break;
                case 2:
                    System.out.println("Enter Book Id");
                    int id = sc.nextInt();
                    library.searchBook(id);
                    break;
                case 3:
                    System.out.println("Enter book id and member Id");
                    bookId = sc.nextInt();
                    membId = sc.nextInt();
                    library.borrowBook(bookId, membId);
                    break;
                case 4:
                    System.out.println("Enter book id and member Id");
                    bookId = sc.nextInt();
                    membId = sc.nextInt();
                    library.returnBook(bookId, membId);
                    break;
                case 5:
                    member = addMember(sc);
                    library.addMember(member);
                    break;
                case 6:
                    library.displayBooks();
                    break;
                case 7:
                    library.displayMembers();
                case 8:
                    System.out.println("Exiting from library");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            if (choice == 8) {
                break;
            }
        }

    }

    public static Book genreOfBooks(Scanner sc) {
        int isbn;
        String title;
        String author;
        int year;
        boolean isAvailable;
        System.out.println("Enter the genre 1 . fictional 2.non fictional");
        if (sc.nextInt() == 1) {
            System.out.println("enter isbn,title,author,year,isAvailable");
            isbn = sc.nextInt();
            sc.nextLine();
            title = sc.nextLine();
            author = sc.nextLine();
            year = sc.nextInt();
            isAvailable = sc.nextBoolean();
            return new FictionBooks(isbn, title, author, year, isAvailable);
        } else {
            System.out.println("enter isbn,title,author,year,isAvailable");
            isbn = sc.nextInt();
            sc.nextLine();
            title = sc.nextLine();
            author = sc.nextLine();
            year = sc.nextInt();
            isAvailable = sc.nextBoolean();
            return new NonFictionBooks(isbn, title, author, year, isAvailable);

        }
    }

    public static LibraryMember addMember(Scanner sc) {
        System.out.println("Enter member Details  member id,member name,contact info , borrowed books");
        int memberId;
        String memberName;
        String contactInfo;
        int[] borrowedBooks;

        memberId = sc.nextInt();
        sc.nextLine();
        memberName = sc.nextLine();
        contactInfo = sc.nextLine();
        System.out.println("Enter number of borrowed books");
        int numberOfBorrowBooks = sc.nextInt();
        borrowedBooks = new int[numberOfBorrowBooks];

        for (int j = 0; j < numberOfBorrowBooks; j++) {
            borrowedBooks[j] = sc.nextInt();
        }
        return new LibraryMember(memberId, memberName, contactInfo, borrowedBooks);
    }
}


