import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library();
    }

    @Test
    public void libraryHasNoBooks(){
        assertEquals(0, library.booksTotal());
    }

    @Test
    public void checkAddBookToLibrary(){
        library.addBook(book);
        assertEquals(1, library.booksTotal());
    }

    @Test
    public void checkLibraryHasCapacity(){
        assertEquals(5, library.totalCapacity());
    }

    @Test
    public void checkCapacityLeftInLibrary(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.currentSpace());
    }

    @Test
    public void checkAddBookIfSpaceAvailable(){
        library.addBook(book);
        assertEquals(1, library.booksTotal());
    }

    @Test
    public void checkBookNotAddedIfNoSpace(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.booksTotal());
        library.addBook(book);
        assertEquals(5, library.booksTotal());
    }

    @Test
    public void checkRemoveBook(){
        library.addBook(book);
        assertEquals(1, library.booksTotal());
        library.removeBook();
        assertEquals(0, library.booksTotal());
    }
}
