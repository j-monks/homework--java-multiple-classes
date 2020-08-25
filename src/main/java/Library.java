import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library() {
        this.capacity = 2;
        this.books = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.bookCount() < this.capacity) {
            this.books.add(book);
        }
    }

    public Book removeBook() {
        return this.books.remove(0);
    }
}
