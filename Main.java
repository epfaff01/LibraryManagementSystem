import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * The Main class represents the main entry point for the library program.
 * It allows users to donate books to the library and manages the library's catalog.
 *
 * @author Eric P.
 */
public class Main {
    /**
     * The Scanner object for user input.
     */
    public static final Scanner keyboard = new Scanner(System.in);

    /**
     * The main method that runs the library program.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Initialize the library catalog
        Library fixedCatalog = new Library();
        String response;
        String genre;

        // Display the initial catalog
        System.out.println("Welcome to our library! Here are the books we currently possess:" + "\n");
        fixedCatalog.printCatalog();

        boolean growingLibrary = true;

        // Main loop for donating books
        while (growingLibrary) {
            System.out.println("Would you like to Donate a book to help grow our library? Type Y or N");

            // Get user response
            response = keyboard.nextLine();

            // Process user response
            if (response.equalsIgnoreCase("Y")) {
                System.out.println("Awesome!");

                boolean genrePresent = true;

                // List of valid genres
                ArrayList<String> validGenres = new ArrayList<>(Arrays.asList("mystery", "nonfiction", "romance", "scifi"));

                // Loop for entering the genre
                while (genrePresent) {
                    System.out.println("What genre of book would you like to donate?");
                    genre = keyboard.nextLine();

                    // Check if the entered genre is valid
                    if (validGenres.contains(genre.toLowerCase())) {
                        // Handle book donation for the specified genre
                        BookDonationManager.handleBookDonation(fixedCatalog, genre.toLowerCase());
                        genrePresent = false;
                    } else {
                        System.out.println("Please enter a valid genre: Mystery, Nonfiction, Romance, or SciFi");
                    }
                }

            } else if (response.equalsIgnoreCase("N")) {
                System.out.println("That's unfortunate, have a good day!");
                growingLibrary = false;
            } else {
                System.out.println("Please enter Y or N");
            }
        }

        // Display the updated catalog if any books were donated

        if (fixedCatalog.bookCatalog.size() > 4) {
            System.out.println();
            System.out.println("Here is our updated library: ");
            System.out.println();
            fixedCatalog.printCatalog();
        }
    }   
}