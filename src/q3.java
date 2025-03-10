/*
 * Question 3:
 * Complete the implementation of a simple library system that handles books and DVDs.
 * 
 * Define an abstract class `Media` that contains:
 * - A title field.
 * - A constructor to initialize it.
 * - A method to display details (to be implemented by subclasses).
 * 
 * Define a `Book` class that extends `Media` with:
 * - An author field.
 * - A page count field.
 * - A constructor to initialize all fields.
 * - A method to display book details.
 * 
 * Define a `DVD` class that extends `Media` with:
 * - A director field.
 * - A duration field.
 * - A constructor to initialize all fields.
 * - A method to display DVD details.
 * 
 * In the `LibrarySystem` class:
 * - Create an instance of `Book` and `DVD` with sample data.
 * - Display their details.
 * 
 * Task:
 * Fill in the missing parts below the comment `TO DO`.
 * DO NOT EDIT ANY OTHER CODE.
 */

// Abstract class Media
abstract class Media {
    private String title;

    public Media(String title) {
        // TO DO: Initialize title
    }

    public String getTitle() {
        // TO DO: Return title
    }

    public abstract void displayDetails();
}

// Book class
class Book extends Media {
    private String author;
    private int pageCount;

    public Book(String title, String author, int pageCount) {
        // TO DO: Initialize fields
    }

    @Override
    public void displayDetails() {
        // TO DO: Display book details
    }
}

// DVD class
class DVD extends Media {
    private String director;
    private int duration;

    public DVD(String title, String director, int duration) {
        // TO DO: Initialize fields
    }

    @Override
    public void displayDetails() {
        // TO DO: Display DVD details
    }
}

// Main class
public class q3 {
    public static void main(String[] args) {
        // Create book and DVD
        Book book = new Book("Java Programming", "John Doe", 500);
        DVD dvd = new DVD("Inception", "Christopher Nolan", 148);

        // TO DO: Display book details

        // Blank line
        System.out.println();

        // TO DO: Display DVD details

    }
}
