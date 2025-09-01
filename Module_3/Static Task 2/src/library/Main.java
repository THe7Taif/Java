package library;

import library.system.Library;
import library.model.Book;
import library.model.LibraryMember;


public class Main {
    public static void main(String[] args) {

        // Note: we should add books and members by Library Class not by Book, LibraryMember Classes .
        // Create instances of Library, Book, LibraryMember
        Library library = new Library();

        Book book, book1, book2;
        LibraryMember member, member1, member2;

        // Add books and members to the library.
        // Make books
        book = new Book("ABC", "John","123");
        book1 = new Book("DEF", "Zaid","1234");
        book2 = new Book("GHI", "Smith","12345");


        // Add books:
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);


         // Make members.
         member = new LibraryMember("Adam",1);
         member1 = new LibraryMember("John",2);
         member2 = new LibraryMember("Chris",3);

         // Add members to the Library:
        library.addMember(member);
        library.addMember(member1);
        library.addMember(member2);


        // Perform borrowing and returning operations.
        // Borrow books:
        library.borrowBook(member, book);


        // Return books:
        library.returnBook(member, book);


        // library members, reserve/cancel books, display reserved books.
        // reserve book
        library.reserveBook(member2, book2);


        // cancel books
        library.cancelReservation(member2, book2);

        // display reserved books.
        library.displayReservedBooks(member2);

    }
}
