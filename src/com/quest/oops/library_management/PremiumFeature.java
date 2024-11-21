package com.quest.oops.library_management;

public class PremiumFeature extends Members {
    //premium features
    private static final int BORROW_LIMIT = 10;
    private static final int WITHOUT_DUE = 10;
    private int[] borrowedBook = new int[BORROW_LIMIT];

    PremiumFeature(int memberId, String memberName, String membershipType) {
        super(memberId, memberName, membershipType);
    }

    @Override
    public int[] getBorrowedBook() {
        return borrowedBook;
    }

    @Override
    public void borrowBook(int isbn, Members members) {
        Books[] books1 = Books.getBooks();
        int bookCount = Books.getBooksCount();
        Members[] members1 = getMembers();
        int memberCount = getMemberCount();

        if ( members != null) {
            boolean flag1 = false;
            for (int i = 0; i < bookCount; i++) {
                int[] borrowedBook = getBorrowedBook();
                if (books1[i].getIsbn() == isbn && books1[i].getIsAvailable() && getCountOfBorrowed() < BORROW_LIMIT) {
                    borrowedBook[getCountOfBorrowed()] = isbn;
                    books1[i].setAvailable(false);
                    setCountOfBorrowed(getCountOfBorrowed()+1);
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
    public void returnBook(int isbn, Members members, int numberOfDates) {
        Books[] books1 = Books.getBooks();
        int bookCount = Books.getBooksCount();
        if ( members != null) {
            boolean flag1 = false;
            for (int i = 0; i < bookCount; i++) {
                if (books1[i].getIsbn() == isbn ) {
                    if(numberOfDates > WITHOUT_DUE ){
                        adjustBorrowedBook(isbn);
                        setCountOfBorrowed(getCountOfBorrowed()-1);
                        books1[i].setAvailable(true);
                        System.out.println("Book returned without Due!!!");
                        flag1 = true;
                    }
                    else{
                        adjustBorrowedBook(isbn);
                        setCountOfBorrowed(getCountOfBorrowed()-1);
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

    @Override
    public void adjustBorrowedBook(int isbn) {
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
