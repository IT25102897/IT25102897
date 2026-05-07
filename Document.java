public class Document {
    private String title;
    private String content;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void displayDocument() {
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
    }

    public String getTitle() {
        return title;
    }
}