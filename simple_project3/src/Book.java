public class Book {
    private String title;
    private String author;

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showDetails() {
        System.out.println("Book title: " + title);
        System.out.println("Book author: " + author);
    }
}
