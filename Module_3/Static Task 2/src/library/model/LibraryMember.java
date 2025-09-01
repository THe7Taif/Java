package library.model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String name;
    private int memberId;
    private List<Book> borrowedBooks;
    private List<Book> reservedBooks = new ArrayList<>();

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters
    public String getName() { return name; }
    public int getMemberId() { return memberId; }
    public List<Book> getBorrowedBooks() { return borrowedBooks; }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    // Borrow and return books
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    // Task 3: Setters and Getters
    public void addReservedBook(Book book) {
        reservedBooks.add(book);
    }

    public void removeReservedBook(Book book) {
        reservedBooks.remove(book);
    }

    public boolean hasReservedBook(Book book) {
        return reservedBooks.contains(book);
    }

    public List<Book> getReservedBooks() {
        return reservedBooks;
    }
}
