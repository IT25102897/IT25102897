package lab09q02;

public class Report implements Printable {
    String title;
    String author;
    String date;

    public Report(String title, String author, String date) {
        this.title = title;
        this.author = author;
        this.date = date;
    }

    @Override
    public void printDetails() {
        System.out.println("--- Report ---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Date: " + date);
    }
}