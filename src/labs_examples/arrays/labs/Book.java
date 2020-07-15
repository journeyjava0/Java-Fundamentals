package labs_examples.arrays.labs;

public class Book {

    private String title;
    private String author;
    private int numPages;

    public Book(){}

    public Book(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {

        if (numPages < 1) {
            System.out.println("Book must have more than 0 pages");
            return;
        }
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numPages=" + numPages +
                '}';
    }
}
