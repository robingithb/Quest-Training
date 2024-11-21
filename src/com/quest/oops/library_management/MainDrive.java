package com.quest.oops.library_management;

import com.quest.oops.library.Book;
import com.quest.oops.library.Library;
import com.quest.oops.library.LibraryMember;

import java.lang.reflect.Member;
import java.util.Scanner;

public class MainDrive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MainDrive mainDrive =  new MainDrive();
        Members member;
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
            Members members ;
            Books book;
            switch (choice) {
                case 1:
                    //add a book
                    book = addBooks(sc);
                    Books.addBook(book);
                    break;
                case 2:
                    //add a member
                    members  = addMembers(sc);
                    Members.addMembers(members);
                    break;
                case 3:
                    //borrow a book
                    System.out.println("Enter book id and member Id");
                    bookId = intTypeCheck(sc);
                    membId = intTypeCheck(sc);
                    members =findMember(membId);
                    if (members != null){
                        members.borrowBook(bookId,members);
                    }
                    else {
                        System.out.println("Member is not found");
                    }
                    break;
                case 4:
                    //return a book
                    System.out.println("Enter book id , member Id , number of days");
                    bookId = intTypeCheck(sc);
                    membId = intTypeCheck(sc);
                    int days = intTypeCheck(sc);
                    members =findMember(membId);
                    if (members != null){
                        members.returnBook(bookId,members,days);
                    }
                    else {
                        System.out.println("Member is not found");
                    }
                    break;
//                case 5:
//                    //add member
//                    member = addMember(sc);
//                    library.addMember(member);
//                    break;
//                case 6:
//                    //display the books
//                    library.displayBooks();
//                    break;
                case 7:
                    //display   the members
                    Books.displayBooks();
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
    private static Members findMember(int memberId){
        Members[] members1 = Members.getMembers();
        int memberCount = Members.getMemberCount();
        Members mem = null;
        boolean flag2 = false;
        for (int i = 0; i < memberCount; i++) {
            if (members1[i].getMemberId() == memberId ) {
                mem = members1[i];
                flag2 = true;
                return mem;
            }
        }
        return null;
    }

    private static Members addMembers(Scanner sc){
        System.out.println("Enter the Member ID");
        int memberId = intTypeCheck(sc);
        System.out.println("Enter the Member name");
        String memberName = stringTypeCheck(sc);
        System.out.println("Enter the membership type");
        String membershipType = stringTypeCheck(sc);
        if(membershipType.equalsIgnoreCase("regular")){
            return new Members(memberId,memberName,membershipType);
        }
        else {
            return new PremiumFeature(memberId,memberName,membershipType);
        }

    }

    private static Books addBooks(Scanner sc){
        System.out.println("Enter the isbn");
        int isbn = intTypeCheck(sc);
        System.out.println("Enter title of the Book");
        String title = stringTypeCheck(sc);
        System.out.println("Enter author of thr Book");
        String author = stringTypeCheck(sc);

        return new Books(isbn,title,author);
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

