/**
 * @author Eric P.
 * 
 * Exception thrown to indicate that the number of pages in a book is outside the valid bounds.
 * This exception is a subclass of RuntimeException.
 */
public class NumPagesOutsideBoundsException extends RuntimeException {

    /**
     * Constructs a new NumPagesOutsideBoundsException with a default error message.
     * The default message indicates that a book must have at least 1 page.
     */
    public NumPagesOutsideBoundsException() {
        super("Book must have at least 1 page");
    }
}