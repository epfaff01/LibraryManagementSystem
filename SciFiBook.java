/**
 * This SciFi Book class inherits from the Book class. A SciFi Book is a specific type of Book
 * which inherits properties from the Book class and a two new variables are created.
 * 
 *  @author Eric P.
 */

public class SciFiBook extends Book implements BookInfo {

    private String alienSpecies;
    private boolean advancedTechnology;

    /**
     * Constructs a new SciFi Book with a specific title, author, number of pages, genre,
     * and two parameters unique to a SciFi Book: alienSpecies, advancedTechnology
     *
     * @param title , String for the title of the book
     * @param author , String for the author of the book
     * @param yearPublished , Integer for the year the book was published
     * @param numPages , Integer for the number of pages in the book
     * @param alienSpecies , String for the type of alien species featured in the sci-fi book                                 // GOT THIS IDEA FROM CHAT GPT
     * @param advancedTechnology , Boolean that indicates whether advanced technology plays a signficant role or not          // GOT THIS IDEA FROM CHAT GPT
     */
    public SciFiBook (String title, String author, int yearPublished, int numPages, String alienSpecies, boolean advancedTechnology) {
        super(title, author, yearPublished, numPages);
        this.alienSpecies = alienSpecies;
        this.advancedTechnology = advancedTechnology;
    }
    
    /**
     * @return the type of alien species featured in the sci-fi book
     */
    public String getAlienSpecies() {
        return alienSpecies;
    }

    /**
     * set the type of alien species featured
     * @param ali; a string, the type of alien species featured
     */
    public void setAlienSpecies(String ali) {
        alienSpecies = ali;
    }

    /**
     * @return boolean that indicates whether advanced technology plays a significant role or not
     */
    public boolean getAdvancedTechnology() {
        return advancedTechnology;
    }
    
    /**
     * set boolean
     * @param adv; a boolean that indicates whether advanced technology plays a significant role or not
     */
    public void setAdvancedTechnology(boolean adv) {
        advancedTechnology = adv;
    }

    /**
     * @return The genre of the book
     */
    @Override
    public String getGenre() {
        return "SciFi";
    }

    /**
     * @return String representation of a SciFi Book,
     * including title, author, year published, number of pages, type of alien species featured, and if advanced technology plays a signficant role or not
     */
    @Override
    public String toString() {
        String returnstring = "";
        returnstring += "Title: " + getTitle() + "\n";
        returnstring += "Author: " + getAuthor() + "\n";
        returnstring += "Year Published: " + getYearPublished() + "\n";
        returnstring += "Number of Pages: " + getNumPages() + "\n";
        returnstring += "Alien Species: " + getAlienSpecies() + "\n";
        returnstring += "Advanced Technology: " + getAdvancedTechnology() + "\n";
        return returnstring;
    }
}
