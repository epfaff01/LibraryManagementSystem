/**
 * @author Eric P.
 * 
 * Exception thrown to indicate that a year is outside the valid bounds (1000 to 2023, inclusive).
 * This exception is a subclass of RuntimeException.
 */
public class YearOutsideBoundsException extends RuntimeException {

    /**
     * Constructs a new YearOutsideBoundsException with a default error message.
     * The default message indicates that the year must be between 1000 and 2023.
     */
    public YearOutsideBoundsException() {
        super("Year must be between 1000 and 2023");
    }
}