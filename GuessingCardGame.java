import java.util.Random;
import java.util.Scanner;

public class GuessingCardGame {
    public static void main(String[] args) {
        // Create a deck of 52 cards
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // Randomly choose a card from the deck
        Random random = new Random();
        String randomSuit = suits[random.nextInt(suits.length)];
        String randomRank = ranks[random.nextInt(ranks.length)];
        String randomCard = randomRank + " of " + randomSuit;

        // Introduction and rules
        System.out.println("Welcome to the Guessing Card Game!");
        System.out.println("I've chosen a random card from a deck. Can you guess it?");
        System.out.println("You have unlimited attempts to guess the card.");
        System.out.println("To quit the game, type 'exit' at any time.");
        System.out.println("Guess the card in the format: Rank of Suit (e.g., Ace of Spades)\n");

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (true) {
            // Prompt for user input
            System.out.print("Your guess: ");
            String userGuess = scanner.nextLine().trim();

            if (userGuess.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing. The correct card was: " + randomCard);
                break;
            }

            attempts++;

            if (userGuess.equalsIgnoreCase(randomCard)) {
                System.out.println("\nCongratulations! You guessed the card: " + randomCard);
                System.out.println("Number of attempts: " + attempts);
                break;
            } else {
                System.out.println("Incorrect guess. Try again.");
            }
        }

        scanner.close();
    }
}
