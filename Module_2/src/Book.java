import java.util.ArrayList;

// Task 1.1
public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private double rating; // Task 4
    private ArrayList<String> reviews;// Task 4: Sould make reviews as a List, cuz we need to Collection we can access them in the future.

    // Task 1.2
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        reviews = new ArrayList<>();

    }


    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPublicationYear() {
        return publicationYear;
    }



    // Task 4
    // set the rating of the book.
    public void setRating(double rating) {
        if (rating >= 0.0 && rating <= 5.0) {
            this.rating = rating;
        } else
        System.out.println("\"Rating must be between 0.0 and 5.0\"");
    }

    public void addReview(String review) {
        reviews.add(review); // add method in ArrayList to --> reviews []
    }

    public ArrayList<String> getReview() {
        return reviews;
    }
    public double getRating() {
        return rating;
    }


    @Override
    public String toString() {
        return "\"" + title + "\" by " + author
                + " (" + publicationYear + "), Rating: " + rating
                + ", Reviews: " + reviews.size();
    }

}

