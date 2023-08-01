import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before() {
        book = new Book("The Rambling Man", "Billy Connoly", "Biography");
    }

    @Test
    public void bookHasTitle() {
        assertEquals("The Rambling Man", book.getTitle());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("Billy Connoly", book.getAuthor());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("Biography", book.getGenre());
    }
}