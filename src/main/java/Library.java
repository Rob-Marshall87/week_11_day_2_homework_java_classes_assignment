import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(){
        this.books = new ArrayList<>();
        this.capacity = 5;
    }


    public int booksTotal() {
        return books.size();
    }

    public void addBook(Book book) {
        if (capacity > books.size())
            books.add(book);
    }

    public int totalCapacity() {
        return capacity;
    }

    public int currentSpace() {
        return capacity -= books.size();
    }

    public Book removeBook() {
        return books.remove(0);
    }
}
