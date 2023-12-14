/**
 * @author Eric P.
 * 
 * This interface defines methods for retrieving information about a book.
 * Classes implementing this interface must contain these methods.
 */
public interface BookInfo {
    String getTitle();
    String getAuthor();
    int getYearPublished();
    int getNumPages();
    String getGenre();
}
