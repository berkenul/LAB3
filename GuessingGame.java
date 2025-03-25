import java.util.Random;
import java.util.Scanner;

/**
 * @author Pablo
 * @since 2025-03-24
 */
public class GuessingGame {

    private static final int MAX_TRIES = 5;
    private static final int MIN = 1;
    private static final int MAX = 100;

    public static void play(Scanner scanner) {
        Random random = new Random();
        boolean playAgain;

        do {
            int numberToGuess = random.nextInt(MAX - MIN + 1) + MIN;
            int remainingTries = MAX_TRIES;
            boolean guessedCorrectly = false;

            System.out.println("I'm thinking of a number between " + MIN + " and " + MAX + ".");
            System.out.println("Guess what it is. You have " + MAX_TRIES + " tries:");

            while (remainingTries > 0) {
                int guess = scanner.nextInt();

                if (guess == numberToGuess) {
                    System.out.println("You got it!");
                    guessedCorrectly = true;
                    break;
                } else if (guess < numberToGuess) {
                    remainingTries--;
                    System.out.println("Nope! Too low. Try again (" + remainingTries + " tries left):");
                } else {
                    remainingTries--;
                    System.out.println("Nope! Too high. Try again (" + remainingTries + " tries left):");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Nope! You lost. The number was " + numberToGuess);
            }

            System.out.print("Do you want to play again? (Y/N): ");
            scanner.nextLine(); // buffer clean
            String answer = scanner.nextLine().trim().toUpperCase();
            playAgain = answer.equals("Y");
        } while (playAgain);
    }
}
