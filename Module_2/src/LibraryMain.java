/* Library Catalog:
1. Title: "Introduction to Java Programming", Author: "John Smith", Year: 2020
2. Title: "Data Structures and Algorithms", Author: "Jane Doe", Year: 2018
3. Title: "The Art of Fiction", Author: "Alice Johnson", Year: 2019

Books by Author "Jane Doe":
Title: "Data Structures and Algorithms", Year: 2018
*/


// Task 1.6
public class LibraryMain {
    public static void main(String[] args) {

        Book book1, book2, book3, book4, book5;
        Library myLibrary;
        User user1, user2;


        // Create instances of Book representing different books:
        book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);
        book4 = new Book("Principles of Machine Learning", "Michael Brown", 2021);
        book5 = new Book("Modern Web Development", "Emily Davis", 2022);

        // Create an instance of Library
        myLibrary = new Library();


        // Add the book instances to the library:
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);
        myLibrary.addBook(book4);
        myLibrary.addBook(book5);



        // Display the list of all books in the library.
        System.out.println("Library Catalog: ");
        myLibrary.displayBooks();

        // Search for books by a specific author and display the results:
        myLibrary.findBooksByAuthor("Alice Johnson");



        // Task 2
        // This method should simulate a book being borrowed. It should remove the book from the library's collection if available.
        myLibrary.borrowBook("Modern Web Development");

        System.out.println("\n- Please wait! Cheking for book availability in the library's collection.... ");
        myLibrary.borrowBook("Modern Web Development"); // to try and check for the same book if it's still available?.


        // book being returned to the library. It should add the book back to the library's collection.
        myLibrary.returnBook("Modern Web Development");


        // Task 3
        // return a boolean indicating whether the book with the specified title is available in the library.
        myLibrary.isBookAvailable("Modern Web Development");

        myLibrary.isBookAvailable("The Low BoOk"); // Book does not exists in the library collection.

        // Task 4
        // Set rating
        book1.setRating(4.8);
        book2.setRating(2.6);

        // Add review
        book1.addReview("An excellent book for writing cleaner, more maintainable code!");
        book2.addReview("An excellent book for writing cleaner, more maintainable code!");

        // Display results
        System.out.println("\n- Book Review System:");
        System.out.println(book1.getTitle() + " (" + book1.getPublicationYear() + ")");
        System.out.println("Rating: " + book1.getRating());
        System.out.println("Review: " + book1.getReview());

        // Task 5
        // calculate and return the average rating of all books in the library.
        System.out.println("\n- The book has highest number of reviews: \n" + myLibrary.getMostReviewedBook());



        // Task 6
        // Users
        user1 = new User("John Smith", 21);
        user2 = new User("Jane Doe", 18);
        myLibrary.addUser(user1);
        myLibrary.addUser(user2);

        // Borrow & Return
        myLibrary.userBorrowBook(user1, "Modern Web Development");
        myLibrary.userReturnBook(user1, "Modern Web Development");

    }
}
