import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("Harry Potter", "J. K. Rowling", "Fantasy");
    }


    @Test
    public void bookHasTitle(){
        assertEquals("Harry Potter", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("J. K. Rowling", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Fantasy", book.getGenre());
    }


}
