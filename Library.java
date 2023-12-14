import java.util.ArrayList;

/**
 * The Library class represents a library's catalog containing books of various genres.
 * It provides methods to create, manage, and display the catalog.
 *
 * @author Eric P.
 */
public class Library {

    /**
     * An ArrayList to store books in the library catalog.
     */
    public ArrayList<Book> bookCatalog;

    /**
     * Constructs an ArrayList of books and initializes the library catalog
     * with specific books representing different genres.
     */
    public Library() {
        // Initialize the bookCatalog ArrayList only once
        bookCatalog = new ArrayList<>();

        // Add a mystery book
        bookCatalog.add(new MysteryBook("The Hound of the Baskervilles", "Sir Arthur Conan Doyle", 1902, 225, "Sherlock Holmes", true));

        // Add a nonfiction book
        bookCatalog.add(new NonfictionBook("Into Thin Air: A Personal Account of the Mt. Everest Disaster", "Jon Krakauer", 1997, 416, "The 1996 Mount Everest disaster", true));

        // Add a romance book
        bookCatalog.add(new RomanceBook("The Hating Game", "Sally Thorne", 2016, 384, "Lucy Hutton", true));

        // Add a Scifi Book
        bookCatalog.add(new SciFiBook("Ender's Game", "Orson Scott Card", 1985, 272, "Formics", true));
    }

    /**
     * Prints the entire catalog, including details of all books categorized by genres.
     */
    public void printCatalog() {
        System.out.println("Mystery Books:");
        System.out.println("---------------------------");
        for (Book book : bookCatalog) {
            if (book instanceof MysteryBook) {
                System.out.println(book);
            }
        }
        System.out.println("Nonfiction Books:");
        System.out.println("---------------------------");
        for (Book book : bookCatalog) {
            if (book instanceof NonfictionBook) {
                System.out.println(book);
            }
        }
        System.out.println("Romance Books:");
        System.out.println("---------------------------");
        for (Book book : bookCatalog) {
            if (book instanceof RomanceBook) {
                System.out.println(book);
            }
        }
        System.out.println("SciFi Books:");
        System.out.println("---------------------------");
        for (Book book : bookCatalog) {
            if (book instanceof SciFiBook) {
                System.out.println(book);
            }
        }
    }

    /**
     * Adds a donated mystery book to the library catalog.
     * 
     * @param donatedBook The mystery book to be added.
     */
    public void addBook(MysteryBook donatedBook) {
        bookCatalog.add(donatedBook);
    }

    /**
     * Adds a donated nonfiction book to the library catalog.
     *
     * @param donatedBook The nonfiction book to be added.
     */
    public void addBook(NonfictionBook donatedBook) {
        bookCatalog.add(donatedBook);
    }

    /**
     * Adds a donated romance book to the library catalog.
     *
     * @param donatedBook The romance book to be added.
     */
    public void addBook(RomanceBook donatedBook) {
        bookCatalog.add(donatedBook);
    }

    /**
     * Adds a donated science fiction (SciFi) book to the library catalog.
     *
     * @param donatedBook The SciFi book to be added.
     */
    public void addBook(SciFiBook donatedBook) {
        bookCatalog.add(donatedBook);
    }
}