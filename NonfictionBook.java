/**
 * This Nonfiction Book class inherits from the Book class. A Nonfiction Book is a specific type of Book
 * which inherits properties from the Book class and a two new variables are created.
 * 
 *  @author Eric P.
 */

public class NonfictionBook extends Book implements BookInfo {

    private String topic;
    private boolean authorExpertise;

    /**
     * Constructs a new Nonfiction Book with a specific title, author, number of pages, genre,
     * and two parameters unique to a Nonfiction Book: topic, authorExpertise
     *
     * @param title , String for the title of the book
     * @param author , String for the author of the book
     * @param yearPublished , Integer for the year the book was published
     * @param numPages , Integer for the number of pages in the book
     * @param topic , String for the topic of the nonfiction book                                                    // GOT THIS IDEA FROM CHAT GPT
     * @param authorExpertise , Boolean indicating whether the author is an expert in the book's topic or not        // GOT THIS IDEA FROM CHAT GPT
     */
    public NonfictionBook (String title, String author, int yearPublished, int numPages, String topic, boolean authorExpertise) {
        super(title, author, yearPublished, numPages);
        this.topic = topic;
        this.authorExpertise = authorExpertise;
    }
    
    /**
     * @return the topic of the nonfiction book
     */
    public String getTopic() {
        return topic;
    }

    /**
     * set the topic of the book
     * @param top; a string, the topic of the book
     */
    public void setTopic(String top) {
        topic = top;
    }

    /**
     * @return boolean that indicates whether the author is an expert in the book's topic or not
     */
    public boolean getAuthorExpertise() {
        return authorExpertise;
    }

    /**
     * set boolean
     * @param exp; a boolean that indicates whether the author is an expert in the book's topic or not
     */
    public void setAuthorExpertise(boolean exp) {
        authorExpertise = exp;
    }

    /**
     * @return The genre of the book
     */
    @Override
    public String getGenre() {
        return "Nonfiction";
    }

    /**
     * @return String representation of a Nonfiction Book,
     * including title, author, year published, number of pages, topic of the book, and whether the author is an expert in the book's topic or not
     */
    @Override
    public String toString() {
        String returnstring = "";
        returnstring += "Title: " + getTitle() + "\n";
        returnstring += "Author: " + getAuthor() + "\n";
        returnstring += "Year Published: " + getYearPublished() + "\n";
        returnstring += "Number of Pages: " + getNumPages() + "\n";
        returnstring += "Topic: " + getTopic() + "\n";
        returnstring += "Author Expertise: " + getAuthorExpertise() + "\n";
        return returnstring;
    }
}
