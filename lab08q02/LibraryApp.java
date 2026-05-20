package lab08q02;

public class LibraryApp {
    public static void main(String[] args) {

        Library library = new Library("City Public Library");

        Book b1 = new Book("978-0-13-468599-1", "Clean Code");
        Book b2 = new Book("978-0-20-163361-5", "The Pragmatic Programmer");
        Book b3 = new Book("978-0-59-651798-1", "Head First Java");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        System.out.println();
        library.displayLibraryDetails();
    }
}