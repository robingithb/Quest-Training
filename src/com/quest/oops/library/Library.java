package com.quest.oops.library;

public class Library extends  LibraryOperations {
    private Book book;
    private LibraryMember libraryMember;
    private Book[] books;
    private int bookCount;
    private LibraryMember[] members;
    private int membersCount;

    Library(int totalBookCount , int totalMembers){
        this.books = new Book[totalBookCount];
        this.bookCount = 0;
        this.members = new LibraryMember[totalMembers];
        this.membersCount = 0;

    }


    @Override
    public void addBook(Book book ) {
        if(book != null && bookCount < books.length){
            books[bookCount] = book;
            bookCount += 1;
            System.out.println("Books added :"+book.getTitle());
        }
        else {
            System.out.println("Book is not added");
        }
    }

    public Book[] getBooks() {
        return books;
    }

    public LibraryMember[] getMembers() {
        return members;
    }

    public int getBookCount() {
        return bookCount;
    }

    public int getMembersCount() {
        return membersCount;
    }

    @Override
    public void addMember(LibraryMember member) {
        if(member != null && membersCount < members.length){
            members[membersCount] = member;
            membersCount += 1;
            System.out.println("Member added : "+member.getMemberName());
        }
        else {
            System.out.println("Member is not added");
        }
    }

    @Override
    public void searchBook(int isbn) {
        Book[] books1 = getBooks();
        int bookCount = getBookCount();
        boolean flag = false;
        for(int i =0;i<bookCount;i++){
            if(isbn == books1[i].getIsbn()){
                System.out.println("Book Name :"+books1[i].getTitle());
                System.out.println("Availability : "+books1[i].getIsAvailable());
                flag = true;
            }
        }
        if(!flag){
            System.out.println("Book n ot found here");
        }
    }

    @Override
    public void borrowBook(int isbn , int memberId) {
        Book[] books1 = getBooks();
        int bookCount = getBookCount();
        LibraryMember[] members1 = getMembers();
        int memberCount = getMembersCount();
        LibraryMember mem = null;
        boolean flag2 = false;
        for (int i = 0; i < memberCount; i++) {
            if (members1[i].getMemberId() == memberId) {
                mem = members1[i];
                flag2 = true;
                break;
            }
        }
        if (!flag2) {
            System.out.println("wrong Members id ");
        }
        Book b;
        if ( mem != null) {
            boolean flag1 = false;
            for (int i = 0; i < bookCount; i++) {
                if (books1[i].getIsbn() == isbn) {
                    mem.borrow(isbn, books1[i]);
                    flag1 = true;
                    System.out.println("Book borrowed");
                    break;
                }
            }
            if (!flag1)
                System.out.println("Not found isbn");
        }
    }

    @Override
    public void returnBook(int isbn , int memberId) {
        Book[] books1 = getBooks();
        int bookCount = getBookCount();
        LibraryMember[] members1 = getMembers();
        int memberCount = getMembersCount();
        LibraryMember mem = null;
        boolean flag2 = false;
        for (int i = 0; i < memberCount; i++) {
            if (members1[i].getMemberId() == memberId) {
                mem = members1[i];
                flag2 = true;
                break;
            }
        }
        if (!flag2) {
            System.out.println("wrong Members id ");
        }
        Book b;
        if ( mem != null) {
            boolean flag1 = false;
            for (int i = 0; i < bookCount; i++) {
                if (books1[i].getIsbn() == isbn) {
                    mem.returnBook(isbn,books1[i]);
                    flag1 = true;
                    System.out.println("Book returned");
                    break;
                }
            }
            if (!flag1)
                System.out.println("Not found isbn");
        }
    }
    public void displayBooks(){
        Book[] books1 = getBooks();
        int bookCount = getBookCount();

        for(int i = 0; i<bookCount;i++){
            if(books1[i].getIsAvailable()){
                books1[i].displayBooks();
            }
        }
    }
    public void displayMembers(){
        LibraryMember[] members1 = getMembers();
        int numberOfMembers = getMembersCount();
        for(int i=0;i<numberOfMembers;i++){
            members1[i].displayMember();
        }
    }
}
