import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library();
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
    }

    @Test
    public void borrowerStartsWithNoBooks(){
        assertEquals(0, borrower.totalBooks());
    }

    @Test
    public void borrowerCanAddBook(){
        borrower.addBook(book);
        assertEquals(1, borrower.totalBooks());
    }

    @Test
    public void checkBorrowerRemovesBookFromLibrary(){
        assertEquals(3, library.booksTotal());
        borrower.takeBook(library);
        assertEquals(2, library.booksTotal());
        assertEquals(1, borrower.totalBooks());
    }


}
