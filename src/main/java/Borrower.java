import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> books;

    public Borrower(){
        this.books = new ArrayList<>();
    }

    public int totalBooks() {
        return books.size();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void takeBook(Library library) {
        Book book = library.removeBook();
        books.add(book);
    }
}
