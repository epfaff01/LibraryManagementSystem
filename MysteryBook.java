/**
 * This Mystery Book class inherits from the Book class. A Mystery Book is a specific type of Book
 * which inherits properties from the Book class and a two new variables are created.
 * 
 *  @author Eric P.
 */

public class MysteryBook extends Book implements BookInfo {

    private String detectiveName;
    private boolean crimeSolved;

    /**
     * Constructs a new Mystery Book with a specific title, author, number of pages, genre,
     * and two parameters unique to a Mystery Book: detectiveName, crimeSolved
     *
     * @param title , String for the title of the book
     * @param author , String for the author of the book
     * @param yearPublished , Integer for the year the book was published
     * @param numPages , Integer for the number of pages in the book
     * @param detectiveName , String for the name of the detective                              // GOT THIS IDEA FROM CHAT GPT
     * @param crimeSolved , Boolean that indicates whether the crime was solved or not          // GOT THIS IDEA FROM CHAT GPT
     */
    public MysteryBook (String title, String author, int yearPublished, int numPages, String detectiveName, boolean crimeSolved) {
        super(title, author, yearPublished, numPages);
        this.detectiveName = detectiveName;
        this.crimeSolved = crimeSolved;
    }
    
    /**
     * @return the name of the detective
     */
    public String getDetectiveName() {
        return detectiveName;
    }

    /**
     * set the detective's name
     * @param d; a string, the name of the detective
     */
    public void setDetectiveName(String d) {
        detectiveName = d;
    }

    /**
     * @return boolean that indicates whether the crime was solved or not  
     */
    public boolean getCrimeSolved() {
        return crimeSolved;
    }

    /**
     * set boolean
     * @param sol; a boolean that indicates whether the crime was solved or not  
     */
    public void setCrimeSolved(boolean sol) {
        crimeSolved = sol;
    }

    /**
     * @return The genre of the book
     */
    @Override
    public String getGenre() {
        return "Mystery";
    }
    
    /**
     * @return String representation of a Mystery Book,
     * including title, author, year published, number of pages, name of the detective, and if the crime was Solved or not
     */
    @Override
    public String toString() {
        String returnstring = "";
        returnstring += "Title: " + getTitle() + "\n";
        returnstring += "Author: " + getAuthor() + "\n";
        returnstring += "Year Published: " + getYearPublished() + "\n";
        returnstring += "Number of Pages: " + getNumPages() + "\n";
        returnstring += "Detective's name: " + getDetectiveName() + "\n";
        returnstring += "Crime Solved: " + getCrimeSolved() + "\n";
        return returnstring;
    }
}
