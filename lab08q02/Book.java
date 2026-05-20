package lab08q02;

public class Book {
    private String isbn;
    private String title;
    private Library library;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public void displayBookDetails() {
        System.out.println("  ISBN: " + isbn);
        System.out.println("  Title: " + title);
        if (library != null) {
            System.out.println("  Library: " + library.getLibraryName());
        }
    }
}