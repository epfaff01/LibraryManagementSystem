import java.util.Scanner;

/**
 * @author Eric P.
 * 
 * The BookDonationManager class manages the process of handling book donations
 * and adding the donated books to the library catalog.
 */
class BookDonationManager {

    /**
     * Handles the donation of a book based on the specified genre and adds it to the library catalog.
     *
     * @param library  ,  The library catalog where the donated book will be added.
     * @param genre    ,  The genre of the donated book.
     */
    public static void handleBookDonation(Library library, String genre) {
        Scanner keyboard = Main.keyboard;

        System.out.println("Please enter the title of the " + genre + " book, in double quotations! :");
        String title = keyboard.nextLine();

        System.out.println("Please enter the author of the " + genre + " book, in double quotations! :");
        String author = keyboard.nextLine();

        System.out.println("Please enter the year (Between 1000 and 2023) the " + genre + " book was published:");
        int yearPublished = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Please enter the number of pages (>0) in the " + genre + " book:");
        int numOfPages = keyboard.nextInt();
        keyboard.nextLine();

        if (genre.equalsIgnoreCase("mystery")) {
            System.out.println("Please enter the detective's name in the Mystery book, in double quotations! :");
            String detectiveName = keyboard.nextLine();

            System.out.println("Was the crime solved in the Mystery book? Type true or false:");
            boolean isCrimeSolved = keyboard.nextBoolean();

            MysteryBook donatedBook = new MysteryBook(title, author, yearPublished, numOfPages, detectiveName, isCrimeSolved);
            library.addBook(donatedBook);

        } else if (genre.equalsIgnoreCase("nonfiction")) {

            System.out.println("Please enter the topic of the book, in double quotations! :");
            String topic = keyboard.nextLine();

            System.out.println("Is the author an expert on this topic? Type true or false:");
            boolean authorExpertise = keyboard.nextBoolean();

            NonfictionBook donatedBook = new NonfictionBook(title, author, yearPublished, numOfPages, topic, authorExpertise);
            library.addBook(donatedBook);

        } else if (genre.equalsIgnoreCase("romance")) {

            System.out.println("Please enter the main character's name in the book, in double quotations! :");
            String mainCharacter = keyboard.nextLine();

            System.out.println("Does the book have a happy ending? Type true or false:");
            boolean happyEnding = keyboard.nextBoolean();

            RomanceBook donatedBook = new RomanceBook(title, author, yearPublished, numOfPages, mainCharacter, happyEnding);
            library.addBook(donatedBook);
        } else {

            System.out.println("Please enter the alien species's name in the book, in double quotations! :");
            String alienSpecies = keyboard.nextLine();

            System.out.println("Is advanced technology present in the book? Type true or false:");
            boolean advancedTechnology = keyboard.nextBoolean();

            SciFiBook donatedBook = new SciFiBook(title, author, yearPublished, numOfPages, alienSpecies, advancedTechnology);
            library.addBook(donatedBook);

        }

        System.out.println("Thank you for donating the " + genre + " book!");
        keyboard.nextLine();
        System.out.println();
    }
}