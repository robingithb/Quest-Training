package com.quest.oops.library_management;

public class Members implements LibraryOperations{

    private static final int BORROW_LIMIT = 5;
    private static final int WITHOUT_DUE = 5;

    private int[] borrowedBook = new int[BORROW_LIMIT];


    private static  final int MAX_MEMBERS = 10;
    private int memberId;
    private String memberName;
    private String membershipType;
    private int countOfBorrowed;


    private static Members[] members = new Members[MAX_MEMBERS];
    private static int MEMBER_COUNT = 0;



    Members(int memberId , String memberName , String membershipType){
        this.memberId = memberId;
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.countOfBorrowed = 0;
    }
    //setters


    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public void setCountOfBorrowed(int countOfBorrowed) {
        this.countOfBorrowed = countOfBorrowed;
    }
    //getters


    public int getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public static Members[] getMembers() {
        return members;
    }

    public int getCountOfBorrowed() {
        return countOfBorrowed;
    }

    public int[] getBorrowedBook() {
        return borrowedBook;
    }
    //    public Book[] getBooks() {
//        return books;
//    }

//    public static int getBooksCount() {
//        return BOOKS_COUNT;
//    }

    public static int getMemberCount() {
        return MEMBER_COUNT;
    }


    @Override
    public void borrowBook(int isbn, Members members) {
        Books[] books1 = Books.getBooks();
        int bookCount = Books.getBooksCount();
        if ( members != null) {
            boolean flag1 = false;
            for (int i = 0; i < bookCount; i++) {
                if (books1[i].getIsbn() == isbn && books1[i].getIsAvailable() && countOfBorrowed < BORROW_LIMIT) {
                    borrowedBook[countOfBorrowed] = isbn;
                    books1[i].setAvailable(false);
                    countOfBorrowed  += 1;
                    flag1 = true;
                    System.out.println("Book borrowed by "+members.getMemberName());
                    break;
                }
            }
            if (!flag1)
                System.out.println("Not found isbn");
        }

    }

    @Override
    public void returnBook(int isbn, Members members , int numberOfDates) {
        Books[] books1 = Books.getBooks();
        int bookCount = Books.getBooksCount();
        if ( members != null) {
            boolean flag1 = false;
            for (int i = 0; i < bookCount; i++) {
                if (books1[i].getIsbn() == isbn ) {
                    if(numberOfDates < WITHOUT_DUE ){
                        adjustBorrowedBook(isbn);
                        countOfBorrowed -= 1;
                        books1[i].setAvailable(true);
                        System.out.println("Book returned without Due!!!");
                        flag1 = true;
                    }
                    else{
                        adjustBorrowedBook(isbn);
                        countOfBorrowed -= 1;
                        books1[i].setAvailable(true);
                        System.out.println("Book returned with Due : "+((numberOfDates - WITHOUT_DUE)*10)+"Rupees fine");
                        flag1 = true;
                    }
                    break;
                }
            }
            if (!flag1)
                System.out.println("Not found isbn");
        }

    }


    //add books



    public static void addMembers(Members member) {
        if(MEMBER_COUNT < MAX_MEMBERS && member != null){
            members[MEMBER_COUNT] = member;
            MEMBER_COUNT += 1;
            System.out.println("Member Added successfully "+member.getMemberName());
        }
        else {
            System.out.println("Member is not added !!! try again...");
        }
    }

    public  void displayMembers(){
        for (int i =0;i<MEMBER_COUNT;i++){
            System.out.println(members[i].getMemberName());
        }
    }

    public void adjustBorrowedBook(int isbn ) {
        int[] borrowedBooks = getBorrowedBook();
                for (int i = 0; i < borrowedBooks.length; i++) {
                    if (borrowedBooks[i] == isbn) {
                        int j;
                        for (j = i; j < borrowedBooks.length - 1; j++) {
                            borrowedBooks[j] = borrowedBooks[j + 1];
                        }
                        borrowedBooks[borrowedBooks.length-1] = 0;
                    }
                }
            }
    }

