package library.system;

import library.model.Book;
import library.model.LibraryMember;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<LibraryMember> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }

    public void borrowBook(LibraryMember member, Book book) {

        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(book.getTitle())) {
                member.borrowBook(b);   // member borrow book
                books.remove(b);        // removing book from books list
                System.out.println(member.getName() + " borrowed " + b.getTitle());
                return;
            }
        }
        System.out.println("Book not available.");
    }

    public void returnBook(LibraryMember member, Book book) {
        if (member.getBorrowedBooks().contains(book)) {
            member.returnBook(book); // member returned book by it function from the LibraryMember Class.
            books.add(book);  // adding book back to books list by ArrayList add method.
            System.out.println(member.getName() + " returned " + book.getTitle());
        } else {
            System.out.println("This member did not borrow the book.");
        }
    }


    // Task 3: book Reservation.
    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Reservation canceled successfully.");
        } else {
            System.out.println("Book was not reserved by this member.");
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
    }
}


