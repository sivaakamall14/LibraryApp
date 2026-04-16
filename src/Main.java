public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        // Add books
        library.addBook(new Book(1, "Java Basics"));
        library.addBook(new Book(2, "OOP Concepts"));
        library.addBook(new Book(3, "Data Structures"));

        // View books
        library.viewBooks();

        // Borrow a book
        library.borrowBook(2);

        // View again
        library.viewBooks();

        // Return the book
        library.returnBook(2);

        // Final view
        library.viewBooks();
    }
}