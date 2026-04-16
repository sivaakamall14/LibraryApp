import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void viewBooks() {
        System.out.println("\nLibrary Books:");
        for (Book book : books) {
            String status = book.isBorrowed() ? "Borrowed" : "Available";
            System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() + " (" + status + ")");
        }
    }

    public void borrowBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                book.borrowBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }
}