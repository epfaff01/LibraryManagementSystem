import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Eric P.
 * 
 * The BookTester class contains JUnit tests for the Book class.
 */
public class BookTester {

    /**
     * Tests the constructor of the Book class with a given title.
     */
    @Test
    public void testConstructorWithGivenTitle() {
        Book book = new Book("The Hound of the Baskervilles","Sir Arthur Conan Doyle",1902,225);

        assertEquals(book.getTitle(),"The Hound of the Baskervilles");
    }

    /**
     * Tests the constructor of the Book class by setting the author after creation.
     */
    @Test
    public void testConstructorWithSettingAuthor() {
        Book book = new Book("The Hound of the Baskervilles","Sir Arthur Conan Doyle",1902,225);
        book.setAuthor("Eric Pfaffenbach");

        assertEquals(book.getAuthor(),"Eric Pfaffenbach");
    }

    /**
     * Tests the constructor of the Book class with a given valid year.
     */
    @Test
    public void testConstructorWithGivenValidYear() {
        Book book = new Book("Ender's Game","Orson Scott Card",1985,272);
        
        assertEquals(book.getYearPublished(), 1985);
    }

    /**
     * Tests the constructor of the Book class by setting a valid year after creation.
     */
    @Test
    public void testConstructorWithSettingValidYear() {
        Book book = new Book("Ender's Game","Orson Scott Card",1985,272);
        book.setYearPublished(2020);
        
        assertEquals(book.getYearPublished(), 2020);
    }

    /**
     * Tests the constructor of the Book class by setting an invalid year after creation.
     * Expects a YearOutsideBoundsException to be thrown.
     */
    @Test(expected = YearOutsideBoundsException.class)
    public void testConstructorWithSettingInvalidYear() {
        Book book = new Book("Ender's Game","Orson Scott Card",1985,272);
        book.setYearPublished(2026);
        
        assertEquals(book.getYearPublished(), 2026);
    }

    /**
     * Tests the constructor of the Book class by setting a valid number of pages after creation.
     */
    @Test
    public void testConstructorSettingValidNumPages() {
        Book book = new Book("The Hating Game","Sally Thorne",2016,384);
        book.setNumPages(283);
        
        assertEquals(book.getNumPages(), 283);
    }

    /**
     * Tests the constructor of the Book class by setting an invalid number of pages after creation.
     * Expects a NumPagesOutsideBoundsException to be thrown.
     */
    @Test (expected = NumPagesOutsideBoundsException.class)
    public void testConstructorWithInvalidNumPages() {
        Book book = new Book("The Hating Game","Sally Thorne",2016,-23);
        
        assertEquals(book.getNumPages(), -23);
    }
}