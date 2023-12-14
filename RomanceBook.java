/**
 * This Romance Book class inherits from the Book class. A Romance Book is a specific type of Book
 * which inherits properties from the Book class and a two new variables are created.
 * 
 *  @author Eric P.
 */

public class RomanceBook extends Book implements BookInfo {

    private String mainCharacter;
    private boolean happyEnding;

    /**
     * Constructs a new Romance Book with a specific title, author, number of pages, genre,
     * and two parameters unique to a Romance Book: mainCharacter, happyEnding
     *
     * @param title , String for the title of the book
     * @param author , String for the author of the book
     * @param yearPublished , Integer for the year the book was published
     * @param numPages , Integer for the number of pages in the book
     * @param mainCharacter , String for the name of the main character                              // GOT THIS IDEA FROM CHAT GPT
     * @param happyEnding , Boolean that indicates whether the book has a happy ending or not        // GOT THIS IDEA FROM CHAT GPT
     */
    public RomanceBook (String title, String author, int yearPublished, int numPages, String mainCharacter, boolean happyEnding) {
        super(title, author, yearPublished, numPages);
        this.mainCharacter = mainCharacter;
        this.happyEnding = happyEnding;
    }
    
    /**
     * @return the name of the main character
     */
    public String getMainCharacter() {
        return mainCharacter;
    }

    /**
     * set the main character's name
     * @param m; a string, the name of the main character
     */
    public void setMainCharacter(String m) {
        mainCharacter = m;
    }

    /**
     * @return boolean that indicates whether the book has a happy ending or not  
     */
    public boolean getHappyEnding() {
        return happyEnding;
    }

    /**
     * set boolean
     * @param hap; a boolean that indicates whether the book has a happy ending or not  
     */
    public void setHappyEnding(boolean hap) {
        happyEnding = hap;
    }

    /**
     * @return The genre of the book
     */
    @Override
    public String getGenre() {
        return "Romance";
    }

    /**
     * @return String representation of a Romance Book,
     * including title, author, year published, number of pages, name of the main character, and if the book has a happy ending or not
     */
    @Override
    public String toString() {
        String returnstring = "";
        returnstring += "Title: " + getTitle() + "\n";
        returnstring += "Author: " + getAuthor() + "\n";
        returnstring += "Year Published: " + getYearPublished() + "\n";
        returnstring += "Number of Pages: " + getNumPages() + "\n";
        returnstring += "Main character's name: " + getMainCharacter() + "\n";
        returnstring += "Happy Ending: " + getHappyEnding() + "\n";
        return returnstring;
    }
}
