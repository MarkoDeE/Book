import java.util.ArrayList;
import java.util.List;

public class BookCatalogue {
    private List<Book> books;

    // Constructor
    public BookCatalogue() {
        books = new ArrayList<>();
    }

    // Behaviour to add a book to the catalogue
    public void addBook(Book book) {
        books.add(book);
    }

    // Behaviour to remove a book from the catalogue
    public void removeBook(Book book) {
        books.remove(book);
    }

    // Behaviour to search for a book by author
    public List<Book> searchByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .toList();
    }

    // Behaviour to search for a book by title
    public List<Book> searchByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .toList();
    }

    // Behaviour to get total price of all the books available in the catalogue
    public double getTotalPrice() {
        return books.stream()
                .mapToDouble(Book::getPrice)
                .sum();
    }
}
