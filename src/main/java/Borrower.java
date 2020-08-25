import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowersBooks;

    public Borrower() {
        this.borrowersBooks = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.borrowersBooks.size();
    }

    public void takeBook(Library library) {
        this.borrowersBooks.add(library.removeBook());
    }
}