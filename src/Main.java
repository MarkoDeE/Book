import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create some book objects
        Book book1 = new Book("Origins", "Dan Brown", 29.99);
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 15.99);
        Book book3 = new Book("Dune", "Frank Herbert", 20.99);

        // Create a book catalogue object
        BookCatalogue catalogue = new BookCatalogue();

        // Add books to the catalogue
        catalogue.addBook(book1);
        catalogue.addBook(book2);
        catalogue.addBook(book3);

        // Search for a book by author
        List<Book> booksByAuthor = catalogue.searchByAuthor("Dan Brown");
        System.out.println("Books by author Dan Brown:");
        for (Book book : booksByAuthor) {
            System.out.println(book.getTitle());
        }

        // Search for a book by title
        List<Book> booksByTitle = catalogue.searchByTitle("Origins");
        System.out.println("Books with title Origins:");
        for (Book book : booksByTitle) {
            System.out.println(book.getAuthor());
        }

        // Get total price of all books in the catalogue
        double totalPrice = catalogue.getTotalPrice();
        System.out.println("Total price of all books: $" + totalPrice);

        // Remove a book from the catalogue
        catalogue.removeBook(book2);
        System.out.println("Book " + book2.getTitle() + " removed from the catalogue.");
    }
}
