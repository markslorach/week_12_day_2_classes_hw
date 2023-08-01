import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;


    @Before
    public void before(){
        library = new Library(3);
        book1 = new Book("The Rambling Man", "Billy Connoly", "Biography");
        book2 = new Book("I Will Teach You To Be Rich", "Ramit Sethi", "Finance");
        book3 = new Book("Steal Like an Artist", "Austin Kleon", "Self Help");
        book4 = new Book("Goodbye, Things: The New Japanese Minimalism", "Fumio Sasaki", "Self Help");
    }

    @Test
    public void libraryHasCapacity(){
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void capacityFull(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.bookCount());
    }
}