/**
 * This Book class represents a book stored in a library system. Inside, it contains information about
 * the book: Title, author, number of pages, genre
 * 
 *  @author Eric Pfaffenbach
 */

public class Book {
    String title;
    String author;
    int yearPublished;
    int numPages;

    /**
     * Constructs a new Book with a specific title, author, number of pages, and genre.
     *
     * @param title , String for the title of the book
     * @param author , String for the author of the book
     * @param yearPublished , Integer for the year the book was published
     * @param numPages , Integer for the number of pages in the book
     */
    public Book(String title, String author, int yearPublished, int numPages)
	{
		this.title = title;
		this.author = author;
        this.yearPublished = yearPublished;
        if (yearPublished < 1000 || yearPublished > 2023) {
            throw new YearOutsideBoundsException();
        }
        this.numPages = numPages;
	}

    /**
     * @return the title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * set the title of the book
     * @param t; a string, the title of a book
     */
    public void setTitle(String t) {
        title = t;
    }

    /**
     * @return the author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * set the author of the book
     * @param a; a string, the author of a book
     */
    public void setAuthor(String a) {
        author = a;
    }

    /**
     * @return the year the book was published
     */
    public int getYearPublished() {
        if (yearPublished < 1000 || yearPublished > 2023) {
            throw new YearOutsideBoundsException();
        }
        return yearPublished;
    }

    /**
     * set the year the book was published
     * @param y; an integer, the year the book was published
     */
    public void setYearPublished(int y) {
        yearPublished = y;
        if (yearPublished < 1000 || yearPublished > 2023) {
            throw new YearOutsideBoundsException();
        }
    }

    /**
     * @return the number of pages in the book
     */
    public int getNumPages() {
        if (numPages <= 0) {
            throw new NumPagesOutsideBoundsException();
        }
        return numPages; 
    }

    /**
     * set the number of pages in the book
     * @param n; an integer, the number of pages in the book
     */
    public void setNumPages(int n) {
        numPages = n;
        if (numPages <= 0) {
            throw new NumPagesOutsideBoundsException();
        }
    }

    /**
     * @return String representation of a book,
     * including title, author, year published, number of pages, and genre
     */
    @Override
    public String toString() {
        String returnstring = "";
        returnstring += "Title: " + getTitle() + "\n";
        returnstring += "Author: " + getAuthor() + "\n";
        returnstring += "Year Published: " + getYearPublished() + "\n";
        returnstring += "Number of Pages: " + getNumPages() + "\n";
        return returnstring;
    }
}
