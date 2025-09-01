import java.util.ArrayList;
import java.util.HashMap;

// Task 1.3
public class Library {

    // Task 1.4
    private ArrayList<Book> books = new ArrayList<>();
    private HashMap<String, Book> borrowedBooks = new HashMap<>(); // store borrowed books by title
    private ArrayList<User> users = new ArrayList<>();


    // Task 1.5
    public void addBook(Book book) {
        books.add(book);
    }

    /* Library Catalog:
            1. Title: "Introduction to Java Programming", Author: "John Smith", Year: 2020
            2. Title: "Data Structures and Algorithms", Author: "Jane Doe", Year: 2018
            3. Title: "The Art of Fiction", Author: "Alice Johnson", Year: 2019
     */
    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: \"" + book.getTitle() + "\", Author: \"" + book.getAuthor() + "\", Year: " + book.getPublicationYear());
        }
    }


    //Books by Author "Jane Doe":
    //Title: "Data Structures and Algorithms", Year: 2018

    public void findBooksByAuthor(String author) {

        boolean found = false; // it's for the Scenario method to be found or not, in our method:

        for (Book book : books) { // for each book in ArrayList<Book> books-->
            if (book.getAuthor().equalsIgnoreCase(author)) {  // from class Book get getAuthor() method which return Author, then .equals() search for (author) also IgnoreCase "John or john"
                if (!found) {
                    System.out.println("\nBooks by Author: " + author);  // we return print the Author one time for the logic.
                    found = true;
                }
                System.out.println("Title: " + book.getTitle() + ", " + "Year: " + book.getPublicationYear()); // then we print all books applied by the same Author.
            }
        }
    }


    // Task 2
    // This method looks for a book by title and removes it from the available books list.
    // The book object itself is kept in the system (so it can be returned later).
    public void borrowBook(String title) {

        // boolean available = false;  // CAN NOT BE USED, becuz we need to return the book in the futuer so we dont want to remove it from the list and system, and this boolaen flag will check if the book exists in the library
        Book bookToRemove = null;   // will storeor hold the want to borrow.

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                //available = true;
                System.out.println(book.getTitle()); // print the title of the book we found
                bookToRemove = book; // save it to remove later (don't remove inside the loop)
            }
        }

        //if (available && bookToRemove != null) it was before but we have to not remove the book from the system only from availability list.

        // If we found the book, remove it from the available list.
        if (bookToRemove != null) {
            books.remove(bookToRemove); // remove the book from the ArrayList list
            borrowedBooks.put(title.toLowerCase(), bookToRemove); // then save the borrowed book, Which means that it has been removed from the ArrayList<Book>,
            // but with this line we just restored or resave in the new MapHash<borrowedBooks>, the best solution to not lose the Data. to return it again in the future.

            System.out.println("\n- The book has been successfully borrowed: \nBook \"" + title + "\" has been borrowed and removed from the list.");
        } else {
            System.out.println("Oops! The book \"" + title + "\" is not available.");
        }
    }

    // returnBook(Book book): This method simulates returning a book to the library.
    // It will add the book back to the collection.
    public void returnBook(String title) {
        Book returnedBook = borrowedBooks.remove(title.toLowerCase()); // get the borrowed book
        if (returnedBook != null) {
            books.add(returnedBook);
            System.out.println("\n- Thank you! \nThe book \"" + returnedBook.getTitle() + "\" has been successfully returned.");
        } else {
            System.out.println("The book \"" + title + "\" was not borrowed or already in the library.");
        }
    }


    // Task 3: Book Availability Check
    //isBookAvailable(String title): This method should return a boolean indicating whether the book with the specified title is available in the library.
    public boolean isBookAvailable(String title) {

        // is it in the ArrayList books?
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("\n- Book are available at the moment: " + title);
                return true; // book exists in the ArrayList <books>
            }
        }
        // Then check is it borrowed in the HashMap list?
        for (Book book : borrowedBooks.values()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("\n- Book are not available at the moment: " + title);
                return false; // book exists but is borrowed, means in HashMap<borrowedBooks>
            }
        }
        System.out.println("\n- "+ title + ": Book does not exists in the library collection. ");
        return false; // not found at all
    }


    // Task 5
    // calculate and return the average rating of all books in the library:
    public double getAverageBookRating() {
        double totalRating = 0;  // will store the total of all rating,
        int totalBooks = 0;          // will count the books that it has rating and store them one by one.

        for (Book book : books) { // we search in the main list.
            if (book.getRating() > 0) {      // so if the book has more than 0 as rating number -->
                totalRating = totalRating + book.getRating(); // store it in the totalRating = 0 + the rating.
                totalBooks = totalBooks + 1; // store it in the totalBooks = 0 + 1. this will be for each book one by one. to get all boks that has rating
            }
        }

        for (Book book : borrowedBooks.values()) { // we search in the borrowed list.
            if (book.getRating() > 0) {
                totalRating = totalRating + book.getRating();
                totalBooks  = totalBooks + 1;
            }
        }

        if (totalBooks == 0) {  // if theres no book has a rating so it will be equil to 0, cuz empty
            System.out.println("\n- No ratings available yet.");
            return 0.0;
        }
        double average = totalRating / totalBooks;
        System.out.println("\n- Average books rating: " + average);
        return average;
    }

    // return book with the highest number of reviews.:
    public Book getMostReviewedBook() {
        Book mostReviewed = null;  // This will hold the book with the highest number of reviews, cuz we have many books with Reviews.
        int maxReviewed = 0;         // This keeps track of the highest number of reviews found so far.

        for (Book book : books) { // we search in the main list.
            int reviewsCount = book.getReview().size(); // Get the number of reviews for the current book.
            if (reviewsCount > maxReviewed) {      // then we check for highest we just got if its also higher than one we got before, which have been in hold in maxReviewed variable   -->
                maxReviewed = reviewsCount;        // Update the maximum review count data.
                mostReviewed = book;               // // Update the mostReviewed book to the current one since it has more reviews than any seen before.
            }
        }

        for (Book book : borrowedBooks.values()) {
            int reviewsCount = book.getReview().size();
            if (reviewsCount > maxReviewed) {
                maxReviewed = reviewsCount;
                mostReviewed = book;
            }
        }

        return mostReviewed;
    }

    // Task 6

    public void addUser(User user) {
        users.add(user);
    }

    // when thinking about user request to borrow book, the method will search for the book in books ArrayList,
    // if the book found, the method will add it to the borrowedBooks HashMap list in the Library Class, also
    // will add it to the borrowedBooks ArrayList in th User class. if not found in the books ArrayList. will print that book are not available.

    public Book userBorrowBook(User user, String title) {
        boolean found = false;
        Book borrowedBook = null;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book); // remove book from books ArrayList
                borrowedBooks.put(title.toLowerCase(), book); // add the book to Library borrowedBooks HashMap list
                user.borrowBook(book);
                borrowedBook = book;  // save the book
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The book \"" + title + "\" is not available.");
        }
        return borrowedBook;
    }

    // when thinking about user returning the book to the Library,
    // Retrieves it from borrowedBooks and adds it back to the available list
    public void userReturnBook(User user, String title) {
        Book returnedBook = borrowedBooks.remove(title.toLowerCase()); // Get the book from borrowed list
        if (returnedBook != null) {
            books.add(returnedBook);        // Add back to library
            user.returnBook(returnedBook);  // Remove from user's borrowed list
            System.out.println("\n- Thank you!");
            System.out.println("The book \"" + returnedBook.getTitle() + "\" has been successfully returned.");
        } else {
            System.out.println("The book \"" + title + "\" was not borrowed or is already in the library.");
        }
    }
}


