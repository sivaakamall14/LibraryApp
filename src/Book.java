public class Book {
    private int id;
    private String title;
    private boolean isBorrowed;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.isBorrowed = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Book already borrowed.");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Book returned: " + title);
        } else {
            System.out.println("Book was not borrowed.");
        }
    }
}